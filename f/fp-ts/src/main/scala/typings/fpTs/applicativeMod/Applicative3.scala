package typings.fpTs.applicativeMod

import typings.fpTs.applyMod.Apply3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicative3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
  extends StObject
     with Apply3[F] {
  
  def of[R, E, A](a: A): js.Any
}
object Applicative3 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
    URI: F,
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    of: js.Any => js.Any
  ): Applicative3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Applicative3[F]]
  }
  
  @scala.inline
  implicit class Applicative3MutableBuilder[Self <: Applicative3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Applicative3[F]) extends AnyVal {
    
    @scala.inline
    def setOf(value: js.Any => js.Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
  }
}
