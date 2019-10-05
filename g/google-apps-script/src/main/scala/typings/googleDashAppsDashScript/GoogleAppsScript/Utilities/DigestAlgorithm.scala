package typings.googleDashAppsDashScript.GoogleAppsScript.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DigestAlgorithm extends js.Object

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
  
  /* 0 */ val MD2: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.MD2 with Double = js.native
  /* 1 */ val MD5: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.MD5 with Double = js.native
  /* 2 */ val SHA_1: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_1 with Double = js.native
  /* 3 */ val SHA_256: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_256 with Double = js.native
  /* 4 */ val SHA_384: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_384 with Double = js.native
  /* 5 */ val SHA_512: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_512 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DigestAlgorithm with Double] = js.native
}

