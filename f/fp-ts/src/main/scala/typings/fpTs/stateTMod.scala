package typings.fpTs

import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.monadMod.Monad3C
import typings.fpTs.stateMod.State_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateTMod {
  
  @JSImport("fp-ts/lib/StateT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStateM[M](M: Monad[M]): StateM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM[M]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): StateM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM1[M]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): StateM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM2[M]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](M: Monad3[M]): StateM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM3[M]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): StateM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM2C[M, E]]
  inline def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](M: Monad3C[M, E]): StateM3C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM3C[M, E]]
  
  trait StateM[M] extends StObject {
    
    def ap[S, A, B](fab: StateT[M, S, js.Function1[/* a */ A, B]], fa: StateT[M, S, A]): StateT[M, S, B]
    
    def chain[S, A, B](fa: StateT[M, S, A], f: js.Function1[/* a */ A, StateT[M, S, B]]): StateT[M, S, B]
    
    def evalState[S, A](ma: StateT[M, S, A], s: S): js.Any
    
    def execState[S, A](ma: StateT[M, S, A], s: S): js.Any
    
    def fromM[S, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
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
      ap: (StateT[M, js.Any, js.Function1[js.Any, js.Any]], StateT[M, js.Any, js.Any]) => StateT[M, js.Any, js.Any],
      chain: (StateT[M, js.Any, js.Any], js.Function1[js.Any, StateT[M, js.Any, js.Any]]) => StateT[M, js.Any, js.Any],
      evalState: (StateT[M, js.Any, js.Any], js.Any) => js.Any,
      execState: (StateT[M, js.Any, js.Any], js.Any) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => StateT[M, js.Any, js.Any],
      fromState: State_[js.Any, js.Any] => StateT[M, js.Any, js.Any],
      get: () => StateT[M, js.Any, js.Any],
      gets: js.Function1[js.Any, js.Any] => StateT[M, js.Any, js.Any],
      map: (StateT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => StateT[M, js.Any, js.Any],
      modify: js.Function1[js.Any, js.Any] => StateT[M, js.Any, Unit],
      of: js.Any => StateT[M, js.Any, js.Any],
      put: js.Any => StateT[M, js.Any, Unit]
    ): StateM[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM[M]]
    }
    
    extension [Self <: StateM[?], M](x: Self & StateM[M]) {
      
      inline def setAp(
        value: (StateT[M, js.Any, js.Function1[js.Any, js.Any]], StateT[M, js.Any, js.Any]) => StateT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT[M, js.Any, js.Any], js.Function1[js.Any, StateT[M, js.Any, js.Any]]) => StateT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT[M, js.Any, js.Any], js.Any) => js.Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT[M, js.Any, js.Any], js.Any) => js.Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => StateT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[js.Any, js.Any] => StateT[M, js.Any, js.Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT[M, js.Any, js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[js.Any, js.Any] => StateT[M, js.Any, js.Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(value: (StateT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => StateT[M, js.Any, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[js.Any, js.Any] => StateT[M, js.Any, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: js.Any => StateT[M, js.Any, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: js.Any => StateT[M, js.Any, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def ap[S, A, B](fab: StateT1[M, S, js.Function1[/* a */ A, B]], fa: StateT1[M, S, A]): StateT1[M, S, B]
    
    def chain[S, A, B](fa: StateT1[M, S, A], f: js.Function1[/* a */ A, StateT1[M, S, B]]): StateT1[M, S, B]
    
    def evalState[S, A](ma: StateT1[M, S, A], s: S): js.Any
    
    def execState[S, A](ma: StateT1[M, S, A], s: S): js.Any
    
    def fromM[S, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
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
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      ap: (StateT1[M, js.Any, js.Function1[js.Any, js.Any]], StateT1[M, js.Any, js.Any]) => StateT1[M, js.Any, js.Any],
      chain: (StateT1[M, js.Any, js.Any], js.Function1[js.Any, StateT1[M, js.Any, js.Any]]) => StateT1[M, js.Any, js.Any],
      evalState: (StateT1[M, js.Any, js.Any], js.Any) => js.Any,
      execState: (StateT1[M, js.Any, js.Any], js.Any) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => StateT1[M, js.Any, js.Any],
      fromState: State_[js.Any, js.Any] => StateT1[M, js.Any, js.Any],
      get: () => StateT1[M, js.Any, js.Any],
      gets: js.Function1[js.Any, js.Any] => StateT1[M, js.Any, js.Any],
      map: (StateT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => StateT1[M, js.Any, js.Any],
      modify: js.Function1[js.Any, js.Any] => StateT1[M, js.Any, Unit],
      of: js.Any => StateT1[M, js.Any, js.Any],
      put: js.Any => StateT1[M, js.Any, Unit]
    ): StateM1[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM1[M]]
    }
    
    extension [Self <: StateM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](x: Self & StateM1[M]) {
      
      inline def setAp(
        value: (StateT1[M, js.Any, js.Function1[js.Any, js.Any]], StateT1[M, js.Any, js.Any]) => StateT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT1[M, js.Any, js.Any], js.Function1[js.Any, StateT1[M, js.Any, js.Any]]) => StateT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT1[M, js.Any, js.Any], js.Any) => js.Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT1[M, js.Any, js.Any], js.Any) => js.Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => StateT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[js.Any, js.Any] => StateT1[M, js.Any, js.Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT1[M, js.Any, js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[js.Any, js.Any] => StateT1[M, js.Any, js.Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(value: (StateT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => StateT1[M, js.Any, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[js.Any, js.Any] => StateT1[M, js.Any, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: js.Any => StateT1[M, js.Any, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: js.Any => StateT1[M, js.Any, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def ap[S, E, A, B](fab: StateT2[M, S, E, js.Function1[/* a */ A, B]], fa: StateT2[M, S, E, A]): StateT2[M, S, E, B]
    
    def chain[S, E, A, B](fa: StateT2[M, S, E, A], f: js.Function1[/* a */ A, StateT2[M, S, E, B]]): StateT2[M, S, E, B]
    
    def evalState[S, E, A](ma: StateT2[M, S, E, A], s: S): js.Any
    
    def execState[S, E, A](ma: StateT2[M, S, E, A], s: S): js.Any
    
    def fromM[S, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
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
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      ap: (StateT2[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], StateT2[M, js.Any, js.Any, js.Any]) => StateT2[M, js.Any, js.Any, js.Any],
      chain: (StateT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, StateT2[M, js.Any, js.Any, js.Any]]) => StateT2[M, js.Any, js.Any, js.Any],
      evalState: (StateT2[M, js.Any, js.Any, js.Any], js.Any) => js.Any,
      execState: (StateT2[M, js.Any, js.Any, js.Any], js.Any) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => StateT2[M, js.Any, js.Any, js.Any],
      fromState: State_[js.Any, js.Any] => StateT2[M, js.Any, js.Any, js.Any],
      get: () => StateT2[M, js.Any, js.Any, js.Any],
      gets: js.Function1[js.Any, js.Any] => StateT2[M, js.Any, js.Any, js.Any],
      map: (StateT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => StateT2[M, js.Any, js.Any, js.Any],
      modify: js.Function1[js.Any, js.Any] => StateT2[M, js.Any, js.Any, Unit],
      of: js.Any => StateT2[M, js.Any, js.Any, js.Any],
      put: js.Any => StateT2[M, js.Any, js.Any, Unit]
    ): StateM2[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM2[M]]
    }
    
    extension [Self <: StateM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](x: Self & StateM2[M]) {
      
      inline def setAp(
        value: (StateT2[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], StateT2[M, js.Any, js.Any, js.Any]) => StateT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, StateT2[M, js.Any, js.Any, js.Any]]) => StateT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT2[M, js.Any, js.Any, js.Any], js.Any) => js.Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT2[M, js.Any, js.Any, js.Any], js.Any) => js.Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => StateT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[js.Any, js.Any] => StateT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[js.Any, js.Any] => StateT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(
        value: (StateT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => StateT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[js.Any, js.Any] => StateT2[M, js.Any, js.Any, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: js.Any => StateT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: js.Any => StateT2[M, js.Any, js.Any, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    def ap[S, A, B](fab: StateT2[M, S, E, js.Function1[/* a */ A, B]], fa: StateT2[M, S, E, A]): StateT2[M, S, E, B]
    
    def chain[S, A, B](fa: StateT2[M, S, E, A], f: js.Function1[/* a */ A, StateT2[M, S, E, B]]): StateT2[M, S, E, B]
    
    def evalState[S, A](ma: StateT2[M, S, E, A], s: S): js.Any
    
    def execState[S, A](ma: StateT2[M, S, E, A], s: S): js.Any
    
    def fromM[S, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
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
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      ap: (StateT2[M, js.Any, E, js.Function1[js.Any, js.Any]], StateT2[M, js.Any, E, js.Any]) => StateT2[M, js.Any, E, js.Any],
      chain: (StateT2[M, js.Any, E, js.Any], js.Function1[js.Any, StateT2[M, js.Any, E, js.Any]]) => StateT2[M, js.Any, E, js.Any],
      evalState: (StateT2[M, js.Any, E, js.Any], js.Any) => js.Any,
      execState: (StateT2[M, js.Any, E, js.Any], js.Any) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => StateT2[M, js.Any, E, js.Any],
      fromState: State_[js.Any, js.Any] => StateT2[M, js.Any, E, js.Any],
      get: () => StateT2[M, js.Any, E, js.Any],
      gets: js.Function1[js.Any, js.Any] => StateT2[M, js.Any, E, js.Any],
      map: (StateT2[M, js.Any, E, js.Any], js.Function1[js.Any, js.Any]) => StateT2[M, js.Any, E, js.Any],
      modify: js.Function1[js.Any, js.Any] => StateT2[M, js.Any, E, Unit],
      of: js.Any => StateT2[M, js.Any, E, js.Any],
      put: js.Any => StateT2[M, js.Any, E, Unit]
    ): StateM2C[M, E] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM2C[M, E]]
    }
    
    extension [Self <: StateM2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](x: Self & (StateM2C[M, E])) {
      
      inline def setAp(
        value: (StateT2[M, js.Any, E, js.Function1[js.Any, js.Any]], StateT2[M, js.Any, E, js.Any]) => StateT2[M, js.Any, E, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT2[M, js.Any, E, js.Any], js.Function1[js.Any, StateT2[M, js.Any, E, js.Any]]) => StateT2[M, js.Any, E, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT2[M, js.Any, E, js.Any], js.Any) => js.Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT2[M, js.Any, E, js.Any], js.Any) => js.Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => StateT2[M, js.Any, E, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[js.Any, js.Any] => StateT2[M, js.Any, E, js.Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT2[M, js.Any, E, js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[js.Any, js.Any] => StateT2[M, js.Any, E, js.Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(
        value: (StateT2[M, js.Any, E, js.Any], js.Function1[js.Any, js.Any]) => StateT2[M, js.Any, E, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[js.Any, js.Any] => StateT2[M, js.Any, E, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: js.Any => StateT2[M, js.Any, E, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: js.Any => StateT2[M, js.Any, E, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    def ap[S, R, E, A, B](fab: StateT3[M, S, R, E, js.Function1[/* a */ A, B]], fa: StateT3[M, S, R, E, A]): StateT3[M, S, R, E, B]
    
    def chain[S, R, E, A, B](fa: StateT3[M, S, R, E, A], f: js.Function1[/* a */ A, StateT3[M, S, R, E, B]]): StateT3[M, S, R, E, B]
    
    def evalState[S, R, E, A](ma: StateT3[M, S, R, E, A], s: S): js.Any
    
    def execState[S, R, E, A](ma: StateT3[M, S, R, E, A], s: S): js.Any
    
    def fromM[S, R, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any
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
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      ap: (StateT3[M, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], StateT3[M, js.Any, js.Any, js.Any, js.Any]) => StateT3[M, js.Any, js.Any, js.Any, js.Any],
      chain: (StateT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, StateT3[M, js.Any, js.Any, js.Any, js.Any]]) => StateT3[M, js.Any, js.Any, js.Any, js.Any],
      evalState: (StateT3[M, js.Any, js.Any, js.Any, js.Any], js.Any) => js.Any,
      execState: (StateT3[M, js.Any, js.Any, js.Any, js.Any], js.Any) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any => StateT3[M, js.Any, js.Any, js.Any, js.Any],
      fromState: State_[js.Any, js.Any] => StateT3[M, js.Any, js.Any, js.Any, js.Any],
      get: () => StateT3[M, js.Any, js.Any, js.Any, js.Any],
      gets: js.Function1[js.Any, js.Any] => StateT3[M, js.Any, js.Any, js.Any, js.Any],
      map: (StateT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => StateT3[M, js.Any, js.Any, js.Any, js.Any],
      modify: js.Function1[js.Any, js.Any] => StateT3[M, js.Any, js.Any, js.Any, Unit],
      of: js.Any => StateT3[M, js.Any, js.Any, js.Any, js.Any],
      put: js.Any => StateT3[M, js.Any, js.Any, js.Any, Unit]
    ): StateM3[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM3[M]]
    }
    
    extension [Self <: StateM3[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](x: Self & StateM3[M]) {
      
      inline def setAp(
        value: (StateT3[M, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], StateT3[M, js.Any, js.Any, js.Any, js.Any]) => StateT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, StateT3[M, js.Any, js.Any, js.Any, js.Any]]) => StateT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT3[M, js.Any, js.Any, js.Any, js.Any], js.Any) => js.Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT3[M, js.Any, js.Any, js.Any, js.Any], js.Any) => js.Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any => StateT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[js.Any, js.Any] => StateT3[M, js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT3[M, js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[js.Any, js.Any] => StateT3[M, js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(
        value: (StateT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => StateT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[js.Any, js.Any] => StateT3[M, js.Any, js.Any, js.Any, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: js.Any => StateT3[M, js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: js.Any => StateT3[M, js.Any, js.Any, js.Any, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  trait StateM3C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] extends StObject {
    
    def ap[S, R, A, B](fab: StateT3[M, S, R, E, js.Function1[/* a */ A, B]], fa: StateT3[M, S, R, E, A]): StateT3[M, S, R, E, B]
    
    def chain[S, R, A, B](fa: StateT3[M, S, R, E, A], f: js.Function1[/* a */ A, StateT3[M, S, R, E, B]]): StateT3[M, S, R, E, B]
    
    def evalState[S, R, A](ma: StateT3[M, S, R, E, A], s: S): js.Any
    
    def execState[S, R, A](ma: StateT3[M, S, R, E, A], s: S): js.Any
    
    def fromM[S, R, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any
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
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
      ap: (StateT3[M, js.Any, js.Any, E, js.Function1[js.Any, js.Any]], StateT3[M, js.Any, js.Any, E, js.Any]) => StateT3[M, js.Any, js.Any, E, js.Any],
      chain: (StateT3[M, js.Any, js.Any, E, js.Any], js.Function1[js.Any, StateT3[M, js.Any, js.Any, E, js.Any]]) => StateT3[M, js.Any, js.Any, E, js.Any],
      evalState: (StateT3[M, js.Any, js.Any, E, js.Any], js.Any) => js.Any,
      execState: (StateT3[M, js.Any, js.Any, E, js.Any], js.Any) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any => StateT3[M, js.Any, js.Any, E, js.Any],
      fromState: State_[js.Any, js.Any] => StateT3[M, js.Any, js.Any, E, js.Any],
      get: () => StateT3[M, js.Any, js.Any, E, js.Any],
      gets: js.Function1[js.Any, js.Any] => StateT3[M, js.Any, js.Any, E, js.Any],
      map: (StateT3[M, js.Any, js.Any, E, js.Any], js.Function1[js.Any, js.Any]) => StateT3[M, js.Any, js.Any, E, js.Any],
      modify: js.Function1[js.Any, js.Any] => StateT3[M, js.Any, js.Any, E, Unit],
      of: js.Any => StateT3[M, js.Any, js.Any, E, js.Any],
      put: js.Any => StateT3[M, js.Any, js.Any, E, Unit]
    ): StateM3C[M, E] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), evalState = js.Any.fromFunction2(evalState), execState = js.Any.fromFunction2(execState), fromM = js.Any.fromFunction1(fromM), fromState = js.Any.fromFunction1(fromState), get = js.Any.fromFunction0(get), gets = js.Any.fromFunction1(gets), map = js.Any.fromFunction2(map), modify = js.Any.fromFunction1(modify), of = js.Any.fromFunction1(of), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[StateM3C[M, E]]
    }
    
    extension [Self <: StateM3C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](x: Self & (StateM3C[M, E])) {
      
      inline def setAp(
        value: (StateT3[M, js.Any, js.Any, E, js.Function1[js.Any, js.Any]], StateT3[M, js.Any, js.Any, E, js.Any]) => StateT3[M, js.Any, js.Any, E, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setChain(
        value: (StateT3[M, js.Any, js.Any, E, js.Any], js.Function1[js.Any, StateT3[M, js.Any, js.Any, E, js.Any]]) => StateT3[M, js.Any, js.Any, E, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setEvalState(value: (StateT3[M, js.Any, js.Any, E, js.Any], js.Any) => js.Any): Self = StObject.set(x, "evalState", js.Any.fromFunction2(value))
      
      inline def setExecState(value: (StateT3[M, js.Any, js.Any, E, js.Any], js.Any) => js.Any): Self = StObject.set(x, "execState", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any => StateT3[M, js.Any, js.Any, E, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromState(value: State_[js.Any, js.Any] => StateT3[M, js.Any, js.Any, E, js.Any]): Self = StObject.set(x, "fromState", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => StateT3[M, js.Any, js.Any, E, js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGets(value: js.Function1[js.Any, js.Any] => StateT3[M, js.Any, js.Any, E, js.Any]): Self = StObject.set(x, "gets", js.Any.fromFunction1(value))
      
      inline def setMap(
        value: (StateT3[M, js.Any, js.Any, E, js.Any], js.Function1[js.Any, js.Any]) => StateT3[M, js.Any, js.Any, E, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setModify(value: js.Function1[js.Any, js.Any] => StateT3[M, js.Any, js.Any, E, Unit]): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
      
      inline def setOf(value: js.Any => StateT3[M, js.Any, js.Any, E, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setPut(value: js.Any => StateT3[M, js.Any, js.Any, E, Unit]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
  
  type StateT[M, S, A] = js.Function1[
    /* s */ S, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, S]> */ js.Any
  ]
  
  type StateT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, S, A] = js.Function1[
    /* s */ S, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, S]> */ js.Any
  ]
  
  type StateT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, S, E, A] = js.Function1[
    /* s */ S, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, S]> */ js.Any
  ]
  
  type StateT3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, S, R, E, A] = js.Function1[
    /* s */ S, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, S]> */ js.Any
  ]
}
