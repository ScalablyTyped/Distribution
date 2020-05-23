package typings.googleAppsScript.GoogleAppsScript.Utilities

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
  sealed trait HMAC_MD5 extends MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_1 extends MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_256 extends MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_384 extends MacAlgorithm
  
  @js.native
  sealed trait HMAC_SHA_512 extends MacAlgorithm
  
}

