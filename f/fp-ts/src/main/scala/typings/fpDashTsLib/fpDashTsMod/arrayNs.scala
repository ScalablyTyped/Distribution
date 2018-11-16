package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "array")
@js.native
object arrayNs extends js.Object {
  val URI: /* Array */ java.lang.String = js.native
  val array: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libUnfoldableMod.Unfoldable1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libAlternativeMod.Alternative1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libExtendMod.Extend1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libCompactableMod.Compactable1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libFilterableMod.Filterable1[fpDashTsLib.libArrayMod.URI] with fpDashTsLib.libWitherableMod.Witherable1[fpDashTsLib.libArrayMod.URI] = js.native
  val catOptions: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libOptionMod.Option[js.Any]], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val chop: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* f */ js.Function1[
      /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
      js.Tuple2[js.Any, fpDashTsLib.libArrayMod.Global.Array[js.Any]]
    ], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val chunksOf: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* n */ scala.Double, 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val cons: js.Function2[
    /* a */ js.Any, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val copy: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val deleteAt: js.Function2[
    /* i */ scala.Double, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val drop: js.Function2[
    /* n */ scala.Double, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val dropEnd: js.Function2[
    /* n */ scala.Double, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val dropWhile: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val empty: fpDashTsLib.libArrayMod.Global.Array[scala.Nothing] = js.native
  val filter: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val findIndex: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libOptionMod.Option[scala.Double]
  ] = js.native
  val findLast: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  val findLastIndex: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libOptionMod.Option[scala.Double]
  ] = js.native
  val flatten: js.Function1[
    /* ffa */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libArrayMod.Global.Array[js.Any]], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val fold: js.Function3[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* b */ js.Any, 
    /* cons */ js.Function2[/* head */ js.Any, /* tail */ fpDashTsLib.libArrayMod.Global.Array[js.Any], js.Any], 
    js.Any
  ] = js.native
  val foldL: js.Function3[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* nil */ js.Function0[js.Any], 
    /* cons */ js.Function2[/* head */ js.Any, /* tail */ fpDashTsLib.libArrayMod.Global.Array[js.Any], js.Any], 
    js.Any
  ] = js.native
  val foldr: js.Function3[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* b */ js.Any, 
    /* cons */ js.Function2[/* init */ fpDashTsLib.libArrayMod.Global.Array[js.Any], /* last */ js.Any, js.Any], 
    js.Any
  ] = js.native
  val foldrL: js.Function3[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* nil */ js.Function0[js.Any], 
    /* cons */ js.Function2[/* init */ fpDashTsLib.libArrayMod.Global.Array[js.Any], /* last */ js.Any, js.Any], 
    js.Any
  ] = js.native
  val getMonoid: js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]]] = js.native
  val getOrd: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val head: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  val index: js.Function2[
    /* i */ scala.Double, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  val init: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val insertAt: js.Function3[
    /* i */ scala.Double, 
    /* a */ js.Any, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val isEmpty: js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], scala.Boolean] = js.native
  val isOutOfBound: js.Function2[
    /* i */ scala.Double, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    scala.Boolean
  ] = js.native
  val last: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  val lefts: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val makeBy: js.Function2[
    /* n */ scala.Double, 
    /* f */ js.Function1[/* i */ scala.Double, js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val mapOption: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val member: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[/* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], /* a */ js.Any, scala.Boolean]
  ] = js.native
  val modifyAt: js.Function3[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* i */ scala.Double, 
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[js.Any], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val partitionMap: js.Function2[
    /* fa */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
    fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libArrayMod.Global.Array[js.Any], 
      fpDashTsLib.libArrayMod.Global.Array[js.Any]
    ]
  ] = js.native
  val range: js.Function2[
    /* start */ scala.Double, 
    /* end */ scala.Double, 
    fpDashTsLib.libArrayMod.Global.Array[scala.Double]
  ] = js.native
  val refine: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* refinement */ fpDashTsLib.libFunctionMod.Refinement[js.Any, js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val replicate: js.Function2[/* n */ scala.Double, /* a */ js.Any, fpDashTsLib.libArrayMod.Global.Array[js.Any]] = js.native
  val reverse: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val rights: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val rotate: js.Function2[
    /* n */ scala.Double, 
    /* xs */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val scanLeft: js.Function3[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val scanRight: js.Function3[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val snoc: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* a */ js.Any, 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val sort: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function1[
      /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
      fpDashTsLib.libArrayMod.Global.Array[js.Any]
    ]
  ] = js.native
  val sortBy: js.Function1[
    /* ords */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libOrdMod.Ord[js.Any]], 
    fpDashTsLib.libOptionMod.Option[
      fpDashTsLib.libFunctionMod.Endomorphism[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
    ]
  ] = js.native
  val sortBy1: js.Function2[
    /* head */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    /* tail */ fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libOrdMod.Ord[js.Any]], 
    fpDashTsLib.libFunctionMod.Endomorphism[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val span: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.Anon_Init[js.Any]
  ] = js.native
  val split: js.Function2[
    /* n */ scala.Double, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    js.Tuple2[
      fpDashTsLib.libArrayMod.Global.Array[js.Any], 
      fpDashTsLib.libArrayMod.Global.Array[js.Any]
    ]
  ] = js.native
  val tail: js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val take: js.Function2[
    /* n */ scala.Double, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val takeEnd: js.Function2[
    /* n */ scala.Double, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val takeWhile: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val uniq: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function1[
      /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
      fpDashTsLib.libArrayMod.Global.Array[js.Any]
    ]
  ] = js.native
  val unsafeDeleteAt: js.Function2[
    /* i */ scala.Double, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val unsafeInsertAt: js.Function3[
    /* i */ scala.Double, 
    /* a */ js.Any, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val unsafeUpdateAt: js.Function3[
    /* i */ scala.Double, 
    /* a */ js.Any, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val updateAt: js.Function3[
    /* i */ scala.Double, 
    /* a */ js.Any, 
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val zip: js.Function2[
    /* fa */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* fb */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val zipWith: js.Function3[
    /* fa */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* fb */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
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
  def findFirst[A](as: fpDashTsLib.libArrayMod.Global.Array[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  @JSName("findFirst")
  def findFirst_ABA[A, B /* <: A */](
    as: fpDashTsLib.libArrayMod.Global.Array[A],
    predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libOptionMod.Option[B] = js.native
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
  @js.native
  object Global extends js.Object {
    
    trait Array[T] extends js.Object {
      /** phantom property added by `fp-ts` */
      var _A: T
      /** phantom property added by `fp-ts` */
      var _URI: fpDashTsLib.libArrayMod.URI
    }
    
  }
  
}

