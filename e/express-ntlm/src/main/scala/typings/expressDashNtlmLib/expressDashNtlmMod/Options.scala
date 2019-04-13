package typings
package expressDashNtlmLib.expressDashNtlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var badrequest: js.UndefOr[expressLib.expressMod.Handler] = js.undefined
  var debug: js.UndefOr[
    js.Function2[/* prefix */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var domaincontroller: js.UndefOr[java.lang.String] = js.undefined
  var forbidden: js.UndefOr[expressLib.expressMod.Handler] = js.undefined
  var internalservererror: js.UndefOr[expressLib.expressMod.Handler] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var tlsOptions: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  var unauthorized: js.UndefOr[expressLib.expressMod.Handler] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    badrequest: expressLib.expressMod.Handler = null,
    debug: (/* prefix */ java.lang.String, /* message */ java.lang.String) => scala.Unit = null,
    domain: java.lang.String = null,
    domaincontroller: java.lang.String = null,
    forbidden: expressLib.expressMod.Handler = null,
    internalservererror: expressLib.expressMod.Handler = null,
    prefix: java.lang.String = null,
    tlsOptions: nodeLib.tlsMod.ConnectionOptions = null,
    unauthorized: expressLib.expressMod.Handler = null
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

