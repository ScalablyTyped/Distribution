package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RsaAlgorithm extends js.Object

@JSGlobal("GoogleAppsScript.Utilities.RsaAlgorithm")
@js.native
object RsaAlgorithm extends js.Object {
  @js.native
  sealed trait RSA_SHA_1
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.RsaAlgorithm
  
  @js.native
  sealed trait RSA_SHA_256
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.RsaAlgorithm
  
  /* 0 */ val RSA_SHA_1: RSA_SHA_1 with scala.Double = js.native
  /* 1 */ val RSA_SHA_256: RSA_SHA_256 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.RsaAlgorithm with scala.Double
  ] = js.native
}

