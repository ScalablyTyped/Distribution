package typings.fpTs

import typings.fpTs.fpTsStrings.Writer
import typings.fpTs.libApplicativeMod.Applicative2C
import typings.fpTs.libApplyMod.Apply2C
import typings.fpTs.libChainMod.Chain2C
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libMonadMod.Monad2C
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libPointedMod.Pointed2C
import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWriterMod {
  
  @JSImport("fp-ts/lib/Writer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Writer", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.libWriterMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Writer", "URI")
  @js.native
  val URI: /* "Writer" */ String = js.native
  type URI = /* "Writer" */ String
  
  inline def censor[W](f: js.Function1[/* w */ W, W]): js.Function1[/* fa */ Writer_[W, Any], Writer_[W, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("censor")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Writer_[W, Any], Writer_[W, Any]]]
  
  inline def evalWriter[W, A](fa: Writer_[W, A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("evalWriter")(fa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def evaluate[W, A](fa: Writer_[W, A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(fa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def execWriter[W, A](fa: Writer_[W, A]): W = ^.asInstanceOf[js.Dynamic].applyDynamic("execWriter")(fa.asInstanceOf[js.Any]).asInstanceOf[W]
  
  inline def execute[W, A](fa: Writer_[W, A]): W = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fa.asInstanceOf[js.Any]).asInstanceOf[W]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Writer_[Any, js.Function1[/* a */ A, Any]], Writer_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Writer_[Any, js.Function1[/* a */ A, Any]], Writer_[Any, Any]]]
  
  inline def getApplicative[W](M: Monoid[W]): Applicative2C[Writer, W] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(M.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[Writer, W]]
  
  inline def getApply[W](S: Semigroup[W]): Apply2C[Writer, W] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(S.asInstanceOf[js.Any]).asInstanceOf[Apply2C[Writer, W]]
  
  inline def getChain[W](S: Semigroup[W]): Chain2C[typings.fpTs.libWriterMod.URI, W] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChain")(S.asInstanceOf[js.Any]).asInstanceOf[Chain2C[typings.fpTs.libWriterMod.URI, W]]
  
  inline def getMonad[W](M: Monoid[W]): Monad2C[typings.fpTs.libWriterMod.URI, W] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(M.asInstanceOf[js.Any]).asInstanceOf[Monad2C[typings.fpTs.libWriterMod.URI, W]]
  
  inline def getPointed[W](M: Monoid[W]): Pointed2C[Writer, W] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointed")(M.asInstanceOf[js.Any]).asInstanceOf[Pointed2C[Writer, W]]
  
  inline def listen[W, A](fa: Writer_[W, A]): Writer_[W, js.Tuple2[A, W]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(fa.asInstanceOf[js.Any]).asInstanceOf[Writer_[W, js.Tuple2[A, W]]]
  
  inline def listens[W, B](f: js.Function1[/* w */ W, B]): js.Function1[/* fa */ Writer_[W, Any], Writer_[W, js.Tuple2[Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listens")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Writer_[W, Any], Writer_[W, js.Tuple2[Any, B]]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Writer_[Any, A], Writer_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Writer_[Any, A], Writer_[Any, B]]]
  
  inline def pass[W, A](fa: Writer_[W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): Writer_[W, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fa.asInstanceOf[js.Any]).asInstanceOf[Writer_[W, A]]
  
  inline def tell[W](w: W): Writer_[W, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tell")(w.asInstanceOf[js.Any]).asInstanceOf[Writer_[W, Unit]]
  
  @JSImport("fp-ts/lib/Writer", "writer")
  @js.native
  val writer: Functor2[typings.fpTs.libWriterMod.URI] = js.native
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
  
  type Writer_[W, A] = js.Function0[js.Tuple2[A, W]]
}
