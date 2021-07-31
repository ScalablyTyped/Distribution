package typings.fpTs

import typings.fpTs.anon.Fn3
import typings.fpTs.anon.Fn4
import typings.fpTs.anon.Fn5
import typings.fpTs.anon.Fn6
import typings.fpTs.anon.Fn7
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
import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyMapMod {
  
  @JSImport("fp-ts/lib/ReadonlyMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/ReadonlyMap", "Compactable")
  @js.native
  val Compactable: Compactable2[typings.fpTs.readonlyMapMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReadonlyMap", "Filterable")
  @js.native
  val Filterable: Filterable2[typings.fpTs.readonlyMapMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReadonlyMap", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.readonlyMapMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReadonlyMap", "URI")
  @js.native
  val URI: /* "ReadonlyMap" */ String = js.native
  type URI = /* "ReadonlyMap" */ String
  
  @scala.inline
  def collect[K](O: Ord_[K]): js.Function1[
    /* f */ js.Function2[/* k */ K, /* a */ js.Any, js.Any], 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], js.Array[js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* k */ K, /* a */ js.Any, js.Any], 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], js.Array[js.Any]]
  ]]
  
  @scala.inline
  def compact[K, A](fa: ReadonlyMap[K, Option_[A]]): ReadonlyMap[K, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(fa.asInstanceOf[js.Any]).asInstanceOf[ReadonlyMap[K, A]]
  
  @scala.inline
  def deleteAt[K](E: Eq[K]): js.Function1[/* k */ K, js.Function1[/* m */ ReadonlyMap[K, js.Any], ReadonlyMap[K, js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* k */ K, js.Function1[/* m */ ReadonlyMap[K, js.Any], ReadonlyMap[K, js.Any]]]]
  
  @scala.inline
  def elem[A](E: Eq[A]): Fn4[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[Fn4[A]]
  
  @JSImport("fp-ts/lib/ReadonlyMap", "empty")
  @js.native
  val empty: ReadonlyMap[scala.Nothing, scala.Nothing] = js.native
  
  @scala.inline
  def filter[A](predicate: Predicate[A]): js.Function1[/* fa */ ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, A]]]
  
  @scala.inline
  def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fa */ ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, B]]]
  
  @scala.inline
  def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, B]]]
  
  @scala.inline
  def fromFoldable[F, K, A](E: Eq[K], M: Magma[A], F: Foldable[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ /* fka */ js.Any, 
    ReadonlyMap[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ /* fka */ js.Any, 
    ReadonlyMap[K, A]
  ]]
  @scala.inline
  def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, K, A](E: Eq[K], M: Magma[A], F: Foldable1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ /* fka */ js.Any, 
    ReadonlyMap[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ /* fka */ js.Any, 
    ReadonlyMap[K, A]
  ]]
  @scala.inline
  def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, K, A](E: Eq[K], M: Magma[A], F: Foldable2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [K, A]> */ /* fka */ js.Any, 
    ReadonlyMap[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, [K, A]> */ /* fka */ js.Any, 
    ReadonlyMap[K, A]
  ]]
  @scala.inline
  def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, K, A](E: Eq[K], M: Magma[A], F: Foldable3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [K, A]> */ /* fka */ js.Any, 
    ReadonlyMap[K, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(E.asInstanceOf[js.Any], M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, [K, A]> */ /* fka */ js.Any, 
    ReadonlyMap[K, A]
  ]]
  
  @scala.inline
  def fromMap[K, A](m: Map[K, A]): ReadonlyMap[K, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(m.asInstanceOf[js.Any]).asInstanceOf[ReadonlyMap[K, A]]
  
  @scala.inline
  def getEq[K, A](SK: Eq[K], SA: Eq[A]): Eq[ReadonlyMap[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Eq[ReadonlyMap[K, A]]]
  
  @scala.inline
  def getFilterableWithIndex[K](): FilterableWithIndex2C[typings.fpTs.readonlyMapMod.URI, K, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableWithIndex")().asInstanceOf[FilterableWithIndex2C[typings.fpTs.readonlyMapMod.URI, K, K]]
  
  @scala.inline
  def getMonoid[K, A](SK: Eq[K], SA: Semigroup[A]): Monoid[ReadonlyMap[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Monoid[ReadonlyMap[K, A]]]
  
  @scala.inline
  def getShow[K, A](SK: Show[K], SA: Show[A]): Show[ReadonlyMap[K, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Show[ReadonlyMap[K, A]]]
  
  @scala.inline
  def getWitherable[K](O: Ord_[K]): (Witherable2C[typings.fpTs.readonlyMapMod.URI, K]) & (TraversableWithIndex2C[typings.fpTs.readonlyMapMod.URI, K, K]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getWitherable")(O.asInstanceOf[js.Any]).asInstanceOf[(Witherable2C[typings.fpTs.readonlyMapMod.URI, K]) & (TraversableWithIndex2C[typings.fpTs.readonlyMapMod.URI, K, K])]
  
  @scala.inline
  def insertAt[K](E: Eq[K]): js.Function2[
    /* k */ K, 
    /* a */ js.Any, 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], ReadonlyMap[K, js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* k */ K, 
    /* a */ js.Any, 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], ReadonlyMap[K, js.Any]]
  ]]
  
  @scala.inline
  def isEmpty[K, A](d: ReadonlyMap[K, A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(d.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSubmap[K, A](SK: Eq[K], SA: Eq[A]): Fn7[K, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubmap")(SK.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Fn7[K, A]]
  
  @scala.inline
  def keys[K](O: Ord_[K]): js.Function1[/* m */ ReadonlyMap[K, js.Any], js.Array[K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ ReadonlyMap[K, js.Any], js.Array[K]]]
  
  @scala.inline
  def lookup[K](E: Eq[K]): Fn6[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(E.asInstanceOf[js.Any]).asInstanceOf[Fn6[K]]
  
  @scala.inline
  def lookupWithKey[K](E: Eq[K]): Fn5[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupWithKey")(E.asInstanceOf[js.Any]).asInstanceOf[Fn5[K]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, B]]]
  
  @scala.inline
  def mapWithIndex[K, A, B](f: js.Function2[/* k */ K, /* a */ A, B]): js.Function1[/* fa */ ReadonlyMap[K, A], ReadonlyMap[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyMap[K, A], ReadonlyMap[K, B]]]
  
  @scala.inline
  def member[K](E: Eq[K]): Fn3[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("member")(E.asInstanceOf[js.Any]).asInstanceOf[Fn3[K]]
  
  @scala.inline
  def modifyAt[K](E: Eq[K]): js.Function2[
    /* k */ K, 
    /* f */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], Option_[ReadonlyMap[K, js.Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* k */ K, 
    /* f */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], Option_[ReadonlyMap[K, js.Any]]]
  ]]
  
  @scala.inline
  def partition[A](predicate: Predicate[A]): js.Function1[
    /* fa */ ReadonlyMap[js.Any, A], 
    Separated[ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, A]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReadonlyMap[js.Any, A], 
    Separated[ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, A]]
  ]]
  
  @scala.inline
  def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[
    /* fa */ ReadonlyMap[js.Any, A], 
    Separated[ReadonlyMap[js.Any, B], ReadonlyMap[js.Any, C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReadonlyMap[js.Any, A], 
    Separated[ReadonlyMap[js.Any, B], ReadonlyMap[js.Any, C]]
  ]]
  
  @scala.inline
  def partition_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
    /* fa */ ReadonlyMap[js.Any, A], 
    Separated[ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReadonlyMap[js.Any, A], 
    Separated[ReadonlyMap[js.Any, A], ReadonlyMap[js.Any, B]]
  ]]
  
  @scala.inline
  def pop[K](E: Eq[K]): js.Function1[
    /* k */ K, 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], Option_[js.Tuple2[js.Any, ReadonlyMap[K, js.Any]]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* k */ K, 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], Option_[js.Tuple2[js.Any, ReadonlyMap[K, js.Any]]]]
  ]]
  
  @JSImport("fp-ts/lib/ReadonlyMap", "readonlyMap")
  @js.native
  val readonlyMap: Filterable2[typings.fpTs.readonlyMapMod.URI] = js.native
  
  @scala.inline
  def separate[K, A, B](fa: ReadonlyMap[K, Either_[A, B]]): Separated[ReadonlyMap[K, A], ReadonlyMap[K, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separate")(fa.asInstanceOf[js.Any]).asInstanceOf[Separated[ReadonlyMap[K, A], ReadonlyMap[K, B]]]
  
  @scala.inline
  def singleton[K, A](k: K, a: A): ReadonlyMap[K, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[ReadonlyMap[K, A]]
  
  @scala.inline
  def size[K, A](d: ReadonlyMap[K, A]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def toMap[K, A](m: ReadonlyMap[K, A]): Map[K, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(m.asInstanceOf[js.Any]).asInstanceOf[Map[K, A]]
  
  @scala.inline
  def toReadonlyArray[K](O: Ord_[K]): js.Function1[/* m */ ReadonlyMap[K, js.Any], js.Array[js.Tuple2[K, js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toReadonlyArray")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ ReadonlyMap[K, js.Any], js.Array[js.Tuple2[K, js.Any]]]]
  
  @scala.inline
  def toUnfoldable[K, F](ord: Ord_[K], U: Unfoldable[F]): js.Function1[
    /* d */ ReadonlyMap[K, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(ord.asInstanceOf[js.Any], U.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* d */ ReadonlyMap[K, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [K, A]> */ js.Any
  ]]
  @scala.inline
  def toUnfoldable[K, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](ord: Ord_[K], U: Unfoldable1[F]): js.Function1[
    /* d */ ReadonlyMap[K, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUnfoldable")(ord.asInstanceOf[js.Any], U.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* d */ ReadonlyMap[K, js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [K, A]> */ js.Any
  ]]
  
  @scala.inline
  def updateAt[K](E: Eq[K]): js.Function2[
    /* k */ K, 
    /* a */ js.Any, 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], Option_[ReadonlyMap[K, js.Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateAt")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* k */ K, 
    /* a */ js.Any, 
    js.Function1[/* m */ ReadonlyMap[K, js.Any], Option_[ReadonlyMap[K, js.Any]]]
  ]]
  
  @scala.inline
  def values[A](O: Ord_[A]): js.Function1[/* m */ ReadonlyMap[js.Any, A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* m */ ReadonlyMap[js.Any, A], js.Array[A]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
