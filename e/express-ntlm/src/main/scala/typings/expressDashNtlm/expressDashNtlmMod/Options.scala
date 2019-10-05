package typings.expressDashNtlm.expressDashNtlmMod

import typings.express.expressMod.Handler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var badrequest: js.UndefOr[Handler] = js.undefined
  var debug: js.UndefOr[js.Function2[/* prefix */ String, /* message */ String, Unit]] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var domaincontroller: js.UndefOr[String] = js.undefined
  var forbidden: js.UndefOr[Handler] = js.undefined
  var internalservererror: js.UndefOr[Handler] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var tlsOptions: js.UndefOr[ConnectionOptions] = js.undefined
  var unauthorized: js.UndefOr[Handler] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    badrequest: (/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction) => js.Any = null,
    debug: (/* prefix */ String, /* message */ String) => Unit = null,
    domain: String = null,
    domaincontroller: String = null,
    forbidden: (/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction) => js.Any = null,
    internalservererror: (/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction) => js.Any = null,
    prefix: String = null,
    tlsOptions: ConnectionOptions = null,
    unauthorized: (/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction) => js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (badrequest != null) __obj.updateDynamic("badrequest")(js.Any.fromFunction3(badrequest))
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction2(debug))
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (domaincontroller != null) __obj.updateDynamic("domaincontroller")(domaincontroller)
    if (forbidden != null) __obj.updateDynamic("forbidden")(js.Any.fromFunction3(forbidden))
    if (internalservererror != null) __obj.updateDynamic("internalservererror")(js.Any.fromFunction3(internalservererror))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions)
    if (unauthorized != null) __obj.updateDynamic("unauthorized")(js.Any.fromFunction3(unauthorized))
    __obj.asInstanceOf[Options]
  }
}

