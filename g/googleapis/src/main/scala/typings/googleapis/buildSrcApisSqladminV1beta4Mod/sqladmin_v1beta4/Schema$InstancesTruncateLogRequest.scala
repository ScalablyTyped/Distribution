package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instance truncate log request.
  */
@js.native
trait Schema$InstancesTruncateLogRequest extends js.Object {
  /**
    * Contains details about the truncate log operation.
    */
  var truncateLogContext: js.UndefOr[Schema$TruncateLogContext] = js.native
}

object Schema$InstancesTruncateLogRequest {
  @scala.inline
  def apply(truncateLogContext: Schema$TruncateLogContext = null): Schema$InstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    if (truncateLogContext != null) __obj.updateDynamic("truncateLogContext")(truncateLogContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesTruncateLogRequest]
  }
}

