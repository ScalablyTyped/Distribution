package typings.fpTs

import typings.fpTs.extendMod.Extend
import typings.fpTs.extendMod.Extend1
import typings.fpTs.extendMod.Extend2
import typings.fpTs.extendMod.Extend2C
import typings.fpTs.extendMod.Extend3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comonadMod {
  
  trait Comonad[W]
    extends StObject
       with Extend[W] {
    
    def extract[A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ js.Any
    ): A
  }
  object Comonad {
    
    @scala.inline
    def apply[W](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ js.Any => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Comonad[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad[W]]
    }
    
    @scala.inline
    implicit class ComonadMutableBuilder[Self <: Comonad[?], W] (val x: Self & Comonad[W]) extends AnyVal {
      
      @scala.inline
      def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Extend1[W] {
    
    def extract[A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ js.Any
    ): A
  }
  object Comonad1 {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ js.Any => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Comonad1[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad1[W]]
    }
    
    @scala.inline
    implicit class Comonad1MutableBuilder[Self <: Comonad1[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & Comonad1[W]) extends AnyVal {
      
      @scala.inline
      def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Extend2[W] {
    
    def extract[E, A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any
    ): A
  }
  object Comonad2 {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Comonad2[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad2[W]]
    }
    
    @scala.inline
    implicit class Comonad2MutableBuilder[Self <: Comonad2[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Comonad2[W]) extends AnyVal {
      
      @scala.inline
      def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with Extend2C[W, E] {
    
    def extract[A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any
    ): A
  }
  object Comonad2C {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: W,
      _E: E,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Comonad2C[W, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad2C[W, E]]
    }
    
    @scala.inline
    implicit class Comonad2CMutableBuilder[Self <: Comonad2C[?, ?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Comonad2C[W, E])) extends AnyVal {
      
      @scala.inline
      def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Extend3[W] {
    
    def extract[R, E, A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any
    ): A
  }
  object Comonad3 {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Comonad3[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad3[W]]
    }
    
    @scala.inline
    implicit class Comonad3MutableBuilder[Self <: Comonad3[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Comonad3[W]) extends AnyVal {
      
      @scala.inline
      def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
}
