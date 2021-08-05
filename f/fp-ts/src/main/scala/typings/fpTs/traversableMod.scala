package typings.fpTs

import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.applicativeMod.Applicative3C
import typings.fpTs.applicativeMod.Applicative4
import typings.fpTs.foldableMod.Foldable
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.foldableMod.Foldable2
import typings.fpTs.foldableMod.Foldable2C
import typings.fpTs.foldableMod.Foldable3
import typings.fpTs.foldableMod.FoldableComposition
import typings.fpTs.foldableMod.FoldableComposition11
import typings.fpTs.functorMod.Functor
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorMod.Functor2
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.functorMod.Functor3
import typings.fpTs.functorMod.FunctorComposition
import typings.fpTs.functorMod.FunctorComposition11
import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traversableMod {
  
  @JSImport("fp-ts/lib/Traversable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTraversableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Traversable1[F], G: Traversable1[G]): TraversableComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[TraversableComposition11[F, G]]
  inline def getTraversableComposition[F, G](F: Traversable[F], G: Traversable[G]): TraversableComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[TraversableComposition[F, G]]
  
  @js.native
  trait PipeableTraverse1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<T, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind<T, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<T, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, FE](F: Applicative3C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind<T, B>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableTraverse2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, TE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, TE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind2<T, TE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait Sequence[T] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind2<F, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind3<F, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind2<F, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind3<F, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, A>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Sequence1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind2<F, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind3<F, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind4<F, S, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Kind<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind2<F, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind3<F, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, A>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Sequence2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind3<F, R, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, A>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Sequence2C[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind3<F, R, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, A>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Sequence3[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<T, R, E, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<T, R, E, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, Kind3<F, FR, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, A>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, A>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait SequenceComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def apply[H](H: Applicative[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, HKT<H, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](H: Applicative1[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind<H, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](H: Applicative2[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind2<H, E, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](H: Applicative3[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind3<H, R, E, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](H: Applicative2C[H, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind2<H, E, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traversable[T]
    extends StObject
       with Functor[T]
       with Foldable[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def sequence[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind2<F, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind3<F, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind2<F, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind3<F, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, A>> */ js.Any
      ] = js.native
    
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, B>> */ js.Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<T, B>> */ js.Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, B>> */ js.Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, B>> */ js.Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, B>> */ js.Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traversable1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Functor1[T]
       with Foldable1[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def sequence[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind2<F, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind3<F, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind4<F, S, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Kind<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind2<F, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind3<F, R, E, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, A>> */ js.Any
      ] = js.native
    
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traversable2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Functor2[T]
       with Foldable2[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def sequence[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind3<F, R, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, A>> */ js.Any
      ] = js.native
    
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traversable2C[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, TL]
    extends StObject
       with Functor2C[T, TL]
       with Foldable2C[T, TL] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    /* InferMemberOverrides */
    override val _E: TL = js.native
    
    def sequence[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind3<F, R, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, A>> */ js.Any
      ] = js.native
    
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traversable3[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Functor3[T]
       with Foldable3[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def sequence[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, HKT<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<T, R, E, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, Kind<F, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<T, R, E, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, Kind3<F, FR, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, A>> */ js.Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, Kind2<F, FE, A>> */ /* ta */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, A>> */ js.Any
      ] = js.native
    
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<T, R, E, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<T, R, E, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, TR, TE, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, B>> */ js.Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, B>> */ js.Any
      ] = js.native
  }
  
  trait TraversableComposition[F, G]
    extends StObject
       with FoldableComposition[F, G]
       with FunctorComposition[F, G] {
    
    def sequence[H](H: Applicative[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, HKT<H, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, A>>> */ js.Any
      ]
    
    def traverse[H](H: Applicative[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, B>>> */ js.Any
      ]
  }
  object TraversableComposition {
    
    inline def apply[F, G](
      foldMap: Monoid[js.Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fa */ js.Any, 
          /* f */ js.Function1[/* a */ js.Any, js.Any], 
          js.Any
        ],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
      reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
      sequence: Applicative[js.Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, HKT<H, A>>> */ /* fga */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, A>>> */ js.Any
        ],
      traverse: Applicative[js.Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ js.Any, 
          /* f */ js.Function1[
            /* a */ js.Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ js.Any
          ], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, B>>> */ js.Any
        ]
    ): TraversableComposition[F, G] = {
      val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), map = js.Any.fromFunction2(map), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight), sequence = js.Any.fromFunction1(sequence), traverse = js.Any.fromFunction1(traverse))
      __obj.asInstanceOf[TraversableComposition[F, G]]
    }
    
    extension [Self <: TraversableComposition[?, ?], F, G](x: Self & (TraversableComposition[F, G])) {
      
      inline def setSequence(
        value: Applicative[js.Any] => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, HKT<H, A>>> */ /* fga */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, A>>> */ js.Any
            ]
      ): Self = StObject.set(x, "sequence", js.Any.fromFunction1(value))
      
      inline def setTraverse(
        value: Applicative[js.Any] => js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ js.Any, 
              /* f */ js.Function1[
                /* a */ js.Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ js.Any
              ], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, B>>> */ js.Any
            ]
      ): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TraversableComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with FoldableComposition11[F, G]
       with FunctorComposition11[F, G] {
    
    def sequence[H](H: Applicative[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, HKT<H, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
    def sequence[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](H: Applicative1[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind<H, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
    def sequence[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](H: Applicative2[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind2<H, E, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
    def sequence[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](H: Applicative3[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind3<H, R, E, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
    def sequence[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](H: Applicative2C[H, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind2<H, E, A>>> */ /* fga */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, A>>> */ js.Any
      ] = js.native
    
    def traverse[H](H: Applicative[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
    def traverse[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](H: Applicative1[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
    def traverse[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](H: Applicative2[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
    def traverse[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](H: Applicative3[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
    def traverse[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](H: Applicative2C[H, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traverse[T] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traverse1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traverse2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traverse2C[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Traverse3[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<T, R, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<T, R, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, TR, TE, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait TraverseComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def apply[H](H: Applicative[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](H: Applicative1[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](H: Applicative2[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](H: Applicative3[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](H: Applicative2C[H, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, B> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, B>>> */ js.Any
      ] = js.native
  }
}
