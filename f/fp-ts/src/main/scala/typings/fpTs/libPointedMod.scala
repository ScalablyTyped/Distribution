package typings.fpTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPointedMod {
  
  trait Pointed[F] extends StObject {
    
    val URI: F
    
    def of[A](a: A): Any
  }
  object Pointed {
    
    inline def apply[F](URI: F, of: Any => Any): Pointed[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[Pointed[F]]
    }
    
    extension [Self <: Pointed[?], F](x: Self & Pointed[F]) {
      
      inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pointed1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    val URI: F
    
    def of[A](a: A): Any
  }
  object Pointed1 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](URI: F, of: Any => Any): Pointed1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[Pointed1[F]]
    }
    
    extension [Self <: Pointed1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & Pointed1[F]) {
      
      inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pointed2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    val URI: F
    
    def of[E, A](a: A): Any
  }
  object Pointed2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](URI: F, of: Any => Any): Pointed2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[Pointed2[F]]
    }
    
    extension [Self <: Pointed2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & Pointed2[F]) {
      
      inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pointed2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def of[A](a: A): Any
  }
  object Pointed2C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](URI: F, _E: E, of: Any => Any): Pointed2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[Pointed2C[F, E]]
    }
    
    extension [Self <: Pointed2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Pointed2C[F, E])) {
      
      inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pointed3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    val URI: F
    
    def of[R, E, A](a: A): Any
  }
  object Pointed3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](URI: F, of: Any => Any): Pointed3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[Pointed3[F]]
    }
    
    extension [Self <: Pointed3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & Pointed3[F]) {
      
      inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pointed3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def of[R, A](a: A): Any
  }
  object Pointed3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](URI: F, _E: E, of: Any => Any): Pointed3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[Pointed3C[F, E]]
    }
    
    extension [Self <: Pointed3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (Pointed3C[F, E])) {
      
      inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pointed4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */] extends StObject {
    
    val URI: F
    
    def of[S, R, E, A](a: A): Any
  }
  object Pointed4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](URI: F, of: Any => Any): Pointed4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[Pointed4[F]]
    }
    
    extension [Self <: Pointed4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & Pointed4[F]) {
      
      inline def setOf(value: Any => Any): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
