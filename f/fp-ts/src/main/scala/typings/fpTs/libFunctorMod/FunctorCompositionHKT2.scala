package typings.fpTs.libFunctorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorCompositionHKT2[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
  
  def map[E, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ Any,
    f: js.Function1[/* a */ A, B]
  ): Any
}
object FunctorCompositionHKT2 {
  
  inline def apply[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ Any, js.Function1[Any, Any]) => Any
  ): FunctorCompositionHKT2[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[FunctorCompositionHKT2[F, G]]
  }
  
  extension [Self <: FunctorCompositionHKT2[?, ?], F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & (FunctorCompositionHKT2[F, G])) {
    
    inline def setMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ Any, js.Function1[Any, Any]) => Any
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
  }
}
