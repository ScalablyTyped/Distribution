package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex[F, I]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def mapWithIndex[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.HKT[F, B]
}

