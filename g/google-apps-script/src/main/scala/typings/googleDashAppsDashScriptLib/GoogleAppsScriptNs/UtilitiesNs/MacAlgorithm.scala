package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MacAlgorithm extends js.Object

@JSGlobal("GoogleAppsScript.Utilities.MacAlgorithm")
@js.native
object MacAlgorithm extends js.Object {
  @js.native
  sealed trait HMAC_MD5
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_1
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_256
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_384
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_512
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.MacAlgorithm
  
  val HMAC_MD5: HMAC_MD5 with java.lang.String = js.native
  val HMAC_SHA_1: HMAC_SHA_1 with java.lang.String = js.native
  val HMAC_SHA_256: HMAC_SHA_256 with java.lang.String = js.native
  val HMAC_SHA_384: HMAC_SHA_384 with java.lang.String = js.native
  val HMAC_SHA_512: HMAC_SHA_512 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.MacAlgorithm with java.lang.String
  ] = js.native
}

