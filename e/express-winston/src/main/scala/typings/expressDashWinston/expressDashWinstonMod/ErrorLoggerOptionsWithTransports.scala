package typings.expressDashWinston.expressDashWinstonMod

import typings.logform.logformMod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLoggerOptionsWithTransports
  extends BaseErrorLoggerOptions
     with ErrorLoggerOptions {
  var transports: js.Array[typings.winstonDashTransport.winstonDashTransportMod.^]
}

object ErrorLoggerOptionsWithTransports {
  @scala.inline
  def apply(
    transports: js.Array[typings.winstonDashTransport.winstonDashTransportMod.^],
    baseMeta: js.Object = null,
    dynamicMeta: DynamicMetaFunction = null,
    format: Format = null,
    level: String | DynamicLevelFunction = null,
    metaField: String = null,
    msg: MessageTemplate = null,
    requestFilter: RequestFilter = null,
    requestWhitelist: js.Array[String] = null
  ): ErrorLoggerOptionsWithTransports = {
    val __obj = js.Dynamic.literal(transports = transports)
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta)
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(dynamicMeta)
    if (format != null) __obj.updateDynamic("format")(format)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (metaField != null) __obj.updateDynamic("metaField")(metaField)
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(requestFilter)
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist)
    __obj.asInstanceOf[ErrorLoggerOptionsWithTransports]
  }
}

