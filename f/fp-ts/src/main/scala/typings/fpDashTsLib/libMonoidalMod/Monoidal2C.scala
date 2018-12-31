package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L] {
  def mult[A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], fb: fpDashTsLib.libHKTMod.Type2[F, L, B]): fpDashTsLib.libHKTMod.Type2[F, L, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.libHKTMod.Type2[F, L, scala.Unit]
}

