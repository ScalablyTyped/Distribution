package typings
package fpDashTsLib.libTraversableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Traversable", JSImport.Namespace)
@js.native
object libTraversableModMembers extends js.Object {
  def getTraversableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: Traversable1[F], G: Traversable1[G]): TraversableComposition11[F, G] = js.native
  def getTraversableComposition[F, G](F: Traversable[F], G: Traversable[G]): TraversableComposition[F, G] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS */, T /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F], T: Traversable1[T]): js.Function1[
    /* tfa */ fpDashTsLib.libHKTMod.Type[T, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS */, T /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative1[F], T: Traversable2[T]): js.Function1[
    /* tfa */ fpDashTsLib.libHKTMod.Type2[T, _, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative2[F], T: Traversable1[T]): js.Function1[
    /* tfa */ fpDashTsLib.libHKTMod.Type[T, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F], T: Traversable2[T]): js.Function1[
    /* tfa */ fpDashTsLib.libHKTMod.Type2[T, _, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS3 */, T /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative3[F], T: Traversable1[T]): js.Function1[
    /* tfa */ fpDashTsLib.libHKTMod.Type[T, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def sequence[F, T](F: fpDashTsLib.libApplicativeMod.Applicative[F], T: Traversable[T]): js.Function1[
    /* tfa */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L], T: Traversable1[T]): js.Function1[
    /* tfa */ fpDashTsLib.libHKTMod.Type[T, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS2 */, LF](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, LF], T: Traversable2[T]): js.Function1[
    /* tfa */ fpDashTsLib.libHKTMod.Type2[T, _, fpDashTsLib.libHKTMod.Type2[F, LF, _]], 
    fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS3 */, T /* <: fpDashTsLib.libHKTMod.URIS */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L], T: Traversable1[T]): js.Function1[
    /* tfa */ fpDashTsLib.libHKTMod.Type[T, fpDashTsLib.libHKTMod.Type3[F, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS */, T /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F], T: Traversable1[T]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS */, T /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative1[F], T: Traversable2[T]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative2[F], T: Traversable1[T]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F], T: Traversable2[T]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */, T /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative3[F], T: Traversable1[T]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */, T /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F], T: Traversable2[T]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  def traverse[F, T](F: fpDashTsLib.libApplicativeMod.Applicative[F], T: Traversable[T]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L], T: Traversable1[T]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS2 */, LF](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, LF], T: Traversable2[T]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, LF, _]], 
    fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
}

