package typings.fpTs.libApplicativeMod

import typings.fpTs.libApplyMod.Apply3C
import typings.fpTs.libPointedMod.Pointed3C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicative3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E]
  extends StObject
     with Apply3C[F, E]
     with Pointed3C[F, E] {
  
  /* InferMemberOverrides */
  override val URI: F
  
  /* InferMemberOverrides */
  override val _E: E
}
object Applicative3C {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
    URI: F,
    _E: E,
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any,
    of: Any => Any
  ): Applicative3C[F, E] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Applicative3C[F, E]]
  }
  
  extension [Self <: Applicative3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (Applicative3C[F, E])) {
    
    inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
