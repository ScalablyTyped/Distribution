package typings.fpTs.compactableMod

import typings.fpTs.functorMod.FunctorComposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactableComposition[F, G]
  extends StObject
     with FunctorComposition[F, G] {
  
  def compact[A](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Option<A>>> */ js.Any
  ): js.Any
  
  def separate[A, B](
    fge: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Either<A, B>>> */ js.Any
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ js.Any
  ]
}
object CompactableComposition {
  
  @scala.inline
  def apply[F, G](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Option<A>>> */ js.Any => js.Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Either<A, B>>> */ js.Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ js.Any
    ]
  ): CompactableComposition[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[CompactableComposition[F, G]]
  }
  
  @scala.inline
  implicit class CompactableCompositionMutableBuilder[Self <: CompactableComposition[?, ?], F, G] (val x: Self & (CompactableComposition[F, G])) extends AnyVal {
    
    @scala.inline
    def setCompact(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Option<A>>> */ js.Any => js.Any
    ): Self = StObject.set(x, "compact", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeparate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Either<A, B>>> */ js.Any => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ js.Any
        ]
    ): Self = StObject.set(x, "separate", js.Any.fromFunction1(value))
  }
}
