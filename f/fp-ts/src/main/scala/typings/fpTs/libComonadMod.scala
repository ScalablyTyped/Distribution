package typings.fpTs

import typings.fpTs.libExtendMod.Extend
import typings.fpTs.libExtendMod.Extend1
import typings.fpTs.libExtendMod.Extend2
import typings.fpTs.libExtendMod.Extend2C
import typings.fpTs.libExtendMod.Extend3
import typings.fpTs.libExtendMod.Extend3C
import typings.fpTs.libExtendMod.Extend4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComonadMod {
  
  trait Comonad[W]
    extends StObject
       with Extend[W] {
    
    def extract[A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ Any
    ): A
  }
  object Comonad {
    
    inline def apply[W](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ Any => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[Any, Any]) => Any
    ): Comonad[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad[W]]
    }
    
    extension [Self <: Comonad[?], W](x: Self & Comonad[W]) {
      
      inline def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ Any => Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
    extends StObject
       with Extend1[W] {
    
    def extract[A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ Any
    ): A
  }
  object Comonad1 {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ Any => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, js.Function1[Any, Any]) => Any
    ): Comonad1[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad1[W]]
    }
    
    extension [Self <: Comonad1[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & Comonad1[W]) {
      
      inline def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ Any => Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with Extend2[W] {
    
    def extract[E, A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any
    ): A
  }
  object Comonad2 {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Comonad2[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad2[W]]
    }
    
    extension [Self <: Comonad2[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & Comonad2[W]) {
      
      inline def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any => Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E]
    extends StObject
       with Extend2C[W, E] {
    
    def extract[A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any
    ): A
  }
  object Comonad2C {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      URI: W,
      _E: E,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Comonad2C[W, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad2C[W, E]]
    }
    
    extension [Self <: Comonad2C[?, ?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Comonad2C[W, E])) {
      
      inline def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ Any => Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
    extends StObject
       with Extend3[W] {
    
    def extract[R, E, A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any
    ): A
  }
  object Comonad3 {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Comonad3[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad3[W]]
    }
    
    extension [Self <: Comonad3[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & Comonad3[W]) {
      
      inline def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any => Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad3C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E]
    extends StObject
       with Extend3C[W, E] {
    
    def extract[R, A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any
    ): A
  }
  object Comonad3C {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
      URI: W,
      _E: E,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Comonad3C[W, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad3C[W, E]]
    }
    
    extension [Self <: Comonad3C[?, ?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (Comonad3C[W, E])) {
      
      inline def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ Any => Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
  
  trait Comonad4[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */]
    extends StObject
       with Extend4[W] {
    
    def extract[S, R, E, A](
      wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ Any
    ): A
  }
  object Comonad4 {
    
    inline def apply[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: W,
      extend: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ Any, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ /* wa */ Any, 
          Any
        ]) => Any,
      extract: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ Any => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Comonad4[W] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Comonad4[W]]
    }
    
    extension [Self <: Comonad4[?], W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & Comonad4[W]) {
      
      inline def setExtract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<W, S, R, E, A> */ Any => Any
      ): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
}
