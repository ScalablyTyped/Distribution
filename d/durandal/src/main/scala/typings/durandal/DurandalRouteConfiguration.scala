package typings.durandal

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalRouteConfiguration extends js.Object {
  var hasChildRoutes: js.UndefOr[Boolean] = js.native
  var hash: js.UndefOr[String] = js.native
  var isActive: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any
  ] = js.native
  var moduleId: js.UndefOr[String] = js.native
  var nav: js.UndefOr[js.Any] = js.native
  var route: js.UndefOr[String | js.Array[String]] = js.native
  var routePattern: js.UndefOr[RegExp] = js.native
  var title: js.UndefOr[js.Any] = js.native
  var viewUrl: js.UndefOr[String] = js.native
}

object DurandalRouteConfiguration {
  @scala.inline
  def apply(): DurandalRouteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalRouteConfiguration]
  }
  @scala.inline
  implicit class DurandalRouteConfigurationOps[Self <: DurandalRouteConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHasChildRoutes(value: Boolean): Self = this.set("hasChildRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasChildRoutes: Self = this.set("hasChildRoutes", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setIsActive(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any
    ): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleId: Self = this.set("moduleId", js.undefined)
    @scala.inline
    def setNav(value: js.Any): Self = this.set("nav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNav: Self = this.set("nav", js.undefined)
    @scala.inline
    def setRouteVarargs(value: String*): Self = this.set("route", js.Array(value :_*))
    @scala.inline
    def setRoute(value: String | js.Array[String]): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    @scala.inline
    def setRoutePattern(value: RegExp): Self = this.set("routePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutePattern: Self = this.set("routePattern", js.undefined)
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setViewUrl(value: String): Self = this.set("viewUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewUrl: Self = this.set("viewUrl", js.undefined)
  }
  
}

