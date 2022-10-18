package typings.fpTs.libApplicativeMod

import typings.fpTs.libFunctorMod.FunctorComposition12
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicativeComposition12[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
  extends StObject
     with FunctorComposition12[F, G] {
  
  def ap[E, A, B](
    fgab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, (a : A): B>> */ Any,
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any
  ): Any
  
  def of[E, A](a: A): Any
}
object ApplicativeComposition12 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, js.Function1[Any, Any]) => Any,
    of: Any => Any
  ): ApplicativeComposition12[F, G] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[ApplicativeComposition12[F, G]]
  }
  
  extension [Self <: ApplicativeComposition12[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & (ApplicativeComposition12[F, G])) {
    
    inline def setAp(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any) => Any
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
  }
}
