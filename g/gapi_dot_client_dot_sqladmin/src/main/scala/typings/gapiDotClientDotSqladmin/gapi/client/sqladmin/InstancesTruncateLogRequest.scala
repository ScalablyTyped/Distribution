package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesTruncateLogRequest extends js.Object {
  /** Contains details about the truncate log operation. */
  var truncateLogContext: js.UndefOr[TruncateLogContext] = js.undefined
}

object InstancesTruncateLogRequest {
  @scala.inline
  def apply(truncateLogContext: TruncateLogContext = null): InstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    if (truncateLogContext != null) __obj.updateDynamic("truncateLogContext")(truncateLogContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesTruncateLogRequest]
  }
}

