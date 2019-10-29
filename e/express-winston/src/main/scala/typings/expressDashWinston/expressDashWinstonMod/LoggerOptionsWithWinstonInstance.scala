package typings.expressDashWinston.expressDashWinstonMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashWinston.Anon_Error
import typings.logform.logformMod.Format
import typings.std.Error
import typings.winston.winstonMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptionsWithWinstonInstance
  extends BaseLoggerOptions
     with LoggerOptions {
  var winstonInstance: Logger
}

object LoggerOptionsWithWinstonInstance {
  @scala.inline
  def apply(
    winstonInstance: Logger,
    baseMeta: js.Object = null,
    bodyBlacklist: js.Array[String] = null,
    bodyWhitelist: js.Array[String] = null,
    colorize: js.UndefOr[Boolean] = js.undefined,
    dynamicMeta: (/* req */ Request, /* res */ Response, /* err */ Error) => js.Object = null,
    expressFormat: js.UndefOr[Boolean] = js.undefined,
    format: Format = null,
    headerBlacklist: js.Array[String] = null,
    ignoreRoute: (/* req */ Request, /* res */ Response) => Boolean = null,
    ignoredRoutes: js.Array[String] = null,
    level: String | DynamicLevelFunction = null,
    meta: js.UndefOr[Boolean] = js.undefined,
    metaField: String = null,
    msg: MessageTemplate = null,
    requestField: String = null,
    requestFilter: (/* req */ FilterRequest, /* propName */ String) => js.Any = null,
    requestWhitelist: js.Array[String] = null,
    responseField: String = null,
    responseFilter: (/* res */ FilterResponse, /* propName */ String) => js.Any = null,
    responseWhitelist: js.Array[String] = null,
    skip: (/* req */ Request, /* res */ Response) => Boolean = null,
    statusLevels: Anon_Error = null
  ): LoggerOptionsWithWinstonInstance = {
    val __obj = js.Dynamic.literal(winstonInstance = winstonInstance)
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta)
    if (bodyBlacklist != null) __obj.updateDynamic("bodyBlacklist")(bodyBlacklist)
    if (bodyWhitelist != null) __obj.updateDynamic("bodyWhitelist")(bodyWhitelist)
    if (!js.isUndefined(colorize)) __obj.updateDynamic("colorize")(colorize)
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(js.Any.fromFunction3(dynamicMeta))
    if (!js.isUndefined(expressFormat)) __obj.updateDynamic("expressFormat")(expressFormat)
    if (format != null) __obj.updateDynamic("format")(format)
    if (headerBlacklist != null) __obj.updateDynamic("headerBlacklist")(headerBlacklist)
    if (ignoreRoute != null) __obj.updateDynamic("ignoreRoute")(js.Any.fromFunction2(ignoreRoute))
    if (ignoredRoutes != null) __obj.updateDynamic("ignoredRoutes")(ignoredRoutes)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(meta)) __obj.updateDynamic("meta")(meta)
    if (metaField != null) __obj.updateDynamic("metaField")(metaField)
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (requestField != null) __obj.updateDynamic("requestField")(requestField)
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(js.Any.fromFunction2(requestFilter))
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist)
    if (responseField != null) __obj.updateDynamic("responseField")(responseField)
    if (responseFilter != null) __obj.updateDynamic("responseFilter")(js.Any.fromFunction2(responseFilter))
    if (responseWhitelist != null) __obj.updateDynamic("responseWhitelist")(responseWhitelist)
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction2(skip))
    if (statusLevels != null) __obj.updateDynamic("statusLevels")(statusLevels)
    __obj.asInstanceOf[LoggerOptionsWithWinstonInstance]
  }
}

