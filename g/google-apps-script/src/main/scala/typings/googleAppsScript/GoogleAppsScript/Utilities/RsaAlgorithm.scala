package typings.googleAppsScript.GoogleAppsScript.Utilities

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RsaAlgorithm extends js.Object

/**
  * Selector of RSA algorithm
  */
@JSGlobal("GoogleAppsScript.Utilities.RsaAlgorithm")
@js.native
object RsaAlgorithm extends js.Object {
  @js.native
  sealed trait RSA_SHA_1 extends RsaAlgorithm
  
  @js.native
  sealed trait RSA_SHA_256 extends RsaAlgorithm
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RsaAlgorithm with Double] = js.native
  /* 0 */ @js.native
  object RSA_SHA_1 extends TopLevel[RSA_SHA_1 with Double]
  
  /* 1 */ @js.native
  object RSA_SHA_256 extends TopLevel[RSA_SHA_256 with Double]
  
}

