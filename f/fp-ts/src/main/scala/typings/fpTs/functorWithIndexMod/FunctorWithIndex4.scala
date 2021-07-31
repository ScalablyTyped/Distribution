package typings.fpTs.functorWithIndexMod

import typings.fpTs.functorMod.Functor4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorWithIndex4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */, I]
  extends StObject
     with Functor4[F] {
  
  def mapWithIndex[S, R, E, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any,
    f: js.Function2[/* i */ I, /* a */ A, B]
  ): js.Any
}
object FunctorWithIndex4 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */, I](
    URI: F,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    mapWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function2[/* i */ I, js.Any, js.Any]) => js.Any
  ): FunctorWithIndex4[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
    __obj.asInstanceOf[FunctorWithIndex4[F, I]]
  }
  
  @scala.inline
  implicit class FunctorWithIndex4MutableBuilder[Self <: FunctorWithIndex4[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */, I] (val x: Self & (FunctorWithIndex4[F, I])) extends AnyVal {
    
    @scala.inline
    def setMapWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function2[/* i */ I, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction2(value))
  }
}
