package typings.fpTs.mod

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
import typings.fpTs.libFunctionMod.Lazy
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
import typings.fpTs.libTheseTMod.TheseM
import typings.fpTs.libTheseTMod.TheseM1
import typings.fpTs.libTheseTMod.TheseM2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object theseT {
  
  @JSImport("fp-ts", "theseT")
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
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, [E, A]> */ Any
    ]
  ]]
  inline def toTuple2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, [E, A]> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* e */ Lazy[Any], 
    /* a */ Lazy[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, These<E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, FE, [E, A]> */ Any
    ]
  ]]
}
