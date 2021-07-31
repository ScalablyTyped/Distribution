package typings.fpTs

import typings.fpTs.functorMod.Functor2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerMod {
  
  @JSImport("fp-ts/lib/Writer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Writer", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.writerMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Writer", "URI")
  @js.native
  val URI: /* "Writer" */ String = js.native
  type URI = /* "Writer" */ String
  
  @scala.inline
  def censor[W](f: js.Function1[/* w */ W, W]): js.Function1[/* fa */ Writer_[W, js.Any], Writer_[W, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("censor")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Writer_[W, js.Any], Writer_[W, js.Any]]]
  
  @scala.inline
  def evalWriter[W, A](fa: Writer_[W, A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("evalWriter")(fa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def evaluate[W, A](fa: Writer_[W, A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(fa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def execWriter[W, A](fa: Writer_[W, A]): W = ^.asInstanceOf[js.Dynamic].applyDynamic("execWriter")(fa.asInstanceOf[js.Any]).asInstanceOf[W]
  
  @scala.inline
  def execute[W, A](fa: Writer_[W, A]): W = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fa.asInstanceOf[js.Any]).asInstanceOf[W]
  
  @scala.inline
  def getMonad[W](M: Monoid[W]): Monad2C[typings.fpTs.writerMod.URI, W] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(M.asInstanceOf[js.Any]).asInstanceOf[Monad2C[typings.fpTs.writerMod.URI, W]]
  
  @scala.inline
  def listen[W, A](fa: Writer_[W, A]): Writer_[W, js.Tuple2[A, W]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(fa.asInstanceOf[js.Any]).asInstanceOf[Writer_[W, js.Tuple2[A, W]]]
  
  @scala.inline
  def listens[W, B](f: js.Function1[/* w */ W, B]): js.Function1[/* fa */ Writer_[W, js.Any], Writer_[W, js.Tuple2[js.Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listens")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Writer_[W, js.Any], Writer_[W, js.Tuple2[js.Any, B]]]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Writer_[js.Any, A], Writer_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Writer_[js.Any, A], Writer_[js.Any, B]]]
  
  @scala.inline
  def pass[W, A](fa: Writer_[W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): Writer_[W, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fa.asInstanceOf[js.Any]).asInstanceOf[Writer_[W, A]]
  
  @scala.inline
  def tell[W](w: W): Writer_[W, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tell")(w.asInstanceOf[js.Any]).asInstanceOf[Writer_[W, Unit]]
  
  @JSImport("fp-ts/lib/Writer", "writer")
  @js.native
  val writer: Functor2[typings.fpTs.writerMod.URI] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type Writer_[W, A] = js.Function0[js.Tuple2[A, W]]
}
