package typings.fpTs.libApplicativeMod

import typings.fpTs.libApplyMod.Apply3
import typings.fpTs.libPointedMod.Pointed3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicative3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
  extends StObject
     with Apply3[F]
     with Pointed3[F] {
  
  /* InferMemberOverrides */
  override val URI: F
}
object Applicative3 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
    URI: F,
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any,
    of: Any => Any
  ): Applicative3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Applicative3[F]]
  }
  
  extension [Self <: Applicative3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & Applicative3[F]) {
    
    inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
  }
}
