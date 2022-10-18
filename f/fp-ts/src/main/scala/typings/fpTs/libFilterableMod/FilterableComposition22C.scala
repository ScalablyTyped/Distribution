package typings.fpTs.libFilterableMod

import typings.fpTs.libCompactableMod.CompactableComposition22
import typings.fpTs.libCompactableMod.Separated
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterableComposition22C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E]
  extends StObject
     with CompactableComposition22[F, G] {
  
  def filter[FE, A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any,
    predicate: Predicate[A]
  ): Any
  
  def filterMap[FE, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any,
    f: js.Function1[/* a */ A, Option_[B]]
  ): Any
  
  def partition[FE, A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any,
    predicate: Predicate[A]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any
  ]
  
  def partitionMap[FE, A, B, C](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any,
    f: js.Function1[/* a */ A, Either_[B, C]]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, C>> */ Any
  ]
}
object FilterableComposition22C {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Option<A>>> */ Any => Any,
    filter: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, Predicate[Any]) => Any,
    filterMap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, js.Function1[Any, Option_[Any]]) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any, js.Function1[Any, Any]) => Any,
    partition: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, Predicate[Any]) => Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any
    ],
    partitionMap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, js.Function1[Any, Either_[Any, Any]]) => Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, C>> */ Any
    ],
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Either<A, B>>> */ Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, B>> */ Any
    ]
  ): FilterableComposition22C[F, G, E] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[FilterableComposition22C[F, G, E]]
  }
  
  extension [Self <: FilterableComposition22C[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (FilterableComposition22C[F, G, E])) {
    
    inline def setFilter(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, Predicate[Any]) => Any
    ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, js.Function1[Any, Option_[Any]]) => Any
    ): Self = StObject.set(x, "filterMap", js.Any.fromFunction2(value))
    
    inline def setPartition(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, Predicate[Any]) => Separated_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any
        ]
    ): Self = StObject.set(x, "partition", js.Any.fromFunction2(value))
    
    inline def setPartitionMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, js.Function1[Any, Either_[Any, Any]]) => Separated_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, C>> */ Any
        ]
    ): Self = StObject.set(x, "partitionMap", js.Any.fromFunction2(value))
  }
}
