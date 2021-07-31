package typings.fpTs.functorWithIndexMod

import typings.fpTs.functorMod.Functor3C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorWithIndex3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, I, E]
  extends StObject
     with Functor3C[F, E] {
  
  def mapWithIndex[R, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
    f: js.Function2[/* i */ I, /* a */ A, B]
  ): js.Any
}
object FunctorWithIndex3C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, I, E](
    URI: F,
    _E: E,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    mapWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function2[/* i */ I, js.Any, js.Any]) => js.Any
  ): FunctorWithIndex3C[F, I, E] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
    __obj.asInstanceOf[FunctorWithIndex3C[F, I, E]]
  }
  
  @scala.inline
  implicit class FunctorWithIndex3CMutableBuilder[Self <: FunctorWithIndex3C[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, I, E] (val x: Self & (FunctorWithIndex3C[F, I, E])) extends AnyVal {
    
    @scala.inline
    def setMapWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function2[/* i */ I, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction2(value))
  }
}
