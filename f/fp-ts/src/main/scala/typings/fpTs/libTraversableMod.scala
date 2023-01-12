package typings.fpTs

import typings.fpTs.anon.Fn35
import typings.fpTs.anon.Fn36
import typings.fpTs.anon.Fn37
import typings.fpTs.anon.FnCallF
import typings.fpTs.libApplicativeMod.Applicative
import typings.fpTs.libApplicativeMod.Applicative1
import typings.fpTs.libApplicativeMod.Applicative2
import typings.fpTs.libApplicativeMod.Applicative2C
import typings.fpTs.libApplicativeMod.Applicative3
import typings.fpTs.libApplicativeMod.Applicative3C
import typings.fpTs.libApplicativeMod.Applicative4
import typings.fpTs.libFoldableMod.Foldable
import typings.fpTs.libFoldableMod.Foldable1
import typings.fpTs.libFoldableMod.Foldable2
import typings.fpTs.libFoldableMod.Foldable2C
import typings.fpTs.libFoldableMod.Foldable3
import typings.fpTs.libFoldableMod.FoldableComposition
import typings.fpTs.libFoldableMod.FoldableComposition11
import typings.fpTs.libFunctorMod.Functor
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libFunctorMod.Functor2C
import typings.fpTs.libFunctorMod.Functor3
import typings.fpTs.libFunctorMod.FunctorComposition
import typings.fpTs.libFunctorMod.FunctorComposition11
import typings.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTraversableMod {
  
  @JSImport("fp-ts/lib/Traversable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTraversableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Traversable1[F], G: Traversable1[G]): TraversableComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[TraversableComposition11[F, G]]
  inline def getTraversableComposition[F, G](F: Traversable[F], G: Traversable[G]): TraversableComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[TraversableComposition[F, G]]
  
  inline def sequence[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T], G: Traversable1[G]): Fn37 = (^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn37]
  inline def sequence[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](T: Traversable1[T], G: Traversable2[G]): Fn36 = (^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn36]
  inline def sequence[T, G](T: Traversable[T], G: Traversable[G]): js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<G, HKT<F, A>>> */ /* tgfa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, HKT<G, A>>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<G, HKT<F, A>>> */ /* tgfa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, HKT<G, A>>> */ Any
    ]
  ]]
  
  inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T], G: Traversable1[G]): Fn35 = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn35]
  inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](T: Traversable1[T], G: Traversable2[G]): FnCallF = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FnCallF]
  inline def traverse[T, G](T: Traversable[T], G: Traversable[G]): js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* f */ js.Function1[
        /* a */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
      ], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<G, A>> */ /* tga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, HKT<G, B>>> */ Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* f */ js.Function1[
        /* a */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
      ], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<G, A>> */ /* tga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, HKT<G, B>>> */ Any
      ]
    ]
  ]]
  
  @js.native
  trait PipeableTraverse1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<T, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind<T, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<T, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind<T, B>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableTraverse2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, TE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, TE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind2<T, TE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait Sequence1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind2<F, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind3<F, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind4<F, S, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Kind<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind2<F, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind3<F, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, A>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Sequence2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind3<F, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind4<F, S, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind3<F, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Sequence2C[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind3<F, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind4<F, S, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, Kind2<T, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind3<F, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, A>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Sequence3[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<T, R, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<T, R, E, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, Kind3<F, FR, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, Kind4<F, S, FR, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, Kind3<T, TR, TE, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, Kind3<F, FR, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, A>> */ Any
      ] = js.native
  }
  
  @js.native
  trait SequenceComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[H](H: Applicative[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, HKT<H, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](H: Applicative1[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind<H, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](H: Applicative2[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind2<H, E, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](H: Applicative3[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind3<H, R, E, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](H: Applicative2C[H, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind2<H, E, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Sequence_[T] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind2<F, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind3<F, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind4<F, S, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, HKT<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind2<F, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, A>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind3<F, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, A>> */ Any
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind2<F, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind3<F, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind4<F, S, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, HKT<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind2<F, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, Kind3<F, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, A>> */ Any
      ] = js.native
    
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, B>> */ Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<T, B>> */ Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, B>> */ Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, B>> */ Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, HKT<T, B>> */ Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, B>> */ Any
      ] = js.native
    /**
      * Runs an action for every element in a data structure and accumulates the results
      */
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Traversable1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
    extends StObject
       with Functor1[T]
       with Foldable1[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def sequence[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind2<F, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind3<F, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind4<F, S, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Kind<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind2<F, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, Kind3<F, R, E, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, A>> */ Any
      ] = js.native
    
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Kind<T, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Traversable2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with Functor2[T]
       with Foldable2[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def sequence[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind3<F, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind4<F, S, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, Kind3<F, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, A>> */ Any
      ] = js.native
    
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Traversable2C[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, TL]
    extends StObject
       with Functor2C[T, TL]
       with Foldable2C[T, TL] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    /* InferMemberOverrides */
    override val _E: TL = js.native
    
    def sequence[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind3<F, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind4<F, S, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, Kind2<T, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, Kind3<F, R, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, A>> */ Any
      ] = js.native
    
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, Kind2<T, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Traversable3[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
    extends StObject
       with Functor3[T]
       with Foldable3[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def sequence[F](F: Applicative[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, HKT<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<T, R, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, Kind<F, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<T, R, E, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, Kind3<F, FR, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, Kind4<F, S, FR, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, Kind3<T, TR, TE, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, Kind2<F, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, A>> */ Any
      ] = js.native
    def sequence[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, Kind3<F, FR, FE, A>> */ /* ta */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, A>> */ Any
      ] = js.native
    
    def traverse[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<T, R, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<T, R, E, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, TR, TE, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, Kind3<T, TR, TE, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, B>> */ Any
      ] = js.native
    def traverse[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, B>> */ Any
      ] = js.native
  }
  
  trait TraversableComposition[F, G]
    extends StObject
       with FoldableComposition[F, G]
       with FunctorComposition[F, G] {
    
    def sequence[H](H: Applicative[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, HKT<H, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, A>>> */ Any
      ]
    
    def traverse[H](H: Applicative[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, B>>> */ Any
      ]
  }
  object TraversableComposition {
    
    inline def apply[F, G](
      foldMap: Monoid[Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fa */ Any, 
          /* f */ js.Function1[/* a */ Any, Any], 
          Any
        ],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, js.Function1[Any, Any]) => Any,
      reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any,
      reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any,
      sequence: Applicative[Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, HKT<H, A>>> */ /* fga */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, A>>> */ Any
        ],
      traverse: Applicative[Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ Any, 
          /* f */ js.Function1[
            /* a */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ Any
          ], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, B>>> */ Any
        ]
    ): TraversableComposition[F, G] = {
      val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), map = js.Any.fromFunction2(map), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight), sequence = js.Any.fromFunction1(sequence), traverse = js.Any.fromFunction1(traverse))
      __obj.asInstanceOf[TraversableComposition[F, G]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraversableComposition[?, ?], F, G] (val x: Self & (TraversableComposition[F, G])) extends AnyVal {
      
      inline def setSequence(
        value: Applicative[Any] => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, HKT<H, A>>> */ /* fga */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, A>>> */ Any
            ]
      ): Self = StObject.set(x, "sequence", js.Any.fromFunction1(value))
      
      inline def setTraverse(
        value: Applicative[Any] => js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ Any, 
              /* f */ js.Function1[
                /* a */ Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ Any
              ], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, HKT<F, HKT<G, B>>> */ Any
            ]
      ): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TraversableComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
    extends StObject
       with FoldableComposition11[F, G]
       with FunctorComposition11[F, G] {
    
    def sequence[H](H: Applicative[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, HKT<H, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
    def sequence[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](H: Applicative1[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind<H, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
    def sequence[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](H: Applicative2[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind2<H, E, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
    def sequence[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](H: Applicative3[H]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind3<H, R, E, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
    def sequence[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](H: Applicative2C[H, E]): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Kind2<H, E, A>>> */ /* fga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, A>>> */ Any
      ] = js.native
    
    def traverse[H](H: Applicative[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
    def traverse[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](H: Applicative1[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
    def traverse[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](H: Applicative2[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
    def traverse[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](H: Applicative3[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
    def traverse[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](H: Applicative2C[H, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Traverse1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Kind<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<T, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Traverse2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, TE, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Traverse2C[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<T, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<T, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, FE, Kind2<T, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<T, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<T, E, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Traverse3[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<T, R, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<T, R, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, TR, TE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, Kind3<T, TR, TE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<T, R, TE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Applicative3C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, TR, TE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<T, TR, TE, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait TraverseComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[H](H: Applicative[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<H, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](H: Applicative1[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<H, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](H: Applicative2[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](H: Applicative3[H]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<H, R, E, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
    def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](H: Applicative2C[H, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<H, E, Kind<F, Kind<G, B>>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Traverse_[T] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Applicative4[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, HKT<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<T, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<T, B>> */ Any
      ] = js.native
  }
}
