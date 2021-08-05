package typings.fpTs

import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.readerMod.Reader_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerTMod {
  
  @JSImport("fp-ts/lib/ReaderT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReaderM[M](M: Monad[M]): ReaderM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): ReaderM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM1[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): ReaderM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM2[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](M: Monad3[M]): ReaderM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM3[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): ReaderM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM2C[M, E]]
  
  trait ReaderM[M] extends StObject {
    
    def ap[R, A, B](mab: ReaderT[M, R, js.Function1[/* a */ A, B]], ma: ReaderT[M, R, A]): ReaderT[M, R, B]
    
    def ask[R](): ReaderT[M, R, R]
    
    def asks[R, A](f: js.Function1[/* r */ R, A]): ReaderT[M, R, A]
    
    def chain[R, A, B](ma: ReaderT[M, R, A], f: js.Function1[/* a */ A, ReaderT[M, R, B]]): ReaderT[M, R, B]
    
    def fromM[R, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
    ): ReaderT[M, R, A]
    
    def fromReader[R, A](ma: Reader_[R, A]): ReaderT[M, R, A]
    
    def local[R, A, Q](ma: ReaderT[M, R, A], f: js.Function1[/* d */ Q, R]): ReaderT[M, Q, A]
    
    def map[R, A, B](ma: ReaderT[M, R, A], f: js.Function1[/* a */ A, B]): ReaderT[M, R, B]
    
    def of[R, A](a: A): ReaderT[M, R, A]
  }
  object ReaderM {
    
    inline def apply[M](
      ap: (ReaderT[M, js.Any, js.Function1[js.Any, js.Any]], ReaderT[M, js.Any, js.Any]) => ReaderT[M, js.Any, js.Any],
      ask: () => ReaderT[M, js.Any, js.Any],
      asks: js.Function1[js.Any, js.Any] => ReaderT[M, js.Any, js.Any],
      chain: (ReaderT[M, js.Any, js.Any], js.Function1[js.Any, ReaderT[M, js.Any, js.Any]]) => ReaderT[M, js.Any, js.Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => ReaderT[M, js.Any, js.Any],
      fromReader: Reader_[js.Any, js.Any] => ReaderT[M, js.Any, js.Any],
      local: (ReaderT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT[M, js.Any, js.Any],
      map: (ReaderT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT[M, js.Any, js.Any],
      of: js.Any => ReaderT[M, js.Any, js.Any]
    ): ReaderM[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM[M]]
    }
    
    extension [Self <: ReaderM[?], M](x: Self & ReaderM[M]) {
      
      inline def setAp(
        value: (ReaderT[M, js.Any, js.Function1[js.Any, js.Any]], ReaderT[M, js.Any, js.Any]) => ReaderT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT[M, js.Any, js.Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[js.Any, js.Any] => ReaderT[M, js.Any, js.Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(
        value: (ReaderT[M, js.Any, js.Any], js.Function1[js.Any, ReaderT[M, js.Any, js.Any]]) => ReaderT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => ReaderT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[js.Any, js.Any] => ReaderT[M, js.Any, js.Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(value: (ReaderT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT[M, js.Any, js.Any]): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(value: (ReaderT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT[M, js.Any, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: js.Any => ReaderT[M, js.Any, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  trait ReaderM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def ap[R, A, B](mab: ReaderT1[M, R, js.Function1[/* a */ A, B]], ma: ReaderT1[M, R, A]): ReaderT1[M, R, B]
    
    def ask[R](): ReaderT1[M, R, R]
    
    def asks[R, A](f: js.Function1[/* r */ R, A]): ReaderT1[M, R, A]
    
    def chain[R, A, B](ma: ReaderT1[M, R, A], f: js.Function1[/* a */ A, ReaderT1[M, R, B]]): ReaderT1[M, R, B]
    
    def fromM[R, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
    ): ReaderT1[M, R, A]
    
    def fromReader[R, A](ma: Reader_[R, A]): ReaderT1[M, R, A]
    
    def local[R, A, Q](ma: ReaderT1[M, R, A], f: js.Function1[/* d */ Q, R]): ReaderT1[M, Q, A]
    
    def map[R, A, B](ma: ReaderT1[M, R, A], f: js.Function1[/* a */ A, B]): ReaderT1[M, R, B]
    
    def of[R, A](a: A): ReaderT1[M, R, A]
  }
  object ReaderM1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      ap: (ReaderT1[M, js.Any, js.Function1[js.Any, js.Any]], ReaderT1[M, js.Any, js.Any]) => ReaderT1[M, js.Any, js.Any],
      ask: () => ReaderT1[M, js.Any, js.Any],
      asks: js.Function1[js.Any, js.Any] => ReaderT1[M, js.Any, js.Any],
      chain: (ReaderT1[M, js.Any, js.Any], js.Function1[js.Any, ReaderT1[M, js.Any, js.Any]]) => ReaderT1[M, js.Any, js.Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => ReaderT1[M, js.Any, js.Any],
      fromReader: Reader_[js.Any, js.Any] => ReaderT1[M, js.Any, js.Any],
      local: (ReaderT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT1[M, js.Any, js.Any],
      map: (ReaderT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT1[M, js.Any, js.Any],
      of: js.Any => ReaderT1[M, js.Any, js.Any]
    ): ReaderM1[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM1[M]]
    }
    
    extension [Self <: ReaderM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](x: Self & ReaderM1[M]) {
      
      inline def setAp(
        value: (ReaderT1[M, js.Any, js.Function1[js.Any, js.Any]], ReaderT1[M, js.Any, js.Any]) => ReaderT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT1[M, js.Any, js.Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[js.Any, js.Any] => ReaderT1[M, js.Any, js.Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(
        value: (ReaderT1[M, js.Any, js.Any], js.Function1[js.Any, ReaderT1[M, js.Any, js.Any]]) => ReaderT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => ReaderT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[js.Any, js.Any] => ReaderT1[M, js.Any, js.Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(value: (ReaderT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT1[M, js.Any, js.Any]): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(value: (ReaderT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT1[M, js.Any, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: js.Any => ReaderT1[M, js.Any, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  trait ReaderM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def ap[R, E, A, B](mab: ReaderT2[M, R, E, js.Function1[/* a */ A, B]], ma: ReaderT2[M, R, E, A]): ReaderT2[M, R, E, B]
    
    def ask[R, E](): ReaderT2[M, R, E, R]
    
    def asks[R, E, A](f: js.Function1[/* r */ R, A]): ReaderT2[M, R, E, A]
    
    def chain[R, E, A, B](ma: ReaderT2[M, R, E, A], f: js.Function1[/* a */ A, ReaderT2[M, R, E, B]]): ReaderT2[M, R, E, B]
    
    def fromM[R, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
    ): ReaderT2[M, R, E, A]
    
    def fromReader[R, E, A](ma: Reader_[R, A]): ReaderT2[M, R, E, A]
    
    def local[R, E, A, Q](ma: ReaderT2[M, R, E, A], f: js.Function1[/* d */ Q, R]): ReaderT2[M, Q, E, A]
    
    def map[R, E, A, B](ma: ReaderT2[M, R, E, A], f: js.Function1[/* a */ A, B]): ReaderT2[M, R, E, B]
    
    def of[R, E, A](a: A): ReaderT2[M, R, E, A]
  }
  object ReaderM2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      ap: (ReaderT2[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], ReaderT2[M, js.Any, js.Any, js.Any]) => ReaderT2[M, js.Any, js.Any, js.Any],
      ask: () => ReaderT2[M, js.Any, js.Any, js.Any],
      asks: js.Function1[js.Any, js.Any] => ReaderT2[M, js.Any, js.Any, js.Any],
      chain: (ReaderT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, ReaderT2[M, js.Any, js.Any, js.Any]]) => ReaderT2[M, js.Any, js.Any, js.Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => ReaderT2[M, js.Any, js.Any, js.Any],
      fromReader: Reader_[js.Any, js.Any] => ReaderT2[M, js.Any, js.Any, js.Any],
      local: (ReaderT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT2[M, js.Any, js.Any, js.Any],
      map: (ReaderT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT2[M, js.Any, js.Any, js.Any],
      of: js.Any => ReaderT2[M, js.Any, js.Any, js.Any]
    ): ReaderM2[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM2[M]]
    }
    
    extension [Self <: ReaderM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](x: Self & ReaderM2[M]) {
      
      inline def setAp(
        value: (ReaderT2[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], ReaderT2[M, js.Any, js.Any, js.Any]) => ReaderT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[js.Any, js.Any] => ReaderT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(
        value: (ReaderT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, ReaderT2[M, js.Any, js.Any, js.Any]]) => ReaderT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => ReaderT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[js.Any, js.Any] => ReaderT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(
        value: (ReaderT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(
        value: (ReaderT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: js.Any => ReaderT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  trait ReaderM2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    def ap[R, A, B](mab: ReaderT2[M, R, E, js.Function1[/* a */ A, B]], ma: ReaderT2[M, R, E, A]): ReaderT2[M, R, E, B]
    
    def ask[R](): ReaderT2[M, R, E, R]
    
    def asks[R, A](f: js.Function1[/* r */ R, A]): ReaderT2[M, R, E, A]
    
    def chain[R, A, B](ma: ReaderT2[M, R, E, A], f: js.Function1[/* a */ A, ReaderT2[M, R, E, B]]): ReaderT2[M, R, E, B]
    
    def fromM[R, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
    ): ReaderT2[M, R, E, A]
    
    def fromReader[R, A](ma: Reader_[R, A]): ReaderT2[M, R, E, A]
    
    def local[R, A, Q](ma: ReaderT2[M, R, E, A], f: js.Function1[/* d */ Q, R]): ReaderT2[M, Q, E, A]
    
    def map[R, A, B](ma: ReaderT2[M, R, E, A], f: js.Function1[/* a */ A, B]): ReaderT2[M, R, E, B]
    
    def of[R, A](a: A): ReaderT2[M, R, E, A]
  }
  object ReaderM2C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      ap: (ReaderT2[M, js.Any, E, js.Function1[js.Any, js.Any]], ReaderT2[M, js.Any, E, js.Any]) => ReaderT2[M, js.Any, E, js.Any],
      ask: () => ReaderT2[M, js.Any, E, js.Any],
      asks: js.Function1[js.Any, js.Any] => ReaderT2[M, js.Any, E, js.Any],
      chain: (ReaderT2[M, js.Any, E, js.Any], js.Function1[js.Any, ReaderT2[M, js.Any, E, js.Any]]) => ReaderT2[M, js.Any, E, js.Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => ReaderT2[M, js.Any, E, js.Any],
      fromReader: Reader_[js.Any, js.Any] => ReaderT2[M, js.Any, E, js.Any],
      local: (ReaderT2[M, js.Any, E, js.Any], js.Function1[js.Any, js.Any]) => ReaderT2[M, js.Any, E, js.Any],
      map: (ReaderT2[M, js.Any, E, js.Any], js.Function1[js.Any, js.Any]) => ReaderT2[M, js.Any, E, js.Any],
      of: js.Any => ReaderT2[M, js.Any, E, js.Any]
    ): ReaderM2C[M, E] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM2C[M, E]]
    }
    
    extension [Self <: ReaderM2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](x: Self & (ReaderM2C[M, E])) {
      
      inline def setAp(
        value: (ReaderT2[M, js.Any, E, js.Function1[js.Any, js.Any]], ReaderT2[M, js.Any, E, js.Any]) => ReaderT2[M, js.Any, E, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT2[M, js.Any, E, js.Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[js.Any, js.Any] => ReaderT2[M, js.Any, E, js.Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(
        value: (ReaderT2[M, js.Any, E, js.Any], js.Function1[js.Any, ReaderT2[M, js.Any, E, js.Any]]) => ReaderT2[M, js.Any, E, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => ReaderT2[M, js.Any, E, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[js.Any, js.Any] => ReaderT2[M, js.Any, E, js.Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(
        value: (ReaderT2[M, js.Any, E, js.Any], js.Function1[js.Any, js.Any]) => ReaderT2[M, js.Any, E, js.Any]
      ): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(
        value: (ReaderT2[M, js.Any, E, js.Any], js.Function1[js.Any, js.Any]) => ReaderT2[M, js.Any, E, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: js.Any => ReaderT2[M, js.Any, E, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  trait ReaderM3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    def ap[R, U, E, A, B](mab: ReaderT3[M, R, U, E, js.Function1[/* a */ A, B]], ma: ReaderT3[M, R, U, E, A]): ReaderT3[M, R, U, E, B]
    
    def ask[R, U, E](): ReaderT3[M, R, U, E, R]
    
    def asks[R, U, E, A](f: js.Function1[/* r */ R, A]): ReaderT3[M, R, U, E, A]
    
    def chain[R, U, E, A, B](ma: ReaderT3[M, R, U, E, A], f: js.Function1[/* a */ A, ReaderT3[M, R, U, E, B]]): ReaderT3[M, R, U, E, B]
    
    def fromM[R, U, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, U, E, A> */ js.Any
    ): ReaderT3[M, R, U, E, A]
    
    def fromReader[R, U, E, A](ma: Reader_[R, A]): ReaderT3[M, R, U, E, A]
    
    def local[R, U, E, A, Q](ma: ReaderT3[M, R, U, E, A], f: js.Function1[/* d */ Q, R]): ReaderT3[M, Q, U, E, A]
    
    def map[R, U, E, A, B](ma: ReaderT3[M, R, U, E, A], f: js.Function1[/* a */ A, B]): ReaderT3[M, R, U, E, B]
    
    def of[R, U, E, A](a: A): ReaderT3[M, R, U, E, A]
  }
  object ReaderM3 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      ap: (ReaderT3[M, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], ReaderT3[M, js.Any, js.Any, js.Any, js.Any]) => ReaderT3[M, js.Any, js.Any, js.Any, js.Any],
      ask: () => ReaderT3[M, js.Any, js.Any, js.Any, js.Any],
      asks: js.Function1[js.Any, js.Any] => ReaderT3[M, js.Any, js.Any, js.Any, js.Any],
      chain: (ReaderT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, ReaderT3[M, js.Any, js.Any, js.Any, js.Any]]) => ReaderT3[M, js.Any, js.Any, js.Any, js.Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, U, E, A> */ js.Any => ReaderT3[M, js.Any, js.Any, js.Any, js.Any],
      fromReader: Reader_[js.Any, js.Any] => ReaderT3[M, js.Any, js.Any, js.Any, js.Any],
      local: (ReaderT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT3[M, js.Any, js.Any, js.Any, js.Any],
      map: (ReaderT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT3[M, js.Any, js.Any, js.Any, js.Any],
      of: js.Any => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]
    ): ReaderM3[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM3[M]]
    }
    
    extension [Self <: ReaderM3[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](x: Self & ReaderM3[M]) {
      
      inline def setAp(
        value: (ReaderT3[M, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], ReaderT3[M, js.Any, js.Any, js.Any, js.Any]) => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[js.Any, js.Any] => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(
        value: (ReaderT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, ReaderT3[M, js.Any, js.Any, js.Any, js.Any]]) => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, U, E, A> */ js.Any => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[js.Any, js.Any] => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(
        value: (ReaderT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(
        value: (ReaderT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: js.Any => ReaderT3[M, js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  type ReaderT[M, R, A] = js.Function1[
    /* r */ R, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
  ]
  
  type ReaderT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, R, A] = js.Function1[
    /* r */ R, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
  ]
  
  type ReaderT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, R, E, A] = js.Function1[
    /* r */ R, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
  ]
  
  type ReaderT3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, R, U, E, A] = js.Function1[
    /* r */ R, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, U, E, A> */ js.Any
  ]
}
