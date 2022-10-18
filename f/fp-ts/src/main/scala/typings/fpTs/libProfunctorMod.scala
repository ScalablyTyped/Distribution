package typings.fpTs

import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libFunctorMod.Functor2C
import typings.fpTs.libFunctorMod.Functor3
import typings.fpTs.libFunctorMod.Functor3C
import typings.fpTs.libFunctorMod.Functor4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProfunctorMod {
  
  trait Profunctor[F] extends StObject {
    
    val URI: F
    
    def map[E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any,
      f: js.Function1[/* a */ A, B]
    ): Any
    
    def promap[E, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): Any
  }
  object Profunctor {
    
    inline def apply[F](
      URI: F,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any, js.Function1[Any, Any]) => Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Profunctor[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor[F]]
    }
    
    extension [Self <: Profunctor[?], F](x: Self & Profunctor[F]) {
      
      inline def setMap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Profunctor2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with Functor2[F] {
    
    def promap[E, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): Any
  }
  object Profunctor2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: F,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Profunctor2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor2[F]]
    }
    
    extension [Self <: Profunctor2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & Profunctor2[F]) {
      
      inline def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
  
  trait Profunctor2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E]
    extends StObject
       with Functor2C[F, E] {
    
    def promap[A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): Any
  }
  object Profunctor2C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      URI: F,
      _E: E,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, E], js.Function1[Any, Any]) => Any
    ): Profunctor2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor2C[F, E]]
    }
    
    extension [Self <: Profunctor2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Profunctor2C[F, E])) {
      
      inline def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, E], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
  
  trait Profunctor3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
    extends StObject
       with Functor3[F] {
    
    def promap[R, E, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): Any
  }
  object Profunctor3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: F,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Profunctor3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor3[F]]
    }
    
    extension [Self <: Profunctor3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & Profunctor3[F]) {
      
      inline def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
  
  trait Profunctor3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E]
    extends StObject
       with Functor3C[F, E] {
    
    def promap[R, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): Any
  }
  object Profunctor3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
      URI: F,
      _E: E,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, E], js.Function1[Any, Any]) => Any
    ): Profunctor3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor3C[F, E]]
    }
    
    extension [Self <: Profunctor3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (Profunctor3C[F, E])) {
      
      inline def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, E], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
  
  trait Profunctor4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */]
    extends StObject
       with Functor4[F] {
    
    def promap[S, R, E, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): Any
  }
  object Profunctor4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: F,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any]) => Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
    ): Profunctor4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor4[F]]
    }
    
    extension [Self <: Profunctor4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & Profunctor4[F]) {
      
      inline def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
}
