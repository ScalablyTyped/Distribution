package typings.fpTs

import typings.fpTs.optionMod.Option_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unfoldableMod {
  
  trait Unfoldable[F] extends StObject {
    
    val URI: F
    
    def unfold[A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): js.Any
  }
  object Unfoldable {
    
    @scala.inline
    def apply[F](URI: F, unfold: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any): Unfoldable[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable[F]]
    }
    
    @scala.inline
    implicit class UnfoldableMutableBuilder[Self <: Unfoldable[?], F] (val x: Self & Unfoldable[F]) extends AnyVal {
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfold(value: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
    }
  }
  
  trait Unfoldable1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    val URI: F
    
    def unfold[A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): js.Any
  }
  object Unfoldable1 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](URI: F, unfold: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any): Unfoldable1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable1[F]]
    }
    
    @scala.inline
    implicit class Unfoldable1MutableBuilder[Self <: Unfoldable1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & Unfoldable1[F]) extends AnyVal {
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfold(value: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
    }
  }
  
  trait Unfoldable2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    val URI: F
    
    def unfold[E, A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): js.Any
  }
  object Unfoldable2 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](URI: F, unfold: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any): Unfoldable2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable2[F]]
    }
    
    @scala.inline
    implicit class Unfoldable2MutableBuilder[Self <: Unfoldable2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Unfoldable2[F]) extends AnyVal {
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfold(value: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
    }
  }
  
  trait Unfoldable2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def unfold[A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): js.Any
  }
  object Unfoldable2C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: F,
      _E: E,
      unfold: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any
    ): Unfoldable2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable2C[F, E]]
    }
    
    @scala.inline
    implicit class Unfoldable2CMutableBuilder[Self <: Unfoldable2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Unfoldable2C[F, E])) extends AnyVal {
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfold(value: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unfoldable3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    val URI: F
    
    def unfold[R, E, A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): js.Any
  }
  object Unfoldable3 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](URI: F, unfold: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any): Unfoldable3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfold = js.Any.fromFunction2(unfold))
      __obj.asInstanceOf[Unfoldable3[F]]
    }
    
    @scala.inline
    implicit class Unfoldable3MutableBuilder[Self <: Unfoldable3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Unfoldable3[F]) extends AnyVal {
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfold(value: (js.Any, js.Function1[js.Any, Option_[js.Tuple2[js.Any, js.Any]]]) => js.Any): Self = StObject.set(x, "unfold", js.Any.fromFunction2(value))
    }
  }
}
