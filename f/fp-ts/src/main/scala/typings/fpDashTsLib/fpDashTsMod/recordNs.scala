package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "record")
@js.native
object recordNs extends js.Object {
  val collect: js.Function2[
    /* d */ stdLib.Record[java.lang.String, js.Any], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val compact: js.Function1[
    /* fa */ stdLib.Record[java.lang.String, fpDashTsLib.libOptionMod.Option[js.Any]], 
    stdLib.Record[java.lang.String, js.Any]
  ] = js.native
  val empty: stdLib.Record[java.lang.String, scala.Nothing] = js.native
  val filterMap: js.Function2[
    /* fa */ stdLib.Record[java.lang.String, js.Any], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
    stdLib.Record[java.lang.String, js.Any]
  ] = js.native
  val foldMap: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    js.Function2[
      /* fa */ stdLib.Record[java.lang.String, js.Any], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ]
  ] = js.native
  val foldr: js.Function3[
    /* fa */ stdLib.Record[java.lang.String, js.Any], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any], 
    js.Any
  ] = js.native
  val getMonoid: js.Function1[
    /* S */ js.Any, 
    fpDashTsLib.libMonoidMod.Monoid[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[stdLib.Record[java.lang.String, js.Any]]
  ] = js.native
  val insert: js.Function3[
    /* k */ java.lang.String, 
    /* a */ js.Any, 
    /* d */ stdLib.Record[java.lang.String, js.Any], 
    stdLib.Record[java.lang.String, js.Any]
  ] = js.native
  val isEmpty: js.Function1[/* d */ stdLib.Record[java.lang.String, js.Any], scala.Boolean] = js.native
  val isSubdictionary: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[
      /* d1 */ stdLib.Record[java.lang.String, js.Any], 
      /* d2 */ stdLib.Record[java.lang.String, js.Any], 
      scala.Boolean
    ]
  ] = js.native
  val lookup: js.Function2[
    /* key */ java.lang.String, 
    /* fa */ stdLib.Record[java.lang.String, js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  val map: js.Function2[
    /* fa */ stdLib.Record[java.lang.String, js.Any], 
    /* f */ js.Function1[/* a */ js.Any, js.Any], 
    stdLib.Record[java.lang.String, js.Any]
  ] = js.native
  val mapWithKey: js.Function2[
    /* fa */ stdLib.Record[java.lang.String, js.Any], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, js.Any], 
    stdLib.Record[java.lang.String, js.Any]
  ] = js.native
  val partition: js.Function2[
    /* fa */ stdLib.Record[java.lang.String, js.Any], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, js.Any], stdLib.Record[java.lang.String, js.Any]]
  ] = js.native
  val partitionMap: js.Function2[
    /* fa */ stdLib.Record[java.lang.String, js.Any], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, js.Any], stdLib.Record[java.lang.String, js.Any]]
  ] = js.native
  val pop: js.Function2[
    /* k */ java.lang.String, 
    /* d */ stdLib.Record[java.lang.String, js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Tuple2[js.Any, stdLib.Record[java.lang.String, js.Any]]]
  ] = js.native
  val reduce: js.Function3[
    /* fa */ stdLib.Record[java.lang.String, js.Any], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, js.Any], 
    js.Any
  ] = js.native
  val remove: js.Function2[
    /* k */ java.lang.String, 
    /* d */ stdLib.Record[java.lang.String, js.Any], 
    stdLib.Record[java.lang.String, js.Any]
  ] = js.native
  val separate: js.Function1[
    /* fa */ stdLib.Record[java.lang.String, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, js.Any], stdLib.Record[java.lang.String, js.Any]]
  ] = js.native
  val singleton: js.Function2[/* k */ java.lang.String, /* a */ js.Any, stdLib.Record[java.lang.String, js.Any]] = js.native
  val size: js.Function1[/* d */ stdLib.Record[java.lang.String, js.Any], scala.Double] = js.native
  val toArray: js.Function1[
    /* d */ stdLib.Record[java.lang.String, js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[java.lang.String, js.Any]]
  ] = js.native
  val toUnfoldable: js.Function1[
    /* unfoldable */ fpDashTsLib.libUnfoldableMod.Unfoldable[js.Any], 
    js.Function1[
      /* d */ stdLib.Record[java.lang.String, js.Any], 
      fpDashTsLib.libHKTMod.HKT[js.Any, js.Tuple2[java.lang.String, js.Any]]
    ]
  ] = js.native
  def filter[A](fa: stdLib.Record[java.lang.String, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): stdLib.Record[java.lang.String, A] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](fa: stdLib.Record[java.lang.String, A], p: fpDashTsLib.libFunctionMod.Refinement[A, B]): stdLib.Record[java.lang.String, B] = js.native
  def fromFoldable[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[F, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable2[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable3[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def sequence[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type3[F, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wilt[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.HKT[
      F, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      F, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      _, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      U, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wither[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.Type[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[F, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[F, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
}

