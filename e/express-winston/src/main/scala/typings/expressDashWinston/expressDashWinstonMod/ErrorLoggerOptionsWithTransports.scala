package typings.expressDashWinston.expressDashWinstonMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.logform.logformMod.Format
import typings.std.Error
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
    blacklistedMetaFields: js.Array[String] = null,
    dynamicMeta: (/* req */ Request[ParamsDictionary], /* res */ Response, /* err */ Error) => js.Object = null,
    format: Format = null,
    headerBlacklist: js.Array[String] = null,
    level: String | DynamicLevelFunction = null,
    meta: js.UndefOr[Boolean] = js.undefined,
    metaField: String = null,
    msg: MessageTemplate = null,
    requestField: String = null,
    requestFilter: (/* req */ FilterRequest, /* propName */ String) => js.Any = null,
    requestWhitelist: js.Array[String] = null
  ): ErrorLoggerOptionsWithTransports = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta.asInstanceOf[js.Any])
    if (blacklistedMetaFields != null) __obj.updateDynamic("blacklistedMetaFields")(blacklistedMetaFields.asInstanceOf[js.Any])
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(js.Any.fromFunction3(dynamicMeta))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (headerBlacklist != null) __obj.updateDynamic("headerBlacklist")(headerBlacklist.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(meta)) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (metaField != null) __obj.updateDynamic("metaField")(metaField.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (requestField != null) __obj.updateDynamic("requestField")(requestField.asInstanceOf[js.Any])
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(js.Any.fromFunction2(requestFilter))
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorLoggerOptionsWithTransports]
  }
}

