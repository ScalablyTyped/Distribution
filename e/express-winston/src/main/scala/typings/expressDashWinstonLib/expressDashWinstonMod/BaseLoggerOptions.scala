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
  var statusLevels: js.UndefOr[expressDashWinstonLib.Anon_Warn] = js.undefined
}

