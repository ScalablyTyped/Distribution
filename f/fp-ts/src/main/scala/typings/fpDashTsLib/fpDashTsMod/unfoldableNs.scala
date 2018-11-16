package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "unfoldable")
@js.native
object unfoldableNs extends js.Object {
  def empty[F, A](U: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): fpDashTsLib.libHKTMod.HKT[F, A] = js.native
  def empty[F /* <: fpDashTsLib.libHKTMod.URIS */, A](U: fpDashTsLib.libUnfoldableMod.Unfoldable1[F]): fpDashTsLib.libHKTMod.Type[F, A] = js.native
  def empty[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L, A](U: fpDashTsLib.libUnfoldableMod.Unfoldable2[F]): fpDashTsLib.libHKTMod.Type2[F, L, A] = js.native
  def empty[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L, A](U: fpDashTsLib.libUnfoldableMod.Unfoldable2C[F, L]): fpDashTsLib.libHKTMod.Type2[F, L, A] = js.native
  def empty[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L, A](U: fpDashTsLib.libUnfoldableMod.Unfoldable3[F]): fpDashTsLib.libHKTMod.Type3[F, U, L, A] = js.native
  def empty[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L, A](U: fpDashTsLib.libUnfoldableMod.Unfoldable3C[F, U, L]): fpDashTsLib.libHKTMod.Type3[F, U, L, A] = js.native
  def replicate[F](U: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): js.Function2[/* a */ js.Any, /* n */ scala.Double, fpDashTsLib.libHKTMod.HKT[F, _]] = js.native
  def replicate[F /* <: fpDashTsLib.libHKTMod.URIS2 */](U: fpDashTsLib.libUnfoldableMod.Unfoldable2[F]): js.Function2[/* a */ js.Any, /* n */ scala.Double, fpDashTsLib.libHKTMod.Type2[F, _, _]] = js.native
  def replicate[F /* <: fpDashTsLib.libHKTMod.URIS3 */](U: fpDashTsLib.libUnfoldableMod.Unfoldable3[F]): js.Function2[/* a */ js.Any, /* n */ scala.Double, fpDashTsLib.libHKTMod.Type3[F, _, _, _]] = js.native
  def replicate[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](U: fpDashTsLib.libUnfoldableMod.Unfoldable2C[F, L]): js.Function2[/* a */ js.Any, /* n */ scala.Double, fpDashTsLib.libHKTMod.Type2[F, L, _]] = js.native
  def replicate[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](U: fpDashTsLib.libUnfoldableMod.Unfoldable3C[F, U, L]): js.Function2[/* a */ js.Any, /* n */ scala.Double, fpDashTsLib.libHKTMod.Type3[F, U, L, _]] = js.native
  def replicateA[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS */](
    A: fpDashTsLib.libApplicativeMod.Applicative2[F],
    UT: fpDashTsLib.libUnfoldableMod.Unfoldable1[T] with fpDashTsLib.libTraversableMod.Traversable1[T]
  ): js.Function2[
    /* n */ scala.Double, 
    /* ma */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def replicateA[F /* <: fpDashTsLib.libHKTMod.URIS3 */, T /* <: fpDashTsLib.libHKTMod.URIS */](
    A: fpDashTsLib.libApplicativeMod.Applicative3[F],
    UT: fpDashTsLib.libUnfoldableMod.Unfoldable1[T] with fpDashTsLib.libTraversableMod.Traversable1[T]
  ): js.Function2[
    /* n */ scala.Double, 
    /* ma */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def replicateA[F /* <: fpDashTsLib.libHKTMod.URIS */, T /* <: fpDashTsLib.libHKTMod.URIS */](
    F: fpDashTsLib.libApplicativeMod.Applicative1[F],
    UT: fpDashTsLib.libUnfoldableMod.Unfoldable1[T] with fpDashTsLib.libTraversableMod.Traversable1[T]
  ): js.Function2[
    /* n */ scala.Double, 
    /* ma */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def replicateA[F /* <: fpDashTsLib.libHKTMod.URIS2 */, T /* <: fpDashTsLib.libHKTMod.URIS */, L](
    A: fpDashTsLib.libApplicativeMod.Applicative2C[F, L],
    UT: fpDashTsLib.libUnfoldableMod.Unfoldable1[T] with fpDashTsLib.libTraversableMod.Traversable1[T]
  ): js.Function2[
    /* n */ scala.Double, 
    /* ma */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  def replicateA[F /* <: fpDashTsLib.libHKTMod.URIS3 */, T /* <: fpDashTsLib.libHKTMod.URIS */, U, L](
    A: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L],
    UT: fpDashTsLib.libUnfoldableMod.Unfoldable1[T] with fpDashTsLib.libTraversableMod.Traversable1[T]
  ): js.Function2[
    /* n */ scala.Double, 
    /* ma */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type[T, _]]
  ] = js.native
  @JSName("replicate")
  def replicate_FURIS[F /* <: fpDashTsLib.libHKTMod.URIS */](U: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): js.Function2[/* a */ js.Any, /* n */ scala.Double, fpDashTsLib.libHKTMod.Type[F, _]] = js.native
  def singleton[F](U: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]] = js.native
  def singleton[F /* <: fpDashTsLib.libHKTMod.URIS */](U: fpDashTsLib.libUnfoldableMod.Unfoldable1[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]] = js.native
  def singleton[F /* <: fpDashTsLib.libHKTMod.URIS2 */](U: fpDashTsLib.libUnfoldableMod.Unfoldable2[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]] = js.native
  def singleton[F /* <: fpDashTsLib.libHKTMod.URIS3 */](U: fpDashTsLib.libUnfoldableMod.Unfoldable3[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]] = js.native
  def singleton[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](U: fpDashTsLib.libUnfoldableMod.Unfoldable2C[F, L]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, L, _]] = js.native
  def singleton[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](U: fpDashTsLib.libUnfoldableMod.Unfoldable3C[F, U, L]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, U, L, _]] = js.native
}

