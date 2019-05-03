package typings
package fpDashTsLib.libStrMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/StrMap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.StrMap = js.native
  val strmap: (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[URI, java.lang.String]) with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[URI, java.lang.String]) with fpDashTsLib.libCompactableMod.Compactable1[URI] with (fpDashTsLib.libFilterableWithIndexMod.FilterableWithIndex1[URI, java.lang.String]) with fpDashTsLib.libWitherableMod.Witherable1[URI] with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[URI, java.lang.String]) = js.native
  def collect[A, B](d: StrMap[A], f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def elem[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ StrMap[A], scala.Boolean] = js.native
  def fromFoldable[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Const(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Either(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Free(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IOEither(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IxIO(F: fpDashTsLib.libFoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Map(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Reader(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_ReaderTaskEither(F: fpDashTsLib.libFoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_State(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Store(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_StrMap(F: fpDashTsLib.libFoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_TaskEither(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_These(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Tuple(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Validation(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Writer(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    StrMap[_]
  ] = js.native
  def getMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[StrMap[A]] = js.native
  def getMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[StrMap[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[StrMap[A]] = js.native
  def insert[A](k: java.lang.String, a: A, d: StrMap[A]): StrMap[A] = js.native
  def isEmpty[A](d: StrMap[A]): scala.Boolean = js.native
  def isSubdictionary[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* d1 */ StrMap[A], /* d2 */ StrMap[A], scala.Boolean] = js.native
  def lookup[A](k: java.lang.String, d: StrMap[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def pop[A](k: java.lang.String, d: StrMap[A]): fpDashTsLib.libOptionMod.Option[js.Tuple2[A, StrMap[A]]] = js.native
  def remove[A](k: java.lang.String, d: StrMap[A]): StrMap[A] = js.native
  def singleton[A](k: java.lang.String, a: A): StrMap[A] = js.native
  def size[A](d: StrMap[A]): scala.Double = js.native
  def toArray[A](d: StrMap[A]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[java.lang.String, A]] = js.native
  def toUnfoldable[F](U: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): js.Function1[/* d */ StrMap[_], fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]]] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_StrMap(U: fpDashTsLib.libUnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* d */ StrMap[_], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, StrMap[_]]
  ] = js.native
}

