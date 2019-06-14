package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DigestAlgorithm extends js.Object

@JSGlobal("GoogleAppsScript.Utilities.DigestAlgorithm")
@js.native
object DigestAlgorithm extends js.Object {
  @js.native
  sealed trait MD2
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.DigestAlgorithm
  
  @js.native
  sealed trait MD5
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.DigestAlgorithm
  
  @js.native
  sealed trait SHA_1
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.DigestAlgorithm
  
  @js.native
  sealed trait SHA_256
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.DigestAlgorithm
  
  @js.native
  sealed trait SHA_384
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.DigestAlgorithm
  
  @js.native
  sealed trait SHA_512
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.DigestAlgorithm
  
  /* 0 */ val MD2: MD2 with scala.Double = js.native
  /* 1 */ val MD5: MD5 with scala.Double = js.native
  /* 2 */ val SHA_1: SHA_1 with scala.Double = js.native
  /* 3 */ val SHA_256: SHA_256 with scala.Double = js.native
  /* 4 */ val SHA_384: SHA_384 with scala.Double = js.native
  /* 5 */ val SHA_512: SHA_512 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.DigestAlgorithm with scala.Double
  ] = js.native
}

