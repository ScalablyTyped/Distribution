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

object IxMonad {
  @scala.inline
  def apply[F](
    URI: F,
    ichain: (fpDashTsLib.libHKTMod.HKT3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT3[F, js.Any, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.HKT3[F, js.Any, js.Any, js.Any],
    iof: js.Any => fpDashTsLib.libHKTMod.HKT3[F, js.Any, js.Any, js.Any]
  ): IxMonad[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ichain = js.Any.fromFunction2(ichain), iof = js.Any.fromFunction1(iof))
  
    __obj.asInstanceOf[IxMonad[F]]
  }
}

