package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libFunctorMod.Functor3C[F, U, L] {
  def mult[A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], fb: fpDashTsLib.libHKTMod.Type3[F, U, L, B]): fpDashTsLib.libHKTMod.Type3[F, U, L, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.libHKTMod.Type3[F, U, L, scala.Unit]
}

