package typings.fpTs

import typings.fpTs.libChainMod.Chain
import typings.fpTs.libChainMod.Chain1
import typings.fpTs.libChainMod.Chain2
import typings.fpTs.libChainMod.Chain2C
import typings.fpTs.libChainMod.Chain3
import typings.fpTs.libChainMod.Chain3C
import typings.fpTs.libChainMod.Chain4
import typings.fpTs.libEitherMod.Either_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChainRecMod {
  
  @JSImport("fp-ts/lib/ChainRec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tailRec[A, B](startWith: A, f: js.Function1[/* a */ A, Either_[A, B]]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("tailRec")(startWith.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[B]
  
  trait ChainRec[F]
    extends StObject
       with Chain[F] {
    
    def chainRec[A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, B>> */ Any
        ]
    ): Any
  }
  object ChainRec {
    
    inline def apply[F](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ]) => Any,
      chainRec: (Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, B>> */ Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[Any, Any]) => Any
    ): ChainRec[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec[F]]
    }
    
    extension [Self <: ChainRec[?], F](x: Self & ChainRec[F]) {
      
      inline def setChainRec(
        value: (Any, js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, B>> */ Any
            ]) => Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
    extends StObject
       with Chain1[F] {
    
    def chainRec[A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, B>> */ Any
        ]
    ): Any
  }
  object ChainRec1 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ]) => Any,
      chainRec: (Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, B>> */ Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, js.Function1[Any, Any]) => Any
    ): ChainRec1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec1[F]]
    }
    
    extension [Self <: ChainRec1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & ChainRec1[F]) {
      
      inline def setChainRec(
        value: (Any, js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, B>> */ Any
            ]) => Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with Chain2[F] {
    
    def chainRec[E, A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ Any
        ]
    ): Any
  }
  object ChainRec2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ]) => Any,
      chainRec: (Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): ChainRec2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec2[F]]
    }
    
    extension [Self <: ChainRec2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & ChainRec2[F]) {
      
      inline def setChainRec(
        value: (Any, js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ Any
            ]) => Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E]
    extends StObject
       with Chain2C[F, E] {
    
    def chainRec[A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ Any
        ]
    ): Any
  }
  object ChainRec2C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      URI: F,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ]) => Any,
      chainRec: (Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): ChainRec2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec2C[F, E]]
    }
    
    extension [Self <: ChainRec2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (ChainRec2C[F, E])) {
      
      inline def setChainRec(
        value: (Any, js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ Any
            ]) => Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
    extends StObject
       with Chain3[F] {
    
    def chainRec[R, E, A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ Any
        ]
    ): Any
  }
  object ChainRec3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ]) => Any,
      chainRec: (Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): ChainRec3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec3[F]]
    }
    
    extension [Self <: ChainRec3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & ChainRec3[F]) {
      
      inline def setChainRec(
        value: (Any, js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ Any
            ]) => Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E]
    extends StObject
       with Chain3C[F, E] {
    
    def chainRec[R, A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ Any
        ]
    ): Any
  }
  object ChainRec3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
      URI: F,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ]) => Any,
      chainRec: (Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): ChainRec3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec3C[F, E]]
    }
    
    extension [Self <: ChainRec3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (ChainRec3C[F, E])) {
      
      inline def setChainRec(
        value: (Any, js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ Any
            ]) => Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
  
  trait ChainRec4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */]
    extends StObject
       with Chain4[F] {
    
    def chainRec[S, R, E, A, B](
      a: A,
      f: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Either<A, B>> */ Any
        ]
    ): Any
  }
  object ChainRec4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
        ]) => Any,
      chainRec: (Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Either<A, B>> */ Any
        ]) => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): ChainRec4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[ChainRec4[F]]
    }
    
    extension [Self <: ChainRec4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & ChainRec4[F]) {
      
      inline def setChainRec(
        value: (Any, js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Either<A, B>> */ Any
            ]) => Any
      ): Self = StObject.set(x, "chainRec", js.Any.fromFunction2(value))
    }
  }
}
