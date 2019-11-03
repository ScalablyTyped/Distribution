package typings.expressDashWinston.expressDashWinstonMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.logform.logformMod.Format
import typings.std.Error
import typings.winston.winstonMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLoggerOptionsWithWinstonInstance
  extends BaseErrorLoggerOptions
     with ErrorLoggerOptions {
  var winstonInstance: Logger
}

object ErrorLoggerOptionsWithWinstonInstance {
  @scala.inline
  def apply(
    winstonInstance: Logger,
    baseMeta: js.Object = null,
    dynamicMeta: (/* req */ Request[ParamsDictionary], /* res */ Response, /* err */ Error) => js.Object = null,
    format: Format = null,
    level: String | DynamicLevelFunction = null,
    meta: js.UndefOr[Boolean] = js.undefined,
    metaField: String = null,
    msg: MessageTemplate = null,
    requestField: String = null,
    requestFilter: (/* req */ FilterRequest, /* propName */ String) => js.Any = null,
    requestWhitelist: js.Array[String] = null
  ): ErrorLoggerOptionsWithWinstonInstance = {
    val __obj = js.Dynamic.literal(winstonInstance = winstonInstance)
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta)
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(js.Any.fromFunction3(dynamicMeta))
    if (format != null) __obj.updateDynamic("format")(format)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(meta)) __obj.updateDynamic("meta")(meta)
    if (metaField != null) __obj.updateDynamic("metaField")(metaField)
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (requestField != null) __obj.updateDynamic("requestField")(requestField)
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(js.Any.fromFunction2(requestFilter))
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist)
    __obj.asInstanceOf[ErrorLoggerOptionsWithWinstonInstance]
  }
}

