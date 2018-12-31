package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def mult[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], fb: fpDashTsLib.libHKTMod.Type[F, B]): fpDashTsLib.libHKTMod.Type[F, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.libHKTMod.Type[F, scala.Unit]
}

