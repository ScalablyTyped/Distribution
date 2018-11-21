package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "strmap")
@js.native
object strmapNs extends js.Object {
  @js.native
  class StrMap[A] protected ()
    extends fpDashTsLib.libStrMapMod.StrMap[A] {
    def this(value: ScalablyTyped.runtime.StringDictionary[A]) = this()
  }
  
  val URI: /* StrMap */ java.lang.String = js.native
  val collect: js.Function2[
    /* d */ fpDashTsLib.libStrMapMod.StrMap[js.Any], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val getMonoid: js.Function1[
    /* S */ js.UndefOr[fpDashTsLib.libSemigroupMod.Semigroup[js.Any]], 
    fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libStrMapMod.StrMap[js.Any]]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libStrMapMod.StrMap[js.Any]]
  ] = js.native
  val insert: js.Function3[
    /* k */ java.lang.String, 
    /* a */ js.Any, 
    /* d */ fpDashTsLib.libStrMapMod.StrMap[js.Any], 
    fpDashTsLib.libStrMapMod.StrMap[js.Any]
  ] = js.native
  val isEmpty: js.Function1[/* d */ fpDashTsLib.libStrMapMod.StrMap[js.Any], scala.Boolean] = js.native
  val isSubdictionary: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[
      /* d1 */ fpDashTsLib.libStrMapMod.StrMap[js.Any], 
      /* d2 */ fpDashTsLib.libStrMapMod.StrMap[js.Any], 
      scala.Boolean
    ]
  ] = js.native
  val lookup: js.Function2[
    /* k */ java.lang.String, 
    /* d */ fpDashTsLib.libStrMapMod.StrMap[js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Any]
  ] = js.native
  val pop: js.Function2[
    /* k */ java.lang.String, 
    /* d */ fpDashTsLib.libStrMapMod.StrMap[js.Any], 
    fpDashTsLib.libOptionMod.Option[js.Tuple2[js.Any, fpDashTsLib.libStrMapMod.StrMap[js.Any]]]
  ] = js.native
  val remove: js.Function2[
    /* k */ java.lang.String, 
    /* d */ fpDashTsLib.libStrMapMod.StrMap[js.Any], 
    fpDashTsLib.libStrMapMod.StrMap[js.Any]
  ] = js.native
  val singleton: js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libStrMapMod.StrMap[js.Any]] = js.native
  val size: js.Function1[/* d */ fpDashTsLib.libStrMapMod.StrMap[js.Any], scala.Double] = js.native
  val strmap: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.libStrMapMod.URI] with fpDashTsLib.libFoldableMod.Foldable1[fpDashTsLib.libStrMapMod.URI] with fpDashTsLib.libTraversableMod.Traversable1[fpDashTsLib.libStrMapMod.URI] with fpDashTsLib.libCompactableMod.Compactable1[fpDashTsLib.libStrMapMod.URI] with fpDashTsLib.libFilterableMod.Filterable1[fpDashTsLib.libStrMapMod.URI] with fpDashTsLib.libWitherableMod.Witherable1[fpDashTsLib.libStrMapMod.URI] = js.native
  val toArray: js.Function1[
    /* d */ fpDashTsLib.libStrMapMod.StrMap[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[java.lang.String, js.Any]]
  ] = js.native
  val toUnfoldable: js.Function1[
    /* unfoldable */ fpDashTsLib.libUnfoldableMod.Unfoldable[js.Any], 
    js.Function1[
      /* d */ fpDashTsLib.libStrMapMod.StrMap[js.Any], 
      fpDashTsLib.libHKTMod.HKT[js.Any, js.Tuple2[java.lang.String, js.Any]]
    ]
  ] = js.native
  def fromFoldable[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[F, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable2[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable3[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  def traverseWithKey[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
}

