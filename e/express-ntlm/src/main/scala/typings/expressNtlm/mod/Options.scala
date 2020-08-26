package typings.expressNtlm.mod

import typings.express.mod.Handler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.tlsMod.ConnectionOptions
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var badrequest: js.UndefOr[Handler] = js.native
  var debug: js.UndefOr[js.Function2[/* prefix */ String, /* message */ String, Unit]] = js.native
  var domain: js.UndefOr[String] = js.native
  var domaincontroller: js.UndefOr[String] = js.native
  var forbidden: js.UndefOr[Handler] = js.native
  var internalservererror: js.UndefOr[Handler] = js.native
  var prefix: js.UndefOr[String] = js.native
  var tlsOptions: js.UndefOr[ConnectionOptions] = js.native
  var unauthorized: js.UndefOr[Handler] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBadrequest(
      value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any
    ): Self = this.set("badrequest", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBadrequest: Self = this.set("badrequest", js.undefined)
    @scala.inline
    def setDebug(value: (/* prefix */ String, /* message */ String) => Unit): Self = this.set("debug", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setDomaincontroller(value: String): Self = this.set("domaincontroller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomaincontroller: Self = this.set("domaincontroller", js.undefined)
    @scala.inline
    def setForbidden(
      value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any
    ): Self = this.set("forbidden", js.Any.fromFunction3(value))
    @scala.inline
    def deleteForbidden: Self = this.set("forbidden", js.undefined)
    @scala.inline
    def setInternalservererror(
      value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any
    ): Self = this.set("internalservererror", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInternalservererror: Self = this.set("internalservererror", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setTlsOptions(value: ConnectionOptions): Self = this.set("tlsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsOptions: Self = this.set("tlsOptions", js.undefined)
    @scala.inline
    def setUnauthorized(
      value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any
    ): Self = this.set("unauthorized", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUnauthorized: Self = this.set("unauthorized", js.undefined)
  }
  
}

