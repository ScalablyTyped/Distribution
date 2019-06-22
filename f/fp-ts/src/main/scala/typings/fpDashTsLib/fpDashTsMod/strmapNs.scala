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
    def this(value: org.scalablytyped.runtime.StringDictionary[A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.StrMap = js.native
  val strmap: (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[fpDashTsLib.libStrMapMod.URI, java.lang.String]) with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libStrMapMod.URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[fpDashTsLib.libStrMapMod.URI, java.lang.String]) with fpDashTsLib.libCompactableMod.Compactable1[fpDashTsLib.libStrMapMod.URI] with (fpDashTsLib.libFilterableWithIndexMod.FilterableWithIndex1[fpDashTsLib.libStrMapMod.URI, java.lang.String]) with fpDashTsLib.libWitherableMod.Witherable1[fpDashTsLib.libStrMapMod.URI] with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[fpDashTsLib.libStrMapMod.URI, java.lang.String]) = js.native
  def collect[A, B](d: fpDashTsLib.libStrMapMod.StrMap[A], f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def elem[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libStrMapMod.StrMap[A], scala.Boolean] = js.native
  def fromFoldable[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Const(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Either(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Free(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IOEither(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IxIO(F: fpDashTsLib.libFoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Map(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Reader(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_ReaderTaskEither(F: fpDashTsLib.libFoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_State(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Store(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_StrMap(F: fpDashTsLib.libFoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_TaskEither(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_These(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Traced(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Tuple(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Validation(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Writer(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    fpDashTsLib.libStrMapMod.StrMap[_]
  ] = js.native
  def getEq[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libStrMapMod.StrMap[A]] = js.native
  def getMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libStrMapMod.StrMap[A]] = js.native
  def getMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libStrMapMod.StrMap[A]] = js.native
  def getSetoid[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libStrMapMod.StrMap[A]] = js.native
  def getShow[A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libStrMapMod.StrMap[A]] = js.native
  def insert[A](k: java.lang.String, a: A, d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libStrMapMod.StrMap[A] = js.native
  def isEmpty[A](d: fpDashTsLib.libStrMapMod.StrMap[A]): scala.Boolean = js.native
  def isSubdictionary[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function2[
    /* d1 */ fpDashTsLib.libStrMapMod.StrMap[A], 
    /* d2 */ fpDashTsLib.libStrMapMod.StrMap[A], 
    scala.Boolean
  ] = js.native
  def lookup[A](k: java.lang.String, d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def pop[A](k: java.lang.String, d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libOptionMod.Option[js.Tuple2[A, fpDashTsLib.libStrMapMod.StrMap[A]]] = js.native
  def remove[A](k: java.lang.String, d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libStrMapMod.StrMap[A] = js.native
  def singleton[A](k: java.lang.String, a: A): fpDashTsLib.libStrMapMod.StrMap[A] = js.native
  def size[A](d: fpDashTsLib.libStrMapMod.StrMap[A]): scala.Double = js.native
  def toArray[A](d: fpDashTsLib.libStrMapMod.StrMap[A]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[java.lang.String, A]] = js.native
  def toUnfoldable[F](U: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): js.Function1[
    /* d */ fpDashTsLib.libStrMapMod.StrMap[_], 
    fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_StrMap(U: fpDashTsLib.libUnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* d */ fpDashTsLib.libStrMapMod.StrMap[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libStrMapMod.StrMap[_]
    ]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.libStrMapMod.StrMap[_], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libStrMapMod.StrMap[_]]
  ] = js.native
}

