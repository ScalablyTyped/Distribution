package typings.fpTs.functorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Functor[F] extends StObject {
  
  val URI: F
  
  def map[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any,
    f: js.Function1[/* a */ A, B]
  ): js.Any
}
object Functor {
  
  @scala.inline
  def apply[F](
    URI: F,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
  ): Functor[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[Functor[F]]
  }
  
  @scala.inline
  implicit class FunctorMutableBuilder[Self <: Functor[?], F] (val x: Self & Functor[F]) extends AnyVal {
    
    @scala.inline
    def setMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    @scala.inline
    def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
  }
}
