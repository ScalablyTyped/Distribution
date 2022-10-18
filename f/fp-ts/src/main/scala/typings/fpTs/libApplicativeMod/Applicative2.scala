package typings.fpTs.libApplicativeMod

import typings.fpTs.libApplyMod.Apply2
import typings.fpTs.libPointedMod.Pointed2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicative2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
  extends StObject
     with Apply2[F]
     with Pointed2[F] {
  
  /* InferMemberOverrides */
  override val URI: F
}
object Applicative2 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
    URI: F,
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any,
    of: Any => Any
  ): Applicative2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Applicative2[F]]
  }
  
  extension [Self <: Applicative2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & Applicative2[F]) {
    
    inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
  }
}
