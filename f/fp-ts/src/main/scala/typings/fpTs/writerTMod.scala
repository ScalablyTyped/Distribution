package typings.fpTs

import typings.fpTs.anon.ApChain
import typings.fpTs.anon.ChainE
import typings.fpTs.anon.E
import typings.fpTs.anon.EMap
import typings.fpTs.anon.Of
import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerTMod {
  
  @JSImport("fp-ts/lib/WriterT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getWriterM[M](M: Monad[M]): WriterM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM[M]]
  @scala.inline
  def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): WriterM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM1[M]]
  @scala.inline
  def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): WriterM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM2[M]]
  @scala.inline
  def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](M: Monad3[M]): WriterM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM3[M]]
  @scala.inline
  def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): WriterM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM2C[M, E]]
  
  trait WriterM[M] extends StObject {
    
    def censor[W, A](fa: WriterT[M, W, A], f: js.Function1[/* w */ W, W]): WriterT[M, W, A]
    
    def evalWriter[W, A](fa: WriterT[M, W, A]): js.Any
    
    def execWriter[W, A](fa: WriterT[M, W, A]): js.Any
    
    def getMonad[W](M: Monoid[W]): E[W, M]
    
    def listen[W, A](fa: WriterT[M, W, A]): WriterT[M, W, js.Tuple2[A, W]]
    
    def listens[W, A, B](fa: WriterT[M, W, A], f: js.Function1[/* w */ W, B]): WriterT[M, W, js.Tuple2[A, B]]
    
    def map[W, A, B](fa: WriterT[M, W, A], f: js.Function1[/* a */ A, B]): WriterT[M, W, B]
    
    def pass[W, A](fa: WriterT[M, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT[M, W, A]
    
    def tell[W](w: W): WriterT[M, W, Unit]
  }
  object WriterM {
    
    @scala.inline
    def apply[M](
      censor: (WriterT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT[M, js.Any, js.Any],
      evalWriter: WriterT[M, js.Any, js.Any] => js.Any,
      execWriter: WriterT[M, js.Any, js.Any] => js.Any,
      getMonad: Monoid[js.Any] => E[js.Any, M],
      listen: WriterT[M, js.Any, js.Any] => WriterT[M, js.Any, js.Tuple2[js.Any, js.Any]],
      listens: (WriterT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT[M, js.Any, js.Tuple2[js.Any, js.Any]],
      map: (WriterT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT[M, js.Any, js.Any],
      pass: WriterT[M, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT[M, js.Any, js.Any],
      tell: js.Any => WriterT[M, js.Any, Unit]
    ): WriterM[M] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM[M]]
    }
    
    @scala.inline
    implicit class WriterMMutableBuilder[Self <: WriterM[?], M] (val x: Self & WriterM[M]) extends AnyVal {
      
      @scala.inline
      def setCensor(value: (WriterT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT[M, js.Any, js.Any]): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEvalWriter(value: WriterT[M, js.Any, js.Any] => js.Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecWriter(value: WriterT[M, js.Any, js.Any] => js.Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMonad(value: Monoid[js.Any] => E[js.Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListen(value: WriterT[M, js.Any, js.Any] => WriterT[M, js.Any, js.Tuple2[js.Any, js.Any]]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListens(
        value: (WriterT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT[M, js.Any, js.Tuple2[js.Any, js.Any]]
      ): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMap(value: (WriterT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT[M, js.Any, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPass(
        value: WriterT[M, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTell(value: js.Any => WriterT[M, js.Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  trait WriterM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def censor[W, A](fa: WriterT1[M, W, A], f: js.Function1[/* w */ W, W]): WriterT1[M, W, A]
    
    def evalWriter[W, A](fa: WriterT1[M, W, A]): js.Any
    
    def execWriter[W, A](fa: WriterT1[M, W, A]): js.Any
    
    def getMonad[W](M: Monoid[W]): Of[W, M]
    
    def listen[W, A](fa: WriterT1[M, W, A]): WriterT1[M, W, js.Tuple2[A, W]]
    
    def listens[W, A, B](fa: WriterT1[M, W, A], f: js.Function1[/* w */ W, B]): WriterT1[M, W, js.Tuple2[A, B]]
    
    def map[W, A, B](fa: WriterT1[M, W, A], f: js.Function1[/* a */ A, B]): WriterT1[M, W, B]
    
    def pass[W, A](fa: WriterT1[M, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT1[M, W, A]
    
    def tell[W](w: W): WriterT1[M, W, Unit]
  }
  object WriterM1 {
    
    @scala.inline
    def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      censor: (WriterT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT1[M, js.Any, js.Any],
      evalWriter: WriterT1[M, js.Any, js.Any] => js.Any,
      execWriter: WriterT1[M, js.Any, js.Any] => js.Any,
      getMonad: Monoid[js.Any] => Of[js.Any, M],
      listen: WriterT1[M, js.Any, js.Any] => WriterT1[M, js.Any, js.Tuple2[js.Any, js.Any]],
      listens: (WriterT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT1[M, js.Any, js.Tuple2[js.Any, js.Any]],
      map: (WriterT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT1[M, js.Any, js.Any],
      pass: WriterT1[M, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT1[M, js.Any, js.Any],
      tell: js.Any => WriterT1[M, js.Any, Unit]
    ): WriterM1[M] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM1[M]]
    }
    
    @scala.inline
    implicit class WriterM1MutableBuilder[Self <: WriterM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & WriterM1[M]) extends AnyVal {
      
      @scala.inline
      def setCensor(value: (WriterT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT1[M, js.Any, js.Any]): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEvalWriter(value: WriterT1[M, js.Any, js.Any] => js.Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecWriter(value: WriterT1[M, js.Any, js.Any] => js.Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMonad(value: Monoid[js.Any] => Of[js.Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListen(value: WriterT1[M, js.Any, js.Any] => WriterT1[M, js.Any, js.Tuple2[js.Any, js.Any]]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListens(
        value: (WriterT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT1[M, js.Any, js.Tuple2[js.Any, js.Any]]
      ): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMap(value: (WriterT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT1[M, js.Any, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPass(
        value: WriterT1[M, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTell(value: js.Any => WriterT1[M, js.Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  trait WriterM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def censor[E, W, A](fa: WriterT2[M, E, W, A], f: js.Function1[/* w */ W, W]): WriterT2[M, E, W, A]
    
    def evalWriter[E, W, A](fa: WriterT2[M, E, W, A]): js.Any
    
    def execWriter[E, W, A](fa: WriterT2[M, E, W, A]): js.Any
    
    def getMonad[W](M: Monoid[W]): ApChain[W, M]
    
    def listen[E, W, A](fa: WriterT2[M, E, W, A]): WriterT2[M, E, W, js.Tuple2[A, W]]
    
    def listens[E, W, A, B](fa: WriterT2[M, E, W, A], f: js.Function1[/* w */ W, B]): WriterT2[M, E, W, js.Tuple2[A, B]]
    
    def map[E, W, A, B](fa: WriterT2[M, E, W, A], f: js.Function1[/* a */ A, B]): WriterT2[M, E, W, B]
    
    def pass[E, W, A](fa: WriterT2[M, E, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT2[M, E, W, A]
    
    def tell[E, W](w: W): WriterT2[M, E, W, Unit]
  }
  object WriterM2 {
    
    @scala.inline
    def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      censor: (WriterT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, js.Any, js.Any, js.Any],
      evalWriter: WriterT2[M, js.Any, js.Any, js.Any] => js.Any,
      execWriter: WriterT2[M, js.Any, js.Any, js.Any] => js.Any,
      getMonad: Monoid[js.Any] => ApChain[js.Any, M],
      listen: WriterT2[M, js.Any, js.Any, js.Any] => WriterT2[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]],
      listens: (WriterT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]],
      map: (WriterT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, js.Any, js.Any, js.Any],
      pass: WriterT2[M, js.Any, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT2[M, js.Any, js.Any, js.Any],
      tell: js.Any => WriterT2[M, js.Any, js.Any, Unit]
    ): WriterM2[M] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM2[M]]
    }
    
    @scala.inline
    implicit class WriterM2MutableBuilder[Self <: WriterM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & WriterM2[M]) extends AnyVal {
      
      @scala.inline
      def setCensor(
        value: (WriterT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEvalWriter(value: WriterT2[M, js.Any, js.Any, js.Any] => js.Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecWriter(value: WriterT2[M, js.Any, js.Any, js.Any] => js.Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMonad(value: Monoid[js.Any] => ApChain[js.Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListen(
        value: WriterT2[M, js.Any, js.Any, js.Any] => WriterT2[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]
      ): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListens(
        value: (WriterT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]
      ): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMap(
        value: (WriterT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPass(
        value: WriterT2[M, js.Any, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTell(value: js.Any => WriterT2[M, js.Any, js.Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  trait WriterM2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    def censor[W, A](fa: WriterT2[M, E, W, A], f: js.Function1[/* w */ W, W]): WriterT2[M, E, W, A]
    
    def evalWriter[W, A](fa: WriterT2[M, E, W, A]): js.Any
    
    def execWriter[W, A](fa: WriterT2[M, E, W, A]): js.Any
    
    def getMonad[W](M: Monoid[W]): ChainE[W, M, E]
    
    def listen[W, A](fa: WriterT2[M, E, W, A]): WriterT2[M, E, W, js.Tuple2[A, W]]
    
    def listens[W, A, B](fa: WriterT2[M, E, W, A], f: js.Function1[/* w */ W, B]): WriterT2[M, E, W, js.Tuple2[A, B]]
    
    def map[W, A, B](fa: WriterT2[M, E, W, A], f: js.Function1[/* a */ A, B]): WriterT2[M, E, W, B]
    
    def pass[W, A](fa: WriterT2[M, E, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT2[M, E, W, A]
    
    def tell[W](w: W): WriterT2[M, E, W, Unit]
  }
  object WriterM2C {
    
    @scala.inline
    def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      censor: (WriterT2[M, E, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, E, js.Any, js.Any],
      evalWriter: WriterT2[M, E, js.Any, js.Any] => js.Any,
      execWriter: WriterT2[M, E, js.Any, js.Any] => js.Any,
      getMonad: Monoid[js.Any] => ChainE[js.Any, M, E],
      listen: WriterT2[M, E, js.Any, js.Any] => WriterT2[M, E, js.Any, js.Tuple2[js.Any, js.Any]],
      listens: (WriterT2[M, E, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, E, js.Any, js.Tuple2[js.Any, js.Any]],
      map: (WriterT2[M, E, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, E, js.Any, js.Any],
      pass: WriterT2[M, E, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT2[M, E, js.Any, js.Any],
      tell: js.Any => WriterT2[M, E, js.Any, Unit]
    ): WriterM2C[M, E] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM2C[M, E]]
    }
    
    @scala.inline
    implicit class WriterM2CMutableBuilder[Self <: WriterM2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (WriterM2C[M, E])) extends AnyVal {
      
      @scala.inline
      def setCensor(
        value: (WriterT2[M, E, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, E, js.Any, js.Any]
      ): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEvalWriter(value: WriterT2[M, E, js.Any, js.Any] => js.Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecWriter(value: WriterT2[M, E, js.Any, js.Any] => js.Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMonad(value: Monoid[js.Any] => ChainE[js.Any, M, E]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListen(value: WriterT2[M, E, js.Any, js.Any] => WriterT2[M, E, js.Any, js.Tuple2[js.Any, js.Any]]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListens(
        value: (WriterT2[M, E, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, E, js.Any, js.Tuple2[js.Any, js.Any]]
      ): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMap(
        value: (WriterT2[M, E, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, E, js.Any, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPass(
        value: WriterT2[M, E, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT2[M, E, js.Any, js.Any]
      ): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTell(value: js.Any => WriterT2[M, E, js.Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  trait WriterM3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] extends StObject {
    
    def censor[R, E, W, A](fa: WriterT3[M, R, E, W, A], f: js.Function1[/* w */ W, W]): WriterT3[M, R, E, W, A]
    
    def evalWriter[R, E, W, A](fa: WriterT3[M, R, E, W, A]): js.Any
    
    def execWriter[R, E, W, A](fa: WriterT3[M, R, E, W, A]): js.Any
    
    def getMonad[W](M: Monoid[W]): EMap[W, M]
    
    def listen[R, E, W, A](fa: WriterT3[M, R, E, W, A]): WriterT3[M, R, E, W, js.Tuple2[A, W]]
    
    def listens[R, E, W, A, B](fa: WriterT3[M, R, E, W, A], f: js.Function1[/* w */ W, B]): WriterT3[M, R, E, W, js.Tuple2[A, B]]
    
    def map[R, E, W, A, B](fa: WriterT3[M, R, E, W, A], f: js.Function1[/* a */ A, B]): WriterT3[M, R, E, W, B]
    
    def pass[R, E, W, A](fa: WriterT3[M, R, E, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT3[M, R, E, W, A]
    
    def tell[R, E, W](w: W): WriterT3[M, R, E, W, Unit]
  }
  object WriterM3 {
    
    @scala.inline
    def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      censor: (WriterT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT3[M, js.Any, js.Any, js.Any, js.Any],
      evalWriter: WriterT3[M, js.Any, js.Any, js.Any, js.Any] => js.Any,
      execWriter: WriterT3[M, js.Any, js.Any, js.Any, js.Any] => js.Any,
      getMonad: Monoid[js.Any] => EMap[js.Any, M],
      listen: WriterT3[M, js.Any, js.Any, js.Any, js.Any] => WriterT3[M, js.Any, js.Any, js.Any, js.Tuple2[js.Any, js.Any]],
      listens: (WriterT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT3[M, js.Any, js.Any, js.Any, js.Tuple2[js.Any, js.Any]],
      map: (WriterT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT3[M, js.Any, js.Any, js.Any, js.Any],
      pass: WriterT3[M, js.Any, js.Any, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT3[M, js.Any, js.Any, js.Any, js.Any],
      tell: js.Any => WriterT3[M, js.Any, js.Any, js.Any, Unit]
    ): WriterM3[M] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM3[M]]
    }
    
    @scala.inline
    implicit class WriterM3MutableBuilder[Self <: WriterM3[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */] (val x: Self & WriterM3[M]) extends AnyVal {
      
      @scala.inline
      def setCensor(
        value: (WriterT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEvalWriter(value: WriterT3[M, js.Any, js.Any, js.Any, js.Any] => js.Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecWriter(value: WriterT3[M, js.Any, js.Any, js.Any, js.Any] => js.Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMonad(value: Monoid[js.Any] => EMap[js.Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListen(
        value: WriterT3[M, js.Any, js.Any, js.Any, js.Any] => WriterT3[M, js.Any, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]
      ): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListens(
        value: (WriterT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT3[M, js.Any, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]
      ): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMap(
        value: (WriterT3[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => WriterT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPass(
        value: WriterT3[M, js.Any, js.Any, js.Any, js.Tuple2[js.Any, js.Function1[js.Any, js.Any]]] => WriterT3[M, js.Any, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTell(value: js.Any => WriterT3[M, js.Any, js.Any, js.Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  type WriterT[M, W, A] = js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, W]> */ js.Any
  ]
  
  type WriterT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, W, A] = js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, W]> */ js.Any
  ]
  
  type WriterT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E, W, A] = js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, W]> */ js.Any
  ]
  
  type WriterT3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, R, E, W, A] = js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, W]> */ js.Any
  ]
}
