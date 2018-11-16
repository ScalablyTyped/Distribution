package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Monoidal[F]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def mult[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], fb: fpDashTsLib.libHKTMod.HKT[F, B]): fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.libHKTMod.HKT[F, scala.Unit]
}

