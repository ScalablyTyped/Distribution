package typings.fpTs.mod

import typings.fpTs.functorMod.Functor2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.writerMod.Writer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writer {
  
  @JSImport("fp-ts", "writer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "writer.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.writerMod.URI] = js.native
  
  @JSImport("fp-ts", "writer.URI")
  @js.native
  val URI: /* "Writer" */ String = js.native
  
  inline def censor[W](f: js.Function1[/* w */ W, W]): js.Function1[/* fa */ Writer_[W, js.Any], Writer_[W, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("censor")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Writer_[W, js.Any], Writer_[W, js.Any]]]
  
  inline def evalWriter[W, A](fa: Writer_[W, A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("evalWriter")(fa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def evaluate[W, A](fa: Writer_[W, A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(fa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def execWriter[W, A](fa: Writer_[W, A]): W = ^.asInstanceOf[js.Dynamic].applyDynamic("execWriter")(fa.asInstanceOf[js.Any]).asInstanceOf[W]
  
  inline def execute[W, A](fa: Writer_[W, A]): W = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fa.asInstanceOf[js.Any]).asInstanceOf[W]
  
  inline def getMonad[W](M: Monoid[W]): Monad2C[typings.fpTs.writerMod.URI, W] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(M.asInstanceOf[js.Any]).asInstanceOf[Monad2C[typings.fpTs.writerMod.URI, W]]
  
  inline def listen[W, A](fa: Writer_[W, A]): Writer_[W, js.Tuple2[A, W]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(fa.asInstanceOf[js.Any]).asInstanceOf[Writer_[W, js.Tuple2[A, W]]]
  
  inline def listens[W, B](f: js.Function1[/* w */ W, B]): js.Function1[/* fa */ Writer_[W, js.Any], Writer_[W, js.Tuple2[js.Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listens")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Writer_[W, js.Any], Writer_[W, js.Tuple2[js.Any, B]]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Writer_[js.Any, A], Writer_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Writer_[js.Any, A], Writer_[js.Any, B]]]
  
  inline def pass[W, A](fa: Writer_[W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): Writer_[W, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fa.asInstanceOf[js.Any]).asInstanceOf[Writer_[W, A]]
  
  inline def tell[W](w: W): Writer_[W, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tell")(w.asInstanceOf[js.Any]).asInstanceOf[Writer_[W, Unit]]
  
  @JSImport("fp-ts", "writer.writer")
  @js.native
  val writer: Functor2[typings.fpTs.writerMod.URI] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
