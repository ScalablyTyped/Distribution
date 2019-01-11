package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Foldable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def elem[F /* <: fpDashTsLib.libHKTMod.URIS */, A](F: fpDashTsLib.libFoldableMod.Foldable1[F], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type[F, A], scala.Boolean] = js.native
  def elem[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](F: fpDashTsLib.libFoldableMod.Foldable2[F], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], scala.Boolean] = js.native
  def elem[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](F: fpDashTsLib.libFoldableMod.Foldable3[F], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], scala.Boolean] = js.native
  def elem[F, A](F: fpDashTsLib.libFoldableMod.Foldable[F], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.HKT[F, A], scala.Boolean] = js.native
  def elem[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], scala.Boolean] = js.native
  def elem[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], scala.Boolean] = js.native
  def find[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def find[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def find[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable2[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def find[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def find[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def find[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS */, M](F: fpDashTsLib.libFoldableMod.Foldable1[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, M], M] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS2 */, M](F: fpDashTsLib.libFoldableMod.Foldable2[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, M], M] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS3 */, M](F: fpDashTsLib.libFoldableMod.Foldable3[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, M], M] = js.native
  def fold[F, M](F: fpDashTsLib.libFoldableMod.Foldable[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, M], M] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS2 */, M, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, M], M] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS3 */, M, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, M], M] = js.native
  def foldM[F /* <: fpDashTsLib.libHKTMod.URIS */, M /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F], M: fpDashTsLib.libMonadMod.Monad1[M]): js.Function3[
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type[M, _]], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[M, _]
  ] = js.native
  def foldM[F /* <: fpDashTsLib.libHKTMod.URIS */, M /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable1[F], M: fpDashTsLib.libMonadMod.Monad2[M]): js.Function3[
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, _, _]], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type2[M, _, _]
  ] = js.native
  def foldM[F /* <: fpDashTsLib.libHKTMod.URIS */, M /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable1[F], M: fpDashTsLib.libMonadMod.Monad3[M]): js.Function3[
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, _, _, _]], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, _]
  ] = js.native
  def foldM[F, M](F: fpDashTsLib.libFoldableMod.Foldable[F], M: fpDashTsLib.libMonadMod.Monad[M]): js.Function3[
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[M, _]
  ] = js.native
  def foldM[F /* <: fpDashTsLib.libHKTMod.URIS */, M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFoldableMod.Foldable1[F], M: fpDashTsLib.libMonadMod.Monad2C[M, L]): js.Function3[
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, L, _]], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type2[M, L, _]
  ] = js.native
  def foldM[F /* <: fpDashTsLib.libHKTMod.URIS */, M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFoldableMod.Foldable1[F], M: fpDashTsLib.libMonadMod.Monad3C[M, U, L]): js.Function3[
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, _]], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, _]
  ] = js.native
  def foldMap[F /* <: fpDashTsLib.libHKTMod.URIS */, M](F: fpDashTsLib.libFoldableMod.Foldable1[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  def foldMap[F /* <: fpDashTsLib.libHKTMod.URIS2 */, M](F: fpDashTsLib.libFoldableMod.Foldable2[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  def foldMap[F /* <: fpDashTsLib.libHKTMod.URIS3 */, M](F: fpDashTsLib.libFoldableMod.Foldable3[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  def foldMap[F, M](F: fpDashTsLib.libFoldableMod.Foldable[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], /* f */ js.Function1[/* a */ js.Any, M], M] = js.native
  def foldMap[F /* <: fpDashTsLib.libHKTMod.URIS2 */, M, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  def foldMap[F /* <: fpDashTsLib.libHKTMod.URIS3 */, M, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  def foldr[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  def foldr[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  def foldr[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable2[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  def foldr[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable3[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  def foldr[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  def foldr[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F], G: fpDashTsLib.libFoldableMod.Foldable1[G]): fpDashTsLib.libFoldableMod.FoldableComposition11[F, G] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable1[F], G: fpDashTsLib.libFoldableMod.Foldable2[G]): fpDashTsLib.libFoldableMod.FoldableComposition12[F, G] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable2[F], G: fpDashTsLib.libFoldableMod.Foldable1[G]): fpDashTsLib.libFoldableMod.FoldableComposition21[F, G] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable2[F], G: fpDashTsLib.libFoldableMod.Foldable2[G]): fpDashTsLib.libFoldableMod.FoldableComposition22[F, G] = js.native
  def getFoldableComposition[F, G](F: fpDashTsLib.libFoldableMod.Foldable[F], G: fpDashTsLib.libFoldableMod.Foldable[G]): fpDashTsLib.libFoldableMod.FoldableComposition[F, G] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](F: fpDashTsLib.libFoldableMod.Foldable2C[F, LG], G: fpDashTsLib.libFoldableMod.Foldable2[G]): fpDashTsLib.libFoldableMod.FoldableComposition22C[F, G, LG] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](F: fpDashTsLib.libFoldableMod.Foldable3C[F, UF, LF], G: fpDashTsLib.libFoldableMod.Foldable1[G]): fpDashTsLib.libFoldableMod.FoldableComposition3C1[F, G, UF, LF] = js.native
  def intercalate[F /* <: fpDashTsLib.libHKTMod.URIS */, M](F: fpDashTsLib.libFoldableMod.Foldable1[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* sep */ M, js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[F, M], M]] = js.native
  def intercalate[F /* <: fpDashTsLib.libHKTMod.URIS2 */, M](F: fpDashTsLib.libFoldableMod.Foldable2[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* sep */ M, js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type2[F, _, M], M]] = js.native
  def intercalate[F /* <: fpDashTsLib.libHKTMod.URIS3 */, M](F: fpDashTsLib.libFoldableMod.Foldable3[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* sep */ M, js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type3[F, _, _, M], M]] = js.native
  def intercalate[F, M](F: fpDashTsLib.libFoldableMod.Foldable[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* sep */ M, js.Function1[/* fm */ fpDashTsLib.libHKTMod.HKT[F, M], M]] = js.native
  def intercalate[F /* <: fpDashTsLib.libHKTMod.URIS2 */, M, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* sep */ M, js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type2[F, L, M], M]] = js.native
  def intercalate[F /* <: fpDashTsLib.libHKTMod.URIS3 */, M, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* sep */ M, js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type3[F, U, L, M], M]] = js.native
  def maximum[F /* <: fpDashTsLib.libHKTMod.URIS */, A](F: fpDashTsLib.libFoldableMod.Foldable1[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def maximum[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](F: fpDashTsLib.libFoldableMod.Foldable2[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def maximum[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](F: fpDashTsLib.libFoldableMod.Foldable3[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def maximum[F, A](F: fpDashTsLib.libFoldableMod.Foldable[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def maximum[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def maximum[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def minimum[F /* <: fpDashTsLib.libHKTMod.URIS */, A](F: fpDashTsLib.libFoldableMod.Foldable1[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def minimum[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](F: fpDashTsLib.libFoldableMod.Foldable2[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def minimum[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](F: fpDashTsLib.libFoldableMod.Foldable3[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def minimum[F, A](F: fpDashTsLib.libFoldableMod.Foldable[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def minimum[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def minimum[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def oneOf[F /* <: fpDashTsLib.libHKTMod.URIS */, P /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F], P: fpDashTsLib.libPlusMod.Plus1[P]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[P, _]], 
    fpDashTsLib.libHKTMod.Type[P, _]
  ] = js.native
  def oneOf[F /* <: fpDashTsLib.libHKTMod.URIS */, P /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable1[F], P: fpDashTsLib.libPlusMod.Plus2[P]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[P, _, _]], 
    fpDashTsLib.libHKTMod.Type2[P, _, _]
  ] = js.native
  def oneOf[F /* <: fpDashTsLib.libHKTMod.URIS */, P /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable1[F], P: fpDashTsLib.libPlusMod.Plus3[P]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type3[P, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[P, _, _, _]
  ] = js.native
  def oneOf[F, P](F: fpDashTsLib.libFoldableMod.Foldable[F], P: fpDashTsLib.libPlusMod.Plus[P]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[P, _]], 
    fpDashTsLib.libHKTMod.HKT[P, _]
  ] = js.native
  def oneOf[F /* <: fpDashTsLib.libHKTMod.URIS */, P /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFoldableMod.Foldable1[F], P: fpDashTsLib.libPlusMod.Plus2C[P, L]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[P, L, _]], 
    fpDashTsLib.libHKTMod.Type2[P, L, _]
  ] = js.native
  def oneOf[F /* <: fpDashTsLib.libHKTMod.URIS */, P /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFoldableMod.Foldable1[F], P: fpDashTsLib.libPlusMod.Plus3C[P, U, L]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type3[P, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[P, U, L, _]
  ] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS */, A](F: fpDashTsLib.libFoldableMod.Foldable1[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, A], A] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](F: fpDashTsLib.libFoldableMod.Foldable2[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], A] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](F: fpDashTsLib.libFoldableMod.Foldable3[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], A] = js.native
  def product[F, A](F: fpDashTsLib.libFoldableMod.Foldable[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], A] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], A] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], A] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative1[M], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[M, _]], 
    fpDashTsLib.libHKTMod.Type[M, scala.Unit]
  ] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative2[M], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[M, _, _]], 
    fpDashTsLib.libHKTMod.Type2[M, _, scala.Unit]
  ] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative3[M], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type3[M, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, scala.Unit]
  ] = js.native
  def `sequence_`[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */, L](M: fpDashTsLib.libApplicativeMod.Applicative2C[M, L], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[M, L, _]], 
    fpDashTsLib.libHKTMod.Type2[M, L, scala.Unit]
  ] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */, U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[M, U, L],
    F: fpDashTsLib.libFoldableMod.Foldable1[F]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type3[M, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, scala.Unit]
  ] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS */, A](F: fpDashTsLib.libFoldableMod.Foldable1[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, A], A] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](F: fpDashTsLib.libFoldableMod.Foldable2[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], A] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](F: fpDashTsLib.libFoldableMod.Foldable3[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], A] = js.native
  def sum[F, A](F: fpDashTsLib.libFoldableMod.Foldable[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], A] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], A] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], A] = js.native
  def toArray[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libArrayMod.Global.Array[_]] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, _], fpDashTsLib.libArrayMod.Global.Array[_]] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable2[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable3[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFoldableMod.Foldable2C[F, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFoldableMod.Foldable3C[F, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def traverse[M /* <: fpDashTsLib.libHKTMod.URIS */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative1[M], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[M, _]], 
    fpDashTsLib.libHKTMod.Type[M, scala.Unit]
  ] = js.native
  def traverse[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative2[M], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, _, _]], 
    fpDashTsLib.libHKTMod.Type2[M, _, scala.Unit]
  ] = js.native
  def traverse[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative3[M], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, scala.Unit]
  ] = js.native
  def traverse[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  def traverse[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */, L](M: fpDashTsLib.libApplicativeMod.Applicative2C[M, L], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, L, _]], 
    fpDashTsLib.libHKTMod.Type2[M, L, scala.Unit]
  ] = js.native
  def traverse[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */, U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[M, U, L],
    F: fpDashTsLib.libFoldableMod.Foldable1[F]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, scala.Unit]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative1[M], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[M, _]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[M, scala.Unit]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative2[M], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, _, _]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type2[M, _, scala.Unit]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative3[M], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, _, _, _]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, scala.Unit]
  ] = js.native
  def `traverse_`[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */, L](M: fpDashTsLib.libApplicativeMod.Applicative2C[M, L], F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, L, _]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type2[M, L, scala.Unit]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */, U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[M, U, L],
    F: fpDashTsLib.libFoldableMod.Foldable1[F]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, _]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, scala.Unit]
  ] = js.native
}

