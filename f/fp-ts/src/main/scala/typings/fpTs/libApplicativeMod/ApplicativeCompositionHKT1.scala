package typings.fpTs.libApplicativeMod

import typings.fpTs.libFunctorMod.FunctorCompositionHKT1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicativeCompositionHKT1[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
  extends StObject
     with FunctorCompositionHKT1[F, G] {
  
  def ap[A, B](
    fgab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, (a : A): B>> */ Any,
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ Any
  ): Any
  
  def of[A](a: A): Any
}
object ApplicativeCompositionHKT1 {
  
  inline def apply[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ Any) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ Any, js.Function1[Any, Any]) => Any,
    of: Any => Any
  ): ApplicativeCompositionHKT1[F, G] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[ApplicativeCompositionHKT1[F, G]]
  }
  
  extension [Self <: ApplicativeCompositionHKT1[?, ?], F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & (ApplicativeCompositionHKT1[F, G])) {
    
    inline def setAp(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ Any) => Any
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
  }
}
