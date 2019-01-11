package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Foldable2v", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def findFirst[F](F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def findFirst[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def findFirst[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def findFirst[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def findFirst[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def findFirst[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def fold[M, F](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, M], M] = js.native
  def fold[M, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, M], M] = js.native
  def fold[M, F /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, M], M] = js.native
  def fold[M, F /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, M], M] = js.native
  def fold[M, F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, M], M] = js.native
  def fold[M, F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, M], M] = js.native
  def foldM[M /* <: fpDashTsLib.libHKTMod.URIS */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type[M, _]], 
    fpDashTsLib.libHKTMod.Type[M, _]
  ] = js.native
  def foldM[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad2[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, _, _]], 
    fpDashTsLib.libHKTMod.Type2[M, _, _]
  ] = js.native
  def foldM[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad3[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, _]
  ] = js.native
  def foldM[M, F](M: fpDashTsLib.libMonadMod.Monad[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, _]
  ] = js.native
  def foldM[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */, L](M: fpDashTsLib.libMonadMod.Monad2C[M, L], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, L, _]], 
    fpDashTsLib.libHKTMod.Type2[M, L, _]
  ] = js.native
  def foldM[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */, U, L](M: fpDashTsLib.libMonadMod.Monad3C[M, U, L], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, _]
  ] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F], G: fpDashTsLib.libFoldable2vMod.Foldable2v1[G]): fpDashTsLib.libFoldable2vMod.Foldable2vComposition11[F, G] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F], G: fpDashTsLib.libFoldable2vMod.Foldable2v2[G]): fpDashTsLib.libFoldable2vMod.Foldable2vComposition12[F, G] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F], G: fpDashTsLib.libFoldable2vMod.Foldable2v1[G]): fpDashTsLib.libFoldable2vMod.Foldable2vComposition21[F, G] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F], G: fpDashTsLib.libFoldable2vMod.Foldable2v2[G]): fpDashTsLib.libFoldable2vMod.Foldable2vComposition22[F, G] = js.native
  def getFoldableComposition[F, G](F: fpDashTsLib.libFoldable2vMod.Foldable2v[F], G: fpDashTsLib.libFoldable2vMod.Foldable2v[G]): fpDashTsLib.libFoldable2vMod.Foldable2vComposition[F, G] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F],
    G: fpDashTsLib.libFoldable2vMod.Foldable2v2C[G, LG]
  ): fpDashTsLib.libFoldable2vMod.Foldable2vComposition12C[F, G, LG] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */, LF](
    F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, LF],
    G: fpDashTsLib.libFoldable2vMod.Foldable2v1[G]
  ): fpDashTsLib.libFoldable2vMod.Foldable2vComposition2C1[F, G, LF] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F],
    G: fpDashTsLib.libFoldable2vMod.Foldable2v2C[G, LG]
  ): fpDashTsLib.libFoldable2vMod.Foldable2vComposition22C[F, G, LG] = js.native
  def getFoldableComposition[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](
    F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, UF, LF],
    G: fpDashTsLib.libFoldable2vMod.Foldable2v1[G]
  ): fpDashTsLib.libFoldable2vMod.Foldable2vComposition3C1[F, G, UF, LF] = js.native
  def intercalate[M, F](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function2[/* sep */ M, /* fm */ fpDashTsLib.libHKTMod.HKT[F, M], M] = js.native
  def intercalate[M, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function2[/* sep */ M, /* fm */ fpDashTsLib.libHKTMod.Type[F, M], M] = js.native
  def intercalate[M, F /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function2[/* sep */ M, /* fm */ fpDashTsLib.libHKTMod.Type2[F, _, M], M] = js.native
  def intercalate[M, F /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function2[/* sep */ M, /* fm */ fpDashTsLib.libHKTMod.Type3[F, _, _, M], M] = js.native
  def intercalate[M, F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L]): js.Function2[/* sep */ M, /* fm */ fpDashTsLib.libHKTMod.Type2[F, L, M], M] = js.native
  def intercalate[M, F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L]): js.Function2[/* sep */ M, /* fm */ fpDashTsLib.libHKTMod.Type3[F, U, L, M], M] = js.native
  def max[F, A](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def max[F /* <: fpDashTsLib.libHKTMod.URIS */, A](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def max[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def max[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def max[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def max[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def member[F, A](S: fpDashTsLib.libSetoidMod.Setoid[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.HKT[F, A], scala.Boolean] = js.native
  def member[F /* <: fpDashTsLib.libHKTMod.URIS */, A](S: fpDashTsLib.libSetoidMod.Setoid[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type[F, A], scala.Boolean] = js.native
  def member[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](S: fpDashTsLib.libSetoidMod.Setoid[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], scala.Boolean] = js.native
  def member[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](S: fpDashTsLib.libSetoidMod.Setoid[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], scala.Boolean] = js.native
  def member[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](S: fpDashTsLib.libSetoidMod.Setoid[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], scala.Boolean] = js.native
  def member[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](S: fpDashTsLib.libSetoidMod.Setoid[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], scala.Boolean] = js.native
  def min[F, A](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def min[F /* <: fpDashTsLib.libHKTMod.URIS */, A](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def min[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def min[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def min[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def min[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](O: fpDashTsLib.libOrdMod.Ord[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def oneOf[P /* <: fpDashTsLib.libHKTMod.URIS */, F /* <: fpDashTsLib.libHKTMod.URIS */](P: fpDashTsLib.libPlusMod.Plus1[P], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[P, _]], 
    fpDashTsLib.libHKTMod.Type[P, _]
  ] = js.native
  def oneOf[P /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */](P: fpDashTsLib.libPlusMod.Plus2[P], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[P, _, _]], 
    fpDashTsLib.libHKTMod.Type2[P, _, _]
  ] = js.native
  def oneOf[P /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */](P: fpDashTsLib.libPlusMod.Plus3[P], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type3[P, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[P, _, _, _]
  ] = js.native
  def oneOf[P, F](P: fpDashTsLib.libPlusMod.Plus[P], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[P, _]], 
    fpDashTsLib.libHKTMod.HKT[P, _]
  ] = js.native
  def oneOf[P /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */, L](P: fpDashTsLib.libPlusMod.Plus2C[P, L], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[P, L, _]], 
    fpDashTsLib.libHKTMod.Type2[P, L, _]
  ] = js.native
  def oneOf[P /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L, F /* <: fpDashTsLib.libHKTMod.URIS */](P: fpDashTsLib.libPlusMod.Plus3C[P, U, L], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type3[P, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[P, U, L, _]
  ] = js.native
  def product[F, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], A] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS */, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, A], A] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], A] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], A] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], A] = js.native
  def product[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], A] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative1[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[M, _]], 
    fpDashTsLib.libHKTMod.Type[M, scala.Unit]
  ] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative2[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[M, _, _]], 
    fpDashTsLib.libHKTMod.Type2[M, _, scala.Unit]
  ] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative3[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type3[M, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, scala.Unit]
  ] = js.native
  def `sequence_`[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */, L](
    M: fpDashTsLib.libApplicativeMod.Applicative2C[M, L],
    F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[M, L, _]], 
    fpDashTsLib.libHKTMod.Type2[M, L, scala.Unit]
  ] = js.native
  def `sequence_`[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */, U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[M, U, L],
    F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type3[M, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, scala.Unit]
  ] = js.native
  def sum[F, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], A] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS */, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, A], A] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, _, A], A] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, A], A] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A, L](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], A] = js.native
  def sum[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A, U, L](S: fpDashTsLib.libSemiringMod.Semiring[A], F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, A], A] = js.native
  def toArray[F](F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libArrayMod.Global.Array[_]] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, _], fpDashTsLib.libArrayMod.Global.Array[_]] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFoldable2vMod.Foldable2v2C[F, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def toArray[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFoldable2vMod.Foldable2v3C[F, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative1[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[M, _]], 
    fpDashTsLib.libHKTMod.Type[M, scala.Unit]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative2[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, _, _]], 
    fpDashTsLib.libHKTMod.Type2[M, _, scala.Unit]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libApplicativeMod.Applicative3[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[M, _, _, scala.Unit]
  ] = js.native
  def `traverse_`[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS2 */, F /* <: fpDashTsLib.libHKTMod.URIS */, L](
    M: fpDashTsLib.libApplicativeMod.Applicative2C[M, L],
    F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[M, L, _]], 
    fpDashTsLib.libHKTMod.Type2[M, L, scala.Unit]
  ] = js.native
  def `traverse_`[M /* <: fpDashTsLib.libHKTMod.URIS3 */, F /* <: fpDashTsLib.libHKTMod.URIS */, U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[M, U, L],
    F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[M, U, L, scala.Unit]
  ] = js.native
}

