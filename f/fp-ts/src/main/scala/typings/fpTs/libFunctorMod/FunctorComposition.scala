package typings.fpTs.libFunctorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorComposition[F, G] extends StObject {
  
  def map[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any,
    f: js.Function1[/* a */ A, B]
  ): Any
}
object FunctorComposition {
  
  inline def apply[F, G](
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, js.Function1[Any, Any]) => Any
  ): FunctorComposition[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[FunctorComposition[F, G]]
  }
  
  extension [Self <: FunctorComposition[?, ?], F, G](x: Self & (FunctorComposition[F, G])) {
    
    inline def setMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, js.Function1[Any, Any]) => Any
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
  }
}
