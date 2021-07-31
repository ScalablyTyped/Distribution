package typings.fpTs

import typings.fpTs.altMod.Alt
import typings.fpTs.altMod.Alt1
import typings.fpTs.altMod.Alt2
import typings.fpTs.altMod.Alt2C
import typings.fpTs.altMod.Alt3
import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.functionMod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alternativeMod {
  
  trait Alternative[F]
    extends StObject
       with Applicative[F]
       with Alt[F] {
    
    def zero[A](): js.Any
  }
  object Alternative {
    
    @scala.inline
    def apply[F](
      URI: F,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
        ]) => js.Any,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any,
      zero: () => js.Any
    ): Alternative[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Alternative[F]]
    }
    
    @scala.inline
    implicit class AlternativeMutableBuilder[Self <: Alternative[?], F] (val x: Self & Alternative[F]) extends AnyVal {
      
      @scala.inline
      def setZero(value: () => js.Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
  
  trait Alternative1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Applicative1[F]
       with Alt1[F] {
    
    def zero[A](): js.Any
  }
  object Alternative1 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: F,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
        ]) => js.Any,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any,
      zero: () => js.Any
    ): Alternative1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Alternative1[F]]
    }
    
    @scala.inline
    implicit class Alternative1MutableBuilder[Self <: Alternative1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & Alternative1[F]) extends AnyVal {
      
      @scala.inline
      def setZero(value: () => js.Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
  
  trait Alternative2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Applicative2[F]
       with Alt2[F] {
    
    def zero[E, A](): js.Any
  }
  object Alternative2 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ]) => js.Any,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any,
      zero: () => js.Any
    ): Alternative2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Alternative2[F]]
    }
    
    @scala.inline
    implicit class Alternative2MutableBuilder[Self <: Alternative2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Alternative2[F]) extends AnyVal {
      
      @scala.inline
      def setZero(value: () => js.Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
  
  trait Alternative2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with Applicative2C[F, E]
       with Alt2C[F, E] {
    
    def zero[A](): js.Any
  }
  object Alternative2C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: F,
      _E: E,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ]) => js.Any,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any,
      zero: () => js.Any
    ): Alternative2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Alternative2C[F, E]]
    }
    
    @scala.inline
    implicit class Alternative2CMutableBuilder[Self <: Alternative2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Alternative2C[F, E])) extends AnyVal {
      
      @scala.inline
      def setZero(value: () => js.Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
  
  trait Alternative3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Applicative3[F]
       with Alt3[F] {
    
    def zero[R, E, A](): js.Any
  }
  object Alternative3 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
        ]) => js.Any,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any,
      zero: () => js.Any
    ): Alternative3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Alternative3[F]]
    }
    
    @scala.inline
    implicit class Alternative3MutableBuilder[Self <: Alternative3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Alternative3[F]) extends AnyVal {
      
      @scala.inline
      def setZero(value: () => js.Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
}
