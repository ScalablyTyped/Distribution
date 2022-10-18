package typings.fpTs.libFunctorWithIndexMod

import typings.fpTs.libFunctorMod.Functor2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorWithIndex2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I]
  extends StObject
     with Functor2[F] {
  
  def mapWithIndex[E, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    f: js.Function2[/* i */ I, /* a */ A, B]
  ): Any
}
object FunctorWithIndex2 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I](
    URI: F,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any,
    mapWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function2[/* i */ I, Any, Any]) => Any
  ): FunctorWithIndex2[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
    __obj.asInstanceOf[FunctorWithIndex2[F, I]]
  }
  
  extension [Self <: FunctorWithIndex2[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I](x: Self & (FunctorWithIndex2[F, I])) {
    
    inline def setMapWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function2[/* i */ I, Any, Any]) => Any
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction2(value))
  }
}
