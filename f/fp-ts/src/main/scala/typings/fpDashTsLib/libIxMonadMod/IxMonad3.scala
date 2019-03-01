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

object IxMonad3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    ichain: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    iof: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]]
  ): IxMonad3[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("ichain")(ichain)
    __obj.updateDynamic("iof")(iof)
    __obj.asInstanceOf[IxMonad3[F]]
  }
}

