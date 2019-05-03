package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "array")
@js.native
object arrayNs extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Array = js.native
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
  def elem[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* as */ fpDashTsLib.libArrayMod.Global.Array[A], scala.Boolean] = js.native
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
  def lookup[A](i: scala.Double, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
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
  @JSName("traverse")
  def traverse_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_IxIO[U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libArrayMod.Global.Array[_]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libArrayMod.Global.Array[_]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      _, 
      fpDashTsLib.libArrayMod.Global.Array[_]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      L, 
      fpDashTsLib.libArrayMod.Global.Array[_]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      _, 
      fpDashTsLib.libArrayMod.Global.Array[_]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      L, 
      fpDashTsLib.libArrayMod.Global.Array[_]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libArrayMod.Global.Array[_]]
  ] = js.native
  @JSName("traverse")
  def traverse_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* ta */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libArrayMod.Global.Array[_]]
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
  def unzip[A, B](as: fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[A, B]]): js.Tuple2[fpDashTsLib.libArrayMod.Global.Array[A], fpDashTsLib.libArrayMod.Global.Array[B]] = js.native
  def updateAt[A](i: scala.Double, a: A, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def zip[A, B](fa: fpDashTsLib.libArrayMod.Global.Array[A], fb: fpDashTsLib.libArrayMod.Global.Array[B]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[A, B]] = js.native
  def zipWith[A, B, C](
    fa: fpDashTsLib.libArrayMod.Global.Array[A],
    fb: fpDashTsLib.libArrayMod.Global.Array[B],
    f: js.Function2[/* a */ A, /* b */ B, C]
  ): fpDashTsLib.libArrayMod.Global.Array[C] = js.native
}

