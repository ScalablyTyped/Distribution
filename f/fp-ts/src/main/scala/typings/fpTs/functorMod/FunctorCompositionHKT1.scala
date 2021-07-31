package typings.fpTs.functorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorCompositionHKT1[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
  
  def map[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ js.Any,
    f: js.Function1[/* a */ A, B]
  ): js.Any
}
object FunctorCompositionHKT1 {
  
  @scala.inline
  def apply[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
  ): FunctorCompositionHKT1[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[FunctorCompositionHKT1[F, G]]
  }
  
  @scala.inline
  implicit class FunctorCompositionHKT1MutableBuilder[Self <: FunctorCompositionHKT1[?, ?], F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & (FunctorCompositionHKT1[F, G])) extends AnyVal {
    
    @scala.inline
    def setMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
  }
}
