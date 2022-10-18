package typings.fpTs.libFunctorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Functor2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
  
  val URI: F
  
  val _E: E
  
  def map[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    f: js.Function1[/* a */ A, B]
  ): Any
}
object Functor2C {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
    URI: F,
    _E: E,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
  ): Functor2C[F, E] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[Functor2C[F, E]]
  }
  
  extension [Self <: Functor2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Functor2C[F, E])) {
    
    inline def setMap(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
