package typings
package fpDashTsLib.libSemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Semigroupoid3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U] extends js.Object {
  val URI: F
  val _U: U
  def compose[L, A, B](ab: fpDashTsLib.libHKTMod.Type3[F, U, A, B], la: fpDashTsLib.libHKTMod.Type3[F, U, L, A]): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

