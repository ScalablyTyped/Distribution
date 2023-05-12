package typings.fpTs

import typings.fpTs.libApplicativeMod.ApplicativeComposition12
import typings.fpTs.libApplicativeMod.ApplicativeComposition22
import typings.fpTs.libApplicativeMod.ApplicativeCompositionHKT2
import typings.fpTs.libApplyMod.Apply
import typings.fpTs.libApplyMod.Apply1
import typings.fpTs.libApplyMod.Apply2
import typings.fpTs.libApplyMod.Apply2C
import typings.fpTs.libApplyMod.Apply3
import typings.fpTs.libApplyMod.Apply3C
import typings.fpTs.libChainMod.Chain
import typings.fpTs.libChainMod.Chain1
import typings.fpTs.libChainMod.Chain2
import typings.fpTs.libChainMod.Chain2C
import typings.fpTs.libChainMod.Chain3
import typings.fpTs.libChainMod.Chain3C
import typings.fpTs.libEitherMod.URI
import typings.fpTs.libFunctionMod.LazyArg
import typings.fpTs.libFunctorMod.Functor
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libFunctorMod.Functor2C
import typings.fpTs.libFunctorMod.Functor3
import typings.fpTs.libFunctorMod.Functor3C
import typings.fpTs.libMonadMod.Monad
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonadMod.Monad2
import typings.fpTs.libMonadMod.Monad2C
import typings.fpTs.libMonadMod.Monad3
import typings.fpTs.libMonadMod.Monad3C
import typings.fpTs.libPointedMod.Pointed
import typings.fpTs.libPointedMod.Pointed1
import typings.fpTs.libPointedMod.Pointed2
import typings.fpTs.libPointedMod.Pointed2C
import typings.fpTs.libPointedMod.Pointed3
import typings.fpTs.libPointedMod.Pointed3C
import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEitherTMod {
  
  @JSImport("fp-ts/lib/EitherT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alt[M](M: Monad[M]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME](M: Monad2C[M, ME]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME](M: Monad3C[M, ME]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ]]
  
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](M: Monad1[M], S: Semigroup[E]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2[M], S: Semigroup[E]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3[M], S: Semigroup[E]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M, E](M: Monad[M], S: Semigroup[E]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME, E](M: Monad2C[M, ME], S: Semigroup[E]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME, E](M: Monad3C[M, ME], S: Semigroup[E]): js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ LazyArg[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ]]
  
  inline def ap[F](F: Apply[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Apply1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Apply2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Apply3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Apply2C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Apply3C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, B>> */ Any
    ]
  ]]
  
  inline def bimap[F](F: Functor[F]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<G, B>> */ Any
    ]
  ]]
  
  inline def chain[M](M: Monad[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME](M: Monad2C[M, ME]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME](M: Monad3C[M, ME]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ]
  ]]
  
  inline def chainNullableK[M](M: Monad[M]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, S, R, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, S, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, S, R, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, S, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, T](M: Monad2C[M, T]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, T, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, T, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, T, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, T, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, R](M: Monad3C[M, R]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, S, R, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, S, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, S, R, Either<E, A>> */ /* ma */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, S, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  
  inline def fromNullable[F](F: Pointed[F]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, NonNullable<A>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, NonNullable<A>>> */ Any
    ]
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, NonNullable<A>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, NonNullable<A>>> */ Any
    ]
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, Either<E, NonNullable<A>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, Either<E, NonNullable<A>>> */ Any
    ]
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, Either<E, NonNullable<A>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, Either<E, NonNullable<A>>> */ Any
    ]
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, R](F: Pointed2C[F, R]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, Either<E, NonNullable<A>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, Either<E, NonNullable<A>>> */ Any
    ]
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, R](F: Pointed3C[F, R]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, Either<E, NonNullable<A>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, Either<E, NonNullable<A>>> */ Any
    ]
  ]]
  
  inline def fromNullableK[F](F: Pointed[F]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, R](F: Pointed2C[F, R]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, R](F: Pointed3C[F, R]): js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
      js.Function1[
        /* a */ js.Array[Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, Either<E, NonNullable<B>>> */ Any
      ]
    ]
  ]]
  
  inline def getEitherM[M](M: Monad[M]): EitherM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEitherM")(M.asInstanceOf[js.Any]).asInstanceOf[EitherM[M]]
  inline def getEitherM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): EitherM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEitherM")(M.asInstanceOf[js.Any]).asInstanceOf[EitherM1[M]]
  inline def getEitherM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): EitherM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEitherM")(M.asInstanceOf[js.Any]).asInstanceOf[EitherM2[M]]
  
  inline def getOrElse[M](M: Monad[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME](M: Monad2C[M, ME]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME](M: Monad3C[M, ME]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, A> */ Any
    ]
  ]]
  
  inline def left[F](F: Pointed[F]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Pointed2C[F, FE]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Pointed3C[F, FE]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ]]
  
  inline def leftF[F](F: Functor[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ]]
  
  inline def map[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, B>> */ Any
    ]
  ]]
  
  inline def mapLeft[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<G, A>> */ Any
    ]
  ]]
  
  inline def `match`[F](F: Functor[F]): js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, ME, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, ME, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, B> */ Any
    ]
  ]]
  
  inline def matchE[M](M: Chain[M]): js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Chain1[M]): js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Chain2[M]): js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Chain3[M]): js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](M: Chain2C[M, FE]): js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](M: Chain3C[M, FE]): js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, FE, B> */ Any
    ]
  ]]
  
  inline def orElse[M](M: Monad[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E2, A>> */ Any
    ]
  ]]
  inline def orElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E2, A>> */ Any
    ]
  ]]
  inline def orElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ]
  ]]
  inline def orElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ]
  ]]
  inline def orElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME](M: Monad2C[M, ME]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ]
  ]]
  inline def orElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME](M: Monad3C[M, ME]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E1, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ]
  ]]
  
  inline def orElseFirst[M](M: Monad[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirst")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ]]
  inline def orElseFirst[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirst")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ]]
  inline def orElseFirst[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirst")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def orElseFirst[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirst")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def orElseFirst[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME](M: Monad2C[M, ME]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirst")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def orElseFirst[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME](M: Monad3C[M, ME]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirst")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ]]
  
  inline def orLeft[M](M: Monad[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orLeft")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E2, A>> */ Any
    ]
  ]]
  inline def orLeft[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orLeft")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E2, A>> */ Any
    ]
  ]]
  inline def orLeft[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orLeft")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ]
  ]]
  inline def orLeft[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orLeft")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ]
  ]]
  inline def orLeft[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME](M: Monad2C[M, ME]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orLeft")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E2, A>> */ Any
    ]
  ]]
  inline def orLeft[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME](M: Monad3C[M, ME]): js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("orLeft")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, E2> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E1, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E2, A>> */ Any
    ]
  ]]
  
  inline def right[F](F: Pointed[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Pointed2C[F, FE]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Pointed3C[F, FE]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ]]
  
  inline def rightF[F](F: Functor[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ Any
  ]]
  
  inline def swap[F](F: Functor[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<A, E>> */ Any
  ]]
  
  inline def toUnion[F](F: Functor[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, E | A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, E | A> */ Any
  ]]
  inline def toUnion[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, E | A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, E | A> */ Any
  ]]
  inline def toUnion[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E | A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E | A> */ Any
  ]]
  inline def toUnion[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E | A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E | A> */ Any
  ]]
  inline def toUnion[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E | A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E | A> */ Any
  ]]
  inline def toUnion[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E | A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, Either<E, A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E | A> */ Any
  ]]
  
  trait EitherM[M]
    extends StObject
       with ApplicativeCompositionHKT2[M, URI] {
    
    def alt[E, A](fa: EitherT[M, E, A], that: LazyArg[EitherT[M, E, A]]): EitherT[M, E, A]
    
    def bimap[E, A, N, B](ma: EitherT[M, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): EitherT[M, N, B]
    
    def chain[E, A, B](ma: EitherT[M, E, A], f: js.Function1[/* a */ A, EitherT[M, E, B]]): EitherT[M, E, B]
    
    def fold[E, A, R](
      ma: EitherT[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ]
    ): Any
    
    def getOrElse[E, A](
      ma: EitherT[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
        ]
    ): Any
    
    def left[E, A](e: E): EitherT[M, E, A]
    
    def leftM[E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ Any
    ): EitherT[M, E, A]
    
    def mapLeft[E, A, N](ma: EitherT[M, E, A], f: js.Function1[/* e */ E, N]): EitherT[M, N, A]
    
    def orElse[E, A, N](ma: EitherT[M, E, A], onLeft: js.Function1[/* e */ E, EitherT[M, N, A]]): EitherT[M, N, A]
    
    def rightM[E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ): EitherT[M, E, A]
    
    def swap[E, A](ma: EitherT[M, E, A]): EitherT[M, A, E]
  }
  object EitherM {
    
    inline def apply[M](
      alt: (EitherT[M, Any, Any], LazyArg[EitherT[M, Any, Any]]) => EitherT[M, Any, Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ Any) => Any,
      bimap: (EitherT[M, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => EitherT[M, Any, Any],
      chain: (EitherT[M, Any, Any], js.Function1[Any, EitherT[M, Any, Any]]) => EitherT[M, Any, Any],
      fold: (EitherT[M, Any, Any], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ]) => Any,
      getOrElse: (EitherT[M, Any, Any], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
        ]) => Any,
      left: Any => EitherT[M, Any, Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ Any => EitherT[M, Any, Any],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ Any, js.Function1[Any, Any]) => Any,
      mapLeft: (EitherT[M, Any, Any], js.Function1[Any, Any]) => EitherT[M, Any, Any],
      of: Any => Any,
      orElse: (EitherT[M, Any, Any], js.Function1[Any, EitherT[M, Any, Any]]) => EitherT[M, Any, Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any => EitherT[M, Any, Any],
      swap: EitherT[M, Any, Any] => EitherT[M, Any, Any]
    ): EitherM[M] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), bimap = js.Any.fromFunction3(bimap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), getOrElse = js.Any.fromFunction2(getOrElse), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), of = js.Any.fromFunction1(of), orElse = js.Any.fromFunction2(orElse), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap))
      __obj.asInstanceOf[EitherM[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EitherM[?], M] (val x: Self & EitherM[M]) extends AnyVal {
      
      inline def setAlt(value: (EitherT[M, Any, Any], LazyArg[EitherT[M, Any, Any]]) => EitherT[M, Any, Any]): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      inline def setBimap(
        value: (EitherT[M, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => EitherT[M, Any, Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setChain(value: (EitherT[M, Any, Any], js.Function1[Any, EitherT[M, Any, Any]]) => EitherT[M, Any, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (EitherT[M, Any, Any], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
            ], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
            ]) => Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      inline def setGetOrElse(
        value: (EitherT[M, Any, Any], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
            ]) => Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      inline def setLeft(value: Any => EitherT[M, Any, Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ Any => EitherT[M, Any, Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMapLeft(value: (EitherT[M, Any, Any], js.Function1[Any, Any]) => EitherT[M, Any, Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setOrElse(value: (EitherT[M, Any, Any], js.Function1[Any, EitherT[M, Any, Any]]) => EitherT[M, Any, Any]): Self = StObject.set(x, "orElse", js.Any.fromFunction2(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any => EitherT[M, Any, Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: EitherT[M, Any, Any] => EitherT[M, Any, Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
    }
  }
  
  trait EitherM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
    extends StObject
       with ApplicativeComposition12[M, URI] {
    
    def alt[E, A](fa: EitherT1[M, E, A], that: LazyArg[EitherT1[M, E, A]]): EitherT1[M, E, A]
    
    def bimap[E, A, N, B](ma: EitherT1[M, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): EitherT1[M, N, B]
    
    def chain[E, A, B](ma: EitherT1[M, E, A], f: js.Function1[/* a */ A, EitherT1[M, E, B]]): EitherT1[M, E, B]
    
    def fold[E, A, R](
      ma: EitherT1[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ]
    ): Any
    
    def getOrElse[E, A](
      ma: EitherT1[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
        ]
    ): Any
    
    def left[E, A](e: E): EitherT1[M, E, A]
    
    def leftM[E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ Any
    ): EitherT1[M, E, A]
    
    def mapLeft[E, A, N](ma: EitherT1[M, E, A], f: js.Function1[/* e */ E, N]): EitherT1[M, N, A]
    
    def orElse[E, A, N](ma: EitherT1[M, E, A], onLeft: js.Function1[/* e */ E, EitherT1[M, N, A]]): EitherT1[M, N, A]
    
    def rightM[E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ): EitherT1[M, E, A]
    
    def swap[E, A](ma: EitherT1[M, E, A]): EitherT1[M, A, E]
  }
  object EitherM1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      alt: (EitherT1[M, Any, Any], LazyArg[EitherT1[M, Any, Any]]) => EitherT1[M, Any, Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any) => Any,
      bimap: (EitherT1[M, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => EitherT1[M, Any, Any],
      chain: (EitherT1[M, Any, Any], js.Function1[Any, EitherT1[M, Any, Any]]) => EitherT1[M, Any, Any],
      fold: (EitherT1[M, Any, Any], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ]) => Any,
      getOrElse: (EitherT1[M, Any, Any], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
        ]) => Any,
      left: Any => EitherT1[M, Any, Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ Any => EitherT1[M, Any, Any],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, js.Function1[Any, Any]) => Any,
      mapLeft: (EitherT1[M, Any, Any], js.Function1[Any, Any]) => EitherT1[M, Any, Any],
      of: Any => Any,
      orElse: (EitherT1[M, Any, Any], js.Function1[Any, EitherT1[M, Any, Any]]) => EitherT1[M, Any, Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any => EitherT1[M, Any, Any],
      swap: EitherT1[M, Any, Any] => EitherT1[M, Any, Any]
    ): EitherM1[M] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), bimap = js.Any.fromFunction3(bimap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), getOrElse = js.Any.fromFunction2(getOrElse), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), of = js.Any.fromFunction1(of), orElse = js.Any.fromFunction2(orElse), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap))
      __obj.asInstanceOf[EitherM1[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EitherM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] (val x: Self & EitherM1[M]) extends AnyVal {
      
      inline def setAlt(value: (EitherT1[M, Any, Any], LazyArg[EitherT1[M, Any, Any]]) => EitherT1[M, Any, Any]): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      inline def setBimap(
        value: (EitherT1[M, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => EitherT1[M, Any, Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setChain(value: (EitherT1[M, Any, Any], js.Function1[Any, EitherT1[M, Any, Any]]) => EitherT1[M, Any, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (EitherT1[M, Any, Any], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
            ], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
            ]) => Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      inline def setGetOrElse(
        value: (EitherT1[M, Any, Any], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
            ]) => Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      inline def setLeft(value: Any => EitherT1[M, Any, Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ Any => EitherT1[M, Any, Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMapLeft(value: (EitherT1[M, Any, Any], js.Function1[Any, Any]) => EitherT1[M, Any, Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setOrElse(value: (EitherT1[M, Any, Any], js.Function1[Any, EitherT1[M, Any, Any]]) => EitherT1[M, Any, Any]): Self = StObject.set(x, "orElse", js.Any.fromFunction2(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any => EitherT1[M, Any, Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: EitherT1[M, Any, Any] => EitherT1[M, Any, Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
    }
  }
  
  trait EitherM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with ApplicativeComposition22[M, URI] {
    
    def alt[R, E, A](fa: EitherT2[M, R, E, A], that: LazyArg[EitherT2[M, R, E, A]]): EitherT2[M, R, E, A]
    
    def bimap[R, E, A, N, B](ma: EitherT2[M, R, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): EitherT2[M, R, N, B]
    
    def chain[R, E, A, B](ma: EitherT2[M, R, E, A], f: js.Function1[/* a */ A, EitherT2[M, R, E, B]]): EitherT2[M, R, E, B]
    
    def fold[R, E, A, B](
      ma: EitherT2[M, R, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ]
    ): Any
    
    def getOrElse[R, E, A](
      ma: EitherT2[M, R, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any
        ]
    ): Any
    
    def left[R, E, A](e: E): EitherT2[M, R, E, A]
    
    def leftM[R, E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ Any
    ): EitherT2[M, R, E, A]
    
    def mapLeft[R, E, A, N](ma: EitherT2[M, R, E, A], f: js.Function1[/* e */ E, N]): EitherT2[M, R, N, A]
    
    def orElse[R, E, A, F](ma: EitherT2[M, R, E, A], onLeft: js.Function1[/* e */ E, EitherT2[M, R, F, A]]): EitherT2[M, R, F, A]
    
    def rightM[R, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any
    ): EitherT2[M, R, E, A]
    
    def swap[R, E, A](ma: EitherT2[M, R, E, A]): EitherT2[M, R, A, E]
  }
  object EitherM2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      alt: (EitherT2[M, Any, Any, Any], LazyArg[EitherT2[M, Any, Any, Any]]) => EitherT2[M, Any, Any, Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, (a : A): B>> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any) => Any,
      bimap: (EitherT2[M, Any, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => EitherT2[M, Any, Any, Any],
      chain: (EitherT2[M, Any, Any, Any], js.Function1[Any, EitherT2[M, Any, Any, Any]]) => EitherT2[M, Any, Any, Any],
      fold: (EitherT2[M, Any, Any, Any], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ]) => Any,
      getOrElse: (EitherT2[M, Any, Any, Any], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any
        ]) => Any,
      left: Any => EitherT2[M, Any, Any, Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ Any => EitherT2[M, Any, Any, Any],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any, js.Function1[Any, Any]) => Any,
      mapLeft: (EitherT2[M, Any, Any, Any], js.Function1[Any, Any]) => EitherT2[M, Any, Any, Any],
      of: Any => Any,
      orElse: (EitherT2[M, Any, Any, Any], js.Function1[Any, EitherT2[M, Any, Any, Any]]) => EitherT2[M, Any, Any, Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any => EitherT2[M, Any, Any, Any],
      swap: EitherT2[M, Any, Any, Any] => EitherT2[M, Any, Any, Any]
    ): EitherM2[M] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), bimap = js.Any.fromFunction3(bimap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), getOrElse = js.Any.fromFunction2(getOrElse), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), of = js.Any.fromFunction1(of), orElse = js.Any.fromFunction2(orElse), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap))
      __obj.asInstanceOf[EitherM2[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EitherM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] (val x: Self & EitherM2[M]) extends AnyVal {
      
      inline def setAlt(
        value: (EitherT2[M, Any, Any, Any], LazyArg[EitherT2[M, Any, Any, Any]]) => EitherT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      inline def setBimap(
        value: (EitherT2[M, Any, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => EitherT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setChain(
        value: (EitherT2[M, Any, Any, Any], js.Function1[Any, EitherT2[M, Any, Any, Any]]) => EitherT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (EitherT2[M, Any, Any, Any], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
            ], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
            ]) => Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      inline def setGetOrElse(
        value: (EitherT2[M, Any, Any, Any], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any
            ]) => Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      inline def setLeft(value: Any => EitherT2[M, Any, Any, Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ Any => EitherT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMapLeft(value: (EitherT2[M, Any, Any, Any], js.Function1[Any, Any]) => EitherT2[M, Any, Any, Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setOrElse(
        value: (EitherT2[M, Any, Any, Any], js.Function1[Any, EitherT2[M, Any, Any, Any]]) => EitherT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "orElse", js.Any.fromFunction2(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any => EitherT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: EitherT2[M, Any, Any, Any] => EitherT2[M, Any, Any, Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
    }
  }
  
  type EitherT[M, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
  
  type EitherT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
  
  type EitherT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, R, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Either<E, A>> */ Any
}
