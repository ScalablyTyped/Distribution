package typings.fpTs.functorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorComposition[F, G] extends StObject {
  
  def map[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any,
    f: js.Function1[/* a */ A, B]
  ): js.Any
}
object FunctorComposition {
  
  @scala.inline
  def apply[F, G](
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
  ): FunctorComposition[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[FunctorComposition[F, G]]
  }
  
  @scala.inline
  implicit class FunctorCompositionMutableBuilder[Self <: FunctorComposition[?, ?], F, G] (val x: Self & (FunctorComposition[F, G])) extends AnyVal {
    
    @scala.inline
    def setMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
  }
}
