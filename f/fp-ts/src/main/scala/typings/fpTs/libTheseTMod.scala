package typings.fpTs

import typings.fpTs.anon.Ap
import typings.fpTs.anon.Map
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

object libTheseTMod {
  
  @JSImport("fp-ts/lib/TheseT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](F: Apply1[F], S: Semigroup[E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Apply2[F], S: Semigroup[E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Apply3[F], S: Semigroup[E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, B>> */ Any
    ]
  ]]
  inline def ap[F, E](F: Apply[F], S: Semigroup[E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE, E](F: Apply2C[F, FE], S: Semigroup[E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE, E](F: Apply3C[F, FE], S: Semigroup[E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, (a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, B>> */ Any
    ]
  ]]
  
  inline def bimap[F](F: Functor[F]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<G, B>> */ Any
    ]
  ]]
  inline def bimap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<G, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* f */ js.Function1[/* e */ Any, Any], 
    /* g */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<G, B>> */ Any
    ]
  ]]
  
  inline def both[F](F: Pointed[F]): js.Function2[
    /* e */ Any, 
    /* a */ scala.Nothing, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("both")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Any, 
    /* a */ scala.Nothing, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ]]
  inline def both[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("both")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ]]
  inline def both[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("both")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, These<E, A>> */ Any
  ]]
  inline def both[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("both")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, These<E, A>> */ Any
  ]]
  inline def both[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, R](F: Pointed2C[F, R]): js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("both")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, These<E, A>> */ Any
  ]]
  inline def both[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, R](F: Pointed3C[F, R]): js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, R, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("both")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Any, 
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, R, These<E, A>> */ Any
  ]]
  
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](M: Monad1[M], S: Semigroup[E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2[M], S: Semigroup[E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3[M], S: Semigroup[E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, B>> */ Any
    ]
  ]]
  inline def chain[M, E](M: Monad[M], S: Semigroup[E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME, E](M: Monad2C[M, ME], S: Semigroup[E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME, E](M: Monad3C[M, ME], S: Semigroup[E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, B>> */ Any
    ]
  ]]
  
  inline def getTheseM[M](M: Monad[M]): TheseM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheseM")(M.asInstanceOf[js.Any]).asInstanceOf[TheseM[M]]
  inline def getTheseM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): TheseM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheseM")(M.asInstanceOf[js.Any]).asInstanceOf[TheseM1[M]]
  inline def getTheseM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): TheseM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheseM")(M.asInstanceOf[js.Any]).asInstanceOf[TheseM2[M]]
  
  inline def left[F](F: Pointed[F]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Pointed2C[F, FE]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ]]
  inline def left[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Pointed3C[F, FE]): js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ]]
  
  inline def leftF[F](F: Functor[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ]]
  inline def leftF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, E> */ /* fe */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ]]
  
  inline def map[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, B>> */ Any
    ]
  ]]
  
  inline def mapLeft[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<G, A>> */ Any
    ]
  ]]
  inline def mapLeft[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<G, A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* e */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fea */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<G, A>> */ Any
    ]
  ]]
  
  inline def `match`[F](F: Functor[F]): js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, B> */ Any
    ]
  ]]
  inline def `match`[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, R](F: Functor2C[M, R]): js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, R](F: Functor3C[F, R]): js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[/* e */ Any, Any], 
    /* onRight */ js.Function1[/* a */ Any, Any], 
    /* onBoth */ js.Function2[/* e */ Any, /* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, S, R, B> */ Any
    ]
  ]]
  
  inline def matchE[M](M: Chain[M]): js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Chain1[M]): js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Chain2[M]): js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Chain3[M]): js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, ME](M: Chain2C[M, ME]): js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, ME, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, ME](M: Chain3C[M, ME]): js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* onLeft */ js.Function1[
      /* e */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    /* onRight */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    /* onBoth */ js.Function2[
      /* e */ Any, 
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, These<E, A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, ME, B> */ Any
    ]
  ]]
  
  inline def right[F](F: Pointed[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Pointed2C[F, FE]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ]]
  inline def right[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Pointed3C[F, FE]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ]]
  
  inline def rightF[F](F: Functor[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ Any
  ]]
  inline def rightF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ Any
  ]]
  
  inline def swap[F](F: Functor[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<A, E>> */ Any
  ]]
  inline def swap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<A, E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<A, E>> */ Any
  ]]
  
  inline def toTuple2[F](F: Functor[F]): js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ LazyArg[Any], 
    /* a */ LazyArg[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, [E, A]> */ Any
    ]
  ]]
  
  trait TheseM[M] extends StObject {
    
    def bimap[E, A, N, B](fa: TheseT[M, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): TheseT[M, N, B]
    
    def both[E, A](e: E, a: A): TheseT[M, E, A]
    
    def fold[E, A, R](
      fa: TheseT[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ],
      onBoth: js.Function2[
          /* e */ E, 
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ]
    ): Any
    
    def getMonad[E](S: Semigroup[E]): Ap[E, M]
    
    def left[E, A](e: E): TheseT[M, E, A]
    
    def leftM[E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ Any
    ): TheseT[M, E, A]
    
    def map[E, A, B](fa: TheseT[M, E, A], f: js.Function1[/* a */ A, B]): TheseT[M, E, B]
    
    def mapLeft[E, A, N](fa: TheseT[M, E, A], f: js.Function1[/* e */ E, N]): TheseT[M, N, A]
    
    def right[E, A](a: A): TheseT[M, E, A]
    
    def rightM[E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ): TheseT[M, E, A]
    
    def swap[E, A](fa: TheseT[M, E, A]): TheseT[M, A, E]
    
    def toTuple[E, A](fa: TheseT[M, E, A], e: E, a: A): Any
  }
  object TheseM {
    
    inline def apply[M](
      bimap: (TheseT[M, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => TheseT[M, Any, Any],
      both: (Any, Any) => TheseT[M, Any, Any],
      fold: (TheseT[M, Any, Any], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ], js.Function2[
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
        ]) => Any,
      getMonad: Semigroup[Any] => Ap[Any, M],
      left: Any => TheseT[M, Any, Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ Any => TheseT[M, Any, Any],
      map: (TheseT[M, Any, Any], js.Function1[Any, Any]) => TheseT[M, Any, Any],
      mapLeft: (TheseT[M, Any, Any], js.Function1[Any, Any]) => TheseT[M, Any, Any],
      right: Any => TheseT[M, Any, Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any => TheseT[M, Any, Any],
      swap: TheseT[M, Any, Any] => TheseT[M, Any, Any],
      toTuple: (TheseT[M, Any, Any], Any, Any) => Any
    ): TheseM[M] = {
      val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction3(bimap), both = js.Any.fromFunction2(both), fold = js.Any.fromFunction4(fold), getMonad = js.Any.fromFunction1(getMonad), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), right = js.Any.fromFunction1(right), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap), toTuple = js.Any.fromFunction3(toTuple))
      __obj.asInstanceOf[TheseM[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TheseM[?], M] (val x: Self & TheseM[M]) extends AnyVal {
      
      inline def setBimap(
        value: (TheseT[M, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => TheseT[M, Any, Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setBoth(value: (Any, Any) => TheseT[M, Any, Any]): Self = StObject.set(x, "both", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (TheseT[M, Any, Any], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
            ], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
            ], js.Function2[
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ Any
            ]) => Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction4(value))
      
      inline def setGetMonad(value: Semigroup[Any] => Ap[Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setLeft(value: Any => TheseT[M, Any, Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ Any => TheseT[M, Any, Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMap(value: (TheseT[M, Any, Any], js.Function1[Any, Any]) => TheseT[M, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapLeft(value: (TheseT[M, Any, Any], js.Function1[Any, Any]) => TheseT[M, Any, Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setRight(value: Any => TheseT[M, Any, Any]): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any => TheseT[M, Any, Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: TheseT[M, Any, Any] => TheseT[M, Any, Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
      
      inline def setToTuple(value: (TheseT[M, Any, Any], Any, Any) => Any): Self = StObject.set(x, "toTuple", js.Any.fromFunction3(value))
    }
  }
  
  trait TheseM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def bimap[E, A, N, B](fa: TheseT1[M, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): TheseT1[M, N, B]
    
    def both[E, A](e: E, a: A): TheseT1[M, E, A]
    
    def fold[E, A, R](
      fa: TheseT1[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ],
      onBoth: js.Function2[
          /* e */ E, 
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ]
    ): Any
    
    def getMonad[E](S: Semigroup[E]): typings.fpTs.anon.Chain[E, M]
    
    def left[E, A](e: E): TheseT1[M, E, A]
    
    def leftM[E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ Any
    ): TheseT1[M, E, A]
    
    def map[E, A, B](fa: TheseT1[M, E, A], f: js.Function1[/* a */ A, B]): TheseT1[M, E, B]
    
    def mapLeft[E, A, N](fa: TheseT1[M, E, A], f: js.Function1[/* e */ E, N]): TheseT1[M, N, A]
    
    def right[E, A](a: A): TheseT1[M, E, A]
    
    def rightM[E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ): TheseT1[M, E, A]
    
    def swap[E, A](fa: TheseT1[M, E, A]): TheseT1[M, A, E]
    
    def toTuple[E, A](fa: TheseT1[M, E, A], e: E, a: A): Any
  }
  object TheseM1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      bimap: (TheseT1[M, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => TheseT1[M, Any, Any],
      both: (Any, Any) => TheseT1[M, Any, Any],
      fold: (TheseT1[M, Any, Any], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ], js.Function2[
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
        ]) => Any,
      getMonad: Semigroup[Any] => typings.fpTs.anon.Chain[Any, M],
      left: Any => TheseT1[M, Any, Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ Any => TheseT1[M, Any, Any],
      map: (TheseT1[M, Any, Any], js.Function1[Any, Any]) => TheseT1[M, Any, Any],
      mapLeft: (TheseT1[M, Any, Any], js.Function1[Any, Any]) => TheseT1[M, Any, Any],
      right: Any => TheseT1[M, Any, Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any => TheseT1[M, Any, Any],
      swap: TheseT1[M, Any, Any] => TheseT1[M, Any, Any],
      toTuple: (TheseT1[M, Any, Any], Any, Any) => Any
    ): TheseM1[M] = {
      val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction3(bimap), both = js.Any.fromFunction2(both), fold = js.Any.fromFunction4(fold), getMonad = js.Any.fromFunction1(getMonad), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), right = js.Any.fromFunction1(right), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap), toTuple = js.Any.fromFunction3(toTuple))
      __obj.asInstanceOf[TheseM1[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TheseM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] (val x: Self & TheseM1[M]) extends AnyVal {
      
      inline def setBimap(
        value: (TheseT1[M, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => TheseT1[M, Any, Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setBoth(value: (Any, Any) => TheseT1[M, Any, Any]): Self = StObject.set(x, "both", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (TheseT1[M, Any, Any], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
            ], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
            ], js.Function2[
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ Any
            ]) => Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction4(value))
      
      inline def setGetMonad(value: Semigroup[Any] => typings.fpTs.anon.Chain[Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setLeft(value: Any => TheseT1[M, Any, Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ Any => TheseT1[M, Any, Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMap(value: (TheseT1[M, Any, Any], js.Function1[Any, Any]) => TheseT1[M, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapLeft(value: (TheseT1[M, Any, Any], js.Function1[Any, Any]) => TheseT1[M, Any, Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setRight(value: Any => TheseT1[M, Any, Any]): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any => TheseT1[M, Any, Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: TheseT1[M, Any, Any] => TheseT1[M, Any, Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
      
      inline def setToTuple(value: (TheseT1[M, Any, Any], Any, Any) => Any): Self = StObject.set(x, "toTuple", js.Any.fromFunction3(value))
    }
  }
  
  trait TheseM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def bimap[R, E, A, N, B](fa: TheseT2[M, R, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): TheseT2[M, R, N, B]
    
    def both[R, E, A](e: E, a: A): TheseT2[M, R, E, A]
    
    def fold[R, E, A, B](
      fa: TheseT2[M, R, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ],
      onBoth: js.Function2[
          /* e */ E, 
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ]
    ): Any
    
    def getMonad[E](S: Semigroup[E]): Map[E, M]
    
    def left[R, E, A](e: E): TheseT2[M, R, E, A]
    
    def leftM[R, E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ Any
    ): TheseT2[M, R, E, A]
    
    def map[R, E, A, B](fa: TheseT2[M, R, E, A], f: js.Function1[/* a */ A, B]): TheseT2[M, R, E, B]
    
    def mapLeft[R, E, A, N](fa: TheseT2[M, R, E, A], f: js.Function1[/* e */ E, N]): TheseT2[M, R, N, A]
    
    def right[R, E, A](a: A): TheseT2[M, R, E, A]
    
    def rightM[R, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any
    ): TheseT2[M, R, E, A]
    
    def swap[R, E, A](fa: TheseT2[M, R, E, A]): TheseT2[M, R, A, E]
    
    def toTuple[R, E, A](fa: TheseT2[M, R, E, A], e: E, a: A): Any
  }
  object TheseM2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      bimap: (TheseT2[M, Any, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => TheseT2[M, Any, Any, Any],
      both: (Any, Any) => TheseT2[M, Any, Any, Any],
      fold: (TheseT2[M, Any, Any, Any], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ], js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ], js.Function2[
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
        ]) => Any,
      getMonad: Semigroup[Any] => Map[Any, M],
      left: Any => TheseT2[M, Any, Any, Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ Any => TheseT2[M, Any, Any, Any],
      map: (TheseT2[M, Any, Any, Any], js.Function1[Any, Any]) => TheseT2[M, Any, Any, Any],
      mapLeft: (TheseT2[M, Any, Any, Any], js.Function1[Any, Any]) => TheseT2[M, Any, Any, Any],
      right: Any => TheseT2[M, Any, Any, Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any => TheseT2[M, Any, Any, Any],
      swap: TheseT2[M, Any, Any, Any] => TheseT2[M, Any, Any, Any],
      toTuple: (TheseT2[M, Any, Any, Any], Any, Any) => Any
    ): TheseM2[M] = {
      val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction3(bimap), both = js.Any.fromFunction2(both), fold = js.Any.fromFunction4(fold), getMonad = js.Any.fromFunction1(getMonad), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), right = js.Any.fromFunction1(right), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap), toTuple = js.Any.fromFunction3(toTuple))
      __obj.asInstanceOf[TheseM2[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TheseM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] (val x: Self & TheseM2[M]) extends AnyVal {
      
      inline def setBimap(
        value: (TheseT2[M, Any, Any, Any], js.Function1[Any, Any], js.Function1[Any, Any]) => TheseT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setBoth(value: (Any, Any) => TheseT2[M, Any, Any, Any]): Self = StObject.set(x, "both", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (TheseT2[M, Any, Any, Any], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
            ], js.Function1[
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
            ], js.Function2[
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
            ]) => Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction4(value))
      
      inline def setGetMonad(value: Semigroup[Any] => Map[Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setLeft(value: Any => TheseT2[M, Any, Any, Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ Any => TheseT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMap(value: (TheseT2[M, Any, Any, Any], js.Function1[Any, Any]) => TheseT2[M, Any, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapLeft(value: (TheseT2[M, Any, Any, Any], js.Function1[Any, Any]) => TheseT2[M, Any, Any, Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setRight(value: Any => TheseT2[M, Any, Any, Any]): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any => TheseT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: TheseT2[M, Any, Any, Any] => TheseT2[M, Any, Any, Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
      
      inline def setToTuple(value: (TheseT2[M, Any, Any, Any], Any, Any) => Any): Self = StObject.set(x, "toTuple", js.Any.fromFunction3(value))
    }
  }
  
  type TheseT[M, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, A>> */ Any
  
  type TheseT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, A>> */ Any
  
  type TheseT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, R, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, These<E, A>> */ Any
}
