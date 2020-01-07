package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a snapshot of a job.
  */
@js.native
trait Schema$Snapshot extends js.Object {
  /**
    * The time this snapshot was created.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * The unique ID of this snapshot.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The project this snapshot belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The job this snapshot was created from.
    */
  var sourceJobId: js.UndefOr[String] = js.native
  /**
    * The time after which this snapshot will be automatically deleted.
    */
  var ttl: js.UndefOr[String] = js.native
}

object Schema$Snapshot {
  @scala.inline
  def apply(
    creationTime: String = null,
    id: String = null,
    projectId: String = null,
    sourceJobId: String = null,
    ttl: String = null
  ): Schema$Snapshot = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (sourceJobId != null) __obj.updateDynamic("sourceJobId")(sourceJobId.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Snapshot]
  }
}

