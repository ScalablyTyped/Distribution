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
  
  val MD2: MD2 with java.lang.String = js.native
  val MD5: MD5 with java.lang.String = js.native
  val SHA_1: SHA_1 with java.lang.String = js.native
  val SHA_256: SHA_256 with java.lang.String = js.native
  val SHA_384: SHA_384 with java.lang.String = js.native
  val SHA_512: SHA_512 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.DigestAlgorithm with java.lang.String
  ] = js.native
}

