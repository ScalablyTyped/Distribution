package typings.expressDashNtlm.expressDashNtlmMod

import typings.express.expressMod.Handler
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
    badrequest: Handler = null,
    debug: (/* prefix */ String, /* message */ String) => Unit = null,
    domain: String = null,
    domaincontroller: String = null,
    forbidden: Handler = null,
    internalservererror: Handler = null,
    prefix: String = null,
    tlsOptions: ConnectionOptions = null,
    unauthorized: Handler = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (badrequest != null) __obj.updateDynamic("badrequest")(badrequest)
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction2(debug))
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (domaincontroller != null) __obj.updateDynamic("domaincontroller")(domaincontroller)
    if (forbidden != null) __obj.updateDynamic("forbidden")(forbidden)
    if (internalservererror != null) __obj.updateDynamic("internalservererror")(internalservererror)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions)
    if (unauthorized != null) __obj.updateDynamic("unauthorized")(unauthorized)
    __obj.asInstanceOf[Options]
  }
}

