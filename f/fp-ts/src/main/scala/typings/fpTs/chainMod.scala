package typings.fpTs

import typings.fpTs.applyMod.Apply
import typings.fpTs.applyMod.Apply1
import typings.fpTs.applyMod.Apply2
import typings.fpTs.applyMod.Apply2C
import typings.fpTs.applyMod.Apply3
import typings.fpTs.applyMod.Apply3C
import typings.fpTs.applyMod.Apply4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chainMod {
  
  trait Chain[F]
    extends StObject
       with Apply[F] {
    
    def chain[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ]
    ): js.Any
  }
  object Chain {
    
    @scala.inline
    def apply[F](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Chain[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Chain[F]]
    }
    
    @scala.inline
    implicit class ChainMutableBuilder[Self <: Chain[?], F] (val x: Self & Chain[F]) extends AnyVal {
      
      @scala.inline
      def setChain(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
  
  trait Chain1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Apply1[F] {
    
    def chain[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ]
    ): js.Any
  }
  object Chain1 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Chain1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Chain1[F]]
    }
    
    @scala.inline
    implicit class Chain1MutableBuilder[Self <: Chain1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & Chain1[F]) extends AnyVal {
      
      @scala.inline
      def setChain(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
  
  trait Chain2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Apply2[F] {
    
    def chain[E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]
    ): js.Any
  }
  object Chain2 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Chain2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Chain2[F]]
    }
    
    @scala.inline
    implicit class Chain2MutableBuilder[Self <: Chain2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & Chain2[F]) extends AnyVal {
      
      @scala.inline
      def setChain(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
  
  trait Chain2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with Apply2C[F, E] {
    
    def chain[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]
    ): js.Any
  }
  object Chain2C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: F,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Chain2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Chain2C[F, E]]
    }
    
    @scala.inline
    implicit class Chain2CMutableBuilder[Self <: Chain2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Chain2C[F, E])) extends AnyVal {
      
      @scala.inline
      def setChain(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
  
  trait Chain3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Apply3[F] {
    
    def chain[R, E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]
    ): js.Any
  }
  object Chain3 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Chain3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Chain3[F]]
    }
    
    @scala.inline
    implicit class Chain3MutableBuilder[Self <: Chain3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & Chain3[F]) extends AnyVal {
      
      @scala.inline
      def setChain(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
  
  trait Chain3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E]
    extends StObject
       with Apply3C[F, E] {
    
    def chain[R, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]
    ): js.Any
  }
  object Chain3C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
      URI: F,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Chain3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Chain3C[F, E]]
    }
    
    @scala.inline
    implicit class Chain3CMutableBuilder[Self <: Chain3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] (val x: Self & (Chain3C[F, E])) extends AnyVal {
      
      @scala.inline
      def setChain(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
  
  trait Chain4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
    extends StObject
       with Apply4[F] {
    
    def chain[S, R, E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
        ]
    ): js.Any
  }
  object Chain4 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Chain4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Chain4[F]]
    }
    
    @scala.inline
    implicit class Chain4MutableBuilder[Self <: Chain4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] (val x: Self & Chain4[F]) extends AnyVal {
      
      @scala.inline
      def setChain(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    }
  }
}
