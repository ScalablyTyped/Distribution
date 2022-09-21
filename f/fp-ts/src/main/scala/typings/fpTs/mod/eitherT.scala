package typings.fpTs.mod

import typings.fpTs.applyMod.Apply
import typings.fpTs.applyMod.Apply1
import typings.fpTs.applyMod.Apply2
import typings.fpTs.applyMod.Apply2C
import typings.fpTs.applyMod.Apply3
import typings.fpTs.applyMod.Apply3C
import typings.fpTs.chainMod.Chain
import typings.fpTs.chainMod.Chain1
import typings.fpTs.chainMod.Chain2
import typings.fpTs.chainMod.Chain2C
import typings.fpTs.chainMod.Chain3
import typings.fpTs.chainMod.Chain3C
import typings.fpTs.eitherTMod.EitherM
import typings.fpTs.eitherTMod.EitherM1
import typings.fpTs.eitherTMod.EitherM2
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functorMod.Functor
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorMod.Functor2
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.functorMod.Functor3
import typings.fpTs.functorMod.Functor3C
import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.monadMod.Monad3C
import typings.fpTs.pointedMod.Pointed
import typings.fpTs.pointedMod.Pointed1
import typings.fpTs.pointedMod.Pointed2
import typings.fpTs.pointedMod.Pointed2C
import typings.fpTs.pointedMod.Pointed3
import typings.fpTs.pointedMod.Pointed3C
import typings.fpTs.semigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherT {
  
  @JSImport("fp-ts", "eitherT")
  @js.native
  val ^ : js.Any = js.native
  
  inline def alt[M](M: Monad[M]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME](M: Monad2C[M, ME]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME](M: Monad3C[M, ME]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ]]
  
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](M: Monad1[M], S: Semigroup[E]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2[M], S: Semigroup[E]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3[M], S: Semigroup[E]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M, E](M: Monad[M], S: Semigroup[E]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME, E](M: Monad2C[M, ME], S: Semigroup[E]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, Either<E, A>> */ Any
    ]
  ]]
  inline def altValidation[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME, E](M: Monad3C[M, ME], S: Semigroup[E]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, Either<E, A>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("altValidation")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* second */ Lazy[
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
}
