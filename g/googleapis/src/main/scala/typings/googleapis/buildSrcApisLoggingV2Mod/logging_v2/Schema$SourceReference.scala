package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a particular snapshot of the source tree used to build and
  * deploy an application.
  */
@js.native
trait Schema$SourceReference extends js.Object {
  /**
    * Optional. A URI string identifying the repository. Example:
    * &quot;https://github.com/GoogleCloudPlatform/kubernetes.git&quot;
    */
  var repository: js.UndefOr[String] = js.native
  /**
    * The canonical and persistent identifier of the deployed revision. Example
    * (git): &quot;0035781c50ec7aa23385dc841529ce8a4b70db1b&quot;
    */
  var revisionId: js.UndefOr[String] = js.native
}

object Schema$SourceReference {
  @scala.inline
  def apply(repository: String = null, revisionId: String = null): Schema$SourceReference = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceReference]
  }
}

