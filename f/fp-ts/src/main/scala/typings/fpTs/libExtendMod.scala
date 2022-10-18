package typings.fpTs

import typings.fpTs.libFunctorMod.Functor
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libFunctorMod.Functor2C
import typings.fpTs.libFunctorMod.Functor3
import typings.fpTs.libFunctorMod.Functor3C
import typings.fpTs.libFunctorMod.Functor4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExtendMod {
  
  trait Extend[W]
    extends StObject
       with Functor[W] {
    
    def extend[A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
          B
        ]
    ): Any
  }
  object Extend {
    
    inline def apply[W](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[Any, Any]) => Any
    ): Extend[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend[W]]
    }
    
    extension [Self <: Extend[?], W](x: Self & Extend[W]) {
      
      inline def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
              Any
            ]) => Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
    extends StObject
       with Functor1[W] {
    
    def extend[A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
          B
        ]
    ): Any
  }
  object Extend1 {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, js.Function1[Any, Any]) => Any
    ): Extend1[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend1[W]]
    }
    
    extension [Self <: Extend1[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & Extend1[W]) {
      
      inline def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
              Any
            ]) => Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with Functor2[W] {
    
    def extend[E, A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
          B
        ]
    ): Any
  }
  object Extend2 {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Extend2[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend2[W]]
    }
    
    extension [Self <: Extend2[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & Extend2[W]) {
      
      inline def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
              Any
            ]) => Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E]
    extends StObject
       with Functor2C[W, E] {
    
    def extend[A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
          B
        ]
    ): Any
  }
  object Extend2C {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      URI: W,
      _E: E,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Extend2C[W, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend2C[W, E]]
    }
    
    extension [Self <: Extend2C[?, ?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Extend2C[W, E])) {
      
      inline def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
              Any
            ]) => Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
    extends StObject
       with Functor3[W] {
    
    def extend[R, E, A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
          B
        ]
    ): Any
  }
  object Extend3 {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Extend3[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend3[W]]
    }
    
    extension [Self <: Extend3[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & Extend3[W]) {
      
      inline def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
              Any
            ]) => Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend3C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E]
    extends StObject
       with Functor3C[W, E] {
    
    def extend[R, A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
          B
        ]
    ): Any
  }
  object Extend3C {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
      URI: W,
      _E: E,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Extend3C[W, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend3C[W, E]]
    }
    
    extension [Self <: Extend3C[?, ?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (Extend3C[W, E])) {
      
      inline def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
              Any
            ]) => Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
  
  trait Extend4[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */]
    extends StObject
       with Functor4[W] {
    
    def extend[S, R, E, A, B](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ Any,
      f: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ /* wa */ Any, 
          B
        ]
    ): Any
  }
  object Extend4 {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Extend4[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Extend4[W]]
    }
    
    extension [Self <: Extend4[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & Extend4[W]) {
      
      inline def setExtend(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ Any, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ /* wa */ Any, 
              Any
            ]) => Any
      ): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    }
  }
}
