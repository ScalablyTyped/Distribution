package typings.fpTs

import typings.fpTs.anon.Fn0
import typings.fpTs.anon.Fn1
import typings.fpTs.anon.FnCallAM
import typings.fpTs.anon.FnCallKM
import typings.fpTs.anon.FnCallMeThat
import typings.fpTs.compactableMod.Compactable2
import typings.fpTs.compactableMod.Separated
import typings.fpTs.eitherMod.Either_
import typings.fpTs.eqMod.Eq
import typings.fpTs.filterableMod.Filterable2
import typings.fpTs.filterableWithIndexMod.FilterableWithIndex2C
import typings.fpTs.foldableMod.Foldable
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.foldableMod.Foldable2
import typings.fpTs.foldableMod.Foldable3
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor2
import typings.fpTs.magmaMod.Magma
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.ordMod.Ord_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.showMod.Show
import typings.fpTs.traversableWithIndexMod.TraversableWithIndex2C
import typings.fpTs.unfoldableMod.Unfoldable
import typings.fpTs.unfoldableMod.Unfoldable1
import typings.fpTs.witherableMod.Witherable2C
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("fp-ts/lib/Map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Map", "Compactable")
  @js.native
  val Compactable: Compactable2[typings.fpTs.mapMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Map", "Filterable")
  @js.native
  val Filterable: Filterable2[typings.fpTs.mapMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Map", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.mapMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Map", "URI")
  @js.native
  val URI: /* "Map" */ String = js.native
  type URI = /* "Map" */ String
  
  inline def collect[K](O: Ord_[K]): js.Function1[
    /* f */ js.Function2[/* k */ K, /* a */ js.Any, js.Any], 
    js.Function1[/* m */ Map[K, js.Any], js.Array[js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* k */ K, /* a */ js.Any, js.Any], 
    js.Function1[/* m */ Map[K, js.Any], js.Array[js.Any]]
  ]]
  
  inline def compact[K, A](fa: Map[K, Option_[A]]): Map[K, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(fa.asInstanceOf[js.Any]).asInstanceOf[Map[K, A]]
  
  inline def deleteAt[K](E: Eq[K]): js.Function1[/* k */ K, js.Function1[/* m */ Map[K, js.Any], Map[K, js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* k */ K, js.Function1[/* m */ Map[K, js.Any], Map[K, js.Any]]]]
  
  inline def elem[A](E: Eq[A]): FnCallAM[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallAM[A]]
  
  @JSImport("fp-ts/lib/Map", "empty")
  @js.native
  val empty: Map[scala.Nothing, scala.Nothing] = js.native
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fa */ Map[js.Any, A], Map[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[js.Any, A], Map[js.Any, A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fa */ Map[js.Any, A], Map[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[js.Any, A], Map[js.Any, B]]]
  
  inline def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Map[js.Any, A], Map[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[js.Any, A], Map[js.Any, B]]]
  
  inline def fromFoldable[F, K, A](E: Eq[K], M: Magma[A], F: Foldable[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ /* fka */ js.Any, 
    Map[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ /* fka */ js.Any, 
    Map[K, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, K, A](E: Eq[K], M: Magma[A], F: Foldable1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ /* fka */ js.Any, 
    Map[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ /* fka */ js.Any, 
    Map[K, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, K, A](E: Eq[K], M: Magma[A], F: Foldable2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [K, A]> */ /* fka */ js.Any, 
    Map[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [K, A]> */ /* fka */ js.Any, 
    Map[K, A]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, K, A](E: Eq[K], M: Magma[A], F: Foldable3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [K, A]> */ /* fka */ js.Any, 
    Map[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [K, A]> */ /* fka */ js.Any, 
    Map[K, A]
  ]]
  
  inline def getEq[K, A](SK: Eq[K], SA: Eq[A]): Eq[Map[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Eq[Map[K, A]]]
  
  inline def getFilterableWithIndex[K](): FilterableWithIndex2C[typings.fpTs.mapMod.URI, K, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableWithIndex")().asInstanceOf[FilterableWithIndex2C[typings.fpTs.mapMod.URI, K, K]]
  
  inline def getMonoid[K, A](SK: Eq[K], SA: Semigroup[A]): Monoid[Map[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Monoid[Map[K, A]]]
  
  inline def getShow[K, A](SK: Show[K], SA: Show[A]): Show[Map[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Show[Map[K, A]]]
  
  inline def getWitherable[K](O: Ord_[K]): (Witherable2C[typings.fpTs.mapMod.URI, K]) & (TraversableWithIndex2C[typings.fpTs.mapMod.URI, K, K]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getWitherable")(O.asInstanceOf[js.Any]).asInstanceOf[(Witherable2C[typings.fpTs.mapMod.URI, K]) & (TraversableWithIndex2C[typings.fpTs.mapMod.URI, K, K])]
  
  inline def insertAt[K](E: Eq[K]): js.Function2[/* k */ K, /* a */ js.Any, js.Function1[/* m */ Map[K, js.Any], Map[K, js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* k */ K, /* a */ js.Any, js.Function1[/* m */ Map[K, js.Any], Map[K, js.Any]]]]
  
  inline def isEmpty[K, A](d: Map[K, A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(d.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSubmap[K, A](SK: Eq[K], SA: Eq[A]): FnCallMeThat[K, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubmap")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[FnCallMeThat[K, A]]
  
  inline def keys[K](O: Ord_[K]): js.Function1[/* m */ Map[K, js.Any], js.Array[K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ Map[K, js.Any], js.Array[K]]]
  
  inline def lookup[K](E: Eq[K]): Fn1[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(E.asInstanceOf[js.Any]).asInstanceOf[Fn1[K]]
  
  inline def lookupWithKey[K](E: Eq[K]): Fn0[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupWithKey")(E.asInstanceOf[js.Any]).asInstanceOf[Fn0[K]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Map[js.Any, A], Map[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[js.Any, A], Map[js.Any, B]]]
  
  inline def mapWithIndex[K, A, B](f: js.Function2[/* k */ K, /* a */ A, B]): js.Function1[/* fa */ Map[K, A], Map[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[K, A], Map[K, B]]]
  
  @JSImport("fp-ts/lib/Map", "map_")
  @js.native
  val map_ : Filterable2[typings.fpTs.mapMod.URI] = js.native
  
  inline def member[K](E: Eq[K]): FnCallKM[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("member")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallKM[K]]
  
  inline def modifyAt[K](E: Eq[K]): js.Function2[
    /* k */ K, 
    /* f */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* m */ Map[K, js.Any], Option_[Map[K, js.Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* k */ K, 
    /* f */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* m */ Map[K, js.Any], Option_[Map[K, js.Any]]]
  ]]
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fa */ Map[js.Any, A], Separated[Map[js.Any, A], Map[js.Any, A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[js.Any, A], Separated[Map[js.Any, A], Map[js.Any, A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ Map[js.Any, A], Separated[Map[js.Any, B], Map[js.Any, C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[js.Any, A], Separated[Map[js.Any, B], Map[js.Any, C]]]]
  
  inline def partition_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Map[js.Any, A], Separated[Map[js.Any, A], Map[js.Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Map[js.Any, A], Separated[Map[js.Any, A], Map[js.Any, B]]]]
  
  inline def pop[K](E: Eq[K]): js.Function1[
    /* k */ K, 
    js.Function1[/* m */ Map[K, js.Any], Option_[js.Tuple2[js.Any, Map[K, js.Any]]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* k */ K, 
    js.Function1[/* m */ Map[K, js.Any], Option_[js.Tuple2[js.Any, Map[K, js.Any]]]]
  ]]
  
  inline def separate[K, A, B](fa: Map[K, Either_[A, B]]): Separated[Map[K, A], Map[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separate")(fa.asInstanceOf[js.Any]).asInstanceOf[Separated[Map[K, A], Map[K, B]]]
  
  inline def singleton[K, A](k: K, a: A): Map[K, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Map[K, A]]
  
  inline def size[K, A](d: Map[K, A]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toArray[K](O: Ord_[K]): js.Function1[/* m */ Map[K, js.Any], js.Array[js.Tuple2[K, js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ Map[K, js.Any], js.Array[js.Tuple2[K, js.Any]]]]
  
  inline def toUnfoldable[K, F](O: Ord_[K], U: Unfoldable[F]): js.Function1[
    /* d */ Map[K, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(O.asInstanceOf[js.Any], U.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* d */ Map[K, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ js.Any
  ]]
  inline def toUnfoldable[K, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](O: Ord_[K], U: Unfoldable1[F]): js.Function1[
    /* d */ Map[K, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(O.asInstanceOf[js.Any], U.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* d */ Map[K, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ js.Any
  ]]
  
  inline def updateAt[K](E: Eq[K]): js.Function2[
    /* k */ K, 
    /* a */ js.Any, 
    js.Function1[/* m */ Map[K, js.Any], Option_[Map[K, js.Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* k */ K, 
    /* a */ js.Any, 
    js.Function1[/* m */ Map[K, js.Any], Option_[Map[K, js.Any]]]
  ]]
  
  inline def values[A](O: Ord_[A]): js.Function1[/* m */ Map[js.Any, A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ Map[js.Any, A], js.Array[A]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
