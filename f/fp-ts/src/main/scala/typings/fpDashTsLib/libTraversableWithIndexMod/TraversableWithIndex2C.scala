package typings
package fpDashTsLib.libTraversableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversableWithIndex2C[T /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L]
  extends fpDashTsLib.libTraversable2vMod.Traversable2v2C[T, L]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex2C[T, I, L]
     with fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex2C[T, I, L] {
  /* InferMemberOverrides */
  override val URI: T = js.native
  /* InferMemberOverrides */
  override val _L: L = js.native
  def traverseWithIndex[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  def traverseWithIndex[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  def traverseWithIndex[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  def traverseWithIndex[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  def traverseWithIndex[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, L, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  def traverseWithIndex[F /* <: fpDashTsLib.libHKTMod.URIS3 */, FU](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, FU, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, FU, L, _]], 
    fpDashTsLib.libHKTMod.Type3[F, FU, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
}

