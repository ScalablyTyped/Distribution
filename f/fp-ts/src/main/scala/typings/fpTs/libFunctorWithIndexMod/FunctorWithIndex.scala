package typings.fpTs.libFunctorWithIndexMod

import typings.fpTs.libFunctorMod.Functor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorWithIndex[F, I]
  extends StObject
     with Functor[F] {
  
  def mapWithIndex[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
    f: js.Function2[/* i */ I, /* a */ A, B]
  ): Any
}
object FunctorWithIndex {
  
  inline def apply[F, I](
    URI: F,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[Any, Any]) => Any,
    mapWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function2[/* i */ I, Any, Any]) => Any
  ): FunctorWithIndex[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
    __obj.asInstanceOf[FunctorWithIndex[F, I]]
  }
  
  extension [Self <: FunctorWithIndex[?, ?], F, I](x: Self & (FunctorWithIndex[F, I])) {
    
    inline def setMapWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function2[/* i */ I, Any, Any]) => Any
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction2(value))
  }
}
