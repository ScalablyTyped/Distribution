package typings.fpTs

import typings.fpTs.chainMod.Chain
import typings.fpTs.chainMod.Chain1
import typings.fpTs.chainMod.Chain2
import typings.fpTs.chainMod.Chain2C
import typings.fpTs.chainMod.Chain3
import typings.fpTs.eitherMod.Either_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chainRecMod {
  
  @JSImport("fp-ts/lib/ChainRec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tailRec[A, B](a: A, f: js.Function1[/* a */ A, Either_[A, B]]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("tailRec")(a.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[B]
  
  trait ChainRec[F]
    extends StObject
       with Chain[F] {
    
    def chainRec[A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, B>> */ js.Any
        ]
    ): js.Any
  }
  object ChainRec {
    
    @scala.inline
    def apply[F](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ]) => js.Any,
      chainRec: (js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, B>> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): ChainRec[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec[F]]
    }
    
    @scala.inline
    implicit class ChainRecMutableBuilder[Self <: ChainRec[?], F] (val x: Self & ChainRec[F]) extends AnyVal {
      
      @scala.inline
      def setChainRec(
        value: (js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, B>> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Chain1[F] {
    
    def chainRec[A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, B>> */ js.Any
        ]
    ): js.Any
  }
  object ChainRec1 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ]) => js.Any,
      chainRec: (js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, B>> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): ChainRec1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec1[F]]
    }
    
    @scala.inline
    implicit class ChainRec1MutableBuilder[Self <: ChainRec1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & ChainRec1[F]) extends AnyVal {
      
      @scala.inline
      def setChainRec(
        value: (js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, B>> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Chain2[F] {
    
    def chainRec[E, A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any
        ]
    ): js.Any
  }
  object ChainRec2 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]) => js.Any,
      chainRec: (js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): ChainRec2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec2[F]]
    }
    
    @scala.inline
    implicit class ChainRec2MutableBuilder[Self <: ChainRec2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & ChainRec2[F]) extends AnyVal {
      
      @scala.inline
      def setChainRec(
        value: (js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with Chain2C[F, E] {
    
    def chainRec[A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any
        ]
    ): js.Any
  }
  object ChainRec2C {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: F,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]) => js.Any,
      chainRec: (js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): ChainRec2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec2C[F, E]]
    }
    
    @scala.inline
    implicit class ChainRec2CMutableBuilder[Self <: ChainRec2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (ChainRec2C[F, E])) extends AnyVal {
      
      @scala.inline
      def setChainRec(
        value: (js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Chain3[F] {
    
    def chainRec[R, E, A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ js.Any
        ]
    ): js.Any
  }
  object ChainRec3 {
    
    @scala.inline
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]) => js.Any,
      chainRec: (js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): ChainRec3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec3[F]]
    }
    
    @scala.inline
    implicit class ChainRec3MutableBuilder[Self <: ChainRec3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & ChainRec3[F]) extends AnyVal {
      
      @scala.inline
      def setChainRec(
        value: (js.Any, js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
}
