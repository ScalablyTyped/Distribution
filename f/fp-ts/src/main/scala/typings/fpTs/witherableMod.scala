package typings.fpTs

import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.applicativeMod.Applicative3C
import typings.fpTs.compactableMod.Compactable
import typings.fpTs.compactableMod.Compactable1
import typings.fpTs.compactableMod.Compactable2
import typings.fpTs.compactableMod.Compactable2C
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
  
  @JSImport("fp-ts/lib/Witherable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterE[G](W: Witherable[G]): js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* predicate */ js.Function1[
        /* a */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, boolean> */ Any
      ], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<G, A> */ /* ga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterE")(W.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* predicate */ js.Function1[
        /* a */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, boolean> */ Any
      ], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<G, A> */ /* ga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any
      ]
    ]
  ]]
  inline def filterE[G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](W: Witherable1[G]): FilterE1[G] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterE")(W.asInstanceOf[js.Any]).asInstanceOf[FilterE1[G]]
  
  inline def wiltDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[W], C: Compactable1[W]): Wilt1[W] = (^.asInstanceOf[js.Dynamic].applyDynamic("wiltDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wilt1[W]]
  inline def wiltDefault[W](T: Traversable[W], C: Compactable[W]): Wilt[W] = (^.asInstanceOf[js.Dynamic].applyDynamic("wiltDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wilt[W]]
  inline def wiltDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](T: Traversable2C[W, E], C: Compactable2[W]): Wilt2C[W, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("wiltDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wilt2C[W, E]]
  inline def wiltDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](T: Traversable2[W], C: Compactable2C[W, E]): Wilt2C[W, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("wiltDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wilt2C[W, E]]
  
  inline def witherDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[W], C: Compactable1[W]): Wither1[W] = (^.asInstanceOf[js.Dynamic].applyDynamic("witherDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wither1[W]]
  inline def witherDefault[W](T: Traversable[W], C: Compactable[W]): Wither[W] = (^.asInstanceOf[js.Dynamic].applyDynamic("witherDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wither[W]]
  inline def witherDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](T: Traversable2C[W, E], C: Compactable2[W]): Wither2C[W, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("witherDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wither2C[W, E]]
  inline def witherDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](T: Traversable2[W], C: Compactable2C[W, E]): Wither2C[W, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("witherDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wither2C[W, E]]
  
  @js.native
  trait FilterE1[G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* predicate */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, boolean> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<G, A> */ /* ga */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* predicate */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, boolean> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<G, A> */ /* ga */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* predicate */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, boolean> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<G, A> */ /* ga */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* predicate */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, boolean> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<G, A> */ /* ga */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<G, A>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* predicate */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, boolean> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<G, A> */ /* ga */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* predicate */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, boolean> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<G, A> */ /* ga */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<G, A>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWilt[W] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<HKT<W, B>, HKT<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<HKT<W, B>, HKT<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWilt1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind<W, B>, Kind<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind<W, B>, Kind<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWilt2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWilt2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, WE] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWilt3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither[W] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, WE] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait PipeableWither3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<W, WR, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<W, WR, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, WR, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<W, WR, WE, B>> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, WR, WE, B>> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait Wilt[W] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Wilt1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Wilt2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Wilt2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Wilt3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind3<W, R, E, B>, Kind3<W, R, E, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind3<W, R, E, B>, Kind3<W, R, E, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, R, WE, B>, Kind3<W, R, WE, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, R, WE, B>, Kind3<W, R, WE, C>>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Wither[W] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Wither1[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Wither2[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, WE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Wither2C[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, E, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Wither3[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<W, R, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<W, R, E, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, WR, WE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<W, WR, WE, B>> */ Any
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, R, WE, B>> */ Any
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    /**
      * Partition a structure with effects
      */
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<HKT<W, B>, HKT<W, C>>> */ Any
      ] = js.native
    
    /**
      * Filter a structure  with effects
      */
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<W, B>> */ Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, HKT<W, B>> */ Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, HKT<W, B>> */ Any
      ] = js.native
    /**
      * Filter a structure  with effects
      */
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, HKT<W, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Witherable1[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
    extends StObject
       with Traversable1[T]
       with Filterable1[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def wilt[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Separated<Kind<W, B>, Kind<W, C>>> */ Any
      ] = js.native
    
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<W, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<W, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<W, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Applicative3C[F, E]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<W, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Witherable2[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with Traversable2[T]
       with Filterable2[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def wilt[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, WE, B>, Kind2<W, WE, C>>> */ Any
      ] = js.native
    
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, E, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, E, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, WE, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, WE, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Witherable2C[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, TL]
    extends StObject
       with Traversable2C[T, TL]
       with Filterable2C[T, TL] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    /* InferMemberOverrides */
    override val _E: TL = js.native
    
    def wilt[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind2<W, E, B>, Kind2<W, E, C>>> */ Any
      ] = js.native
    
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<W, E, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<W, E, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, E, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Kind2<W, E, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<W, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<W, E, B>> */ Any
      ] = js.native
  }
  
  @js.native
  trait Witherable3[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
    extends StObject
       with Traversable3[T]
       with Filterable3[T] {
    
    /* InferMemberOverrides */
    override val URI: T = js.native
    
    def wilt[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Separated<Kind3<W, R, E, B>, Kind3<W, R, E, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Separated<Kind3<W, R, E, B>, Kind3<W, R, E, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, R, WE, B>, Kind3<W, R, WE, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Separated<Kind3<W, WR, WE, B>, Kind3<W, WR, WE, C>>> */ Any
      ] = js.native
    def wilt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* wa */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<B, C>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Separated<Kind3<W, R, WE, B>, Kind3<W, R, WE, C>>> */ Any
      ] = js.native
    
    def wither[F](F: Applicative[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind3<W, R, E, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, E, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<W, R, E, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, WR, WE, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, WR, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, Kind3<W, WR, WE, B>> */ Any
      ] = js.native
    def wither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Applicative2C[F, FE]): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<W, R, WE, A> */ /* ta */ Any, 
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Option<B>> */ Any
        ], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind3<W, R, WE, B>> */ Any
      ] = js.native
  }
}
