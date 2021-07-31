package typings.fpTs.filterableMod

import typings.fpTs.compactableMod.CompactableComposition22
import typings.fpTs.compactableMod.Separated
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Predicate
import typings.fpTs.optionMod.Option_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterableComposition22C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
  extends StObject
     with CompactableComposition22[F, G] {
  
  def filter[FE, A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any,
    predicate: Predicate[A]
  ): js.Any
  
  def filterMap[FE, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any,
    f: js.Function1[/* a */ A, Option_[B]]
  ): js.Any
  
  def partition[FE, A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any,
    predicate: Predicate[A]
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any
  ]
  
  def partitionMap[FE, A, B, C](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any,
    f: js.Function1[/* a */ A, Either_[B, C]]
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, C>> */ js.Any
  ]
}
object FilterableComposition22C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Option<A>>> */ js.Any => js.Any,
    filter: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, Predicate[js.Any]) => js.Any,
    filterMap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Function1[js.Any, Option_[js.Any]]) => js.Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    partition: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, Predicate[js.Any]) => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any
    ],
    partitionMap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Function1[js.Any, Either_[js.Any, js.Any]]) => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, C>> */ js.Any
    ],
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Either<A, B>>> */ js.Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, B>> */ js.Any
    ]
  ): FilterableComposition22C[F, G, E] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[FilterableComposition22C[F, G, E]]
  }
  
  @scala.inline
  implicit class FilterableComposition22CMutableBuilder[Self <: FilterableComposition22C[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (FilterableComposition22C[F, G, E])) extends AnyVal {
    
    @scala.inline
    def setFilter(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, Predicate[js.Any]) => js.Any
    ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Function1[js.Any, Option_[js.Any]]) => js.Any
    ): Self = StObject.set(x, "filterMap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPartition(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, Predicate[js.Any]) => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any
        ]
    ): Self = StObject.set(x, "partition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPartitionMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Function1[js.Any, Either_[js.Any, js.Any]]) => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, C>> */ js.Any
        ]
    ): Self = StObject.set(x, "partitionMap", js.Any.fromFunction2(value))
  }
}
