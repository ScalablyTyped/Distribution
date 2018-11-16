package typings
package fpDashTsLib.libIxMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IxMonad[F] extends js.Object {
  val URI: F
  def ichain[I, O, Z, A, B](
    fa: fpDashTsLib.libHKTMod.HKT3[F, I, O, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT3[F, O, Z, B]]
  ): fpDashTsLib.libHKTMod.HKT3[F, I, Z, B]
  def iof[I, A](a: A): fpDashTsLib.libHKTMod.HKT3[F, I, I, A]
}

