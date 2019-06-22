package typings
package fpDashTsLib.es6IxMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IxMonad3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  val URI: F
  def ichain[I, O, Z, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind3[F, I, O, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind3[F, O, Z, B]]
  ): fpDashTsLib.es6HKTMod.Kind3[F, I, Z, B]
  def iof[I, A](a: A): fpDashTsLib.es6HKTMod.Kind3[F, I, I, A]
}

object IxMonad3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    ichain: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any],
    iof: js.Any => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): IxMonad3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ichain = js.Any.fromFunction2(ichain), iof = js.Any.fromFunction1(iof))
  
    __obj.asInstanceOf[IxMonad3[F]]
  }
}

