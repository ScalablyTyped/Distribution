package typings
package fpDashTsLib.libSemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  val URI: F
  def compose[X, U, L, A, B](ab: fpDashTsLib.libHKTMod.Type4[F, X, U, A, B], la: fpDashTsLib.libHKTMod.Type4[F, X, U, L, A]): fpDashTsLib.libHKTMod.Type4[F, X, U, L, B]
}

