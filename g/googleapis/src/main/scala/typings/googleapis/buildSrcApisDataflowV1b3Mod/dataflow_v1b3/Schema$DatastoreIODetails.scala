package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a Datastore connector used by the job.
  */
@js.native
trait Schema$DatastoreIODetails extends js.Object {
  /**
    * Namespace used in the connection.
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.native
}

object Schema$DatastoreIODetails {
  @scala.inline
  def apply(namespace: String = null, projectId: String = null): Schema$DatastoreIODetails = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DatastoreIODetails]
  }
}

