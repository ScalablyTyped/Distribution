package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor2[F] {
  def first[A, B, C](pab: fpDashTsLib.libHKTMod.Type2[F, A, B]): fpDashTsLib.libHKTMod.Type2[F, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[A, B, C](pab: fpDashTsLib.libHKTMod.Type2[F, B, C]): fpDashTsLib.libHKTMod.Type2[F, js.Tuple2[A, B], js.Tuple2[A, C]]
}

