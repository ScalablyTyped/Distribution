package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalRouteConfiguration extends js.Object {
  var hasChildRoutes: js.UndefOr[scala.Boolean] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var isActive: js.UndefOr[knockoutLib.KnockoutComputed[scala.Boolean]] = js.undefined
  var moduleId: js.UndefOr[java.lang.String] = js.undefined
  var nav: js.UndefOr[js.Any] = js.undefined
  var route: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var routePattern: js.UndefOr[stdLib.RegExp] = js.undefined
  var title: js.UndefOr[js.Any] = js.undefined
  var viewUrl: js.UndefOr[java.lang.String] = js.undefined
}

object DurandalRouteConfiguration {
  @scala.inline
  def apply(
    hasChildRoutes: js.UndefOr[scala.Boolean] = js.undefined,
    hash: java.lang.String = null,
    isActive: knockoutLib.KnockoutComputed[scala.Boolean] = null,
    moduleId: java.lang.String = null,
    nav: js.Any = null,
    route: java.lang.String | js.Array[java.lang.String] = null,
    routePattern: stdLib.RegExp = null,
    title: js.Any = null,
    viewUrl: java.lang.String = null
  ): DurandalRouteConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasChildRoutes)) __obj.updateDynamic("hasChildRoutes")(hasChildRoutes)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (isActive != null) __obj.updateDynamic("isActive")(isActive)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId)
    if (nav != null) __obj.updateDynamic("nav")(nav)
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (routePattern != null) __obj.updateDynamic("routePattern")(routePattern)
    if (title != null) __obj.updateDynamic("title")(title)
    if (viewUrl != null) __obj.updateDynamic("viewUrl")(viewUrl)
    __obj.asInstanceOf[DurandalRouteConfiguration]
  }
}

