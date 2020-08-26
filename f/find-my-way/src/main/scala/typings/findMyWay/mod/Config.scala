package typings.findMyWay.mod

import typings.findMyWay.anon.DeriveVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[V /* <: HTTPVersion */] extends js.Object {
  var allowUnsafeRegex: js.UndefOr[Boolean] = js.native
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var defaultRoute: js.UndefOr[js.Function2[/* req */ Req[V], /* res */ Res[V], Unit]] = js.native
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.native
  var maxParamLength: js.UndefOr[Double] = js.native
  var onBadUrl: js.UndefOr[js.Function3[/* path */ String, /* req */ Req[V], /* res */ Res[V], Unit]] = js.native
  var versioning: js.UndefOr[DeriveVersion[V]] = js.native
}

object Config {
  @scala.inline
  def apply[/* <: typings.findMyWay.mod.HTTPVersion */ V](): Config[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[V]]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config[_], /* <: typings.findMyWay.mod.HTTPVersion */ V] (val x: Self with Config[V]) extends AnyVal {
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
    def setAllowUnsafeRegex(value: Boolean): Self = this.set("allowUnsafeRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnsafeRegex: Self = this.set("allowUnsafeRegex", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setDefaultRoute(value: (/* req */ Req[V], /* res */ Res[V]) => Unit): Self = this.set("defaultRoute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDefaultRoute: Self = this.set("defaultRoute", js.undefined)
    @scala.inline
    def setIgnoreTrailingSlash(value: Boolean): Self = this.set("ignoreTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreTrailingSlash: Self = this.set("ignoreTrailingSlash", js.undefined)
    @scala.inline
    def setMaxParamLength(value: Double): Self = this.set("maxParamLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParamLength: Self = this.set("maxParamLength", js.undefined)
    @scala.inline
    def setOnBadUrl(value: (/* path */ String, /* req */ Req[V], /* res */ Res[V]) => Unit): Self = this.set("onBadUrl", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnBadUrl: Self = this.set("onBadUrl", js.undefined)
    @scala.inline
    def setVersioning(value: DeriveVersion[V]): Self = this.set("versioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersioning: Self = this.set("versioning", js.undefined)
  }
  
}

