package typings.fpTs.mod

import typings.fpTs.anon.Fn15
import typings.fpTs.anon.Fn16
import typings.fpTs.anon.Fn17
import typings.fpTs.anon.Fn18
import typings.fpTs.anon.Fn19
import typings.fpTs.libApplyMod.Apply
import typings.fpTs.libApplyMod.Apply1
import typings.fpTs.libApplyMod.Apply2
import typings.fpTs.libApplyMod.Apply2C
import typings.fpTs.libApplyMod.Apply3
import typings.fpTs.libApplyMod.Apply3C
import typings.fpTs.libApplyMod.Apply4
import typings.fpTs.libChainMod.Chain
import typings.fpTs.libChainMod.Chain1
import typings.fpTs.libChainMod.Chain2
import typings.fpTs.libChainMod.Chain2C
import typings.fpTs.libChainMod.Chain3
import typings.fpTs.libChainMod.Chain3C
import typings.fpTs.libChainMod.Chain4
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libFunctionMod.Lazy
import typings.fpTs.libFunctorMod.Functor
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libFunctorMod.Functor2C
import typings.fpTs.libFunctorMod.Functor3
import typings.fpTs.libFunctorMod.Functor3C
import typings.fpTs.libFunctorMod.Functor4
import typings.fpTs.libMonadMod.Monad
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonadMod.Monad2
import typings.fpTs.libMonadMod.Monad2C
import typings.fpTs.libMonadMod.Monad3
import typings.fpTs.libMonadMod.Monad3C
import typings.fpTs.libMonadMod.Monad4
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libOptionTMod.OptionM
import typings.fpTs.libOptionTMod.OptionM1
import typings.fpTs.libOptionTMod.OptionM2
import typings.fpTs.libOptionTMod.OptionM2C
import typings.fpTs.libPointedMod.Pointed
import typings.fpTs.libPointedMod.Pointed1
import typings.fpTs.libPointedMod.Pointed2
import typings.fpTs.libPointedMod.Pointed2C
import typings.fpTs.libPointedMod.Pointed3
import typings.fpTs.libPointedMod.Pointed3C
import typings.fpTs.libPointedMod.Pointed4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionT {
  
  @JSImport("fp-ts", "optionT")
  @js.native
  val ^ : js.Any = js.native
  
  inline def alt[M](M: Monad[M]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](M: Monad4[M]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ Any
    ]
  ]]
  inline def alt[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3C[M, E]): js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* first */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ Any
    ]
  ]]
  
  inline def ap[F](F: Apply[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Apply1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Apply2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Apply3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Apply4[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Apply2C[F, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Apply3C[F, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* fa */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<(a : A): B>> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ]]
  
  inline def chain[M](M: Monad[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](M: Monad4[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3C[M, E]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ]
  ]]
  
  inline def chainNullableK[M](M: Monad[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](M: Monad4[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def chainNullableK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3C[M, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  
  inline def chainOptionK[M](M: Monad[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<B>> */ Any
    ]
  ]]
  inline def chainOptionK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<B>> */ Any
    ]
  ]]
  inline def chainOptionK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ]
  ]]
  inline def chainOptionK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ]
  ]]
  inline def chainOptionK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](M: Monad4[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<B>> */ Any
    ]
  ]]
  inline def chainOptionK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<B>> */ Any
    ]
  ]]
  inline def chainOptionK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3C[M, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<B>> */ Any
    ]
  ]]
  
  inline def fromEither[F](F: Pointed[F]): js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ Any
  ]]
  inline def fromEither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ Any
  ]]
  inline def fromEither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ]]
  inline def fromEither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ]]
  inline def fromEither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Pointed4[F]): js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ Any
  ]]
  inline def fromEither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Pointed2C[F, E]): js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ]]
  inline def fromEither[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Pointed3C[F, E]): js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* e */ Either_[Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ]]
  
  inline def fromF[F](F: Functor[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ Any
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ Any
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Functor4[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ Any
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor3C[F, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ]]
  
  inline def fromNullable[F](F: Pointed[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<NonNullable<A>>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<NonNullable<A>>> */ Any
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<NonNullable<A>>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<NonNullable<A>>> */ Any
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<NonNullable<A>>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<NonNullable<A>>> */ Any
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<NonNullable<A>>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<NonNullable<A>>> */ Any
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Pointed4[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<NonNullable<A>>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<NonNullable<A>>> */ Any
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Pointed2C[F, E]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<NonNullable<A>>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<NonNullable<A>>> */ Any
  ]]
  inline def fromNullable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Pointed3C[F, E]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<NonNullable<A>>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<NonNullable<A>>> */ Any
  ]]
  
  inline def fromNullableK[F](F: Pointed[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Pointed4[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Pointed2C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  inline def fromNullableK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Pointed3C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<NonNullable<B>>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<NonNullable<B>>> */ Any
    ]
  ]]
  
  inline def fromOptionK[F](F: Pointed[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
    ]
  ]]
  inline def fromOptionK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
    ]
  ]]
  inline def fromOptionK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ]]
  inline def fromOptionK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ]]
  inline def fromOptionK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Pointed4[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<B>> */ Any
    ]
  ]]
  inline def fromOptionK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Pointed2C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ]]
  inline def fromOptionK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Pointed3C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ]]
  
  inline def fromPredicate[F](F: Pointed[F]): Fn19 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(F.asInstanceOf[js.Any]).asInstanceOf[Fn19]
  inline def fromPredicate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): Fn19 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(F.asInstanceOf[js.Any]).asInstanceOf[Fn19]
  inline def fromPredicate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): Fn18 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(F.asInstanceOf[js.Any]).asInstanceOf[Fn18]
  inline def fromPredicate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): Fn16 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(F.asInstanceOf[js.Any]).asInstanceOf[Fn16]
  inline def fromPredicate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Pointed4[F]): Fn15 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(F.asInstanceOf[js.Any]).asInstanceOf[Fn15]
  inline def fromPredicate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Pointed2C[F, E]): Fn19 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(F.asInstanceOf[js.Any]).asInstanceOf[Fn19]
  inline def fromPredicate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Pointed3C[F, E]): Fn17 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(F.asInstanceOf[js.Any]).asInstanceOf[Fn17]
  
  inline def getOptionM[M](M: Monad[M]): OptionM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM[M]]
  inline def getOptionM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): OptionM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM1[M]]
  inline def getOptionM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): OptionM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM2[M]]
  inline def getOptionM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): OptionM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM2C[M, E]]
  
  inline def getOrElse[M](M: Monad[M]): js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](M: Monad4[M]): js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ]
  ]]
  inline def getOrElse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3C[M, E]): js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onNone */ Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ]
  ]]
  
  inline def map[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Functor4[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor3C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<B>> */ Any
    ]
  ]]
  
  inline def `match`[F](F: Functor[F]): js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Functor4[F]): js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ]]
  inline def `match`[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor3C[F, E]): js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[Any], 
    /* onSome */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ]]
  
  inline def matchE[M](M: Chain[M]): js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Chain1[M]): js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Chain2[M]): js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Chain3[M]): js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](M: Chain4[M]): js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Chain2C[M, E]): js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ]
  ]]
  inline def matchE[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Chain3C[M, E]): js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* onNone */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ], 
    /* onSome */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Option<A>> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ]
  ]]
  
  inline def some[F](F: Pointed[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ Any
  ]]
  inline def some[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ Any
  ]]
  inline def some[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ]]
  inline def some[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ]]
  inline def some[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Pointed4[F]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ Any
  ]]
  inline def some[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Pointed2C[F, E]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ]]
  inline def some[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Pointed3C[F, E]): js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ]]
  
  inline def zero[F](F: Pointed[F]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ Any
  ]]
  inline def zero[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ Any
  ]]
  inline def zero[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ]]
  inline def zero[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ]]
  inline def zero[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Pointed4[F]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, Option<A>> */ Any
  ]]
  inline def zero[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Pointed2C[F, E]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ Any
  ]]
  inline def zero[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Pointed3C[F, E]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ]]
}
