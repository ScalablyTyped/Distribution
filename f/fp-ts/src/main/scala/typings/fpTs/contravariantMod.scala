package typings.fpTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contravariantMod {
  
  trait Contravariant[F] extends StObject {
    
    val URI: F
    
    def contramap[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any,
      f: js.Function1[/* b */ B, A]
    ): js.Any
  }
  object Contravariant {
    
    @scala.inline
    def apply[F](
      URI: F,
      contramap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Contravariant[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
      __obj.asInstanceOf[Contravariant[F]]
    }
    
    @scala.inline
    implicit class ContravariantMutableBuilder[Self <: Contravariant[?], F] (val x: Self & Contravariant[F]) extends AnyVal {
      
      @scala.inline
      def setContramap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "contramap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contravariant1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    val URI: F
    
    def contramap[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any,
      f: js.Function1[/* b */ B, A]
    ): js.Any
  }
  object Contravariant1 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: F,
      contramap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Contravariant1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
      __obj.asInstanceOf[Contravariant1[F]]
    }
    
    @scala.inline
    implicit class Contravariant1MutableBuilder[Self <: Contravariant1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & Contravariant1[F]) extends AnyVal {
      
      @scala.inline
      def setContramap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "contramap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contravariant2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    val URI: F
    
    def contramap[E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
      f: js.Function1[/* b */ B, A]
    ): js.Any
  }
  object Contravariant2 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      contramap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Contravariant2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
      __obj.asInstanceOf[Contravariant2[F]]
    }
    
    @scala.inline
    implicit class Contravariant2MutableBuilder[Self <: Contravariant2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Contravariant2[F]) extends AnyVal {
      
      @scala.inline
      def setContramap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "contramap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contravariant2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def contramap[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
      f: js.Function1[/* b */ B, A]
    ): js.Any
  }
  object Contravariant2C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: F,
      _E: E,
      contramap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Contravariant2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
      __obj.asInstanceOf[Contravariant2C[F, E]]
    }
    
    @scala.inline
    implicit class Contravariant2CMutableBuilder[Self <: Contravariant2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Contravariant2C[F, E])) extends AnyVal {
      
      @scala.inline
      def setContramap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "contramap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contravariant3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    val URI: F
    
    def contramap[R, E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
      f: js.Function1[/* b */ B, A]
    ): js.Any
  }
  object Contravariant3 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      contramap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Contravariant3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
      __obj.asInstanceOf[Contravariant3[F]]
    }
    
    @scala.inline
    implicit class Contravariant3MutableBuilder[Self <: Contravariant3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Contravariant3[F]) extends AnyVal {
      
      @scala.inline
      def setContramap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "contramap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contravariant3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] extends StObject {
    
    val URI: F
    
    def contramap[R, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
      f: js.Function1[/* b */ B, A]
    ): js.Any
  }
  object Contravariant3C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
      URI: F,
      contramap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Contravariant3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
      __obj.asInstanceOf[Contravariant3C[F, E]]
    }
    
    @scala.inline
    implicit class Contravariant3CMutableBuilder[Self <: Contravariant3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] (val x: Self & (Contravariant3C[F, E])) extends AnyVal {
      
      @scala.inline
      def setContramap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "contramap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contravariant4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] extends StObject {
    
    val URI: F
    
    def contramap[S, R, E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any,
      f: js.Function1[/* b */ B, A]
    ): js.Any
  }
  object Contravariant4 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: F,
      contramap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Contravariant4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
      __obj.asInstanceOf[Contravariant4[F]]
    }
    
    @scala.inline
    implicit class Contravariant4MutableBuilder[Self <: Contravariant4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] (val x: Self & Contravariant4[F]) extends AnyVal {
      
      @scala.inline
      def setContramap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "contramap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
