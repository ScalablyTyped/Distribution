package typings.fpTs

import typings.fpTs.anon.Fn30
import typings.fpTs.anon.Fn31
import typings.fpTs.libApplicativeMod.Applicative
import typings.fpTs.libApplicativeMod.Applicative1
import typings.fpTs.libApplicativeMod.Applicative2
import typings.fpTs.libApplicativeMod.Applicative2C
import typings.fpTs.libApplicativeMod.Applicative3
import typings.fpTs.libApplicativeMod.Applicative3C
import typings.fpTs.libApplicativeMod.Applicative4
import typings.fpTs.libCompactableMod.Compactable1
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libEqMod.Eq
import typings.fpTs.libFilterableMod.Filterable1
import typings.fpTs.libFilterableWithIndexMod.FilterableWithIndex1
import typings.fpTs.libFilterableWithIndexMod.PredicateWithIndex
import typings.fpTs.libFilterableWithIndexMod.RefinementWithIndex
import typings.fpTs.libFoldableMod.Foldable1
import typings.fpTs.libFoldableMod.Foldable2
import typings.fpTs.libFoldableMod.Foldable3
import typings.fpTs.libFoldableWithIndexMod.FoldableWithIndex1
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libFunctorWithIndexMod.FunctorWithIndex1
import typings.fpTs.libMagmaMod.Magma
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libOrdMod.Ord_
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libSeparatedMod.Separated_
import typings.fpTs.libShowMod.Show
import typings.fpTs.libTraversableMod.Traversable1
import typings.fpTs.libTraversableWithIndexMod.TraversableWithIndex1
import typings.fpTs.libUnfoldableMod.Unfoldable
import typings.fpTs.libUnfoldableMod.Unfoldable1
import typings.fpTs.libWitherableMod.PipeableWilt1
import typings.fpTs.libWitherableMod.PipeableWither1
import typings.fpTs.libWitherableMod.Witherable1
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRecordMod {
  
  @JSImport("fp-ts/lib/Record", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Record", "Compactable")
  @js.native
  val Compactable: Compactable1[typings.fpTs.libRecordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "Filterable")
  @js.native
  val Filterable: Filterable1[typings.fpTs.libRecordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "FilterableWithIndex")
  @js.native
  val FilterableWithIndex: FilterableWithIndex1[typings.fpTs.libRecordMod.URI, String] = js.native
  
  @JSImport("fp-ts/lib/Record", "Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.libRecordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "FoldableWithIndex")
  @js.native
  val FoldableWithIndex: FoldableWithIndex1[typings.fpTs.libRecordMod.URI, String] = js.native
  
  @JSImport("fp-ts/lib/Record", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.libRecordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "FunctorWithIndex")
  @js.native
  val FunctorWithIndex: FunctorWithIndex1[typings.fpTs.libRecordMod.URI, String] = js.native
  
  @JSImport("fp-ts/lib/Record", "Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.libRecordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "TraversableWithIndex")
  @js.native
  val TraversableWithIndex: TraversableWithIndex1[typings.fpTs.libRecordMod.URI, String] = js.native
  
  @JSImport("fp-ts/lib/Record", "URI")
  @js.native
  val URI: /* "Record" */ String = js.native
  type URI = /* "Record" */ String
  
  @JSImport("fp-ts/lib/Record", "Witherable")
  @js.native
  val Witherable: Witherable1[typings.fpTs.libRecordMod.URI] = js.native
  
  inline def collect(O: Ord_[String]): js.Function1[
    /* f */ js.Function2[/* k */ String, /* a */ Any, Any], 
    js.Function1[/* r */ Record[String, Any], js.Array[Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* k */ String, /* a */ Any, Any], 
    js.Function1[/* r */ Record[String, Any], js.Array[Any]]
  ]]
  inline def collect[K /* <: String */, A, B](f: js.Function2[/* k */ K, /* a */ A, B]): js.Function1[/* r */ Record[K, A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* r */ Record[K, A], js.Array[B]]]
  
  inline def compact[A](fa: Record[String, Option_[A]]): Record[String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(fa.asInstanceOf[js.Any]).asInstanceOf[Record[String, A]]
  
  inline def deleteAt[K /* <: String */](k: K): js.Function1[
    /* r */ Record[String, Any], 
    Record[
      /* import warning: importer.ImportType#apply Failed type conversion: string extends K ? string : std.Exclude<string, K> */ js.Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAt")(k.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ Record[String, Any], 
    Record[
      /* import warning: importer.ImportType#apply Failed type conversion: string extends K ? string : std.Exclude<string, K> */ js.Any, 
      Any
    ]
  ]]
  
  inline def difference[A](second: Record[String, A]): js.Function1[/* first */ Record[String, A], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Record[String, A], Record[String, A]]]
  
  inline def elem[A](E: Eq[A]): Fn31[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[Fn31[A]]
  
  @JSImport("fp-ts/lib/Record", "empty")
  @js.native
  val empty: Record[String, scala.Nothing] = js.native
  
  inline def every[A](predicate: Predicate[A]): Predicate[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Predicate[Record[String, A]]]
  
  inline def every_AB_Refinement[A, B /* <: A */](refinement: Refinement[A, B]): Refinement[Record[String, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(refinement.asInstanceOf[js.Any]).asInstanceOf[Refinement[Record[String, A], Record[String, B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fb */ Record[String, A], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ Record[String, A], Record[String, A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fa */ Record[String, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Record[String, B]]]
  
  inline def filterMapWithIndex[K /* <: String */, A, B](f: js.Function2[/* key */ K, /* a */ A, Option_[B]]): js.Function1[/* fa */ Record[K, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Record[String, B]]]
  
  inline def filterWithIndex[K /* <: String */, A](predicateWithIndex: PredicateWithIndex[K, A]): js.Function1[/* fb */ Record[K, A], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(predicateWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ Record[K, A], Record[String, A]]]
  
  inline def filterWithIndex_KAB[K /* <: String */, A, B /* <: A */](refinementWithIndex: RefinementWithIndex[K, A, B]): js.Function1[/* fa */ Record[K, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(refinementWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Record[String, B]]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Record[String, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Record[String, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Record[String, js.Function1[/* a */ A, Any]], Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Record[String, js.Function1[/* a */ A, Any]], Record[String, Any]]]
  
  inline def foldMap(O: Ord_[String]): js.Function1[
    /* M */ Monoid[Any], 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, Any], 
      js.Function1[/* fa */ Record[String, Any], Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* M */ Monoid[Any], 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, Any], 
      js.Function1[/* fa */ Record[String, Any], Any]
    ]
  ]]
  inline def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, M], 
    js.Function1[/* fa */ Record[String, Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, M], 
    js.Function1[/* fa */ Record[String, Any], M]
  ]]
  
  inline def foldMapWithIndex(O: Ord_[String]): js.Function1[
    /* M */ Monoid[Any], 
    js.Function1[
      /* f */ js.Function2[/* k */ String, /* a */ Any, Any], 
      js.Function1[/* fa */ Record[String, Any], Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMapWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* M */ Monoid[Any], 
    js.Function1[
      /* f */ js.Function2[/* k */ String, /* a */ Any, Any], 
      js.Function1[/* fa */ Record[String, Any], Any]
    ]
  ]]
  inline def foldMapWithIndex[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function2[/* k */ String, /* a */ Any, M], 
    js.Function1[/* fa */ Record[String, Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMapWithIndex")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* k */ String, /* a */ Any, M], 
    js.Function1[/* fa */ Record[String, Any], M]
  ]]
  
  inline def fromEntries[A](fa: js.Array[js.Tuple2[String, A]]): Record[String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEntries")(fa.asInstanceOf[js.Any]).asInstanceOf[Record[String, A]]
  
  inline def fromFoldable[F, A](M: Magma[A], F: typings.fpTs.libFoldableMod.Foldable[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [string, A]> */ /* fka */ Any, 
    Record[String, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [string, A]> */ /* fka */ Any, 
    Record[String, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, A](M: Magma[A], F: Foldable1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [string, A]> */ /* fka */ Any, 
    Record[String, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [string, A]> */ /* fka */ Any, 
    Record[String, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, A](M: Magma[A], F: Foldable2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [string, A]> */ /* fka */ Any, 
    Record[String, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [string, A]> */ /* fka */ Any, 
    Record[String, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, A](M: Magma[A], F: Foldable3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [string, A]> */ /* fka */ Any, 
    Record[String, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [string, A]> */ /* fka */ Any, 
    Record[String, A]
  ]]
  
  inline def fromFoldableMap[F, B](M: Magma[B], F: typings.fpTs.libFoldableMod.Foldable[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, js.Tuple2[String, B]], 
    Record[String, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldableMap")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, js.Tuple2[String, B]], 
    Record[String, B]
  ]]
  inline def fromFoldableMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, B](M: Magma[B], F: Foldable1[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, js.Tuple2[String, B]], 
    Record[String, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldableMap")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, js.Tuple2[String, B]], 
    Record[String, B]
  ]]
  inline def fromFoldableMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, B](M: Magma[B], F: Foldable2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, js.Tuple2[String, B]], 
    Record[String, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldableMap")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, js.Tuple2[String, B]], 
    Record[String, B]
  ]]
  inline def fromFoldableMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, B](M: Magma[B], F: Foldable3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, js.Tuple2[String, B]], 
    Record[String, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldableMap")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, js.Tuple2[String, B]], 
    Record[String, B]
  ]]
  
  inline def getDifferenceMagma[A](): Magma[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifferenceMagma")().asInstanceOf[Magma[Record[String, A]]]
  
  inline def getEq[K /* <: String */, A](E: Eq[A]): Eq[Record[K, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Record[K, A]]]
  
  inline def getFoldable(O: Ord_[String]): Foldable1[typings.fpTs.libRecordMod.URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFoldable")(O.asInstanceOf[js.Any]).asInstanceOf[Foldable1[typings.fpTs.libRecordMod.URI]]
  
  inline def getFoldableWithIndex(O: Ord_[String]): FoldableWithIndex1[typings.fpTs.libRecordMod.URI, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[FoldableWithIndex1[typings.fpTs.libRecordMod.URI, String]]
  
  inline def getIntersectionSemigroup[A](S: Semigroup[A]): Semigroup[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Record[String, A]]]
  
  inline def getMonoid[K /* <: String */, A](S: Semigroup[A]): Monoid[Record[K, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(S.asInstanceOf[js.Any]).asInstanceOf[Monoid[Record[K, A]]]
  
  inline def getShow(O: Ord_[String]): js.Function1[/* S */ Show[Any], Show[Record[String, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* S */ Show[Any], Show[Record[String, Any]]]]
  inline def getShow[A](S: Show[A]): Show[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Record[String, A]]]
  
  inline def getTraversable(O: Ord_[String]): Traversable1[typings.fpTs.libRecordMod.URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTraversable")(O.asInstanceOf[js.Any]).asInstanceOf[Traversable1[typings.fpTs.libRecordMod.URI]]
  
  inline def getTraversableWithIndex(O: Ord_[String]): TraversableWithIndex1[typings.fpTs.libRecordMod.URI, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[TraversableWithIndex1[typings.fpTs.libRecordMod.URI, String]]
  
  inline def getUnionMonoid[A](S: Semigroup[A]): Monoid[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionMonoid")(S.asInstanceOf[js.Any]).asInstanceOf[Monoid[Record[String, A]]]
  
  inline def getUnionSemigroup[A](S: Semigroup[A]): Semigroup[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Record[String, A]]]
  
  inline def getWitherable(O: Ord_[String]): Witherable1[typings.fpTs.libRecordMod.URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWitherable")(O.asInstanceOf[js.Any]).asInstanceOf[Witherable1[typings.fpTs.libRecordMod.URI]]
  
  inline def has[K /* <: String */](k: String, r: Record[K, Any]): /* is K */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(k.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[/* is K */ Boolean]
  
  inline def hasOwnProperty_[K /* <: String */](k: String, r: Record[K, Any]): /* is K */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(k.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[/* is K */ Boolean]
  
  inline def insertAt[A](k: String, a: A): js.Function1[/* r */ Record[String, A], Record[String, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAt")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* r */ Record[String, A], Record[String, A]]]
  
  inline def intersection[A](M: Magma[A]): js.Function1[
    /* second */ Record[String, A], 
    js.Function1[/* first */ Record[String, A], Record[String, A]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Record[String, A], 
    js.Function1[/* first */ Record[String, A], Record[String, A]]
  ]]
  
  inline def isEmpty[A](r: Record[String, A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(r.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSubrecord[A](E: Eq[A]): Fn30[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubrecord")(E.asInstanceOf[js.Any]).asInstanceOf[Fn30[A]]
  
  inline def keys[K /* <: String */](r: Record[K, Any]): js.Array[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(r.asInstanceOf[js.Any]).asInstanceOf[js.Array[K]]
  
  inline def lookup(k: String): js.Function1[/* r */ Record[String, Any], Option_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(k.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* r */ Record[String, Any], Option_[Any]]]
  inline def lookup[A](k: String, r: Record[String, A]): Option_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(k.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Option_[A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Record[String, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Record[String, B]]]
  
  inline def mapWithIndex[K /* <: String */, A, B](f: js.Function2[/* k */ K, /* a */ A, B]): js.Function1[/* fa */ Record[K, A], Record[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Record[K, B]]]
  
  inline def modifyAt[A](k: String, f: js.Function1[/* a */ A, A]): js.Function1[/* r */ Record[String, A], Option_[Record[String, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyAt")(k.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* r */ Record[String, A], Option_[Record[String, A]]]]
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fb */ Record[String, A], Separated_[Record[String, A], Record[String, A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ Record[String, A], Separated_[Record[String, A], Record[String, A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ Record[String, A], Separated_[Record[String, B], Record[String, C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Separated_[Record[String, B], Record[String, C]]]]
  
  inline def partitionMapWithIndex[K /* <: String */, A, B, C](f: js.Function2[/* key */ K, /* a */ A, Either_[B, C]]): js.Function1[/* fa */ Record[K, A], Separated_[Record[String, B], Record[String, C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Separated_[Record[String, B], Record[String, C]]]]
  
  inline def partitionWithIndex[K /* <: String */, A](predicateWithIndex: PredicateWithIndex[K, A]): js.Function1[/* fb */ Record[K, A], Separated_[Record[String, A], Record[String, A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionWithIndex")(predicateWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ Record[K, A], Separated_[Record[String, A], Record[String, A]]]]
  
  inline def partitionWithIndex_KAB[K /* <: String */, A, B /* <: A */](refinementWithIndex: RefinementWithIndex[K, A, B]): js.Function1[/* fa */ Record[K, A], Separated_[Record[String, A], Record[String, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionWithIndex")(refinementWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Separated_[Record[String, A], Record[String, B]]]]
  
  inline def partition_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Record[String, A], Separated_[Record[String, A], Record[String, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Separated_[Record[String, A], Record[String, B]]]]
  
  inline def pop[K /* <: String */](k: K): js.Function1[
    /* r */ Record[String, Any], 
    Option_[
      js.Tuple2[
        Any, 
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: string extends K ? string : std.Exclude<string, K> */ js.Any, 
          Any
        ]
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(k.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ Record[String, Any], 
    Option_[
      js.Tuple2[
        Any, 
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: string extends K ? string : std.Exclude<string, K> */ js.Any, 
          Any
        ]
      ]
    ]
  ]]
  
  @JSImport("fp-ts/lib/Record", "record")
  @js.native
  val record: (FunctorWithIndex1[typings.fpTs.libRecordMod.URI, String]) & (FoldableWithIndex1[typings.fpTs.libRecordMod.URI, String]) & (FilterableWithIndex1[typings.fpTs.libRecordMod.URI, String]) & (TraversableWithIndex1[typings.fpTs.libRecordMod.URI, String]) & Witherable1[typings.fpTs.libRecordMod.URI] = js.native
  
  inline def reduce(O: Ord_[String]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* b */ Any, /* a */ Any, Any], 
    js.Function1[/* fa */ Record[String, Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* b */ Any, /* a */ Any, Any], 
    js.Function1[/* fa */ Record[String, Any], Any]
  ]]
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Record[String, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Record[String, A], B]]
  
  inline def reduceRight(O: Ord_[String]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* a */ Any, /* b */ Any, Any], 
    js.Function1[/* fa */ Record[String, Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* a */ Any, /* b */ Any, Any], 
    js.Function1[/* fa */ Record[String, Any], Any]
  ]]
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Record[String, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Record[String, A], B]]
  
  inline def reduceRightWithIndex(O: Ord_[String]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function3[/* k */ String, /* a */ Any, /* b */ Any, Any], 
    js.Function1[/* fa */ Record[String, Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRightWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function3[/* k */ String, /* a */ Any, /* b */ Any, Any], 
    js.Function1[/* fa */ Record[String, Any], Any]
  ]]
  inline def reduceRightWithIndex[K /* <: String */, A, B](b: B, f: js.Function3[/* k */ K, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ Record[K, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRightWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Record[K, A], B]]
  
  inline def reduceWithIndex(O: Ord_[String]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function3[/* k */ String, /* b */ Any, /* a */ Any, Any], 
    js.Function1[/* fa */ Record[String, Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function3[/* k */ String, /* b */ Any, /* a */ Any, Any], 
    js.Function1[/* fa */ Record[String, Any], Any]
  ]]
  inline def reduceWithIndex[K /* <: String */, A, B](b: B, f: js.Function3[/* k */ K, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ Record[K, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Record[K, A], B]]
  
  inline def separate[A, B](fa: Record[String, Either_[A, B]]): Separated_[Record[String, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separate")(fa.asInstanceOf[js.Any]).asInstanceOf[Separated_[Record[String, A], Record[String, B]]]
  
  inline def sequence[F](F: Applicative[F]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, A>> */ Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, A>> */ Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, A>> */ Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, A>> */ Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, A>> */ Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, A>> */ Any
  ]]
  
  inline def singleton[A](k: String, a: A): Record[String, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Record[String, A]]
  
  inline def size[A](r: Record[String, A]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(r.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def some[A](predicate: js.Function1[/* a */ A, Boolean]): js.Function1[/* r */ Record[String, A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* r */ Record[String, A], Boolean]]
  
  inline def toArray[K /* <: String */, A](r: Record[K, A]): js.Array[js.Tuple2[K, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(r.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[K, A]]]
  
  inline def toEntries[K /* <: String */, A](r: Record[K, A]): js.Array[js.Tuple2[K, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toEntries")(r.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[K, A]]]
  
  inline def toUnfoldable[F](U: Unfoldable[F]): js.Function1[
    /* r */ Record[String, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(U.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ Record[String, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ Any
  ]]
  inline def toUnfoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](U: Unfoldable1[F]): js.Function1[
    /* r */ Record[String, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(U.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ Record[String, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ Any
  ]]
  
  inline def traverse[F](F: Applicative[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, B>> */ Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, B>> */ Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Record<K, B>> */ Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ Any
    ]
  ]]
  
  inline def traverseWithIndex[F](F: Applicative[F]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, B>> */ Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, B>> */ Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Record<K, B>> */ Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ], 
    js.Function1[
      /* ta */ Record[String, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ Any
    ]
  ]]
  
  inline def union[A](M: Magma[A]): js.Function1[
    /* second */ Record[String, A], 
    js.Function1[/* first */ Record[String, A], Record[String, A]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Record[String, A], 
    js.Function1[/* first */ Record[String, A], Record[String, A]]
  ]]
  
  inline def updateAt[A](k: String, a: A): js.Function1[/* r */ Record[String, A], Option_[Record[String, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAt")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* r */ Record[String, A], Option_[Record[String, A]]]]
  
  inline def upsertAt[A](k: String, a: A): js.Function1[/* r */ Record[String, A], Record[String, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("upsertAt")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* r */ Record[String, A], Record[String, A]]]
  
  @JSImport("fp-ts/lib/Record", "wilt")
  @js.native
  val wilt: PipeableWilt1[typings.fpTs.libRecordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "wither")
  @js.native
  val wither: PipeableWither1[typings.fpTs.libRecordMod.URI] = js.native
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
