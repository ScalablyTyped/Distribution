package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceReference extends js.Object {
  /** Optional. A URI string identifying the repository. Example: "https://github.com/GoogleCloudPlatform/kubernetes.git" */
  var repository: js.UndefOr[String] = js.undefined
  /** The canonical and persistent identifier of the deployed revision. Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b" */
  var revisionId: js.UndefOr[String] = js.undefined
}

object SourceReference {
  @scala.inline
  def apply(repository: String = null, revisionId: String = null): SourceReference = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    __obj.asInstanceOf[SourceReference]
  }
}

