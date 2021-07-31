package typings.fpTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semigroupoidMod {
  
  trait Semigroupoid[F] extends StObject {
    
    val URI: F
    
    def compose[A, B, C](
      bc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ js.Any,
      ab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ js.Any
    ): js.Any
  }
  object Semigroupoid {
    
    @scala.inline
    def apply[F](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ js.Any) => js.Any
    ): Semigroupoid[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
      __obj.asInstanceOf[Semigroupoid[F]]
    }
    
    @scala.inline
    implicit class SemigroupoidMutableBuilder[Self <: Semigroupoid[?], F] (val x: Self & Semigroupoid[F]) extends AnyVal {
      
      @scala.inline
      def setCompose(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ js.Any) => js.Any
      ): Self = StObject.set(x, "compose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Semigroupoid2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    val URI: F
    
    def compose[A, B, C](
      ab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any,
      la: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any
    ): js.Any
  }
  object Semigroupoid2 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any) => js.Any
    ): Semigroupoid2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
      __obj.asInstanceOf[Semigroupoid2[F]]
    }
    
    @scala.inline
    implicit class Semigroupoid2MutableBuilder[Self <: Semigroupoid2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Semigroupoid2[F]) extends AnyVal {
      
      @scala.inline
      def setCompose(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any) => js.Any
      ): Self = StObject.set(x, "compose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Semigroupoid2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, A] extends StObject {
    
    val URI: F
    
    val _E: A
    
    def compose[B, C](
      ab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any,
      la: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any
    ): js.Any
  }
  object Semigroupoid2C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, A](
      URI: F,
      _E: A,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any) => js.Any
    ): Semigroupoid2C[F, A] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
      __obj.asInstanceOf[Semigroupoid2C[F, A]]
    }
    
    @scala.inline
    implicit class Semigroupoid2CMutableBuilder[Self <: Semigroupoid2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, A] (val x: Self & (Semigroupoid2C[F, A])) extends AnyVal {
      
      @scala.inline
      def setCompose(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any) => js.Any
      ): Self = StObject.set(x, "compose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_E(value: A): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Semigroupoid3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    val URI: F
    
    def compose[R, A, B, C](
      ab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any,
      la: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any
    ): js.Any
  }
  object Semigroupoid3 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any) => js.Any
    ): Semigroupoid3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
      __obj.asInstanceOf[Semigroupoid3[F]]
    }
    
    @scala.inline
    implicit class Semigroupoid3MutableBuilder[Self <: Semigroupoid3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Semigroupoid3[F]) extends AnyVal {
      
      @scala.inline
      def setCompose(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any) => js.Any
      ): Self = StObject.set(x, "compose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Semigroupoid3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, A] extends StObject {
    
    val URI: F
    
    val _E: A
    
    def compose[R, B, C](
      ab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any,
      la: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any
    ): js.Any
  }
  object Semigroupoid3C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, A](
      URI: F,
      _E: A,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any) => js.Any
    ): Semigroupoid3C[F, A] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
      __obj.asInstanceOf[Semigroupoid3C[F, A]]
    }
    
    @scala.inline
    implicit class Semigroupoid3CMutableBuilder[Self <: Semigroupoid3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, A] (val x: Self & (Semigroupoid3C[F, A])) extends AnyVal {
      
      @scala.inline
      def setCompose(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any) => js.Any
      ): Self = StObject.set(x, "compose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_E(value: A): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Semigroupoid4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] extends StObject {
    
    val URI: F
    
    def compose[S, R, A, B, C](
      ab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, B, C> */ js.Any,
      la: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ js.Any
    ): js.Any
  }
  object Semigroupoid4 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ js.Any) => js.Any
    ): Semigroupoid4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose))
      __obj.asInstanceOf[Semigroupoid4[F]]
    }
    
    @scala.inline
    implicit class Semigroupoid4MutableBuilder[Self <: Semigroupoid4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] (val x: Self & Semigroupoid4[F]) extends AnyVal {
      
      @scala.inline
      def setCompose(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ js.Any) => js.Any
      ): Self = StObject.set(x, "compose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
