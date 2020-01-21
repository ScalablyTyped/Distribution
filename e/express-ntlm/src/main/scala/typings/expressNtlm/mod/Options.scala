package typings.expressNtlm.mod

import typings.express.mod.Handler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
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
    badrequest: (/* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any = null,
    debug: (/* prefix */ String, /* message */ String) => Unit = null,
    domain: String = null,
    domaincontroller: String = null,
    forbidden: (/* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any = null,
    internalservererror: (/* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any = null,
    prefix: String = null,
    tlsOptions: ConnectionOptions = null,
    unauthorized: (/* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (badrequest != null) __obj.updateDynamic("badrequest")(js.Any.fromFunction3(badrequest))
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction2(debug))
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domaincontroller != null) __obj.updateDynamic("domaincontroller")(domaincontroller.asInstanceOf[js.Any])
    if (forbidden != null) __obj.updateDynamic("forbidden")(js.Any.fromFunction3(forbidden))
    if (internalservererror != null) __obj.updateDynamic("internalservererror")(js.Any.fromFunction3(internalservererror))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions.asInstanceOf[js.Any])
    if (unauthorized != null) __obj.updateDynamic("unauthorized")(js.Any.fromFunction3(unauthorized))
    __obj.asInstanceOf[Options]
  }
}

