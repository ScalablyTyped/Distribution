package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata type for the operation returned by CreateInstance.
  */
@js.native
trait Schema$CreateInstanceMetadata extends js.Object {
  /**
    * The time at which this operation was cancelled. If set, this operation is
    * in the process of undoing itself (which is guaranteed to succeed) and
    * cannot be cancelled again.
    */
  var cancelTime: js.UndefOr[String] = js.native
  /**
    * The time at which this operation failed or was completed successfully.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The instance being created.
    */
  var instance: js.UndefOr[Schema$Instance] = js.native
  /**
    * The time at which the CreateInstance request was received.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$CreateInstanceMetadata {
  @scala.inline
  def apply(
    cancelTime: String = null,
    endTime: String = null,
    instance: Schema$Instance = null,
    startTime: String = null
  ): Schema$CreateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    if (cancelTime != null) __obj.updateDynamic("cancelTime")(cancelTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateInstanceMetadata]
  }
}

