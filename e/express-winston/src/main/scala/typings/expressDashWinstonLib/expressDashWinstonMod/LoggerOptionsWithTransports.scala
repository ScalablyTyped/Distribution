package typings
package expressDashWinstonLib.expressDashWinstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptionsWithTransports
  extends BaseLoggerOptions
     with LoggerOptions {
  var transports: js.Array[winstonDashTransportLib.winstonDashTransportMod.^]
}

object LoggerOptionsWithTransports {
  @scala.inline
  def apply(
    transports: js.Array[winstonDashTransportLib.winstonDashTransportMod.^],
    baseMeta: js.Object = null,
    bodyBlacklist: js.Array[java.lang.String] = null,
    bodyWhitelist: js.Array[java.lang.String] = null,
    colorize: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicMeta: DynamicMetaFunction = null,
    expressFormat: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreRoute: RouteFilter = null,
    ignoredRoutes: js.Array[java.lang.String] = null,
    level: java.lang.String | DynamicLevelFunction = null,
    meta: js.UndefOr[scala.Boolean] = js.undefined,
    metaField: java.lang.String = null,
    msg: MessageTemplate = null,
    requestFilter: RequestFilter = null,
    requestWhitelist: js.Array[java.lang.String] = null,
    responseFilter: ResponseFilter = null,
    responseWhitelist: js.Array[java.lang.String] = null,
    skip: RouteFilter = null,
    statusLevels: expressDashWinstonLib.Anon_Error = null
  ): LoggerOptionsWithTransports = {
    val __obj = js.Dynamic.literal(transports = transports)
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta)
    if (bodyBlacklist != null) __obj.updateDynamic("bodyBlacklist")(bodyBlacklist)
    if (bodyWhitelist != null) __obj.updateDynamic("bodyWhitelist")(bodyWhitelist)
    if (!js.isUndefined(colorize)) __obj.updateDynamic("colorize")(colorize)
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(dynamicMeta)
    if (!js.isUndefined(expressFormat)) __obj.updateDynamic("expressFormat")(expressFormat)
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
    __obj.asInstanceOf[LoggerOptionsWithTransports]
  }
}

