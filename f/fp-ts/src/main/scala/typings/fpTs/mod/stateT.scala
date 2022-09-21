package typings.fpTs.mod

import typings.fpTs.chainMod.Chain
import typings.fpTs.chainMod.Chain1
import typings.fpTs.chainMod.Chain2
import typings.fpTs.chainMod.Chain2C
import typings.fpTs.chainMod.Chain3
import typings.fpTs.chainMod.Chain3C
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
import typings.fpTs.stateMod.State_
import typings.fpTs.stateTMod.StateM
import typings.fpTs.stateTMod.StateM1
import typings.fpTs.stateTMod.StateM2
import typings.fpTs.stateTMod.StateM2C
import typings.fpTs.stateTMod.StateM3
import typings.fpTs.stateTMod.StateM3C
import typings.fpTs.stateTMod.StateT
import typings.fpTs.stateTMod.StateT1
import typings.fpTs.stateTMod.StateT2
import typings.fpTs.stateTMod.StateT3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateT {
  
  @JSImport("fp-ts", "stateT")
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
}
