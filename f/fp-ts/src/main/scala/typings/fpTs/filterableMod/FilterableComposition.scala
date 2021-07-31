package typings.fpTs.filterableMod

import typings.fpTs.compactableMod.CompactableComposition
import typings.fpTs.compactableMod.Separated
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Predicate
import typings.fpTs.optionMod.Option_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterableComposition[F, G]
  extends StObject
     with CompactableComposition[F, G] {
  
  def filter[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any,
    predicate: Predicate[A]
  ): js.Any
  
  def filterMap[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any,
    f: js.Function1[/* a */ A, Option_[B]]
  ): js.Any
  
  def partition[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any,
    predicate: Predicate[A]
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any
  ]
  
  def partitionMap[A, B, C](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any,
    f: js.Function1[/* a */ A, Either_[B, C]]
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, C>> */ js.Any
  ]
}
object FilterableComposition {
  
  @scala.inline
  def apply[F, G](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Option<A>>> */ js.Any => js.Any,
    filter: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, Predicate[js.Any]) => js.Any,
    filterMap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Function1[js.Any, Option_[js.Any]]) => js.Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    partition: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, Predicate[js.Any]) => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any
    ],
    partitionMap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Function1[js.Any, Either_[js.Any, js.Any]]) => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, C>> */ js.Any
    ],
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Either<A, B>>> */ js.Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ js.Any
    ]
  ): FilterableComposition[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[FilterableComposition[F, G]]
  }
  
  @scala.inline
  implicit class FilterableCompositionMutableBuilder[Self <: FilterableComposition[?, ?], F, G] (val x: Self & (FilterableComposition[F, G])) extends AnyVal {
    
    @scala.inline
    def setFilter(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, Predicate[js.Any]) => js.Any
    ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Function1[js.Any, Option_[js.Any]]) => js.Any
    ): Self = StObject.set(x, "filterMap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPartition(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, Predicate[js.Any]) => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any
        ]
    ): Self = StObject.set(x, "partition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPartitionMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Function1[js.Any, Either_[js.Any, js.Any]]) => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, C>> */ js.Any
        ]
    ): Self = StObject.set(x, "partitionMap", js.Any.fromFunction2(value))
  }
}
