package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Strong[F]
  extends fpDashTsLib.libProfunctorMod.Profunctor[F] {
  def first[A, B, C](pab: fpDashTsLib.libHKTMod.HKT2[F, A, B]): fpDashTsLib.libHKTMod.HKT2[F, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[A, B, C](pab: fpDashTsLib.libHKTMod.HKT2[F, B, C]): fpDashTsLib.libHKTMod.HKT2[F, js.Tuple2[A, B], js.Tuple2[A, C]]
}

