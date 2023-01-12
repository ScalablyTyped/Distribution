package typings.fpTs.libApplicativeMod

import typings.fpTs.libApplyMod.Apply
import typings.fpTs.libPointedMod.Pointed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicative[F]
  extends StObject
     with Apply[F]
     with Pointed[F] {
  
  /* InferMemberOverrides */
  override val URI: F
}
object Applicative {
  
  inline def apply[F](
    URI: F,
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[Any, Any]) => Any,
    of: Any => Any
  ): Applicative[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Applicative[F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicative[?], F] (val x: Self & Applicative[F]) extends AnyVal {
    
    inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
  }
}
