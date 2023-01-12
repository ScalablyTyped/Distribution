package typings.fpTs

import typings.fpTs.anon.ApChain
import typings.fpTs.anon.ChainE
import typings.fpTs.anon.E
import typings.fpTs.anon.EMap
import typings.fpTs.anon.Of
import typings.fpTs.libMonadMod.Monad
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonadMod.Monad2
import typings.fpTs.libMonadMod.Monad2C
import typings.fpTs.libMonadMod.Monad3
import typings.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWriterTMod {
  
  @JSImport("fp-ts/lib/WriterT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWriterM[M](M: Monad[M]): WriterM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): WriterM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM1[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): WriterM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM2[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): WriterM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM3[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): WriterM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM2C[M, E]]
  
  trait WriterM[M] extends StObject {
    
    def censor[W, A](fa: WriterT[M, W, A], f: js.Function1[/* w */ W, W]): WriterT[M, W, A]
    
    def evalWriter[W, A](fa: WriterT[M, W, A]): Any
    
    def execWriter[W, A](fa: WriterT[M, W, A]): Any
    
    def getMonad[W](M: Monoid[W]): E[W, M]
    
    def listen[W, A](fa: WriterT[M, W, A]): WriterT[M, W, js.Tuple2[A, W]]
    
    def listens[W, A, B](fa: WriterT[M, W, A], f: js.Function1[/* w */ W, B]): WriterT[M, W, js.Tuple2[A, B]]
    
    def map[W, A, B](fa: WriterT[M, W, A], f: js.Function1[/* a */ A, B]): WriterT[M, W, B]
    
    def pass[W, A](fa: WriterT[M, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT[M, W, A]
    
    def tell[W](w: W): WriterT[M, W, Unit]
  }
  object WriterM {
    
    inline def apply[M](
      censor: (WriterT[M, Any, Any], js.Function1[Any, Any]) => WriterT[M, Any, Any],
      evalWriter: WriterT[M, Any, Any] => Any,
      execWriter: WriterT[M, Any, Any] => Any,
      getMonad: Monoid[Any] => E[Any, M],
      listen: WriterT[M, Any, Any] => WriterT[M, Any, js.Tuple2[Any, Any]],
      listens: (WriterT[M, Any, Any], js.Function1[Any, Any]) => WriterT[M, Any, js.Tuple2[Any, Any]],
      map: (WriterT[M, Any, Any], js.Function1[Any, Any]) => WriterT[M, Any, Any],
      pass: WriterT[M, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT[M, Any, Any],
      tell: Any => WriterT[M, Any, Unit]
    ): WriterM[M] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriterM[?], M] (val x: Self & WriterM[M]) extends AnyVal {
      
      inline def setCensor(value: (WriterT[M, Any, Any], js.Function1[Any, Any]) => WriterT[M, Any, Any]): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      inline def setEvalWriter(value: WriterT[M, Any, Any] => Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      inline def setExecWriter(value: WriterT[M, Any, Any] => Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      inline def setGetMonad(value: Monoid[Any] => E[Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setListen(value: WriterT[M, Any, Any] => WriterT[M, Any, js.Tuple2[Any, Any]]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      inline def setListens(value: (WriterT[M, Any, Any], js.Function1[Any, Any]) => WriterT[M, Any, js.Tuple2[Any, Any]]): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      inline def setMap(value: (WriterT[M, Any, Any], js.Function1[Any, Any]) => WriterT[M, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setPass(value: WriterT[M, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT[M, Any, Any]): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setTell(value: Any => WriterT[M, Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  trait WriterM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def censor[W, A](fa: WriterT1[M, W, A], f: js.Function1[/* w */ W, W]): WriterT1[M, W, A]
    
    def evalWriter[W, A](fa: WriterT1[M, W, A]): Any
    
    def execWriter[W, A](fa: WriterT1[M, W, A]): Any
    
    def getMonad[W](M: Monoid[W]): Of[W, M]
    
    def listen[W, A](fa: WriterT1[M, W, A]): WriterT1[M, W, js.Tuple2[A, W]]
    
    def listens[W, A, B](fa: WriterT1[M, W, A], f: js.Function1[/* w */ W, B]): WriterT1[M, W, js.Tuple2[A, B]]
    
    def map[W, A, B](fa: WriterT1[M, W, A], f: js.Function1[/* a */ A, B]): WriterT1[M, W, B]
    
    def pass[W, A](fa: WriterT1[M, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT1[M, W, A]
    
    def tell[W](w: W): WriterT1[M, W, Unit]
  }
  object WriterM1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      censor: (WriterT1[M, Any, Any], js.Function1[Any, Any]) => WriterT1[M, Any, Any],
      evalWriter: WriterT1[M, Any, Any] => Any,
      execWriter: WriterT1[M, Any, Any] => Any,
      getMonad: Monoid[Any] => Of[Any, M],
      listen: WriterT1[M, Any, Any] => WriterT1[M, Any, js.Tuple2[Any, Any]],
      listens: (WriterT1[M, Any, Any], js.Function1[Any, Any]) => WriterT1[M, Any, js.Tuple2[Any, Any]],
      map: (WriterT1[M, Any, Any], js.Function1[Any, Any]) => WriterT1[M, Any, Any],
      pass: WriterT1[M, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT1[M, Any, Any],
      tell: Any => WriterT1[M, Any, Unit]
    ): WriterM1[M] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM1[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriterM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] (val x: Self & WriterM1[M]) extends AnyVal {
      
      inline def setCensor(value: (WriterT1[M, Any, Any], js.Function1[Any, Any]) => WriterT1[M, Any, Any]): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      inline def setEvalWriter(value: WriterT1[M, Any, Any] => Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      inline def setExecWriter(value: WriterT1[M, Any, Any] => Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      inline def setGetMonad(value: Monoid[Any] => Of[Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setListen(value: WriterT1[M, Any, Any] => WriterT1[M, Any, js.Tuple2[Any, Any]]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      inline def setListens(value: (WriterT1[M, Any, Any], js.Function1[Any, Any]) => WriterT1[M, Any, js.Tuple2[Any, Any]]): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      inline def setMap(value: (WriterT1[M, Any, Any], js.Function1[Any, Any]) => WriterT1[M, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setPass(value: WriterT1[M, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT1[M, Any, Any]): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setTell(value: Any => WriterT1[M, Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  trait WriterM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def censor[E, W, A](fa: WriterT2[M, E, W, A], f: js.Function1[/* w */ W, W]): WriterT2[M, E, W, A]
    
    def evalWriter[E, W, A](fa: WriterT2[M, E, W, A]): Any
    
    def execWriter[E, W, A](fa: WriterT2[M, E, W, A]): Any
    
    def getMonad[W](M: Monoid[W]): ApChain[W, M]
    
    def listen[E, W, A](fa: WriterT2[M, E, W, A]): WriterT2[M, E, W, js.Tuple2[A, W]]
    
    def listens[E, W, A, B](fa: WriterT2[M, E, W, A], f: js.Function1[/* w */ W, B]): WriterT2[M, E, W, js.Tuple2[A, B]]
    
    def map[E, W, A, B](fa: WriterT2[M, E, W, A], f: js.Function1[/* a */ A, B]): WriterT2[M, E, W, B]
    
    def pass[E, W, A](fa: WriterT2[M, E, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT2[M, E, W, A]
    
    def tell[E, W](w: W): WriterT2[M, E, W, Unit]
  }
  object WriterM2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      censor: (WriterT2[M, Any, Any, Any], js.Function1[Any, Any]) => WriterT2[M, Any, Any, Any],
      evalWriter: WriterT2[M, Any, Any, Any] => Any,
      execWriter: WriterT2[M, Any, Any, Any] => Any,
      getMonad: Monoid[Any] => ApChain[Any, M],
      listen: WriterT2[M, Any, Any, Any] => WriterT2[M, Any, Any, js.Tuple2[Any, Any]],
      listens: (WriterT2[M, Any, Any, Any], js.Function1[Any, Any]) => WriterT2[M, Any, Any, js.Tuple2[Any, Any]],
      map: (WriterT2[M, Any, Any, Any], js.Function1[Any, Any]) => WriterT2[M, Any, Any, Any],
      pass: WriterT2[M, Any, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT2[M, Any, Any, Any],
      tell: Any => WriterT2[M, Any, Any, Unit]
    ): WriterM2[M] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM2[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriterM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] (val x: Self & WriterM2[M]) extends AnyVal {
      
      inline def setCensor(value: (WriterT2[M, Any, Any, Any], js.Function1[Any, Any]) => WriterT2[M, Any, Any, Any]): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      inline def setEvalWriter(value: WriterT2[M, Any, Any, Any] => Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      inline def setExecWriter(value: WriterT2[M, Any, Any, Any] => Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      inline def setGetMonad(value: Monoid[Any] => ApChain[Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setListen(value: WriterT2[M, Any, Any, Any] => WriterT2[M, Any, Any, js.Tuple2[Any, Any]]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      inline def setListens(
        value: (WriterT2[M, Any, Any, Any], js.Function1[Any, Any]) => WriterT2[M, Any, Any, js.Tuple2[Any, Any]]
      ): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      inline def setMap(value: (WriterT2[M, Any, Any, Any], js.Function1[Any, Any]) => WriterT2[M, Any, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setPass(value: WriterT2[M, Any, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT2[M, Any, Any, Any]): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setTell(value: Any => WriterT2[M, Any, Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  trait WriterM2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    def censor[W, A](fa: WriterT2[M, E, W, A], f: js.Function1[/* w */ W, W]): WriterT2[M, E, W, A]
    
    def evalWriter[W, A](fa: WriterT2[M, E, W, A]): Any
    
    def execWriter[W, A](fa: WriterT2[M, E, W, A]): Any
    
    def getMonad[W](M: Monoid[W]): ChainE[W, M, E]
    
    def listen[W, A](fa: WriterT2[M, E, W, A]): WriterT2[M, E, W, js.Tuple2[A, W]]
    
    def listens[W, A, B](fa: WriterT2[M, E, W, A], f: js.Function1[/* w */ W, B]): WriterT2[M, E, W, js.Tuple2[A, B]]
    
    def map[W, A, B](fa: WriterT2[M, E, W, A], f: js.Function1[/* a */ A, B]): WriterT2[M, E, W, B]
    
    def pass[W, A](fa: WriterT2[M, E, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT2[M, E, W, A]
    
    def tell[W](w: W): WriterT2[M, E, W, Unit]
  }
  object WriterM2C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      censor: (WriterT2[M, E, Any, Any], js.Function1[Any, Any]) => WriterT2[M, E, Any, Any],
      evalWriter: WriterT2[M, E, Any, Any] => Any,
      execWriter: WriterT2[M, E, Any, Any] => Any,
      getMonad: Monoid[Any] => ChainE[Any, M, E],
      listen: WriterT2[M, E, Any, Any] => WriterT2[M, E, Any, js.Tuple2[Any, Any]],
      listens: (WriterT2[M, E, Any, Any], js.Function1[Any, Any]) => WriterT2[M, E, Any, js.Tuple2[Any, Any]],
      map: (WriterT2[M, E, Any, Any], js.Function1[Any, Any]) => WriterT2[M, E, Any, Any],
      pass: WriterT2[M, E, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT2[M, E, Any, Any],
      tell: Any => WriterT2[M, E, Any, Unit]
    ): WriterM2C[M, E] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM2C[M, E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriterM2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] (val x: Self & (WriterM2C[M, E])) extends AnyVal {
      
      inline def setCensor(value: (WriterT2[M, E, Any, Any], js.Function1[Any, Any]) => WriterT2[M, E, Any, Any]): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      inline def setEvalWriter(value: WriterT2[M, E, Any, Any] => Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      inline def setExecWriter(value: WriterT2[M, E, Any, Any] => Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      inline def setGetMonad(value: Monoid[Any] => ChainE[Any, M, E]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setListen(value: WriterT2[M, E, Any, Any] => WriterT2[M, E, Any, js.Tuple2[Any, Any]]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      inline def setListens(
        value: (WriterT2[M, E, Any, Any], js.Function1[Any, Any]) => WriterT2[M, E, Any, js.Tuple2[Any, Any]]
      ): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      inline def setMap(value: (WriterT2[M, E, Any, Any], js.Function1[Any, Any]) => WriterT2[M, E, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setPass(value: WriterT2[M, E, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT2[M, E, Any, Any]): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setTell(value: Any => WriterT2[M, E, Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  trait WriterM3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    def censor[R, E, W, A](fa: WriterT3[M, R, E, W, A], f: js.Function1[/* w */ W, W]): WriterT3[M, R, E, W, A]
    
    def evalWriter[R, E, W, A](fa: WriterT3[M, R, E, W, A]): Any
    
    def execWriter[R, E, W, A](fa: WriterT3[M, R, E, W, A]): Any
    
    def getMonad[W](M: Monoid[W]): EMap[W, M]
    
    def listen[R, E, W, A](fa: WriterT3[M, R, E, W, A]): WriterT3[M, R, E, W, js.Tuple2[A, W]]
    
    def listens[R, E, W, A, B](fa: WriterT3[M, R, E, W, A], f: js.Function1[/* w */ W, B]): WriterT3[M, R, E, W, js.Tuple2[A, B]]
    
    def map[R, E, W, A, B](fa: WriterT3[M, R, E, W, A], f: js.Function1[/* a */ A, B]): WriterT3[M, R, E, W, B]
    
    def pass[R, E, W, A](fa: WriterT3[M, R, E, W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): WriterT3[M, R, E, W, A]
    
    def tell[R, E, W](w: W): WriterT3[M, R, E, W, Unit]
  }
  object WriterM3 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      censor: (WriterT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => WriterT3[M, Any, Any, Any, Any],
      evalWriter: WriterT3[M, Any, Any, Any, Any] => Any,
      execWriter: WriterT3[M, Any, Any, Any, Any] => Any,
      getMonad: Monoid[Any] => EMap[Any, M],
      listen: WriterT3[M, Any, Any, Any, Any] => WriterT3[M, Any, Any, Any, js.Tuple2[Any, Any]],
      listens: (WriterT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => WriterT3[M, Any, Any, Any, js.Tuple2[Any, Any]],
      map: (WriterT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => WriterT3[M, Any, Any, Any, Any],
      pass: WriterT3[M, Any, Any, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT3[M, Any, Any, Any, Any],
      tell: Any => WriterT3[M, Any, Any, Any, Unit]
    ): WriterM3[M] = {
      val __obj = js.Dynamic.literal(censor = js.Any.fromFunction2(censor), evalWriter = js.Any.fromFunction1(evalWriter), execWriter = js.Any.fromFunction1(execWriter), getMonad = js.Any.fromFunction1(getMonad), listen = js.Any.fromFunction1(listen), listens = js.Any.fromFunction2(listens), map = js.Any.fromFunction2(map), pass = js.Any.fromFunction1(pass), tell = js.Any.fromFunction1(tell))
      __obj.asInstanceOf[WriterM3[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriterM3[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] (val x: Self & WriterM3[M]) extends AnyVal {
      
      inline def setCensor(
        value: (WriterT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => WriterT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
      
      inline def setEvalWriter(value: WriterT3[M, Any, Any, Any, Any] => Any): Self = StObject.set(x, "evalWriter", js.Any.fromFunction1(value))
      
      inline def setExecWriter(value: WriterT3[M, Any, Any, Any, Any] => Any): Self = StObject.set(x, "execWriter", js.Any.fromFunction1(value))
      
      inline def setGetMonad(value: Monoid[Any] => EMap[Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setListen(value: WriterT3[M, Any, Any, Any, Any] => WriterT3[M, Any, Any, Any, js.Tuple2[Any, Any]]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      inline def setListens(
        value: (WriterT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => WriterT3[M, Any, Any, Any, js.Tuple2[Any, Any]]
      ): Self = StObject.set(x, "listens", js.Any.fromFunction2(value))
      
      inline def setMap(
        value: (WriterT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => WriterT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setPass(
        value: WriterT3[M, Any, Any, Any, js.Tuple2[Any, js.Function1[Any, Any]]] => WriterT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setTell(value: Any => WriterT3[M, Any, Any, Any, Unit]): Self = StObject.set(x, "tell", js.Any.fromFunction1(value))
    }
  }
  
  type WriterT[M, W, A] = js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, W]> */ Any
  ]
  
  type WriterT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, W, A] = js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, W]> */ Any
  ]
  
  type WriterT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E, W, A] = js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, W]> */ Any
  ]
  
  type WriterT3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, R, E, W, A] = js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, W]> */ Any
  ]
}
