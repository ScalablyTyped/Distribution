package typings.fpTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invariantMod {
  
  trait Invariant[F] extends StObject {
    
    val URI: F
    
    def imap[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
      f: js.Function1[/* a */ A, B],
      g: js.Function1[/* b */ B, A]
    ): Any
  }
  object Invariant {
    
    inline def apply[F](
      URI: F,
      imap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Invariant[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
      __obj.asInstanceOf[Invariant[F]]
    }
    
    extension [Self <: Invariant[?], F](x: Self & Invariant[F]) {
      
      inline def setImap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "imap", js.Any.fromFunction3(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Invariant1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    val URI: F
    
    def imap[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
      f: js.Function1[/* a */ A, B],
      g: js.Function1[/* b */ B, A]
    ): Any
  }
  object Invariant1 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      URI: F,
      imap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Invariant1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
      __obj.asInstanceOf[Invariant1[F]]
    }
    
    extension [Self <: Invariant1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & Invariant1[F]) {
      
      inline def setImap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "imap", js.Any.fromFunction3(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Invariant2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    val URI: F
    
    def imap[E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function1[/* a */ A, B],
      g: js.Function1[/* b */ B, A]
    ): Any
  }
  object Invariant2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: F,
      imap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Invariant2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
      __obj.asInstanceOf[Invariant2[F]]
    }
    
    extension [Self <: Invariant2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & Invariant2[F]) {
      
      inline def setImap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "imap", js.Any.fromFunction3(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Invariant2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def imap[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function1[/* a */ A, B],
      g: js.Function1[/* b */ B, A]
    ): Any
  }
  object Invariant2C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      URI: F,
      _E: E,
      imap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Invariant2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
      __obj.asInstanceOf[Invariant2C[F, E]]
    }
    
    extension [Self <: Invariant2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Invariant2C[F, E])) {
      
      inline def setImap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "imap", js.Any.fromFunction3(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Invariant3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    val URI: F
    
    def imap[R, E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function1[/* a */ A, B],
      g: js.Function1[/* b */ B, A]
    ): Any
  }
  object Invariant3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: F,
      imap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Invariant3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
      __obj.asInstanceOf[Invariant3[F]]
    }
    
    extension [Self <: Invariant3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & Invariant3[F]) {
      
      inline def setImap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "imap", js.Any.fromFunction3(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Invariant3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def imap[R, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function1[/* a */ A, B],
      g: js.Function1[/* b */ B, A]
    ): Any
  }
  object Invariant3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
      URI: F,
      _E: E,
      imap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Invariant3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
      __obj.asInstanceOf[Invariant3C[F, E]]
    }
    
    extension [Self <: Invariant3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (Invariant3C[F, E])) {
      
      inline def setImap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "imap", js.Any.fromFunction3(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Invariant4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */] extends StObject {
    
    val URI: F
    
    def imap[S, R, E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      f: js.Function1[/* a */ A, B],
      g: js.Function1[/* b */ B, A]
    ): Any
  }
  object Invariant4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: F,
      imap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Invariant4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
      __obj.asInstanceOf[Invariant4[F]]
    }
    
    extension [Self <: Invariant4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & Invariant4[F]) {
      
      inline def setImap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "imap", js.Any.fromFunction3(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
