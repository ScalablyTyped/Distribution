package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex4[F /* <: fpDashTsLib.libHKTMod.URIS4 */, I]
  extends fpDashTsLib.libFunctorMod.Functor4[F] {
  def mapWithIndex[X, U, L, A, B](fa: fpDashTsLib.libHKTMod.Type4[F, X, U, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.Type4[F, X, U, L, B]
}

