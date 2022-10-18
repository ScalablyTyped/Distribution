package typings.fpTs

import typings.fpTs.anon.Fn12
import typings.fpTs.anon.Fn13
import typings.fpTs.anon.FnCallAM
import typings.fpTs.anon.FnCallKM
import typings.fpTs.anon.FnCallMeThat
import typings.fpTs.libCompactableMod.Compactable2
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libEqMod.Eq
import typings.fpTs.libFilterableMod.Filterable2
import typings.fpTs.libFilterableWithIndexMod.FilterableWithIndex2C
import typings.fpTs.libFoldableMod.Foldable
import typings.fpTs.libFoldableMod.Foldable1
import typings.fpTs.libFoldableMod.Foldable2
import typings.fpTs.libFoldableMod.Foldable2C
import typings.fpTs.libFoldableMod.Foldable3
import typings.fpTs.libFoldableWithIndexMod.FoldableWithIndex2C
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libMagmaMod.Magma
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libOrdMod.Ord_
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libSeparatedMod.Separated_
import typings.fpTs.libShowMod.Show
import typings.fpTs.libTraversableWithIndexMod.TraversableWithIndex2C
import typings.fpTs.libUnfoldableMod.Unfoldable
import typings.fpTs.libUnfoldableMod.Unfoldable1
import typings.fpTs.libWitherableMod.Witherable2C
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapMod {
  
  @JSImport("fp-ts/lib/Map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Map", "Compactable")
  @js.native
  val Compactable: Compactable2[typings.fpTs.libMapMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Map", "Filterable")
  @js.native
  val Filterable: Filterable2[typings.fpTs.libMapMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Map", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.libMapMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Map", "URI")
  @js.native
  val URI: /* "Map" */ String = js.native
  type URI = /* "Map" */ String
  
  inline def collect[K](O: Ord_[K]): js.Function1[
    /* f */ js.Function2[/* k */ K, /* a */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], js.Array[Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* k */ K, /* a */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], js.Array[Any]]
  ]]
  
  inline def compact[K, A](fa: Map[K, Option_[A]]): Map[K, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(fa.asInstanceOf[js.Any]).asInstanceOf[Map[K, A]]
  
  inline def deleteAt[K](E: Eq[K]): js.Function1[/* k */ K, js.Function1[/* m */ Map[K, Any], Map[K, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* k */ K, js.Function1[/* m */ Map[K, Any], Map[K, Any]]]]
  
  inline def difference[K](E: Eq[K]): js.Function1[/* _second */ Map[K, Any], js.Function1[/* first */ Map[K, Any], Map[K, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* _second */ Map[K, Any], js.Function1[/* first */ Map[K, Any], Map[K, Any]]]]
  
  inline def elem[A](E: Eq[A]): FnCallAM[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallAM[A]]
  
  @JSImport("fp-ts/lib/Map", "empty")
  @js.native
  val empty: Map[scala.Nothing, scala.Nothing] = js.native
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fb */ Map[Any, A], Map[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ Map[Any, A], Map[Any, A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fa */ Map[Any, A], Map[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[Any, A], Map[Any, B]]]
  
  inline def filterMapWithIndex[K, A, B](f: js.Function2[/* k */ K, /* a */ A, Option_[B]]): js.Function1[/* fa */ Map[K, A], Map[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[K, A], Map[K, B]]]
  
  inline def filterWithIndex[K, A](p: js.Function2[/* k */ K, /* a */ A, Boolean]): js.Function1[/* m */ Map[K, A], Map[K, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ Map[K, A], Map[K, A]]]
  
  inline def filterWithIndex_KAB[K, A, B /* <: A */](p: js.Function2[/* k */ K, /* a */ A, /* is B */ Boolean]): js.Function1[/* m */ Map[K, A], Map[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ Map[K, A], Map[K, B]]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Map[Any, A], Map[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[Any, A], Map[Any, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Map[Any, js.Function1[/* a */ A, Any]], Map[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Map[Any, js.Function1[/* a */ A, Any]], Map[Any, Any]]]
  
  inline def foldMap[K](O: Ord_[K]): js.Function1[
    /* M */ Monoid[Any], 
    js.Function1[/* f */ js.Function1[/* a */ Any, Any], js.Function1[/* m */ Map[K, Any], Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* M */ Monoid[Any], 
    js.Function1[/* f */ js.Function1[/* a */ Any, Any], js.Function1[/* m */ Map[K, Any], Any]]
  ]]
  
  inline def foldMapWithIndex[K](O: Ord_[K]): js.Function1[
    /* M */ Monoid[Any], 
    js.Function1[
      /* f */ js.Function2[/* k */ K, /* a */ Any, Any], 
      js.Function1[/* m */ Map[K, Any], Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMapWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* M */ Monoid[Any], 
    js.Function1[
      /* f */ js.Function2[/* k */ K, /* a */ Any, Any], 
      js.Function1[/* m */ Map[K, Any], Any]
    ]
  ]]
  
  inline def fromFoldable[F, K, A](E: Eq[K], M: Magma[A], F: Foldable[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ /* fka */ Any, 
    Map[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ /* fka */ Any, 
    Map[K, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, K, A](E: Eq[K], M: Magma[A], F: Foldable1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ /* fka */ Any, 
    Map[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ /* fka */ Any, 
    Map[K, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, K, A](E: Eq[K], M: Magma[A], F: Foldable2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [K, A]> */ /* fka */ Any, 
    Map[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [K, A]> */ /* fka */ Any, 
    Map[K, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, K, A](E: Eq[K], M: Magma[A], F: Foldable3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [K, A]> */ /* fka */ Any, 
    Map[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [K, A]> */ /* fka */ Any, 
    Map[K, A]
  ]]
  
  inline def getDifferenceMagma[K](E: Eq[K]): js.Function0[Magma[Map[K, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifferenceMagma")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Magma[Map[K, Any]]]]
  
  inline def getEq[K, A](SK: Eq[K], SA: Eq[A]): Eq[Map[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Eq[Map[K, A]]]
  
  inline def getFilterableWithIndex[K](): FilterableWithIndex2C[typings.fpTs.libMapMod.URI, K, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableWithIndex")().asInstanceOf[FilterableWithIndex2C[typings.fpTs.libMapMod.URI, K, K]]
  
  inline def getFoldable[K](O: Ord_[K]): Foldable2C[typings.fpTs.fpTsStrings.Map, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFoldable")(O.asInstanceOf[js.Any]).asInstanceOf[Foldable2C[typings.fpTs.fpTsStrings.Map, K]]
  
  inline def getFoldableWithIndex[K](O: Ord_[K]): FoldableWithIndex2C[typings.fpTs.fpTsStrings.Map, K, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[FoldableWithIndex2C[typings.fpTs.fpTsStrings.Map, K, K]]
  
  inline def getIntersectionSemigroup[K, A](E: Eq[K], S: Semigroup[A]): Semigroup[Map[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionSemigroup")(E.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[Semigroup[Map[K, A]]]
  
  inline def getMonoid[K, A](SK: Eq[K], SA: Semigroup[A]): Monoid[Map[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Monoid[Map[K, A]]]
  
  inline def getShow[K, A](SK: Show[K], SA: Show[A]): Show[Map[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Show[Map[K, A]]]
  
  inline def getTraversableWithIndex[K](O: Ord_[K]): TraversableWithIndex2C[typings.fpTs.fpTsStrings.Map, K, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[TraversableWithIndex2C[typings.fpTs.fpTsStrings.Map, K, K]]
  
  inline def getUnionMonoid[K, A](E: Eq[K], S: Semigroup[A]): Monoid[Map[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnionMonoid")(E.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[Monoid[Map[K, A]]]
  
  inline def getUnionSemigroup[K, A](E: Eq[K], S: Semigroup[A]): Semigroup[Map[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnionSemigroup")(E.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[Semigroup[Map[K, A]]]
  
  inline def getWitherable[K](O: Ord_[K]): (Witherable2C[typings.fpTs.libMapMod.URI, K]) & (TraversableWithIndex2C[typings.fpTs.libMapMod.URI, K, K]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getWitherable")(O.asInstanceOf[js.Any]).asInstanceOf[(Witherable2C[typings.fpTs.libMapMod.URI, K]) & (TraversableWithIndex2C[typings.fpTs.libMapMod.URI, K, K])]
  
  inline def insertAt[K](E: Eq[K]): js.Function2[/* k */ K, /* a */ Any, js.Function1[/* m */ Map[K, Any], Map[K, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* k */ K, /* a */ Any, js.Function1[/* m */ Map[K, Any], Map[K, Any]]]]
  
  inline def intersection[K, A](E: Eq[K], M: Magma[A]): js.Function1[/* second */ Map[K, A], js.Function1[/* first */ Map[K, A], Map[K, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* second */ Map[K, A], js.Function1[/* first */ Map[K, A], Map[K, A]]]]
  
  inline def isEmpty[K, A](m: Map[K, A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(m.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSubmap[K, A](SK: Eq[K], SA: Eq[A]): FnCallMeThat[K, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubmap")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[FnCallMeThat[K, A]]
  
  inline def keys[K](O: Ord_[K]): js.Function1[/* m */ Map[K, Any], js.Array[K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ Map[K, Any], js.Array[K]]]
  
  inline def lookup[K](E: Eq[K]): FnCallKM[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallKM[K]]
  
  inline def lookupWithKey[K](E: Eq[K]): Fn12[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupWithKey")(E.asInstanceOf[js.Any]).asInstanceOf[Fn12[K]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Map[Any, A], Map[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[Any, A], Map[Any, B]]]
  
  inline def mapWithIndex[K, A, B](f: js.Function2[/* k */ K, /* a */ A, B]): js.Function1[/* fa */ Map[K, A], Map[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[K, A], Map[K, B]]]
  
  @JSImport("fp-ts/lib/Map", "map_")
  @js.native
  val map_ : Filterable2[typings.fpTs.libMapMod.URI] = js.native
  
  inline def member[K](E: Eq[K]): Fn13[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("member")(E.asInstanceOf[js.Any]).asInstanceOf[Fn13[K]]
  
  inline def modifyAt[K](E: Eq[K]): js.Function2[
    /* k */ K, 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Option_[Map[K, Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* k */ K, 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Option_[Map[K, Any]]]
  ]]
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fb */ Map[Any, A], Separated_[Map[Any, A], Map[Any, A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ Map[Any, A], Separated_[Map[Any, A], Map[Any, A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ Map[Any, A], Separated_[Map[Any, B], Map[Any, C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[Any, A], Separated_[Map[Any, B], Map[Any, C]]]]
  
  inline def partitionMapWithIndex[K, A, B, C](f: js.Function2[/* k */ K, /* a */ A, Either_[B, C]]): js.Function1[/* fa */ Map[K, A], Separated_[Map[K, B], Map[K, C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[K, A], Separated_[Map[K, B], Map[K, C]]]]
  
  inline def partitionWithIndex[K, A](predicateWithIndex: js.Function2[/* k */ K, /* a */ A, Boolean]): js.Function1[/* fb */ Map[K, A], Separated_[Map[K, A], Map[K, A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionWithIndex")(predicateWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ Map[K, A], Separated_[Map[K, A], Map[K, A]]]]
  
  inline def partitionWithIndex_KAB[K, A, B /* <: A */](predicateWithIndex: js.Function2[/* k */ K, /* a */ A, /* is B */ Boolean]): js.Function1[/* fa */ Map[K, A], Separated_[Map[K, A], Map[K, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionWithIndex")(predicateWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[K, A], Separated_[Map[K, A], Map[K, B]]]]
  
  inline def partition_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Map[Any, A], Separated_[Map[Any, A], Map[Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[Any, A], Separated_[Map[Any, A], Map[Any, B]]]]
  
  inline def pop[K](E: Eq[K]): js.Function1[/* k */ K, js.Function1[/* m */ Map[K, Any], Option_[js.Tuple2[Any, Map[K, Any]]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* k */ K, js.Function1[/* m */ Map[K, Any], Option_[js.Tuple2[Any, Map[K, Any]]]]]]
  
  inline def reduce[K](O: Ord_[K]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* b */ Any, /* a */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* b */ Any, /* a */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Any]
  ]]
  
  inline def reduceRight[K](O: Ord_[K]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* a */ Any, /* b */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* a */ Any, /* b */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Any]
  ]]
  
  inline def reduceRightWithIndex[K](O: Ord_[K]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function3[/* k */ K, /* a */ Any, /* b */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRightWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function3[/* k */ K, /* a */ Any, /* b */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Any]
  ]]
  
  inline def reduceWithIndex[K](O: Ord_[K]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function3[/* k */ K, /* b */ Any, /* a */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceWithIndex")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function3[/* k */ K, /* b */ Any, /* a */ Any, Any], 
    js.Function1[/* m */ Map[K, Any], Any]
  ]]
  
  inline def separate[K, A, B](fa: Map[K, Either_[A, B]]): Separated_[Map[K, A], Map[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separate")(fa.asInstanceOf[js.Any]).asInstanceOf[Separated_[Map[K, A], Map[K, B]]]
  
  inline def singleton[K, A](k: K, a: A): Map[K, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Map[K, A]]
  
  inline def size[K, A](m: Map[K, A]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toArray[K](O: Ord_[K]): js.Function1[/* m */ Map[K, Any], js.Array[js.Tuple2[K, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ Map[K, Any], js.Array[js.Tuple2[K, Any]]]]
  
  inline def toUnfoldable[K, F](ord: Ord_[K], U: Unfoldable[F]): js.Function1[
    /* d */ Map[K, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(ord.asInstanceOf[js.Any], U.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* d */ Map[K, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ Any
  ]]
  inline def toUnfoldable[K, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](ord: Ord_[K], U: Unfoldable1[F]): js.Function1[
    /* d */ Map[K, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(ord.asInstanceOf[js.Any], U.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* d */ Map[K, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ Any
  ]]
  
  inline def union[K, A](E: Eq[K], M: Magma[A]): js.Function1[/* second */ Map[K, A], js.Function1[/* first */ Map[K, A], Map[K, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* second */ Map[K, A], js.Function1[/* first */ Map[K, A], Map[K, A]]]]
  
  inline def updateAt[K](E: Eq[K]): js.Function2[/* k */ K, /* a */ Any, js.Function1[/* m */ Map[K, Any], Option_[Map[K, Any]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* k */ K, /* a */ Any, js.Function1[/* m */ Map[K, Any], Option_[Map[K, Any]]]]]
  
  inline def upsertAt[K](E: Eq[K]): js.Function2[/* k */ K, /* a */ Any, js.Function1[/* m */ Map[K, Any], Map[K, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("upsertAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* k */ K, /* a */ Any, js.Function1[/* m */ Map[K, Any], Map[K, Any]]]]
  
  inline def values[A](O: Ord_[A]): js.Function1[/* m */ Map[Any, A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ Map[Any, A], js.Array[A]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
