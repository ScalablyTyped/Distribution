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
  
  val RSA_SHA_1: RSA_SHA_1 with java.lang.String = js.native
  val RSA_SHA_256: RSA_SHA_256 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.RsaAlgorithm with java.lang.String
  ] = js.native
}

