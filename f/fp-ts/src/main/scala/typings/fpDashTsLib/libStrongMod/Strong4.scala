package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Strong4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor4[F] {
  def first[X, U, A, B, C](pab: fpDashTsLib.libHKTMod.Type4[F, X, U, A, B]): fpDashTsLib.libHKTMod.Type4[F, X, U, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[X, U, A, B, C](pab: fpDashTsLib.libHKTMod.Type4[F, X, U, B, C]): fpDashTsLib.libHKTMod.Type4[F, X, U, js.Tuple2[A, B], js.Tuple2[A, C]]
}

