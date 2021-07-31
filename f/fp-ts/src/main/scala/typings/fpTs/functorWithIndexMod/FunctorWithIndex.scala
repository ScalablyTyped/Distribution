package typings.fpTs.functorWithIndexMod

import typings.fpTs.functorMod.Functor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorWithIndex[F, I]
  extends StObject
     with Functor[F] {
  
  def mapWithIndex[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any,
    f: js.Function2[/* i */ I, /* a */ A, B]
  ): js.Any
}
object FunctorWithIndex {
  
  @scala.inline
  def apply[F, I](
    URI: F,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    mapWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function2[/* i */ I, js.Any, js.Any]) => js.Any
  ): FunctorWithIndex[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
    __obj.asInstanceOf[FunctorWithIndex[F, I]]
  }
  
  @scala.inline
  implicit class FunctorWithIndexMutableBuilder[Self <: FunctorWithIndex[?, ?], F, I] (val x: Self & (FunctorWithIndex[F, I])) extends AnyVal {
    
    @scala.inline
    def setMapWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function2[/* i */ I, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction2(value))
  }
}
