package typings.fpTs

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

object extendMod {
  
  trait Extend[W]
    extends StObject
       with Functor[W] {
    
    def extend[A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ js.Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
          B
        ]
    ): js.Any
  }
  object Extend {
    
    @scala.inline
    def apply[W](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Extend[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend[W]]
    }
    
    @scala.inline
    implicit class ExtendMutableBuilder[Self <: Extend[?], W] (val x: Self & Extend[W]) extends AnyVal {
      
      @scala.inline
      def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ js.Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
              js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Functor1[W] {
    
    def extend[A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ js.Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
          B
        ]
    ): js.Any
  }
  object Extend1 {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Extend1[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend1[W]]
    }
    
    @scala.inline
    implicit class Extend1MutableBuilder[Self <: Extend1[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & Extend1[W]) extends AnyVal {
      
      @scala.inline
      def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ js.Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
              js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Functor2[W] {
    
    def extend[E, A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
          B
        ]
    ): js.Any
  }
  object Extend2 {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Extend2[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend2[W]]
    }
    
    @scala.inline
    implicit class Extend2MutableBuilder[Self <: Extend2[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Extend2[W]) extends AnyVal {
      
      @scala.inline
      def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
              js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with Functor2C[W, E] {
    
    def extend[A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
          B
        ]
    ): js.Any
  }
  object Extend2C {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: W,
      _E: E,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Extend2C[W, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend2C[W, E]]
    }
    
    @scala.inline
    implicit class Extend2CMutableBuilder[Self <: Extend2C[?, ?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Extend2C[W, E])) extends AnyVal {
      
      @scala.inline
      def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ js.Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
              js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Functor3[W] {
    
    def extend[R, E, A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
          B
        ]
    ): js.Any
  }
  object Extend3 {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Extend3[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend3[W]]
    }
    
    @scala.inline
    implicit class Extend3MutableBuilder[Self <: Extend3[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Extend3[W]) extends AnyVal {
      
      @scala.inline
      def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
              js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend3C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E]
    extends StObject
       with Functor3C[W, E] {
    
    def extend[R, A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
          B
        ]
    ): js.Any
  }
  object Extend3C {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
      URI: W,
      _E: E,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Extend3C[W, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend3C[W, E]]
    }
    
    @scala.inline
    implicit class Extend3CMutableBuilder[Self <: Extend3C[?, ?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] (val x: Self & (Extend3C[W, E])) extends AnyVal {
      
      @scala.inline
      def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ js.Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
              js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend4[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
    extends StObject
       with Functor4[W] {
    
    def extend[S, R, E, A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ js.Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ /* wa */ js.Any, 
          B
        ]
    ): js.Any
  }
  object Extend4 {
    
    @scala.inline
    def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ js.Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ /* wa */ js.Any, 
          js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Extend4[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend4[W]]
    }
    
    @scala.inline
    implicit class Extend4MutableBuilder[Self <: Extend4[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] (val x: Self & Extend4[W]) extends AnyVal {
      
      @scala.inline
      def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ js.Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ /* wa */ js.Any, 
              js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
}
