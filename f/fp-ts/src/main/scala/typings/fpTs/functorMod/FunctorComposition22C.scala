package typings.fpTs.functorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorComposition22C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
  
  def map[FE, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any,
    f: js.Function1[/* a */ A, B]
  ): js.Any
}
object FunctorComposition22C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
  ): FunctorComposition22C[F, G, E] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[FunctorComposition22C[F, G, E]]
  }
  
  @scala.inline
  implicit class FunctorComposition22CMutableBuilder[Self <: FunctorComposition22C[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (FunctorComposition22C[F, G, E])) extends AnyVal {
    
    @scala.inline
    def setMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
  }
}
