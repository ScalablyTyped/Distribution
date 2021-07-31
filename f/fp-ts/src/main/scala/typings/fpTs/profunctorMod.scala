package typings.fpTs

import typings.fpTs.functorMod.Functor2
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.functorMod.Functor3
import typings.fpTs.functorMod.Functor3C
import typings.fpTs.functorMod.Functor4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profunctorMod {
  
  trait Profunctor[F] extends StObject {
    
    val URI: F
    
    def map[E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any,
      f: js.Function1[/* a */ A, B]
    ): js.Any
    
    def promap[E, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): js.Any
  }
  object Profunctor {
    
    @scala.inline
    def apply[F](
      URI: F,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any
    ): Profunctor[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor[F]]
    }
    
    @scala.inline
    implicit class ProfunctorMutableBuilder[Self <: Profunctor[?], F] (val x: Self & Profunctor[F]) extends AnyVal {
      
      @scala.inline
      def setMap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
      
      @scala.inline
      def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Profunctor2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Functor2[F] {
    
    def promap[E, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): js.Any
  }
  object Profunctor2 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any
    ): Profunctor2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor2[F]]
    }
    
    @scala.inline
    implicit class Profunctor2MutableBuilder[Self <: Profunctor2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Profunctor2[F]) extends AnyVal {
      
      @scala.inline
      def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
  
  trait Profunctor2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with Functor2C[F, E] {
    
    def promap[A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): js.Any
  }
  object Profunctor2C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: F,
      _E: E,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, E], js.Function1[js.Any, js.Any]) => js.Any
    ): Profunctor2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor2C[F, E]]
    }
    
    @scala.inline
    implicit class Profunctor2CMutableBuilder[Self <: Profunctor2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Profunctor2C[F, E])) extends AnyVal {
      
      @scala.inline
      def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, E], js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
  
  trait Profunctor3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Functor3[F] {
    
    def promap[R, E, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): js.Any
  }
  object Profunctor3 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any
    ): Profunctor3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor3[F]]
    }
    
    @scala.inline
    implicit class Profunctor3MutableBuilder[Self <: Profunctor3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Profunctor3[F]) extends AnyVal {
      
      @scala.inline
      def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
  
  trait Profunctor3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E]
    extends StObject
       with Functor3C[F, E] {
    
    def promap[R, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): js.Any
  }
  object Profunctor3C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
      URI: F,
      _E: E,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, E], js.Function1[js.Any, js.Any]) => js.Any
    ): Profunctor3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor3C[F, E]]
    }
    
    @scala.inline
    implicit class Profunctor3CMutableBuilder[Self <: Profunctor3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] (val x: Self & (Profunctor3C[F, E])) extends AnyVal {
      
      @scala.inline
      def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, E], js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
  
  trait Profunctor4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
    extends StObject
       with Functor4[F] {
    
    def promap[S, R, E, A, D, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any,
      f: js.Function1[/* d */ D, E],
      g: js.Function1[/* a */ A, B]
    ): js.Any
  }
  object Profunctor4 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: F,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any
    ): Profunctor4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap))
      __obj.asInstanceOf[Profunctor4[F]]
    }
    
    @scala.inline
    implicit class Profunctor4MutableBuilder[Self <: Profunctor4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] (val x: Self & Profunctor4[F]) extends AnyVal {
      
      @scala.inline
      def setPromap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "promap", js.Any.fromFunction3(value))
    }
  }
}
