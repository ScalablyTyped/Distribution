package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a snapshot of a job.
  */
@js.native
trait Schema$SnapshotJobRequest extends js.Object {
  /**
    * The location that contains this job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * TTL for the snapshot.
    */
  var ttl: js.UndefOr[String] = js.native
}

object Schema$SnapshotJobRequest {
  @scala.inline
  def apply(location: String = null, ttl: String = null): Schema$SnapshotJobRequest = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SnapshotJobRequest]
  }
}

