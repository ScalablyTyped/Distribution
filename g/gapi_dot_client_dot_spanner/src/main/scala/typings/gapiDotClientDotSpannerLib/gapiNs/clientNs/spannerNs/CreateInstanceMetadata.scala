package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceMetadata extends js.Object {
  /**
    * The time at which this operation was cancelled. If set, this operation is
    * in the process of undoing itself (which is guaranteed to succeed) and
    * cannot be cancelled again.
    */
  var cancelTime: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which this operation failed or was completed successfully. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** The instance being created. */
  var instance: js.UndefOr[Instance] = js.undefined
  /**
    * The time at which the
    * CreateInstance request was
    * received.
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

object CreateInstanceMetadata {
  @scala.inline
  def apply(
    cancelTime: java.lang.String = null,
    endTime: java.lang.String = null,
    instance: Instance = null,
    startTime: java.lang.String = null
  ): CreateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    if (cancelTime != null) __obj.updateDynamic("cancelTime")(cancelTime)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[CreateInstanceMetadata]
  }
}

