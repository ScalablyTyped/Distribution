package typings.fpTs.applicativeMod

import typings.fpTs.applyMod.Apply2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicative2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
  extends StObject
     with Apply2[F] {
  
  def of[E, A](a: A): js.Any
}
object Applicative2 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
    URI: F,
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    of: js.Any => js.Any
  ): Applicative2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Applicative2[F]]
  }
  
  @scala.inline
  implicit class Applicative2MutableBuilder[Self <: Applicative2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Applicative2[F]) extends AnyVal {
    
    @scala.inline
    def setOf(value: js.Any => js.Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
  }
}
