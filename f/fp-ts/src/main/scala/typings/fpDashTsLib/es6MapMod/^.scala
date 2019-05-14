package typings
package fpDashTsLib.es6MapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Map = js.native
  val empty: stdLib.Map[scala.Nothing, scala.Nothing] = js.native
  val map: fpDashTsLib.es6FilterableMod.Filterable2[URI] = js.native
  def collect[K](O: fpDashTsLib.es6OrdMod.Ord[K]): js.Function2[
    /* m */ stdLib.Map[K, _], 
    /* f */ js.Function2[/* k */ K, /* a */ js.Any, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def elem[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* a */ A, /* m */ stdLib.Map[_, A], scala.Boolean] = js.native
  def fromFoldable[K, F](S: fpDashTsLib.es6SetoidMod.Setoid[K], F: fpDashTsLib.es6Foldable2vMod.Foldable2v[F]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.HKT[F, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Array[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_FreeGroup[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IO[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Identity[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IxIO[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Map[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_NonEmptyArray[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_NonEmptyArray2v[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Option[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Pair[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_ReaderTaskEither[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_StrMap[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Task[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Tree[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Zipper[K](
    S: fpDashTsLib.es6SetoidMod.Setoid[K],
    F: fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[K, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Map[K, _]
  ] = js.native
  def getFilterableWithIndex[K](): fpDashTsLib.es6FilterableWithIndexMod.FilterableWithIndex2C[fpDashTsLib.fpDashTsLibStrings.Map, K, K] = js.native
  def getMonoid[K, A](SK: fpDashTsLib.es6SetoidMod.Setoid[K], SA: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6MonoidMod.Monoid[stdLib.Map[K, A]] = js.native
  def getSetoid[K, A](SK: fpDashTsLib.es6SetoidMod.Setoid[K], SA: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[stdLib.Map[K, A]] = js.native
  def getShow[K, A](SK: fpDashTsLib.es6ShowMod.Show[K], SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[stdLib.Map[K, A]] = js.native
  def getTraversableWithIndex[K](O: fpDashTsLib.es6OrdMod.Ord[K]): fpDashTsLib.es6TraversableWithIndexMod.TraversableWithIndex2C[fpDashTsLib.fpDashTsLibStrings.Map, K, K] = js.native
  def getWitherable[K](O: fpDashTsLib.es6OrdMod.Ord[K]): fpDashTsLib.es6WitherableMod.Witherable2C[fpDashTsLib.fpDashTsLibStrings.Map, K] = js.native
  def insert[K](S: fpDashTsLib.es6SetoidMod.Setoid[K]): js.Function3[/* k */ K, /* a */ js.Any, /* m */ stdLib.Map[K, _], stdLib.Map[K, _]] = js.native
  def isEmpty[K, A](d: stdLib.Map[K, A]): scala.Boolean = js.native
  def isSubmap[K, A](SK: fpDashTsLib.es6SetoidMod.Setoid[K], SA: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* d1 */ stdLib.Map[K, A], /* d2 */ stdLib.Map[K, A], scala.Boolean] = js.native
  def keys[K](O: fpDashTsLib.es6OrdMod.Ord[K]): js.Function1[/* m */ stdLib.Map[K, _], fpDashTsLib.libArrayMod.Global.Array[K]] = js.native
  def lookup[K](S: fpDashTsLib.es6SetoidMod.Setoid[K]): js.Function2[/* k */ K, /* m */ stdLib.Map[K, _], fpDashTsLib.es6OptionMod.Option[_]] = js.native
  def lookupWithKey[K](S: fpDashTsLib.es6SetoidMod.Setoid[K]): js.Function2[
    /* k */ K, 
    /* m */ stdLib.Map[K, _], 
    fpDashTsLib.es6OptionMod.Option[js.Tuple2[K, _]]
  ] = js.native
  def member[K](S: fpDashTsLib.es6SetoidMod.Setoid[K]): js.Function2[/* k */ K, /* m */ stdLib.Map[K, _], scala.Boolean] = js.native
  def pop[K](S: fpDashTsLib.es6SetoidMod.Setoid[K]): js.Function2[
    /* k */ K, 
    /* m */ stdLib.Map[K, _], 
    fpDashTsLib.es6OptionMod.Option[js.Tuple2[_, stdLib.Map[K, _]]]
  ] = js.native
  def remove[K](S: fpDashTsLib.es6SetoidMod.Setoid[K]): js.Function2[/* k */ K, /* m */ stdLib.Map[K, _], stdLib.Map[K, _]] = js.native
  def singleton[K, A](k: K, a: A): stdLib.Map[K, A] = js.native
  def size[K, A](d: stdLib.Map[K, A]): scala.Double = js.native
  def toArray[K](O: fpDashTsLib.es6OrdMod.Ord[K]): js.Function1[/* m */ stdLib.Map[K, _], fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[K, _]]] = js.native
  def toUnfoldable[K, F](O: fpDashTsLib.es6OrdMod.Ord[K], unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable[F]): js.Function1[/* d */ stdLib.Map[K, _], fpDashTsLib.es6HKTMod.HKT[F, js.Tuple2[K, _]]] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_Array[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_FreeGroup[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_IO[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_Identity[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_NonEmptyArray[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_NonEmptyArray2v[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_Option[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_Pair[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_StrMap[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_Task[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_Tree[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[K, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_Zipper[K](
    O: fpDashTsLib.es6OrdMod.Ord[K],
    unfoldable: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function1[
    /* d */ stdLib.Map[K, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[K, _]]
  ] = js.native
  def values[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[/* m */ stdLib.Map[_, A], fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
}

