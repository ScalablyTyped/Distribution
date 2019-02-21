package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "map")
@js.native
object mapNs extends js.Object {
  val URI: /* Map */ java.lang.String = js.native
  val empty: stdLib.Map[scala.Nothing, scala.Nothing] = js.native
  val map: fpDashTsLib.libFilterableMod.Filterable2[fpDashTsLib.libMapMod.URI] = js.native
  def collect[K](O: fpDashTsLib.libOrdMod.Ord[K]): js.Function2[
    /* m */ stdLib.Map[K, _], 
    /* f */ js.Function2[/* k */ K, /* a */ js.Any, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def elem[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* m */ stdLib.Map[_, A], scala.Boolean] = js.native
  def fromFoldable[K, F](S: fpDashTsLib.libSetoidMod.Setoid[K], F: fpDashTsLib.libFoldable2vMod.Foldable2v[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[K, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  def fromFoldable[K, F /* <: fpDashTsLib.libHKTMod.URIS */](S: fpDashTsLib.libSetoidMod.Setoid[K], F: fpDashTsLib.libFoldable2vMod.Foldable2v1[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[F, js.Tuple2[K, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  def fromFoldable[K, F /* <: fpDashTsLib.libHKTMod.URIS2 */](S: fpDashTsLib.libSetoidMod.Setoid[K], F: fpDashTsLib.libFoldable2vMod.Foldable2v2[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[K, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  def fromFoldable[K, F /* <: fpDashTsLib.libHKTMod.URIS3 */](S: fpDashTsLib.libSetoidMod.Setoid[K], F: fpDashTsLib.libFoldable2vMod.Foldable2v3[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[K, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  def getFilterableWithIndex[K](): fpDashTsLib.libFilterableWithIndexMod.FilterableWithIndex2C[fpDashTsLib.fpDashTsLibStrings.Map, K, K] = js.native
  def getMonoid[K, A](SK: fpDashTsLib.libSetoidMod.Setoid[K], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[stdLib.Map[K, A]] = js.native
  def getSetoid[K, A](SK: fpDashTsLib.libSetoidMod.Setoid[K], SA: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[stdLib.Map[K, A]] = js.native
  def getTraversableWithIndex[K](O: fpDashTsLib.libOrdMod.Ord[K]): fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex2C[fpDashTsLib.fpDashTsLibStrings.Map, K, K] = js.native
  def getWitherable[K](O: fpDashTsLib.libOrdMod.Ord[K]): fpDashTsLib.libWitherableMod.Witherable2C[fpDashTsLib.fpDashTsLibStrings.Map, K] = js.native
  def insert[K](S: fpDashTsLib.libSetoidMod.Setoid[K]): js.Function3[/* k */ K, /* a */ js.Any, /* m */ stdLib.Map[K, _], stdLib.Map[K, _]] = js.native
  def isEmpty[K, A](d: stdLib.Map[K, A]): scala.Boolean = js.native
  def isSubmap[K, A](SK: fpDashTsLib.libSetoidMod.Setoid[K], SA: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* d1 */ stdLib.Map[K, A], /* d2 */ stdLib.Map[K, A], scala.Boolean] = js.native
  def keys[K](O: fpDashTsLib.libOrdMod.Ord[K]): js.Function1[/* m */ stdLib.Map[K, _], fpDashTsLib.libArrayMod.Global.Array[K]] = js.native
  def lookup[K](S: fpDashTsLib.libSetoidMod.Setoid[K]): js.Function2[/* k */ K, /* m */ stdLib.Map[K, _], fpDashTsLib.libOptionMod.Option[_]] = js.native
  def lookupWithKey[K](S: fpDashTsLib.libSetoidMod.Setoid[K]): js.Function2[
    /* k */ K, 
    /* m */ stdLib.Map[K, _], 
    fpDashTsLib.libOptionMod.Option[js.Tuple2[K, _]]
  ] = js.native
  def member[K](S: fpDashTsLib.libSetoidMod.Setoid[K]): js.Function2[/* k */ K, /* m */ stdLib.Map[K, _], scala.Boolean] = js.native
  def pop[K](S: fpDashTsLib.libSetoidMod.Setoid[K]): js.Function2[
    /* k */ K, 
    /* m */ stdLib.Map[K, _], 
    fpDashTsLib.libOptionMod.Option[js.Tuple2[_, stdLib.Map[K, _]]]
  ] = js.native
  def remove[K](S: fpDashTsLib.libSetoidMod.Setoid[K]): js.Function2[/* k */ K, /* m */ stdLib.Map[K, _], stdLib.Map[K, _]] = js.native
  def singleton[K, A](k: K, a: A): stdLib.Map[K, A] = js.native
  def size[K, A](d: stdLib.Map[K, A]): scala.Double = js.native
  def toArray[K](O: fpDashTsLib.libOrdMod.Ord[K]): js.Function1[/* m */ stdLib.Map[K, _], fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[K, _]]] = js.native
  def toUnfoldable[K, F](O: fpDashTsLib.libOrdMod.Ord[K], unfoldable: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): js.Function1[/* d */ stdLib.Map[K, _], fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[K, _]]] = js.native
  def toUnfoldable[K, F /* <: fpDashTsLib.libHKTMod.URIS */](O: fpDashTsLib.libOrdMod.Ord[K], unfoldable: fpDashTsLib.libUnfoldableMod.Unfoldable1[F]): js.Function1[/* d */ stdLib.Map[K, _], fpDashTsLib.libHKTMod.Type[F, js.Tuple2[K, _]]] = js.native
  def values[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* m */ stdLib.Map[_, A], fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
}

