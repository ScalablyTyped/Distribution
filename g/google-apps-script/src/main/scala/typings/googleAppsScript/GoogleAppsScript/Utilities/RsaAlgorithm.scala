package typings.googleAppsScript.GoogleAppsScript.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
