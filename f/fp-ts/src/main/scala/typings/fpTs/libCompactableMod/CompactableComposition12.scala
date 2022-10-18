package typings.fpTs.libCompactableMod

import typings.fpTs.libFunctorMod.FunctorComposition12
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactableComposition12[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
  extends StObject
     with FunctorComposition12[F, G] {
  
  def compact[E, A](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Option<A>>> */ Any
  ): Any
  
  def separate[E, A, B](
    fge: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Either<A, B>>> */ Any
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any
  ]
}
object CompactableComposition12 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Option<A>>> */ Any => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, js.Function1[Any, Any]) => Any,
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Either<A, B>>> */ Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any
    ]
  ): CompactableComposition12[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[CompactableComposition12[F, G]]
  }
  
  extension [Self <: CompactableComposition12[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & (CompactableComposition12[F, G])) {
    
    inline def setCompact(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Option<A>>> */ Any => Any
    ): Self = StObject.set(x, "compact", js.Any.fromFunction1(value))
    
    inline def setSeparate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Either<A, B>>> */ Any => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any
        ]
    ): Self = StObject.set(x, "separate", js.Any.fromFunction1(value))
  }
}
