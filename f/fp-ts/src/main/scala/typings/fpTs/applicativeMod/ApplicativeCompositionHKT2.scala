package typings.fpTs.applicativeMod

import typings.fpTs.functorMod.FunctorCompositionHKT2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicativeCompositionHKT2[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
  extends StObject
     with FunctorCompositionHKT2[F, G] {
  
  def ap[E, A, B](
    fgab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, (a : A): B>> */ js.Any,
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ js.Any
  ): js.Any
  
  def of[E, A](a: A): js.Any
}
object ApplicativeCompositionHKT2 {
  
  @scala.inline
  def apply[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ js.Any) => js.Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    of: js.Any => js.Any
  ): ApplicativeCompositionHKT2[F, G] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[ApplicativeCompositionHKT2[F, G]]
  }
  
  @scala.inline
  implicit class ApplicativeCompositionHKT2MutableBuilder[Self <: ApplicativeCompositionHKT2[?, ?], F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & (ApplicativeCompositionHKT2[F, G])) extends AnyVal {
    
    @scala.inline
    def setAp(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ js.Any) => js.Any
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOf(value: js.Any => js.Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
  }
}
