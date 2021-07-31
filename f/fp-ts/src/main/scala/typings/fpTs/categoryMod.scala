package typings.fpTs

import typings.fpTs.semigroupoidMod.Semigroupoid
import typings.fpTs.semigroupoidMod.Semigroupoid2
import typings.fpTs.semigroupoidMod.Semigroupoid3
import typings.fpTs.semigroupoidMod.Semigroupoid4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryMod {
  
  trait Category[F]
    extends StObject
       with Semigroupoid[F] {
    
    def id[A](): js.Any
  }
  object Category {
    
    @scala.inline
    def apply[F](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ js.Any) => js.Any,
      id: () => js.Any
    ): Category[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
      __obj.asInstanceOf[Category[F]]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category[?], F] (val x: Self & Category[F]) extends AnyVal {
      
      @scala.inline
      def setId(value: () => js.Any): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    }
  }
  
  trait Category2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Semigroupoid2[F] {
    
    def id[A](): js.Any
  }
  object Category2 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any) => js.Any,
      id: () => js.Any
    ): Category2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
      __obj.asInstanceOf[Category2[F]]
    }
    
    @scala.inline
    implicit class Category2MutableBuilder[Self <: Category2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Category2[F]) extends AnyVal {
      
      @scala.inline
      def setId(value: () => js.Any): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    }
  }
  
  trait Category3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Semigroupoid3[F] {
    
    def id[R, A](): js.Any
  }
  object Category3 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any) => js.Any,
      id: () => js.Any
    ): Category3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
      __obj.asInstanceOf[Category3[F]]
    }
    
    @scala.inline
    implicit class Category3MutableBuilder[Self <: Category3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Category3[F]) extends AnyVal {
      
      @scala.inline
      def setId(value: () => js.Any): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    }
  }
  
  trait Category4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
    extends StObject
       with Semigroupoid4[F] {
    
    def id[S, R, A](): js.Any
  }
  object Category4 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, B, C> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ js.Any) => js.Any,
      id: () => js.Any
    ): Category4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
      __obj.asInstanceOf[Category4[F]]
    }
    
    @scala.inline
    implicit class Category4MutableBuilder[Self <: Category4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] (val x: Self & Category4[F]) extends AnyVal {
      
      @scala.inline
      def setId(value: () => js.Any): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    }
  }
}
