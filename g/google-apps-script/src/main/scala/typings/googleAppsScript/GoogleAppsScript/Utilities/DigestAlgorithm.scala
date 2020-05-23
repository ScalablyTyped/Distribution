package typings.googleAppsScript.GoogleAppsScript.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DigestAlgorithm extends js.Object

/**
  * Selector of Digest algorithm.
  */
@JSGlobal("GoogleAppsScript.Utilities.DigestAlgorithm")
@js.native
object DigestAlgorithm extends js.Object {
  @js.native
  sealed trait MD2 extends DigestAlgorithm
  
  @js.native
  sealed trait MD5 extends DigestAlgorithm
  
  @js.native
  sealed trait SHA_1 extends DigestAlgorithm
  
  @js.native
  sealed trait SHA_256 extends DigestAlgorithm
  
  @js.native
  sealed trait SHA_384 extends DigestAlgorithm
  
  @js.native
  sealed trait SHA_512 extends DigestAlgorithm
  
}

