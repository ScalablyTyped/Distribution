package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "strmap")
@js.native
object strmapNs extends js.Object {
  @js.native
  class StrMap[A] protected ()
    extends fpDashTsLib.es6StrMapMod.StrMap[A] {
    def this(value: org.scalablytyped.runtime.StringDictionary[A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.StrMap = js.native
  val strmap: (fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex1[fpDashTsLib.es6StrMapMod.URI, java.lang.String]) with fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.es6StrMapMod.URI] with (fpDashTsLib.es6TraversableWithIndexMod.TraversableWithIndex1[fpDashTsLib.es6StrMapMod.URI, java.lang.String]) with fpDashTsLib.es6CompactableMod.Compactable1[fpDashTsLib.es6StrMapMod.URI] with (fpDashTsLib.es6FilterableWithIndexMod.FilterableWithIndex1[fpDashTsLib.es6StrMapMod.URI, java.lang.String]) with fpDashTsLib.es6WitherableMod.Witherable1[fpDashTsLib.es6StrMapMod.URI] with (fpDashTsLib.es6FoldableWithIndexMod.FoldableWithIndex1[fpDashTsLib.es6StrMapMod.URI, java.lang.String]) = js.native
  def collect[A, B](d: fpDashTsLib.es6StrMapMod.StrMap[A], f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def elem[A](E: fpDashTsLib.es6EqMod.Eq[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.es6StrMapMod.StrMap[A], scala.Boolean] = js.native
  def fromFoldable[F](F: fpDashTsLib.es6FoldableMod.Foldable[F]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.HKT[F, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Const(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Either(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Free(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IOEither(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IxIO(F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Map(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Reader(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_ReaderTaskEither(F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_State(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Store(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_StrMap(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_TaskEither(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_These(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Traced(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Tuple(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Validation(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Writer(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.es6StrMapMod.StrMap[_]
  ] = js.native
  def getEq[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6StrMapMod.StrMap[A]] = js.native
  def getMonoid[A](): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6StrMapMod.StrMap[A]] = js.native
  def getMonoid[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6StrMapMod.StrMap[A]] = js.native
  def getSetoid[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6StrMapMod.StrMap[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6StrMapMod.StrMap[A]] = js.native
  def insert[A](k: java.lang.String, a: A, d: fpDashTsLib.es6StrMapMod.StrMap[A]): fpDashTsLib.es6StrMapMod.StrMap[A] = js.native
  def isEmpty[A](d: fpDashTsLib.es6StrMapMod.StrMap[A]): scala.Boolean = js.native
  def isSubdictionary[A](E: fpDashTsLib.es6EqMod.Eq[A]): js.Function2[
    /* d1 */ fpDashTsLib.es6StrMapMod.StrMap[A], 
    /* d2 */ fpDashTsLib.es6StrMapMod.StrMap[A], 
    scala.Boolean
  ] = js.native
  def lookup[A](k: java.lang.String, d: fpDashTsLib.es6StrMapMod.StrMap[A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def pop[A](k: java.lang.String, d: fpDashTsLib.es6StrMapMod.StrMap[A]): fpDashTsLib.es6OptionMod.Option[js.Tuple2[A, fpDashTsLib.es6StrMapMod.StrMap[A]]] = js.native
  def remove[A](k: java.lang.String, d: fpDashTsLib.es6StrMapMod.StrMap[A]): fpDashTsLib.es6StrMapMod.StrMap[A] = js.native
  def singleton[A](k: java.lang.String, a: A): fpDashTsLib.es6StrMapMod.StrMap[A] = js.native
  def size[A](d: fpDashTsLib.es6StrMapMod.StrMap[A]): scala.Double = js.native
  def toArray[A](d: fpDashTsLib.es6StrMapMod.StrMap[A]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[java.lang.String, A]] = js.native
  def toUnfoldable[F](U: fpDashTsLib.es6UnfoldableMod.Unfoldable[F]): js.Function1[
    /* d */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    fpDashTsLib.es6HKTMod.HKT[F, js.Tuple2[java.lang.String, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_StrMap(U: fpDashTsLib.es6UnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* d */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[F, _]], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_IxIO(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_ReaderTaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.es6StrMapMod.StrMap[_]
    ]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.es6StrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6StrMapMod.StrMap[_]]
  ] = js.native
}

