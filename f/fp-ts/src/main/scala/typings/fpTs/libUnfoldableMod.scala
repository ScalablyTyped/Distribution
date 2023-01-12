package typings.fpTs

import typings.fpTs.libOptionMod.Option_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUnfoldableMod {
  
  trait Unfoldable[F] extends StObject {
    
    val URI: F
    
    def unfold[A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): Any
  }
  object Unfoldable {
    
    inline def apply[F](URI: F, unfold: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Unfoldable[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unfoldable[?], F] (val x: Self & Unfoldable[F]) extends AnyVal {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setUnfold(value: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
    }
  }
  
  trait Unfoldable1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    val URI: F
    
    def unfold[A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): Any
  }
  object Unfoldable1 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](URI: F, unfold: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Unfoldable1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable1[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unfoldable1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] (val x: Self & Unfoldable1[F]) extends AnyVal {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setUnfold(value: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
    }
  }
  
  trait Unfoldable2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    val URI: F
    
    def unfold[E, A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): Any
  }
  object Unfoldable2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](URI: F, unfold: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Unfoldable2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable2[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unfoldable2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] (val x: Self & Unfoldable2[F]) extends AnyVal {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setUnfold(value: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
    }
  }
  
  trait Unfoldable2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def unfold[A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): Any
  }
  object Unfoldable2C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](URI: F, _E: E, unfold: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Unfoldable2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable2C[F, E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unfoldable2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] (val x: Self & (Unfoldable2C[F, E])) extends AnyVal {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setUnfold(value: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unfoldable3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    val URI: F
    
    def unfold[R, E, A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): Any
  }
  object Unfoldable3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](URI: F, unfold: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Unfoldable3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable3[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unfoldable3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] (val x: Self & Unfoldable3[F]) extends AnyVal {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setUnfold(value: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
    }
  }
  
  trait Unfoldable3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def unfold[R, A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): Any
  }
  object Unfoldable3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](URI: F, _E: E, unfold: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Unfoldable3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable3C[F, E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unfoldable3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] (val x: Self & (Unfoldable3C[F, E])) extends AnyVal {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setUnfold(value: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unfoldable4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */] extends StObject {
    
    val URI: F
    
    def unfold[S, R, E, A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): Any
  }
  object Unfoldable4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](URI: F, unfold: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Unfoldable4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable4[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unfoldable4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */] (val x: Self & Unfoldable4[F]) extends AnyVal {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setUnfold(value: (Any, js.Function1[Any, Option_[js.Tuple2[Any, Any]]]) => Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
    }
  }
}
