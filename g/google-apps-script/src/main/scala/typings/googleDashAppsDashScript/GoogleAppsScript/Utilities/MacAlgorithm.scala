package typings.googleDashAppsDashScript.GoogleAppsScript.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MacAlgorithm extends js.Object

@JSGlobal("GoogleAppsScript.Utilities.MacAlgorithm")
@js.native
object MacAlgorithm extends js.Object {
  @js.native
  sealed trait HMAC_MD5 extends MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_1 extends MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_256 extends MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_384 extends MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_512 extends MacAlgorithm
  
  /* 0 */ val HMAC_MD5: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_MD5 with Double = js.native
  /* 1 */ val HMAC_SHA_1: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_1 with Double = js.native
  /* 2 */ val HMAC_SHA_256: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_256 with Double = js.native
  /* 3 */ val HMAC_SHA_384: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_384 with Double = js.native
  /* 4 */ val HMAC_SHA_512: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_512 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MacAlgorithm with Double] = js.native
}

