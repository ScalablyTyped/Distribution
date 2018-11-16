package typings
package fpDashTsLib.libTraversable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Traversable2v2C[T /* <: fpDashTsLib.libHKTMod.URIS2 */, TL]
  extends fpDashTsLib.libFoldable2vMod.Foldable2v2C[T, TL]
     with fpDashTsLib.libFunctorMod.Functor2C[T, TL] {
  /* InferMemberOverrides */
  override val URI: T = js.native
  /* InferMemberOverrides */
  override val _L: TL = js.native
  def sequence[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, fpDashTsLib.libHKTMod.Type2[F, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[F, FL, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS3 */, FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, FU, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, fpDashTsLib.libHKTMod.Type3[F, FU, FL, _]], 
    fpDashTsLib.libHKTMod.Type3[F, FU, FL, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def traverse[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[F, FL, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */, FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, FU, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, TL, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, FU, FL, _]], 
    fpDashTsLib.libHKTMod.Type3[F, FU, FL, fpDashTsLib.libHKTMod.Type2[T, TL, _]]
  ] = js.native
}

