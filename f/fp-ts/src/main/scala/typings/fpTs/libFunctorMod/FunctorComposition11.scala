package typings.fpTs.libFunctorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
  
  def map[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any,
    f: js.Function1[/* a */ A, B]
  ): Any
}
object FunctorComposition11 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, js.Function1[Any, Any]) => Any
  ): FunctorComposition11[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[FunctorComposition11[F, G]]
  }
  
  extension [Self <: FunctorComposition11[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & (FunctorComposition11[F, G])) {
    
    inline def setMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, js.Function1[Any, Any]) => Any
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
  }
}
