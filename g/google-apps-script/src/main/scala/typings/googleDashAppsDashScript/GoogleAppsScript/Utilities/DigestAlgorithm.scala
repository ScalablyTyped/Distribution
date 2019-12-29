package typings.googleDashAppsDashScript.GoogleAppsScript.Utilities

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DigestAlgorithm with Double] = js.native
  /* 0 */ @js.native
  object MD2 extends TopLevel[MD2 with Double]
  
  /* 1 */ @js.native
  object MD5 extends TopLevel[MD5 with Double]
  
  /* 2 */ @js.native
  object SHA_1 extends TopLevel[SHA_1 with Double]
  
  /* 3 */ @js.native
  object SHA_256 extends TopLevel[SHA_256 with Double]
  
  /* 4 */ @js.native
  object SHA_384 extends TopLevel[SHA_384 with Double]
  
  /* 5 */ @js.native
  object SHA_512 extends TopLevel[SHA_512 with Double]
  
}

