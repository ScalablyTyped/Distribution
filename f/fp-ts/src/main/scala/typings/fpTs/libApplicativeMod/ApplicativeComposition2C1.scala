package typings.fpTs.libApplicativeMod

import typings.fpTs.libFunctorMod.FunctorComposition2C1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicativeComposition2C1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E]
  extends StObject
     with FunctorComposition2C1[F, G, E] {
  
  def ap[A, B](
    fgab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, (a : A): B>> */ Any,
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ Any
  ): Any
  
  def of[A](a: A): Any
}
object ApplicativeComposition2C1 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](
    ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ Any) => Any,
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ Any, js.Function1[Any, Any]) => Any,
    of: Any => Any
  ): ApplicativeComposition2C1[F, G, E] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[ApplicativeComposition2C1[F, G, E]]
  }
  
  extension [Self <: ApplicativeComposition2C1[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](x: Self & (ApplicativeComposition2C1[F, G, E])) {
    
    inline def setAp(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ Any) => Any
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
  }
}
