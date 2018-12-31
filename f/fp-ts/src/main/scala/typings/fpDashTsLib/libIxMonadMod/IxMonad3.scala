package typings
package fpDashTsLib.libIxMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IxMonad3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def ichain[I, O, Z, A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, I, O, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type3[F, O, Z, B]]
  ): fpDashTsLib.libHKTMod.Type3[F, I, Z, B]
  def iof[I, A](a: A): fpDashTsLib.libHKTMod.Type3[F, I, I, A]
}

