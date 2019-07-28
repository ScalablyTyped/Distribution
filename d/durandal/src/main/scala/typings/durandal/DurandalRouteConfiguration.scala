package typings.durandal

import typings.knockout.KnockoutComputed
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalRouteConfiguration extends js.Object {
  var hasChildRoutes: js.UndefOr[Boolean] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var isActive: js.UndefOr[KnockoutComputed[Boolean]] = js.undefined
  var moduleId: js.UndefOr[String] = js.undefined
  var nav: js.UndefOr[js.Any] = js.undefined
  var route: js.UndefOr[String | js.Array[String]] = js.undefined
  var routePattern: js.UndefOr[RegExp] = js.undefined
  var title: js.UndefOr[js.Any] = js.undefined
  var viewUrl: js.UndefOr[String] = js.undefined
}

object DurandalRouteConfiguration {
  @scala.inline
  def apply(
    hasChildRoutes: js.UndefOr[Boolean] = js.undefined,
    hash: String = null,
    isActive: KnockoutComputed[Boolean] = null,
    moduleId: String = null,
    nav: js.Any = null,
    route: String | js.Array[String] = null,
    routePattern: RegExp = null,
    title: js.Any = null,
    viewUrl: String = null
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

