package typings.fpTs.libFilterableMod

import typings.fpTs.libCompactableMod.CompactableComposition11
import typings.fpTs.libCompactableMod.Separated
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterableComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
  extends StObject
     with CompactableComposition11[F, G] {
  
  def filter[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any,
    predicate: Predicate[A]
  ): Any
  
  def filterMap[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any,
    f: js.Function1[/* a */ A, Option_[B]]
  ): Any
  
  def partition[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any,
    predicate: Predicate[A]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any
  ]
  
  def partitionMap[A, B, C](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any,
    f: js.Function1[/* a */ A, Either_[B, C]]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, C>> */ Any
  ]
}
object FilterableComposition11 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Option<A>>> */ Any => Any,
    filter: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Predicate[Any]) => Any,
    filterMap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, js.Function1[Any, Option_[Any]]) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, js.Function1[Any, Any]) => Any,
    partition: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Predicate[Any]) => Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any
    ],
    partitionMap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, js.Function1[Any, Either_[Any, Any]]) => Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, C>> */ Any
    ],
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Either<A, B>>> */ Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any
    ]
  ): FilterableComposition11[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[FilterableComposition11[F, G]]
  }
  
  extension [Self <: FilterableComposition11[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & (FilterableComposition11[F, G])) {
    
    inline def setFilter(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Predicate[Any]) => Any
    ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, js.Function1[Any, Option_[Any]]) => Any
    ): Self = StObject.set(x, "filterMap", js.Any.fromFunction2(value))
    
    inline def setPartition(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Predicate[Any]) => Separated_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any
        ]
    ): Self = StObject.set(x, "partition", js.Any.fromFunction2(value))
    
    inline def setPartitionMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, js.Function1[Any, Either_[Any, Any]]) => Separated_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, C>> */ Any
        ]
    ): Self = StObject.set(x, "partitionMap", js.Any.fromFunction2(value))
  }
}
