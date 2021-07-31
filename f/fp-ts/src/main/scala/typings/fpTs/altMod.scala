package typings.fpTs

import typings.fpTs.functionMod.Lazy
import typings.fpTs.functorMod.Functor
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorMod.Functor2
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.functorMod.Functor3
import typings.fpTs.functorMod.Functor3C
import typings.fpTs.functorMod.Functor4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object altMod {
  
  trait Alt[F]
    extends StObject
       with Functor[F] {
    
    def alt[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any,
      that: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
        ]
    ): js.Any
  }
  object Alt {
    
    @scala.inline
    def apply[F](
      URI: F,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Alt[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Alt[F]]
    }
    
    @scala.inline
    implicit class AltMutableBuilder[Self <: Alt[?], F] (val x: Self & Alt[F]) extends AnyVal {
      
      @scala.inline
      def setAlt(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
    }
  }
  
  trait Alt1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Functor1[F] {
    
    def alt[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any,
      that: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
        ]
    ): js.Any
  }
  object Alt1 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: F,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Alt1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Alt1[F]]
    }
    
    @scala.inline
    implicit class Alt1MutableBuilder[Self <: Alt1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & Alt1[F]) extends AnyVal {
      
      @scala.inline
      def setAlt(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
    }
  }
  
  trait Alt2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Functor2[F] {
    
    def alt[E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
      that: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ]
    ): js.Any
  }
  object Alt2 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Alt2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Alt2[F]]
    }
    
    @scala.inline
    implicit class Alt2MutableBuilder[Self <: Alt2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Alt2[F]) extends AnyVal {
      
      @scala.inline
      def setAlt(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
    }
  }
  
  trait Alt2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with Functor2C[F, E] {
    
    def alt[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
      that: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ]
    ): js.Any
  }
  object Alt2C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: F,
      _E: E,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Alt2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Alt2C[F, E]]
    }
    
    @scala.inline
    implicit class Alt2CMutableBuilder[Self <: Alt2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Alt2C[F, E])) extends AnyVal {
      
      @scala.inline
      def setAlt(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
    }
  }
  
  trait Alt3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Functor3[F] {
    
    def alt[R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
      that: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
        ]
    ): js.Any
  }
  object Alt3 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Alt3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Alt3[F]]
    }
    
    @scala.inline
    implicit class Alt3MutableBuilder[Self <: Alt3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Alt3[F]) extends AnyVal {
      
      @scala.inline
      def setAlt(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
    }
  }
  
  trait Alt3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E]
    extends StObject
       with Functor3C[F, E] {
    
    def alt[R, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
      that: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
        ]
    ): js.Any
  }
  object Alt3C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
      URI: F,
      _E: E,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Alt3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Alt3C[F, E]]
    }
    
    @scala.inline
    implicit class Alt3CMutableBuilder[Self <: Alt3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] (val x: Self & (Alt3C[F, E])) extends AnyVal {
      
      @scala.inline
      def setAlt(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
    }
  }
  
  trait Alt4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
    extends StObject
       with Functor4[F] {
    
    def alt[S, R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any,
      that: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any
        ]
    ): js.Any
  }
  object Alt4 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: F,
      alt: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Alt4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Alt4[F]]
    }
    
    @scala.inline
    implicit class Alt4MutableBuilder[Self <: Alt4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] (val x: Self & Alt4[F]) extends AnyVal {
      
      @scala.inline
      def setAlt(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
    }
  }
}
