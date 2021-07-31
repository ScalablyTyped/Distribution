package typings.fpTs.applicativeMod

import typings.fpTs.functorMod.FunctorComposition2C1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicativeComposition2C1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E]
  extends StObject
     with FunctorComposition2C1[F, G, E] {
  
  def ap[A, B](
    fgab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, (a : A): B>> */ js.Any,
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any
  ): js.Any
  
  def of[A](a: A): js.Any
}
object ApplicativeComposition2C1 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E](
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any) => js.Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    of: js.Any => js.Any
  ): ApplicativeComposition2C1[F, G, E] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[ApplicativeComposition2C1[F, G, E]]
  }
  
  @scala.inline
  implicit class ApplicativeComposition2C1MutableBuilder[Self <: ApplicativeComposition2C1[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E] (val x: Self & (ApplicativeComposition2C1[F, G, E])) extends AnyVal {
    
    @scala.inline
    def setAp(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any) => js.Any
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOf(value: js.Any => js.Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
  }
}
