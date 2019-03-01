package typings
package expressDashWinstonLib.expressDashWinstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLoggerOptions extends js.Object {
  var baseMeta: js.UndefOr[js.Object] = js.undefined
  var bodyBlacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var bodyWhitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var colorize: js.UndefOr[scala.Boolean] = js.undefined
  var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.undefined
  var expressFormat: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreRoute: js.UndefOr[RouteFilter] = js.undefined
  var ignoredRoutes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var level: js.UndefOr[java.lang.String | DynamicLevelFunction] = js.undefined
  var meta: js.UndefOr[scala.Boolean] = js.undefined
  var metaField: js.UndefOr[java.lang.String] = js.undefined
  var msg: js.UndefOr[java.lang.String] = js.undefined
  var requestFilter: js.UndefOr[RequestFilter] = js.undefined
  var requestWhitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var responseFilter: js.UndefOr[ResponseFilter] = js.undefined
  var responseWhitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var skip: js.UndefOr[RouteFilter] = js.undefined
  var statusLevels: js.UndefOr[expressDashWinstonLib.Anon_Error] = js.undefined
}

object BaseLoggerOptions {
  @scala.inline
  def apply(
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
    msg: java.lang.String = null,
    requestFilter: RequestFilter = null,
    requestWhitelist: js.Array[java.lang.String] = null,
    responseFilter: ResponseFilter = null,
    responseWhitelist: js.Array[java.lang.String] = null,
    skip: RouteFilter = null,
    statusLevels: expressDashWinstonLib.Anon_Error = null
  ): BaseLoggerOptions = {
    val __obj = js.Dynamic.literal()
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
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(requestFilter)
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist)
    if (responseFilter != null) __obj.updateDynamic("responseFilter")(responseFilter)
    if (responseWhitelist != null) __obj.updateDynamic("responseWhitelist")(responseWhitelist)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    if (statusLevels != null) __obj.updateDynamic("statusLevels")(statusLevels)
    __obj.asInstanceOf[BaseLoggerOptions]
  }
}

