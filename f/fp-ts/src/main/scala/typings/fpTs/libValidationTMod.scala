package typings.fpTs

import typings.fpTs.libApplicativeMod.ApplicativeComposition12C
import typings.fpTs.libApplicativeMod.ApplicativeComposition22C
import typings.fpTs.libApplicativeMod.ApplicativeCompositionHKT2C
import typings.fpTs.libEitherMod.URI
import typings.fpTs.libFunctionMod.Lazy
import typings.fpTs.libMonadMod.Monad
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonadMod.Monad2
import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValidationTMod {
  
  @JSImport("fp-ts/lib/ValidationT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValidationM[E, M](S: Semigroup[E], M: Monad[M]): ValidationM[M, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationM")(S.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[ValidationM[M, E]]
  inline def getValidationM[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](S: Semigroup[E], M: Monad1[M]): ValidationM1[M, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationM")(S.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[ValidationM1[M, E]]
  inline def getValidationM[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](S: Semigroup[E], M: Monad2[M]): ValidationM2[M, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationM")(S.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[ValidationM2[M, E]]
  
  trait ValidationM[M, E]
    extends StObject
       with ApplicativeCompositionHKT2C[M, URI, E] {
    
    def alt[A](fa: ValidationT[M, E, A], that: Lazy[ValidationT[M, E, A]]): ValidationT[M, E, A]
    
    def chain[A, B](ma: ValidationT[M, E, A], f: js.Function1[/* a */ A, ValidationT[M, E, B]]): ValidationT[M, E, B]
  }
  object ValidationM {
    
    inline def apply[M, E](
      alt: (ValidationT[M, E, Any], Lazy[ValidationT[M, E, Any]]) => ValidationT[M, E, Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ Any) => Any,
      chain: (ValidationT[M, E, Any], js.Function1[Any, ValidationT[M, E, Any]]) => ValidationT[M, E, Any],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): ValidationM[M, E] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ValidationM[M, E]]
    }
    
    extension [Self <: ValidationM[?, ?], M, E](x: Self & (ValidationM[M, E])) {
      
      inline def setAlt(value: (ValidationT[M, E, Any], Lazy[ValidationT[M, E, Any]]) => ValidationT[M, E, Any]): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (ValidationT[M, E, Any], js.Function1[Any, ValidationT[M, E, Any]]) => ValidationT[M, E, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
  
  trait ValidationM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E]
    extends StObject
       with ApplicativeComposition12C[M, URI, E] {
    
    def alt[A](fa: ValidationT1[M, E, A], that: Lazy[ValidationT1[M, E, A]]): ValidationT1[M, E, A]
    
    def chain[A, B](ma: ValidationT1[M, E, A], f: js.Function1[/* a */ A, ValidationT1[M, E, B]]): ValidationT1[M, E, B]
  }
  object ValidationM1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](
      alt: (ValidationT1[M, E, Any], Lazy[ValidationT1[M, E, Any]]) => ValidationT1[M, E, Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any) => Any,
      chain: (ValidationT1[M, E, Any], js.Function1[Any, ValidationT1[M, E, Any]]) => ValidationT1[M, E, Any],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): ValidationM1[M, E] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ValidationM1[M, E]]
    }
    
    extension [Self <: ValidationM1[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](x: Self & (ValidationM1[M, E])) {
      
      inline def setAlt(value: (ValidationT1[M, E, Any], Lazy[ValidationT1[M, E, Any]]) => ValidationT1[M, E, Any]): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (ValidationT1[M, E, Any], js.Function1[Any, ValidationT1[M, E, Any]]) => ValidationT1[M, E, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
  
  trait ValidationM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E]
    extends StObject
       with ApplicativeComposition22C[M, URI, E] {
    
    def alt[R, A](fa: ValidationT2[M, R, E, A], that: Lazy[ValidationT2[M, R, E, A]]): ValidationT2[M, R, E, A]
    
    def chain[R, A, B](ma: ValidationT2[M, R, E, A], f: js.Function1[/* a */ A, ValidationT2[M, R, E, B]]): ValidationT2[M, R, E, B]
  }
  object ValidationM2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      alt: (ValidationT2[M, Any, E, Any], Lazy[ValidationT2[M, Any, E, Any]]) => ValidationT2[M, Any, E, Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any) => Any,
      chain: (ValidationT2[M, Any, E, Any], js.Function1[Any, ValidationT2[M, Any, E, Any]]) => ValidationT2[M, Any, E, Any],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): ValidationM2[M, E] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ValidationM2[M, E]]
    }
    
    extension [Self <: ValidationM2[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (ValidationM2[M, E])) {
      
      inline def setAlt(
        value: (ValidationT2[M, Any, E, Any], Lazy[ValidationT2[M, Any, E, Any]]) => ValidationT2[M, Any, E, Any]
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (ValidationT2[M, Any, E, Any], js.Function1[Any, ValidationT2[M, Any, E, Any]]) => ValidationT2[M, Any, E, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
  
  type ValidationT[M, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
  
  type ValidationT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
  
  type ValidationT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, R, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Either<E, A>> */ Any
}
