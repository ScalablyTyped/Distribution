package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Strong3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor3[F] {
  def first[U, A, B, C](pab: fpDashTsLib.libHKTMod.Type3[F, U, A, B]): fpDashTsLib.libHKTMod.Type3[F, U, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[U, A, B, C](pab: fpDashTsLib.libHKTMod.Type3[F, U, B, C]): fpDashTsLib.libHKTMod.Type3[F, U, js.Tuple2[A, B], js.Tuple2[A, C]]
}

