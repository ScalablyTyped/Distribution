package typings.fpTs.compactableMod

import typings.fpTs.functorMod.FunctorComposition22
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactableComposition22[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
  extends StObject
     with FunctorComposition22[F, G] {
  
  def compact[FE, GE, A](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Option<A>>> */ js.Any
  ): js.Any
  
  def separate[FE, GE, A, B](
    fge: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Either<A, B>>> */ js.Any
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, B>> */ js.Any
  ]
}
object CompactableComposition22 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Option<A>>> */ js.Any => js.Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Either<A, B>>> */ js.Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, B>> */ js.Any
    ]
  ): CompactableComposition22[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[CompactableComposition22[F, G]]
  }
  
  @scala.inline
  implicit class CompactableComposition22MutableBuilder[Self <: CompactableComposition22[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & (CompactableComposition22[F, G])) extends AnyVal {
    
    @scala.inline
    def setCompact(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Option<A>>> */ js.Any => js.Any
    ): Self = StObject.set(x, "compact", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeparate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, Either<A, B>>> */ js.Any => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, B>> */ js.Any
        ]
    ): Self = StObject.set(x, "separate", js.Any.fromFunction1(value))
  }
}
