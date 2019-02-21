package typings
package fpDashTsLib.libTraversable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraverseComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def apply[H](H: fpDashTsLib.libApplicativeMod.Applicative[H]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[H, _]], 
    fpDashTsLib.libHKTMod.HKT[H, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]]]
  ] = js.native
  def apply[H /* <: fpDashTsLib.libHKTMod.URIS */](H: fpDashTsLib.libApplicativeMod.Applicative1[H]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[H, _]], 
    fpDashTsLib.libHKTMod.Type[H, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]]]
  ] = js.native
  def apply[H /* <: fpDashTsLib.libHKTMod.URIS2 */](H: fpDashTsLib.libApplicativeMod.Applicative2[H]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[H, _, _]], 
    fpDashTsLib.libHKTMod.Type2[H, _, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]]]
  ] = js.native
  def apply[H /* <: fpDashTsLib.libHKTMod.URIS3 */](H: fpDashTsLib.libApplicativeMod.Applicative3[H]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[H, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[H, _, _, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]]]
  ] = js.native
  def apply[H /* <: fpDashTsLib.libHKTMod.URIS2 */, HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[H, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[H, HL, _]], 
    fpDashTsLib.libHKTMod.Type2[H, HL, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]]]
  ] = js.native
  def apply[H /* <: fpDashTsLib.libHKTMod.URIS3 */, HU, HL](H: fpDashTsLib.libApplicativeMod.Applicative3C[H, HU, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[H, HU, HL, _]], 
    fpDashTsLib.libHKTMod.Type3[H, HU, HL, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, _]]]
  ] = js.native
}

