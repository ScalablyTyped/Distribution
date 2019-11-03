package typings.expressDashWinston.expressDashWinstonMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.logform.logformMod.Format
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseErrorLoggerOptions extends js.Object {
  var baseMeta: js.UndefOr[js.Object] = js.undefined
  var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.undefined
  var format: js.UndefOr[Format] = js.undefined
  var level: js.UndefOr[String | DynamicLevelFunction] = js.undefined
  var meta: js.UndefOr[Boolean] = js.undefined
  var metaField: js.UndefOr[String] = js.undefined
  var msg: js.UndefOr[MessageTemplate] = js.undefined
  var requestField: js.UndefOr[String] = js.undefined
  var requestFilter: js.UndefOr[RequestFilter] = js.undefined
  var requestWhitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object BaseErrorLoggerOptions {
  @scala.inline
  def apply(
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
  ): BaseErrorLoggerOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[BaseErrorLoggerOptions]
  }
}

