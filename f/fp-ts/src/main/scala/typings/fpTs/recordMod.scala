package typings.fpTs

import typings.fpTs.anon.Fn12
import typings.fpTs.anon.Fn13
import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.applicativeMod.Applicative3C
import typings.fpTs.compactableMod.Compactable1
import typings.fpTs.compactableMod.Separated
import typings.fpTs.eitherMod.Either_
import typings.fpTs.eqMod.Eq
import typings.fpTs.filterableMod.Filterable1
import typings.fpTs.filterableWithIndexMod.FilterableWithIndex1
import typings.fpTs.filterableWithIndexMod.PredicateWithIndex
import typings.fpTs.filterableWithIndexMod.RefinementWithIndex
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.foldableMod.Foldable2
import typings.fpTs.foldableMod.Foldable3
import typings.fpTs.foldableWithIndexMod.FoldableWithIndex1
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorWithIndexMod.FunctorWithIndex1
import typings.fpTs.magmaMod.Magma
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.showMod.Show
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableWithIndexMod.TraversableWithIndex1
import typings.fpTs.unfoldableMod.Unfoldable
import typings.fpTs.unfoldableMod.Unfoldable1
import typings.fpTs.witherableMod.PipeableWilt1
import typings.fpTs.witherableMod.PipeableWither1
import typings.fpTs.witherableMod.Witherable1
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordMod {
  
  @JSImport("fp-ts/lib/Record", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Record", "Compactable")
  @js.native
  val Compactable: Compactable1[typings.fpTs.recordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "Filterable")
  @js.native
  val Filterable: Filterable1[typings.fpTs.recordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "FilterableWithIndex")
  @js.native
  val FilterableWithIndex: FilterableWithIndex1[typings.fpTs.recordMod.URI, String] = js.native
  
  @JSImport("fp-ts/lib/Record", "Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.recordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "FoldableWithIndex")
  @js.native
  val FoldableWithIndex: FoldableWithIndex1[typings.fpTs.recordMod.URI, String] = js.native
  
  @JSImport("fp-ts/lib/Record", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.recordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "FunctorWithIndex")
  @js.native
  val FunctorWithIndex: FunctorWithIndex1[typings.fpTs.recordMod.URI, String] = js.native
  
  @JSImport("fp-ts/lib/Record", "Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.recordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "TraversableWithIndex")
  @js.native
  val TraversableWithIndex: TraversableWithIndex1[typings.fpTs.recordMod.URI, String] = js.native
  
  @JSImport("fp-ts/lib/Record", "URI")
  @js.native
  val URI: /* "Record" */ String = js.native
  type URI = /* "Record" */ String
  
  @JSImport("fp-ts/lib/Record", "Witherable")
  @js.native
  val Witherable: Witherable1[typings.fpTs.recordMod.URI] = js.native
  
  inline def collect[K /* <: String */, A, B](f: js.Function2[/* k */ K, /* a */ A, B]): js.Function1[/* r */ Record[K, A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* r */ Record[K, A], js.Array[B]]]
  
  inline def compact[A](fa: Record[String, Option_[A]]): Record[String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(fa.asInstanceOf[js.Any]).asInstanceOf[Record[String, A]]
  
  inline def deleteAt[K /* <: String */](k: K): js.Function1[/* r */ Record[String, js.Any], Record[(Exclude[String, K]) | String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAt")(k.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* r */ Record[String, js.Any], Record[(Exclude[String, K]) | String, js.Any]]]
  
  inline def elem[A](E: Eq[A]): Fn13[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[Fn13[A]]
  
  @JSImport("fp-ts/lib/Record", "empty")
  @js.native
  val empty: Record[String, scala.Nothing] = js.native
  
  inline def every[A](predicate: Predicate[A]): js.Function1[/* r */ Record[String, A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* r */ Record[String, A], Boolean]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fa */ Record[String, A], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Record[String, A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fa */ Record[String, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Record[String, B]]]
  
  inline def filterMapWithIndex[K /* <: String */, A, B](f: js.Function2[/* key */ K, /* a */ A, Option_[B]]): js.Function1[/* fa */ Record[K, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Record[String, B]]]
  
  inline def filterWithIndex[K /* <: String */, A](predicateWithIndex: PredicateWithIndex[K, A]): js.Function1[/* fa */ Record[K, A], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(predicateWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Record[String, A]]]
  
  inline def filterWithIndex_K_StringAB_A[K /* <: String */, A, B /* <: A */](refinementWithIndex: RefinementWithIndex[K, A, B]): js.Function1[/* fa */ Record[K, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(refinementWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Record[String, B]]]
  
  inline def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Record[String, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Record[String, B]]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ Record[String, js.Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ Record[String, js.Any], M]
  ]]
  
  inline def foldMapWithIndex[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function2[/* k */ String, /* a */ js.Any, M], 
    js.Function1[/* fa */ Record[String, js.Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMapWithIndex")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* k */ String, /* a */ js.Any, M], 
    js.Function1[/* fa */ Record[String, js.Any], M]
  ]]
  
  inline def fromFoldable[F, A](M: Magma[A], F: typings.fpTs.foldableMod.Foldable[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ /* fka */ js.Any, 
    Record[String, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ /* fka */ js.Any, 
    Record[String, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, A](M: Magma[A], F: Foldable1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ /* fka */ js.Any, 
    Record[String, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ /* fka */ js.Any, 
    Record[String, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, A](M: Magma[A], F: Foldable2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [K, A]> */ /* fka */ js.Any, 
    Record[String, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [K, A]> */ /* fka */ js.Any, 
    Record[String, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, A](M: Magma[A], F: Foldable3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [K, A]> */ /* fka */ js.Any, 
    Record[String, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [K, A]> */ /* fka */ js.Any, 
    Record[String, A]
  ]]
  
  inline def fromFoldableMap[F, B](M: Magma[B], F: typings.fpTs.foldableMod.Foldable[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[String, B]], 
    Record[String, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldableMap")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[String, B]], 
    Record[String, B]
  ]]
  inline def fromFoldableMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, B](M: Magma[B], F: Foldable1[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[String, B]], 
    Record[String, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldableMap")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[String, B]], 
    Record[String, B]
  ]]
  inline def fromFoldableMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, B](M: Magma[B], F: Foldable2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[String, B]], 
    Record[String, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldableMap")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[String, B]], 
    Record[String, B]
  ]]
  inline def fromFoldableMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, B](M: Magma[B], F: Foldable3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[String, B]], 
    Record[String, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldableMap")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[String, B]], 
    Record[String, B]
  ]]
  
  inline def getEq[K /* <: String */, A](E: Eq[A]): Eq[Record[K, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Record[K, A]]]
  
  inline def getMonoid[K /* <: String */, A](S: Semigroup[A]): Monoid[Record[K, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(S.asInstanceOf[js.Any]).asInstanceOf[Monoid[Record[K, A]]]
  
  inline def getShow[A](S: Show[A]): Show[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Record[String, A]]]
  
  inline def hasOwnProperty_[K /* <: String */](k: String, r: Record[K, js.Any]): /* is K */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(k.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[/* is K */ Boolean]
  
  inline def insertAt[K /* <: String */, A](k: K, a: A): js.Function1[/* r */ Record[String, A], Record[String | K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAt")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* r */ Record[String, A], Record[String | K, A]]]
  
  inline def isEmpty(r: Record[String, js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(r.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSubrecord[A](E: Eq[A]): Fn12[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubrecord")(E.asInstanceOf[js.Any]).asInstanceOf[Fn12[A]]
  
  inline def keys[K /* <: String */](r: Record[K, js.Any]): js.Array[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(r.asInstanceOf[js.Any]).asInstanceOf[js.Array[K]]
  
  inline def lookup(k: String): js.Function1[/* r */ Record[String, js.Any], Option_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(k.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* r */ Record[String, js.Any], Option_[js.Any]]]
  inline def lookup[A](k: String, r: Record[String, A]): Option_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(k.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Option_[A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Record[String, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Record[String, B]]]
  
  inline def mapWithIndex[K /* <: String */, A, B](f: js.Function2[/* k */ K, /* a */ A, B]): js.Function1[/* fa */ Record[K, A], Record[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Record[K, B]]]
  
  inline def modifyAt[A](k: String, f: js.Function1[/* a */ A, A]): js.Function1[/* r */ Record[String, A], Option_[Record[String, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyAt")(k.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* r */ Record[String, A], Option_[Record[String, A]]]]
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fa */ Record[String, A], Separated[Record[String, A], Record[String, A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Separated[Record[String, A], Record[String, A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ Record[String, A], Separated[Record[String, B], Record[String, C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Separated[Record[String, B], Record[String, C]]]]
  
  inline def partitionMapWithIndex[K /* <: String */, A, B, C](f: js.Function2[/* key */ K, /* a */ A, Either_[B, C]]): js.Function1[/* fa */ Record[K, A], Separated[Record[String, B], Record[String, C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Separated[Record[String, B], Record[String, C]]]]
  
  inline def partitionWithIndex[K /* <: String */, A](predicateWithIndex: PredicateWithIndex[K, A]): js.Function1[/* fa */ Record[K, A], Separated[Record[String, A], Record[String, A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionWithIndex")(predicateWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Separated[Record[String, A], Record[String, A]]]]
  
  inline def partitionWithIndex_K_StringAB_A[K /* <: String */, A, B /* <: A */](refinementWithIndex: RefinementWithIndex[K, A, B]): js.Function1[/* fa */ Record[K, A], Separated[Record[String, A], Record[String, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionWithIndex")(refinementWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[K, A], Separated[Record[String, A], Record[String, B]]]]
  
  inline def partition_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Record[String, A], Separated[Record[String, A], Record[String, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Record[String, A], Separated[Record[String, A], Record[String, B]]]]
  
  inline def pop[K /* <: String */](k: K): js.Function1[
    /* r */ Record[String, js.Any], 
    Option_[js.Tuple2[js.Any, Record[(Exclude[String, K]) | String, js.Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(k.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ Record[String, js.Any], 
    Option_[js.Tuple2[js.Any, Record[(Exclude[String, K]) | String, js.Any]]]
  ]]
  
  @JSImport("fp-ts/lib/Record", "record")
  @js.native
  val record: (FunctorWithIndex1[typings.fpTs.recordMod.URI, String]) & (FoldableWithIndex1[typings.fpTs.recordMod.URI, String]) & (FilterableWithIndex1[typings.fpTs.recordMod.URI, String]) & (TraversableWithIndex1[typings.fpTs.recordMod.URI, String]) & Witherable1[typings.fpTs.recordMod.URI] = js.native
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Record[String, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Record[String, A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Record[String, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Record[String, A], B]]
  
  inline def reduceRightWithIndex[K /* <: String */, A, B](b: B, f: js.Function3[/* k */ K, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ Record[K, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRightWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Record[K, A], B]]
  
  inline def reduceWithIndex[K /* <: String */, A, B](b: B, f: js.Function3[/* k */ K, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ Record[K, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Record[K, A], B]]
  
  inline def separate[A, B](fa: Record[String, Either_[A, B]]): Separated[Record[String, A], Record[String, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separate")(fa.asInstanceOf[js.Any]).asInstanceOf[Separated[Record[String, A], Record[String, B]]]
  
  inline def sequence[F](F: Applicative[F]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, A>> */ js.Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, A>> */ js.Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, A>> */ js.Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, A>> */ js.Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, A>> */ js.Any
  ]]
  inline def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ta */ Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, A>> */ js.Any
  ]]
  
  inline def singleton[K /* <: String */, A](k: K, a: A): Record[K, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Record[K, A]]
  
  inline def size(r: Record[String, js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(r.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def some[A](predicate: js.Function1[/* a */ A, Boolean]): js.Function1[/* r */ Record[String, A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* r */ Record[String, A], Boolean]]
  
  inline def toArray[K /* <: String */, A](r: Record[K, A]): js.Array[js.Tuple2[K, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(r.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[K, A]]]
  
  inline def toUnfoldable[F](U: Unfoldable[F]): js.Function1[
    /* r */ Record[String, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(U.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ Record[String, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ js.Any
  ]]
  inline def toUnfoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](U: Unfoldable1[F]): js.Function1[
    /* r */ Record[String, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(U.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ Record[String, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ js.Any
  ]]
  
  inline def traverse[F](F: Applicative[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ js.Any
    ]
  ]]
  
  inline def traverseWithIndex[F](F: Applicative[F]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Record<K, B>> */ js.Any
    ]
  ]]
  inline def traverseWithIndex[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseWithIndex")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[
      /* k */ String, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* ta */ Record[String, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Record<K, B>> */ js.Any
    ]
  ]]
  
  inline def updateAt[A](k: String, a: A): js.Function1[/* r */ Record[String, A], Option_[Record[String, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAt")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* r */ Record[String, A], Option_[Record[String, A]]]]
  
  @JSImport("fp-ts/lib/Record", "wilt")
  @js.native
  val wilt: PipeableWilt1[typings.fpTs.recordMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Record", "wither")
  @js.native
  val wither: PipeableWither1[typings.fpTs.recordMod.URI] = js.native
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
