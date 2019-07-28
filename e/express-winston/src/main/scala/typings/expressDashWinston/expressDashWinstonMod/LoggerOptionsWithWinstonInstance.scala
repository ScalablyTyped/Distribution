package typings.expressDashWinston.expressDashWinstonMod

import typings.expressDashWinston.Anon_Error
import typings.logform.logformMod.Format
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
    dynamicMeta: DynamicMetaFunction = null,
    expressFormat: js.UndefOr[Boolean] = js.undefined,
    format: Format = null,
    ignoreRoute: RouteFilter = null,
    ignoredRoutes: js.Array[String] = null,
    level: String | DynamicLevelFunction = null,
    meta: js.UndefOr[Boolean] = js.undefined,
    metaField: String = null,
    msg: MessageTemplate = null,
    requestFilter: RequestFilter = null,
    requestWhitelist: js.Array[String] = null,
    responseFilter: ResponseFilter = null,
    responseWhitelist: js.Array[String] = null,
    skip: RouteFilter = null,
    statusLevels: Anon_Error = null
  ): LoggerOptionsWithWinstonInstance = {
    val __obj = js.Dynamic.literal(winstonInstance = winstonInstance)
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta)
    if (bodyBlacklist != null) __obj.updateDynamic("bodyBlacklist")(bodyBlacklist)
    if (bodyWhitelist != null) __obj.updateDynamic("bodyWhitelist")(bodyWhitelist)
    if (!js.isUndefined(colorize)) __obj.updateDynamic("colorize")(colorize)
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(dynamicMeta)
    if (!js.isUndefined(expressFormat)) __obj.updateDynamic("expressFormat")(expressFormat)
    if (format != null) __obj.updateDynamic("format")(format)
    if (ignoreRoute != null) __obj.updateDynamic("ignoreRoute")(ignoreRoute)
    if (ignoredRoutes != null) __obj.updateDynamic("ignoredRoutes")(ignoredRoutes)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(meta)) __obj.updateDynamic("meta")(meta)
    if (metaField != null) __obj.updateDynamic("metaField")(metaField)
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(requestFilter)
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist)
    if (responseFilter != null) __obj.updateDynamic("responseFilter")(responseFilter)
    if (responseWhitelist != null) __obj.updateDynamic("responseWhitelist")(responseWhitelist)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    if (statusLevels != null) __obj.updateDynamic("statusLevels")(statusLevels)
    __obj.asInstanceOf[LoggerOptionsWithWinstonInstance]
  }
}

