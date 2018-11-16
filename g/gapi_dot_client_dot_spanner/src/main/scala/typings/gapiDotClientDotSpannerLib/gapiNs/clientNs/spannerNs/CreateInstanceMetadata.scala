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

