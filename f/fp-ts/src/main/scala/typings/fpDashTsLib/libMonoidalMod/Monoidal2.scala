package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Monoidal2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def mult[L, A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], fb: fpDashTsLib.libHKTMod.Type2[F, L, B]): fpDashTsLib.libHKTMod.Type2[F, L, js.Tuple2[A, B]]
  def unit[L](): fpDashTsLib.libHKTMod.Type2[F, L, scala.Unit]
}

