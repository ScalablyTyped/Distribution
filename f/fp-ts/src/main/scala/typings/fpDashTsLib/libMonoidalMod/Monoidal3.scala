package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def mult[U, L, A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], fb: fpDashTsLib.libHKTMod.Type3[F, U, L, B]): fpDashTsLib.libHKTMod.Type3[F, U, L, js.Tuple2[A, B]]
  def unit[U, L](): fpDashTsLib.libHKTMod.Type3[F, U, L, scala.Unit]
}

