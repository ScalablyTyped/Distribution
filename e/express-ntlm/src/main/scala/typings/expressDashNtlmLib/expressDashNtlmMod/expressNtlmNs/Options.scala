package typings
package expressDashNtlmLib.expressDashNtlmMod.expressNtlmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var badrequest: js.UndefOr[expressLib.expressMod.eNs.Handler] = js.undefined
  var debug: js.UndefOr[
    js.Function2[/* prefix */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var domaincontroller: js.UndefOr[java.lang.String] = js.undefined
  var forbidden: js.UndefOr[expressLib.expressMod.eNs.Handler] = js.undefined
  var internalservererror: js.UndefOr[expressLib.expressMod.eNs.Handler] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var tlsOptions: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  var unauthorized: js.UndefOr[expressLib.expressMod.eNs.Handler] = js.undefined
}

