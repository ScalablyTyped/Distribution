package typings.fpTs.libApplicativeMod

import typings.fpTs.libFunctorMod.FunctorComposition22
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicativeComposition22[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
  extends StObject
     with FunctorComposition22[F, G] {
  
  def ap[FE, GE, A, B](
    fgab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, (a : A): B>> */ Any,
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any
  ): Any
  
  def of[FE, GE, A](a: A): Any
}
object ApplicativeComposition22 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any, js.Function1[Any, Any]) => Any,
    of: Any => Any
  ): ApplicativeComposition22[F, G] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[ApplicativeComposition22[F, G]]
  }
  
  extension [Self <: ApplicativeComposition22[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & (ApplicativeComposition22[F, G])) {
    
    inline def setAp(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any) => Any
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
  }
}
