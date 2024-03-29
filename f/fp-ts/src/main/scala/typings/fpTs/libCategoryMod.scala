package typings.fpTs

import typings.fpTs.libSemigroupoidMod.Semigroupoid
import typings.fpTs.libSemigroupoidMod.Semigroupoid2
import typings.fpTs.libSemigroupoidMod.Semigroupoid3
import typings.fpTs.libSemigroupoidMod.Semigroupoid4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCategoryMod {
  
  trait Category[F]
    extends StObject
       with Semigroupoid[F] {
    
    def id[A](): Any
  }
  object Category {
    
    inline def apply[F](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ Any) => Any,
      id: () => Any
    ): Category[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
      __obj.asInstanceOf[Category[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Category[?], F] (val x: Self & Category[F]) extends AnyVal {
      
      inline def setId(value: () => Any): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    }
  }
  
  trait Category2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with Semigroupoid2[F] {
    
    def id[A](): Any
  }
  object Category2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ Any) => Any,
      id: () => Any
    ): Category2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
      __obj.asInstanceOf[Category2[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Category2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] (val x: Self & Category2[F]) extends AnyVal {
      
      inline def setId(value: () => Any): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    }
  }
  
  trait Category3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
    extends StObject
       with Semigroupoid3[F] {
    
    def id[R, A](): Any
  }
  object Category3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ Any) => Any,
      id: () => Any
    ): Category3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
      __obj.asInstanceOf[Category3[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Category3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] (val x: Self & Category3[F]) extends AnyVal {
      
      inline def setId(value: () => Any): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    }
  }
  
  trait Category4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */]
    extends StObject
       with Semigroupoid4[F] {
    
    def id[S, R, A](): Any
  }
  object Category4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, B, C> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ Any) => Any,
      id: () => Any
    ): Category4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
      __obj.asInstanceOf[Category4[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Category4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */] (val x: Self & Category4[F]) extends AnyVal {
      
      inline def setId(value: () => Any): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    }
  }
}
