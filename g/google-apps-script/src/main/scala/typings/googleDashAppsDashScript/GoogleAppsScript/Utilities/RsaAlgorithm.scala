package typings.googleDashAppsDashScript.GoogleAppsScript.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RsaAlgorithm extends js.Object

@JSGlobal("GoogleAppsScript.Utilities.RsaAlgorithm")
@js.native
object RsaAlgorithm extends js.Object {
  @js.native
  sealed trait RSA_SHA_1 extends RsaAlgorithm
  
  @js.native
  sealed trait RSA_SHA_256 extends RsaAlgorithm
  
  /* 0 */ val RSA_SHA_1: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.RsaAlgorithm.RSA_SHA_1 with Double = js.native
  /* 1 */ val RSA_SHA_256: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.RsaAlgorithm.RSA_SHA_256 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RsaAlgorithm with Double] = js.native
}

