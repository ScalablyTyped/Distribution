package typings.googleDashAppsDashScript.GoogleAppsScript.Utilities

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_MD5
import typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_1
import typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_256
import typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_384
import typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MacAlgorithm extends js.Object

/**
  * Selector of MAC algorithm
  */
@JSGlobal("GoogleAppsScript.Utilities.MacAlgorithm")
@js.native
object MacAlgorithm extends js.Object {
  @js.native
  sealed trait HMAC_MD5
    extends typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_1
    extends typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_256
    extends typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_384
    extends typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_512
    extends typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.MacAlgorithm with Double
  ] = js.native
  /* 0 */ @js.native
  object HMAC_MD5 extends TopLevel[HMAC_MD5 with Double]
  
  /* 1 */ @js.native
  object HMAC_SHA_1 extends TopLevel[HMAC_SHA_1 with Double]
  
  /* 2 */ @js.native
  object HMAC_SHA_256 extends TopLevel[HMAC_SHA_256 with Double]
  
  /* 3 */ @js.native
  object HMAC_SHA_384 extends TopLevel[HMAC_SHA_384 with Double]
  
  /* 4 */ @js.native
  object HMAC_SHA_512 extends TopLevel[HMAC_SHA_512 with Double]
  
}

