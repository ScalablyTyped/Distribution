package typings
package fpDashTsLib.libArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Array", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* Array */ java.lang.String = js.native
  val array: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libUnfoldableMod.Unfoldable1[fpDashTsLib.libArrayMod.URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[fpDashTsLib.libArrayMod.URI, scala.Double]) with fpDashTsLib.libAlternativeMod.Alternative1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libExtendMod.Extend1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libCompactableMod.Compactable1[fpDashTsLib.libArrayMod.URI] with (fpDashTsLib.libFilterableWithIndexMod.FilterableWithIndex1[fpDashTsLib.libArrayMod.URI, scala.Double]) with fpDashTsLib.libWitherableMod.Witherable1[fpDashTsLib.libArrayMod.URI] with (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[fpDashTsLib.libArrayMod.URI, scala.Double]) with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[fpDashTsLib.libArrayMod.URI, scala.Double]) = js.native
  val empty: fpDashTsLib.libArrayMod.Global.Array[scala.Nothing] = js.native
  def catOptions[A](as: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def chop[A, B](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    f: js.Function1[
      /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
      js.Tuple2[B, fpDashTsLib.libArrayMod.Global.Array[A]]
    ]
  ): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def chunksOf[A](as: fpDashTsLib.libArrayMod.Global.Array[A], n: scala.Double): fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def comprehension[A, R](
    input: js.Array[fpDashTsLib.libArrayMod.Global.Array[A]],
    f: js.Function1[/* a */ A, scala.Boolean],
    g: js.Function1[/* a */ A, R]
  ): fpDashTsLib.libArrayMod.Global.Array[R] = js.native
  def comprehension[A, B, R](
    input: js.Tuple2[fpDashTsLib.libArrayMod.Global.Array[A], fpDashTsLib.libArrayMod.Global.Array[B]],
    f: js.Function2[/* a */ A, /* b */ B, scala.Boolean],
    g: js.Function2[/* a */ A, /* b */ B, R]
  ): fpDashTsLib.libArrayMod.Global.Array[R] = js.native
  def comprehension[A, B, C, R](
    input: js.Tuple3[
      fpDashTsLib.libArrayMod.Global.Array[A], 
      fpDashTsLib.libArrayMod.Global.Array[B], 
      fpDashTsLib.libArrayMod.Global.Array[C]
    ],
    f: js.Function3[/* a */ A, /* b */ B, /* c */ C, scala.Boolean],
    g: js.Function3[/* a */ A, /* b */ B, /* c */ C, R]
  ): fpDashTsLib.libArrayMod.Global.Array[R] = js.native
  def comprehension[A, B, C, D, R](
    input: js.Tuple4[
      fpDashTsLib.libArrayMod.Global.Array[A], 
      fpDashTsLib.libArrayMod.Global.Array[B], 
      fpDashTsLib.libArrayMod.Global.Array[C], 
      fpDashTsLib.libArrayMod.Global.Array[D]
    ],
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, scala.Boolean],
    g: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, R]
  ): fpDashTsLib.libArrayMod.Global.Array[R] = js.native
  def cons[A](a: A, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def copy[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def deleteAt[A](i: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def difference[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* xs */ fpDashTsLib.libArrayMod.Global.Array[A], 
    /* ys */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[A]
  ] = js.native
  def drop[A](n: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def dropEnd[A](n: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def dropWhile[A](as: fpDashTsLib.libArrayMod.Global.Array[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def filter[A](as: fpDashTsLib.libArrayMod.Global.Array[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def findFirst[A](as: fpDashTsLib.libArrayMod.Global.Array[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  @JSName("findFirst")
  def findFirst_ABA[A, B /* <: A */](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libOptionMod.Option[B] = js.native
  def findIndex[A](as: fpDashTsLib.libArrayMod.Global.Array[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[scala.Double] = js.native
  def findLast[A](as: fpDashTsLib.libArrayMod.Global.Array[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def findLastIndex[A](as: fpDashTsLib.libArrayMod.Global.Array[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[scala.Double] = js.native
  @JSName("findLast")
  def findLast_ABA[A, B /* <: A */](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libOptionMod.Option[B] = js.native
  def flatten[A](ffa: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libArrayMod.Global.Array[A]]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def fold[A, B](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    b: B,
    cons: js.Function2[/* head */ A, /* tail */ fpDashTsLib.libArrayMod.Global.Array[A], B]
  ): B = js.native
  def foldL[A, B](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    nil: js.Function0[B],
    cons: js.Function2[/* head */ A, /* tail */ fpDashTsLib.libArrayMod.Global.Array[A], B]
  ): B = js.native
  def foldr[A, B](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    b: B,
    cons: js.Function2[/* init */ fpDashTsLib.libArrayMod.Global.Array[A], /* last */ A, B]
  ): B = js.native
  def foldrL[A, B](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    nil: js.Function0[B],
    cons: js.Function2[/* init */ fpDashTsLib.libArrayMod.Global.Array[A], /* last */ A, B]
  ): B = js.native
  def getMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getOrd[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def head[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def index[A](i: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def init[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def insertAt[A](i: scala.Double, a: A, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def intersection[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* xs */ fpDashTsLib.libArrayMod.Global.Array[A], 
    /* ys */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[A]
  ] = js.native
  def isEmpty[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): scala.Boolean = js.native
  def isOutOfBound[A](i: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): scala.Boolean = js.native
  def last[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def lefts[L, A](as: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[L, A]]): fpDashTsLib.libArrayMod.Global.Array[L] = js.native
  def makeBy[A](n: scala.Double, f: js.Function1[/* i */ scala.Double, A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def mapOption[A, B](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def member[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], /* a */ A, scala.Boolean] = js.native
  def modifyAt[A](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    i: scala.Double,
    f: fpDashTsLib.libFunctionMod.Endomorphism[A]
  ): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def partition[A](fa: fpDashTsLib.libArrayMod.Global.Array[A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libArrayMod.Global.Array[A], fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def partitionMap[A, L, R](
    fa: fpDashTsLib.libArrayMod.Global.Array[A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[L, R]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libArrayMod.Global.Array[L], fpDashTsLib.libArrayMod.Global.Array[R]] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](fa: fpDashTsLib.libArrayMod.Global.Array[A], p: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libArrayMod.Global.Array[A], fpDashTsLib.libArrayMod.Global.Array[B]] = js.native
  def range(start: scala.Double, end: scala.Double): fpDashTsLib.libArrayMod.Global.Array[scala.Double] = js.native
  def refine[A, B /* <: A */](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def replicate[A](n: scala.Double, a: A): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def reverse[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def rights[L, A](as: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[L, A]]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def rotate[A](n: scala.Double, xs: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def scanLeft[A, B](as: fpDashTsLib.libArrayMod.Global.Array[A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def scanRight[A, B](as: fpDashTsLib.libArrayMod.Global.Array[A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def snoc[A](as: fpDashTsLib.libArrayMod.Global.Array[A], a: A): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def sort[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[A]
  ] = js.native
  def sortBy[A](ords: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libOrdMod.Ord[A]]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libFunctionMod.Endomorphism[fpDashTsLib.libArrayMod.Global.Array[A]]] = js.native
  def sortBy1[A](
    head: fpDashTsLib.libOrdMod.Ord[A],
    tail: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libOrdMod.Ord[A]]
  ): fpDashTsLib.libFunctionMod.Endomorphism[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def span[A](as: fpDashTsLib.libArrayMod.Global.Array[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.Anon_InitRest[A] = js.native
  @JSName("span")
  def span_ABAAnon_Init[A, B /* <: A */](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.Anon_Init[B, A] = js.native
  def split[A](n: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): js.Tuple2[fpDashTsLib.libArrayMod.Global.Array[A], fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def tail[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def take[A](n: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def takeEnd[A](n: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def takeWhile[A](as: fpDashTsLib.libArrayMod.Global.Array[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  @JSName("takeWhile")
  def takeWhile_ABA[A, B /* <: A */](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def traverse[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  def union[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* xs */ fpDashTsLib.libArrayMod.Global.Array[A], 
    /* ys */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[A]
  ] = js.native
  def uniq[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[A]
  ] = js.native
  def unsafeDeleteAt[A](i: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def unsafeInsertAt[A](i: scala.Double, a: A, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def unsafeUpdateAt[A](i: scala.Double, a: A, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def updateAt[A](i: scala.Double, a: A, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def zip[A, B](fa: fpDashTsLib.libArrayMod.Global.Array[A], fb: fpDashTsLib.libArrayMod.Global.Array[B]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[A, B]] = js.native
  def zipWith[A, B, C](
    fa: fpDashTsLib.libArrayMod.Global.Array[A],
    fb: fpDashTsLib.libArrayMod.Global.Array[B],
    f: js.Function2[/* a */ A, /* b */ B, C]
  ): fpDashTsLib.libArrayMod.Global.Array[C] = js.native
}

