package typings.fpTs

import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.applicativeMod.Applicative3C
import typings.fpTs.filterableMod.Filterable
import typings.fpTs.filterableMod.Filterable1
import typings.fpTs.filterableMod.Filterable2
import typings.fpTs.filterableMod.Filterable2C
import typings.fpTs.filterableMod.Filterable3
import typings.fpTs.traversableMod.Traversable
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableMod.Traversable2
import typings.fpTs.traversableMod.Traversable2C
import typings.fpTs.traversableMod.Traversable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object witherableMod {
  
  @js.native
  trait PipeableWilt[W] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWilt1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWilt2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWilt2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, WE] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWilt3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither[W] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, WE] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<W, WR, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<W, WR, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, WR, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<W, WR, WE, B>> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, WR, WE, B>> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait Wilt[W] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Wilt1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Wilt2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Wilt2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Wilt3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind3<W, R, E, B>, Kind3<W, R, E, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind3<W, R, E, B>, Kind3<W, R, E, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, R, WE, B>, Kind3<W, R, WE, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, R, WE, B>, Kind3<W, R, WE, C>>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Wither[W] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Wither1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Wither2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, WE, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Wither2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, E, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Wither3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<W, R, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<W, R, E, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, WR, WE, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<W, WR, WE, B>> */ js.Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, R, WE, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Witherable[T]
    extends StObject
       with Traversable[T]
       with Filterable[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    /**
      * Partition a structure with effects
      */
    def wilt[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ js.Any
      ] = js.native
    
    /**
      * Filter a structure  with effects
      */
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<W, B>> */ js.Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<W, B>> */ js.Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ js.Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ js.Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ js.Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Witherable1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Traversable1[T]
       with Filterable1[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def wilt[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ js.Any
      ] = js.native
    
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<W, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<W, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Witherable2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Traversable2[T]
       with Filterable2[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def wilt[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ js.Any
      ] = js.native
    
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, WE, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Witherable2C[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, TL]
    extends StObject
       with Traversable2C[T, TL]
       with Filterable2C[T, TL] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    /* InferMemberOverrides */
    override val _E: TL = js.native
    
    def wilt[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ js.Any
      ] = js.native
    
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, E, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, E, B>> */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Witherable3[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Traversable3[T]
       with Filterable3[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def wilt[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind3<W, R, E, B>, Kind3<W, R, E, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind3<W, R, E, B>, Kind3<W, R, E, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, R, WE, B>, Kind3<W, R, WE, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ js.Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* wa */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, R, WE, B>, Kind3<W, R, WE, C>>> */ js.Any
      ] = js.native
    
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<W, R, E, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<W, R, E, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, WR, WE, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<W, WR, WE, B>> */ js.Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* ta */ js.Any, 
        /* f */ js.Function1[
          /* a */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ js.Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, R, WE, B>> */ js.Any
      ] = js.native
  }
}
