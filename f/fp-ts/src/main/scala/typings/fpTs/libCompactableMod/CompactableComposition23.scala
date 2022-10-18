package typings.fpTs.libCompactableMod

import typings.fpTs.libFunctorMod.FunctorComposition23
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactableComposition23[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
  extends StObject
     with FunctorComposition23[F, G] {
  
  def compact[R, FE, GE, A](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, Option<A>>> */ Any
  ): Any
  
  def separate[R, FE, GE, A, B](
    fge: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, Either<A, B>>> */ Any
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, A>> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, B>> */ Any
  ]
}
object CompactableComposition23 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, Option<A>>> */ Any => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, E, A>> */ Any, js.Function1[Any, Any]) => Any,
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, Either<A, B>>> */ Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, A>> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, B>> */ Any
    ]
  ): CompactableComposition23[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[CompactableComposition23[F, G]]
  }
  
  extension [Self <: CompactableComposition23[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & (CompactableComposition23[F, G])) {
    
    inline def setCompact(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, Option<A>>> */ Any => Any
    ): Self = StObject.set(x, "compact", js.Any.fromFunction1(value))
    
    inline def setSeparate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, Either<A, B>>> */ Any => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, A>> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<G, R, GE, B>> */ Any
        ]
    ): Self = StObject.set(x, "separate", js.Any.fromFunction1(value))
  }
}
