package typings.fpTs

import typings.fpTs.libChainMod.Chain
import typings.fpTs.libChainMod.Chain1
import typings.fpTs.libChainMod.Chain2
import typings.fpTs.libChainMod.Chain2C
import typings.fpTs.libChainMod.Chain3
import typings.fpTs.libChainMod.Chain3C
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
import typings.fpTs.libStateMod.State_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateTMod {
  
  @JSImport("fp-ts/lib/StateT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ap[M](M: Chain[M]): js.Function1[
    /* fa */ StateT[M, Any, Any], 
    js.Function1[/* fab */ StateT[M, Any, js.Function1[/* a */ Any, Any]], StateT[M, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateT[M, Any, Any], 
    js.Function1[/* fab */ StateT[M, Any, js.Function1[/* a */ Any, Any]], StateT[M, Any, Any]]
  ]]
  inline def ap[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Chain1[M]): js.Function1[
    /* fa */ StateT1[M, Any, Any], 
    js.Function1[/* fab */ StateT1[M, Any, js.Function1[/* a */ Any, Any]], StateT1[M, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateT1[M, Any, Any], 
    js.Function1[/* fab */ StateT1[M, Any, js.Function1[/* a */ Any, Any]], StateT1[M, Any, Any]]
  ]]
  inline def ap[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Chain2[M]): js.Function1[
    /* fa */ StateT2[M, Any, Any, Any], 
    js.Function1[
      /* fab */ StateT2[M, Any, Any, js.Function1[/* a */ Any, Any]], 
      StateT2[M, Any, Any, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateT2[M, Any, Any, Any], 
    js.Function1[
      /* fab */ StateT2[M, Any, Any, js.Function1[/* a */ Any, Any]], 
      StateT2[M, Any, Any, Any]
    ]
  ]]
  inline def ap[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Chain3[M]): js.Function1[
    /* fa */ StateT3[M, Any, Any, Any, Any], 
    js.Function1[
      /* fab */ StateT3[M, Any, Any, Any, js.Function1[/* a */ Any, Any]], 
      StateT3[M, Any, Any, Any, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateT3[M, Any, Any, Any, Any], 
    js.Function1[
      /* fab */ StateT3[M, Any, Any, Any, js.Function1[/* a */ Any, Any]], 
      StateT3[M, Any, Any, Any, Any]
    ]
  ]]
  inline def ap[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Chain2C[M, E]): js.Function1[
    /* fa */ StateT2[M, Any, E, Any], 
    js.Function1[
      /* fab */ StateT2[M, Any, E, js.Function1[/* a */ Any, Any]], 
      StateT2[M, Any, E, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateT2[M, Any, E, Any], 
    js.Function1[
      /* fab */ StateT2[M, Any, E, js.Function1[/* a */ Any, Any]], 
      StateT2[M, Any, E, Any]
    ]
  ]]
  inline def ap[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Chain3C[M, E]): js.Function1[
    /* fa */ StateT3[M, Any, Any, E, Any], 
    js.Function1[
      /* fab */ StateT3[M, Any, Any, E, js.Function1[/* a */ Any, Any]], 
      StateT3[M, Any, Any, E, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateT3[M, Any, Any, E, Any], 
    js.Function1[
      /* fab */ StateT3[M, Any, Any, E, js.Function1[/* a */ Any, Any]], 
      StateT3[M, Any, Any, E, Any]
    ]
  ]]
  
  inline def chain[M](M: Chain[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT[M, Any, Any]], 
    js.Function1[/* ma */ StateT[M, Any, Any], StateT[M, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT[M, Any, Any]], 
    js.Function1[/* ma */ StateT[M, Any, Any], StateT[M, Any, Any]]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Chain1[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT1[M, Any, Any]], 
    js.Function1[/* ma */ StateT1[M, Any, Any], StateT1[M, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT1[M, Any, Any]], 
    js.Function1[/* ma */ StateT1[M, Any, Any], StateT1[M, Any, Any]]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Chain2[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT2[M, Any, Any, Any]], 
    js.Function1[/* ma */ StateT2[M, Any, Any, Any], StateT2[M, Any, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT2[M, Any, Any, Any]], 
    js.Function1[/* ma */ StateT2[M, Any, Any, Any], StateT2[M, Any, Any, Any]]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Chain3[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT3[M, Any, Any, Any, Any]], 
    js.Function1[/* ma */ StateT3[M, Any, Any, Any, Any], StateT3[M, Any, Any, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT3[M, Any, Any, Any, Any]], 
    js.Function1[/* ma */ StateT3[M, Any, Any, Any, Any], StateT3[M, Any, Any, Any, Any]]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Chain2C[M, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT2[M, Any, E, Any]], 
    js.Function1[/* ma */ StateT2[M, Any, E, Any], StateT2[M, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT2[M, Any, E, Any]], 
    js.Function1[/* ma */ StateT2[M, Any, E, Any], StateT2[M, Any, E, Any]]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Chain3C[M, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT3[M, Any, Any, E, Any]], 
    js.Function1[/* ma */ StateT3[M, Any, Any, E, Any], StateT3[M, Any, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, StateT3[M, Any, Any, E, Any]], 
    js.Function1[/* ma */ StateT3[M, Any, Any, E, Any], StateT3[M, Any, Any, E, Any]]
  ]]
  
  inline def evaluate[F](F: Functor[F]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT[F, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT[F, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ]
  ]]
  inline def evaluate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT1[F, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT1[F, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ]
  ]]
  inline def evaluate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT2[F, Any, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT2[F, Any, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ]
  ]]
  inline def evaluate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT3[F, Any, Any, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT3[F, Any, Any, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ]
  ]]
  inline def evaluate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT2[F, Any, E, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT2[F, Any, E, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ]
  ]]
  inline def evaluate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor3C[F, E]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT3[F, Any, Any, E, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT3[F, Any, Any, E, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ]
  ]]
  
  inline def execute[F](F: Functor[F]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT[F, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT[F, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
    ]
  ]]
  inline def execute[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT1[F, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT1[F, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
    ]
  ]]
  inline def execute[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT2[F, Any, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT2[F, Any, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
    ]
  ]]
  inline def execute[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT3[F, Any, Any, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT3[F, Any, Any, Any, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
    ]
  ]]
  inline def execute[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT2[F, Any, E, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT2[F, Any, E, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
    ]
  ]]
  inline def execute[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor3C[F, E]): js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT3[F, Any, Any, E, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* s */ Any, 
    js.Function1[
      /* ma */ StateT3[F, Any, Any, E, Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
    ]
  ]]
  
  inline def fromF[F](F: Functor[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* ma */ Any, 
    StateT[F, Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* ma */ Any, 
    StateT[F, Any, Any]
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* ma */ Any, 
    StateT1[F, Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* ma */ Any, 
    StateT1[F, Any, Any]
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    StateT2[F, Any, Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    StateT2[F, Any, Any, Any]
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    StateT3[F, Any, Any, Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    StateT3[F, Any, Any, Any, Any]
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    StateT2[F, Any, E, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    StateT2[F, Any, E, Any]
  ]]
  inline def fromF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor3C[F, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    StateT3[F, Any, Any, E, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    StateT3[F, Any, Any, E, Any]
  ]]
  
  inline def fromState[F](F: Pointed[F]): js.Function1[/* sa */ State_[Any, Any], StateT[F, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromState")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ State_[Any, Any], StateT[F, Any, Any]]]
  inline def fromState[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[/* sa */ State_[Any, Any], StateT1[F, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromState")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ State_[Any, Any], StateT1[F, Any, Any]]]
  inline def fromState[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[/* sa */ State_[Any, Any], StateT2[F, Any, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromState")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ State_[Any, Any], StateT2[F, Any, Any, Any]]]
  inline def fromState[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[/* sa */ State_[Any, Any], StateT3[F, Any, Any, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromState")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ State_[Any, Any], StateT3[F, Any, Any, Any, Any]]]
  inline def fromState[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Pointed2C[F, E]): js.Function1[/* sa */ State_[Any, Any], StateT2[F, Any, E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromState")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ State_[Any, Any], StateT2[F, Any, E, Any]]]
  inline def fromState[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Pointed3C[F, E]): js.Function1[/* sa */ State_[Any, Any], StateT3[F, Any, Any, E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromState")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ State_[Any, Any], StateT3[F, Any, Any, E, Any]]]
  
  inline def getStateM[M](M: Monad[M]): StateM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM[M]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): StateM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM1[M]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): StateM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM2[M]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): StateM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM3[M]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): StateM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM2C[M, E]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3C[M, E]): StateM3C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM3C[M, E]]
  
  inline def map[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT[F, Any, Any], StateT[F, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT[F, Any, Any], StateT[F, Any, Any]]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT1[F, Any, Any], StateT1[F, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT1[F, Any, Any], StateT1[F, Any, Any]]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT2[F, Any, Any, Any], StateT2[F, Any, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT2[F, Any, Any, Any], StateT2[F, Any, Any, Any]]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT3[F, Any, Any, Any, Any], StateT3[F, Any, Any, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT3[F, Any, Any, Any, Any], StateT3[F, Any, Any, Any, Any]]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT2[F, Any, E, Any], StateT2[F, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT2[F, Any, E, Any], StateT2[F, Any, E, Any]]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor3C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT3[F, Any, Any, E, Any], StateT3[F, Any, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* fa */ StateT3[F, Any, Any, E, Any], StateT3[F, Any, Any, E, Any]]
  ]]
  
  inline def of[F](F: Pointed[F]): js.Function1[/* a */ Any, StateT[F, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, StateT[F, Any, Any]]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[/* a */ Any, StateT1[F, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, StateT1[F, Any, Any]]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[/* a */ Any, StateT2[F, Any, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, StateT2[F, Any, Any, Any]]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[/* a */ Any, StateT3[F, Any, Any, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, StateT3[F, Any, Any, Any, Any]]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Pointed2C[F, E]): js.Function1[/* a */ Any, StateT2[F, Any, E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, StateT2[F, Any, E, Any]]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Pointed3C[F, E]): js.Function1[/* a */ Any, StateT3[F, Any, Any, E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, StateT3[F, Any, Any, E, Any]]]
  
  trait StateM[M] extends StObject {
    
    def ap[S, A, B](fab: StateT[M, S, js.Function1[/* a */ A, B]], fa: StateT[M, S, A]): StateT[M, S, B]
    
    def chain[S, A, B](fa: StateT[M, S, A], f: js.Function1[/* a */ A, StateT[M, S, B]]): StateT[M, S, B]
    
    def evalState[S, A](ma: StateT[M, S, A], s: S): Any
    
    def execState[S, A](ma: StateT[M, S, A], s: S): Any
    
    def fromM[S, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ): StateT[M, S, A]
    
    def fromState[S, A](fa: State_[S, A]): StateT[M, S, A]
    
    def get[S](): StateT[M, S, S]
    
    def gets[S, A](f: js.Function1[/* s */ S, A]): StateT[M, S, A]
    
    def map[S, A, B](fa: StateT[M, S, A], f: js.Function1[/* a */ A, B]): StateT[M, S, B]
    
    def modify[S](f: js.Function1[/* s */ S, S]): StateT[M, S, Unit]
    
    def of[S, A](a: A): StateT[M, S, A]
    
    def put[S](s: S): StateT[M, S, Unit]
  }
  object StateM {
    
    inline def apply[M](
      ap: (StateT[M, Any, js.Function1[Any, Any]], StateT[M, Any, Any]) => StateT[M, Any, Any],
      chain: (StateT[M, Any, Any], js.Function1[Any, StateT[M, Any, Any]]) => StateT[M, Any, Any],
      evalState: (StateT[M, Any, Any], Any) => Any,
      execState: (StateT[M, Any, Any], Any) => Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any => StateT[M, Any, Any],
      fromState: State_[Any, Any] => StateT[M, Any, Any],
      get: () => StateT[M, Any, Any],
      gets: js.Function1[Any, Any] => StateT[M, Any, Any],
      map: (StateT[M, Any, Any], js.Function1[Any, Any]) => StateT[M, Any, Any],
      modify: js.Function1[Any, Any] => StateT[M, Any, Unit],
      of: Any => StateT[M, Any, Any],
      put: Any => StateT[M, Any, Unit]
    ): StateM[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM[M]]
    }
    
    extension [Self <: StateM[?], M](x: Self & StateM[M]) {
      
      inline def setAp(value: (StateT[M, Any, js.Function1[Any, Any]], StateT[M, Any, Any]) => StateT[M, Any, Any]): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(value: (StateT[M, Any, Any], js.Function1[Any, StateT[M, Any, Any]]) => StateT[M, Any, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT[M, Any, Any], Any) => Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT[M, Any, Any], Any) => Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any => StateT[M, Any, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[Any, Any] => StateT[M, Any, Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT[M, Any, Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[Any, Any] => StateT[M, Any, Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(value: (StateT[M, Any, Any], js.Function1[Any, Any]) => StateT[M, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[Any, Any] => StateT[M, Any, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: Any => StateT[M, Any, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: Any => StateT[M, Any, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def ap[S, A, B](fab: StateT1[M, S, js.Function1[/* a */ A, B]], fa: StateT1[M, S, A]): StateT1[M, S, B]
    
    def chain[S, A, B](fa: StateT1[M, S, A], f: js.Function1[/* a */ A, StateT1[M, S, B]]): StateT1[M, S, B]
    
    def evalState[S, A](ma: StateT1[M, S, A], s: S): Any
    
    def execState[S, A](ma: StateT1[M, S, A], s: S): Any
    
    def fromM[S, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ): StateT1[M, S, A]
    
    def fromState[S, A](fa: State_[S, A]): StateT1[M, S, A]
    
    def get[S](): StateT1[M, S, S]
    
    def gets[S, A](f: js.Function1[/* s */ S, A]): StateT1[M, S, A]
    
    def map[S, A, B](fa: StateT1[M, S, A], f: js.Function1[/* a */ A, B]): StateT1[M, S, B]
    
    def modify[S](f: js.Function1[/* s */ S, S]): StateT1[M, S, Unit]
    
    def of[S, A](a: A): StateT1[M, S, A]
    
    def put[S](s: S): StateT1[M, S, Unit]
  }
  object StateM1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      ap: (StateT1[M, Any, js.Function1[Any, Any]], StateT1[M, Any, Any]) => StateT1[M, Any, Any],
      chain: (StateT1[M, Any, Any], js.Function1[Any, StateT1[M, Any, Any]]) => StateT1[M, Any, Any],
      evalState: (StateT1[M, Any, Any], Any) => Any,
      execState: (StateT1[M, Any, Any], Any) => Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any => StateT1[M, Any, Any],
      fromState: State_[Any, Any] => StateT1[M, Any, Any],
      get: () => StateT1[M, Any, Any],
      gets: js.Function1[Any, Any] => StateT1[M, Any, Any],
      map: (StateT1[M, Any, Any], js.Function1[Any, Any]) => StateT1[M, Any, Any],
      modify: js.Function1[Any, Any] => StateT1[M, Any, Unit],
      of: Any => StateT1[M, Any, Any],
      put: Any => StateT1[M, Any, Unit]
    ): StateM1[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM1[M]]
    }
    
    extension [Self <: StateM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & StateM1[M]) {
      
      inline def setAp(value: (StateT1[M, Any, js.Function1[Any, Any]], StateT1[M, Any, Any]) => StateT1[M, Any, Any]): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(value: (StateT1[M, Any, Any], js.Function1[Any, StateT1[M, Any, Any]]) => StateT1[M, Any, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT1[M, Any, Any], Any) => Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT1[M, Any, Any], Any) => Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any => StateT1[M, Any, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[Any, Any] => StateT1[M, Any, Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT1[M, Any, Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[Any, Any] => StateT1[M, Any, Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(value: (StateT1[M, Any, Any], js.Function1[Any, Any]) => StateT1[M, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[Any, Any] => StateT1[M, Any, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: Any => StateT1[M, Any, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: Any => StateT1[M, Any, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def ap[S, E, A, B](fab: StateT2[M, S, E, js.Function1[/* a */ A, B]], fa: StateT2[M, S, E, A]): StateT2[M, S, E, B]
    
    def chain[S, E, A, B](fa: StateT2[M, S, E, A], f: js.Function1[/* a */ A, StateT2[M, S, E, B]]): StateT2[M, S, E, B]
    
    def evalState[S, E, A](ma: StateT2[M, S, E, A], s: S): Any
    
    def execState[S, E, A](ma: StateT2[M, S, E, A], s: S): Any
    
    def fromM[S, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ): StateT2[M, S, E, A]
    
    def fromState[S, E, A](fa: State_[S, A]): StateT2[M, S, E, A]
    
    def get[E, S](): StateT2[M, S, E, S]
    
    def gets[S, E, A](f: js.Function1[/* s */ S, A]): StateT2[M, S, E, A]
    
    def map[S, E, A, B](fa: StateT2[M, S, E, A], f: js.Function1[/* a */ A, B]): StateT2[M, S, E, B]
    
    def modify[E, S](f: js.Function1[/* s */ S, S]): StateT2[M, S, E, Unit]
    
    def of[S, E, A](a: A): StateT2[M, S, E, A]
    
    def put[E, S](s: S): StateT2[M, S, E, Unit]
  }
  object StateM2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      ap: (StateT2[M, Any, Any, js.Function1[Any, Any]], StateT2[M, Any, Any, Any]) => StateT2[M, Any, Any, Any],
      chain: (StateT2[M, Any, Any, Any], js.Function1[Any, StateT2[M, Any, Any, Any]]) => StateT2[M, Any, Any, Any],
      evalState: (StateT2[M, Any, Any, Any], Any) => Any,
      execState: (StateT2[M, Any, Any, Any], Any) => Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any => StateT2[M, Any, Any, Any],
      fromState: State_[Any, Any] => StateT2[M, Any, Any, Any],
      get: () => StateT2[M, Any, Any, Any],
      gets: js.Function1[Any, Any] => StateT2[M, Any, Any, Any],
      map: (StateT2[M, Any, Any, Any], js.Function1[Any, Any]) => StateT2[M, Any, Any, Any],
      modify: js.Function1[Any, Any] => StateT2[M, Any, Any, Unit],
      of: Any => StateT2[M, Any, Any, Any],
      put: Any => StateT2[M, Any, Any, Unit]
    ): StateM2[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM2[M]]
    }
    
    extension [Self <: StateM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & StateM2[M]) {
      
      inline def setAp(
        value: (StateT2[M, Any, Any, js.Function1[Any, Any]], StateT2[M, Any, Any, Any]) => StateT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT2[M, Any, Any, Any], js.Function1[Any, StateT2[M, Any, Any, Any]]) => StateT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT2[M, Any, Any, Any], Any) => Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT2[M, Any, Any, Any], Any) => Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any => StateT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[Any, Any] => StateT2[M, Any, Any, Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT2[M, Any, Any, Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[Any, Any] => StateT2[M, Any, Any, Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(value: (StateT2[M, Any, Any, Any], js.Function1[Any, Any]) => StateT2[M, Any, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[Any, Any] => StateT2[M, Any, Any, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: Any => StateT2[M, Any, Any, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: Any => StateT2[M, Any, Any, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    def ap[S, A, B](fab: StateT2[M, S, E, js.Function1[/* a */ A, B]], fa: StateT2[M, S, E, A]): StateT2[M, S, E, B]
    
    def chain[S, A, B](fa: StateT2[M, S, E, A], f: js.Function1[/* a */ A, StateT2[M, S, E, B]]): StateT2[M, S, E, B]
    
    def evalState[S, A](ma: StateT2[M, S, E, A], s: S): Any
    
    def execState[S, A](ma: StateT2[M, S, E, A], s: S): Any
    
    def fromM[S, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ): StateT2[M, S, E, A]
    
    def fromState[S, A](fa: State_[S, A]): StateT2[M, S, E, A]
    
    def get[S](): StateT2[M, S, E, S]
    
    def gets[S, A](f: js.Function1[/* s */ S, A]): StateT2[M, S, E, A]
    
    def map[S, A, B](fa: StateT2[M, S, E, A], f: js.Function1[/* a */ A, B]): StateT2[M, S, E, B]
    
    def modify[S](f: js.Function1[/* s */ S, S]): StateT2[M, S, E, Unit]
    
    def of[S, A](a: A): StateT2[M, S, E, A]
    
    def put[S](s: S): StateT2[M, S, E, Unit]
  }
  object StateM2C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      ap: (StateT2[M, Any, E, js.Function1[Any, Any]], StateT2[M, Any, E, Any]) => StateT2[M, Any, E, Any],
      chain: (StateT2[M, Any, E, Any], js.Function1[Any, StateT2[M, Any, E, Any]]) => StateT2[M, Any, E, Any],
      evalState: (StateT2[M, Any, E, Any], Any) => Any,
      execState: (StateT2[M, Any, E, Any], Any) => Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any => StateT2[M, Any, E, Any],
      fromState: State_[Any, Any] => StateT2[M, Any, E, Any],
      get: () => StateT2[M, Any, E, Any],
      gets: js.Function1[Any, Any] => StateT2[M, Any, E, Any],
      map: (StateT2[M, Any, E, Any], js.Function1[Any, Any]) => StateT2[M, Any, E, Any],
      modify: js.Function1[Any, Any] => StateT2[M, Any, E, Unit],
      of: Any => StateT2[M, Any, E, Any],
      put: Any => StateT2[M, Any, E, Unit]
    ): StateM2C[M, E] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM2C[M, E]]
    }
    
    extension [Self <: StateM2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (StateM2C[M, E])) {
      
      inline def setAp(
        value: (StateT2[M, Any, E, js.Function1[Any, Any]], StateT2[M, Any, E, Any]) => StateT2[M, Any, E, Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT2[M, Any, E, Any], js.Function1[Any, StateT2[M, Any, E, Any]]) => StateT2[M, Any, E, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT2[M, Any, E, Any], Any) => Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT2[M, Any, E, Any], Any) => Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any => StateT2[M, Any, E, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[Any, Any] => StateT2[M, Any, E, Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT2[M, Any, E, Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[Any, Any] => StateT2[M, Any, E, Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(value: (StateT2[M, Any, E, Any], js.Function1[Any, Any]) => StateT2[M, Any, E, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[Any, Any] => StateT2[M, Any, E, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: Any => StateT2[M, Any, E, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: Any => StateT2[M, Any, E, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    def ap[S, R, E, A, B](fab: StateT3[M, S, R, E, js.Function1[/* a */ A, B]], fa: StateT3[M, S, R, E, A]): StateT3[M, S, R, E, B]
    
    def chain[S, R, E, A, B](fa: StateT3[M, S, R, E, A], f: js.Function1[/* a */ A, StateT3[M, S, R, E, B]]): StateT3[M, S, R, E, B]
    
    def evalState[S, R, E, A](ma: StateT3[M, S, R, E, A], s: S): Any
    
    def execState[S, R, E, A](ma: StateT3[M, S, R, E, A], s: S): Any
    
    def fromM[S, R, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ): StateT3[M, S, R, E, A]
    
    def fromState[S, R, E, A](fa: State_[S, A]): StateT3[M, S, R, E, A]
    
    def get[R, E, S](): StateT3[M, S, R, E, S]
    
    def gets[S, R, E, A](f: js.Function1[/* s */ S, A]): StateT3[M, S, R, E, A]
    
    def map[S, R, E, A, B](fa: StateT3[M, S, R, E, A], f: js.Function1[/* a */ A, B]): StateT3[M, S, R, E, B]
    
    def modify[R, E, S](f: js.Function1[/* s */ S, S]): StateT3[M, S, R, E, Unit]
    
    def of[S, R, E, A](a: A): StateT3[M, S, R, E, A]
    
    def put[R, E, S](s: S): StateT3[M, S, R, E, Unit]
  }
  object StateM3 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      ap: (StateT3[M, Any, Any, Any, js.Function1[Any, Any]], StateT3[M, Any, Any, Any, Any]) => StateT3[M, Any, Any, Any, Any],
      chain: (StateT3[M, Any, Any, Any, Any], js.Function1[Any, StateT3[M, Any, Any, Any, Any]]) => StateT3[M, Any, Any, Any, Any],
      evalState: (StateT3[M, Any, Any, Any, Any], Any) => Any,
      execState: (StateT3[M, Any, Any, Any, Any], Any) => Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any => StateT3[M, Any, Any, Any, Any],
      fromState: State_[Any, Any] => StateT3[M, Any, Any, Any, Any],
      get: () => StateT3[M, Any, Any, Any, Any],
      gets: js.Function1[Any, Any] => StateT3[M, Any, Any, Any, Any],
      map: (StateT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => StateT3[M, Any, Any, Any, Any],
      modify: js.Function1[Any, Any] => StateT3[M, Any, Any, Any, Unit],
      of: Any => StateT3[M, Any, Any, Any, Any],
      put: Any => StateT3[M, Any, Any, Any, Unit]
    ): StateM3[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM3[M]]
    }
    
    extension [Self <: StateM3[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & StateM3[M]) {
      
      inline def setAp(
        value: (StateT3[M, Any, Any, Any, js.Function1[Any, Any]], StateT3[M, Any, Any, Any, Any]) => StateT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT3[M, Any, Any, Any, Any], js.Function1[Any, StateT3[M, Any, Any, Any, Any]]) => StateT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT3[M, Any, Any, Any, Any], Any) => Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT3[M, Any, Any, Any, Any], Any) => Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any => StateT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[Any, Any] => StateT3[M, Any, Any, Any, Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT3[M, Any, Any, Any, Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[Any, Any] => StateT3[M, Any, Any, Any, Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(value: (StateT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => StateT3[M, Any, Any, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[Any, Any] => StateT3[M, Any, Any, Any, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: Any => StateT3[M, Any, Any, Any, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: Any => StateT3[M, Any, Any, Any, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM3C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] extends StObject {
    
    def ap[S, R, A, B](fab: StateT3[M, S, R, E, js.Function1[/* a */ A, B]], fa: StateT3[M, S, R, E, A]): StateT3[M, S, R, E, B]
    
    def chain[S, R, A, B](fa: StateT3[M, S, R, E, A], f: js.Function1[/* a */ A, StateT3[M, S, R, E, B]]): StateT3[M, S, R, E, B]
    
    def evalState[S, R, A](ma: StateT3[M, S, R, E, A], s: S): Any
    
    def execState[S, R, A](ma: StateT3[M, S, R, E, A], s: S): Any
    
    def fromM[S, R, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ): StateT3[M, S, R, E, A]
    
    def fromState[S, R, A](fa: State_[S, A]): StateT3[M, S, R, E, A]
    
    def get[R, S](): StateT3[M, S, R, E, S]
    
    def gets[S, R, A](f: js.Function1[/* s */ S, A]): StateT3[M, S, R, E, A]
    
    def map[S, R, A, B](fa: StateT3[M, S, R, E, A], f: js.Function1[/* a */ A, B]): StateT3[M, S, R, E, B]
    
    def modify[R, S](f: js.Function1[/* s */ S, S]): StateT3[M, S, R, E, Unit]
    
    def of[S, R, A](a: A): StateT3[M, S, R, E, A]
    
    def put[R, S](s: S): StateT3[M, S, R, E, Unit]
  }
  object StateM3C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
      ap: (StateT3[M, Any, Any, E, js.Function1[Any, Any]], StateT3[M, Any, Any, E, Any]) => StateT3[M, Any, Any, E, Any],
      chain: (StateT3[M, Any, Any, E, Any], js.Function1[Any, StateT3[M, Any, Any, E, Any]]) => StateT3[M, Any, Any, E, Any],
      evalState: (StateT3[M, Any, Any, E, Any], Any) => Any,
      execState: (StateT3[M, Any, Any, E, Any], Any) => Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any => StateT3[M, Any, Any, E, Any],
      fromState: State_[Any, Any] => StateT3[M, Any, Any, E, Any],
      get: () => StateT3[M, Any, Any, E, Any],
      gets: js.Function1[Any, Any] => StateT3[M, Any, Any, E, Any],
      map: (StateT3[M, Any, Any, E, Any], js.Function1[Any, Any]) => StateT3[M, Any, Any, E, Any],
      modify: js.Function1[Any, Any] => StateT3[M, Any, Any, E, Unit],
      of: Any => StateT3[M, Any, Any, E, Any],
      put: Any => StateT3[M, Any, Any, E, Unit]
    ): StateM3C[M, E] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM3C[M, E]]
    }
    
    extension [Self <: StateM3C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (StateM3C[M, E])) {
      
      inline def setAp(
        value: (StateT3[M, Any, Any, E, js.Function1[Any, Any]], StateT3[M, Any, Any, E, Any]) => StateT3[M, Any, Any, E, Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT3[M, Any, Any, E, Any], js.Function1[Any, StateT3[M, Any, Any, E, Any]]) => StateT3[M, Any, Any, E, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT3[M, Any, Any, E, Any], Any) => Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT3[M, Any, Any, E, Any], Any) => Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any => StateT3[M, Any, Any, E, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[Any, Any] => StateT3[M, Any, Any, E, Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT3[M, Any, Any, E, Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[Any, Any] => StateT3[M, Any, Any, E, Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(value: (StateT3[M, Any, Any, E, Any], js.Function1[Any, Any]) => StateT3[M, Any, Any, E, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[Any, Any] => StateT3[M, Any, Any, E, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: Any => StateT3[M, Any, Any, E, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: Any => StateT3[M, Any, Any, E, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  type StateT[M, S, A] = js.Function1[
    /* s */ S, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, S]> */ Any
  ]
  
  type StateT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, S, A] = js.Function1[
    /* s */ S, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, S]> */ Any
  ]
  
  type StateT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, S, E, A] = js.Function1[
    /* s */ S, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, S]> */ Any
  ]
  
  type StateT3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, S, R, E, A] = js.Function1[
    /* s */ S, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, S]> */ Any
  ]
}
