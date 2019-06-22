package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "writer")
@js.native
object writerNs extends js.Object {
  @js.native
  class Writer[W, A] protected ()
    extends fpDashTsLib.es6WriterMod.Writer[W, A] {
    def this(run: js.Function0[js.Tuple2[A, W]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Writer = js.native
  val writer: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.es6WriterMod.URI] = js.native
  def censor[W, A](fa: fpDashTsLib.es6WriterMod.Writer[W, A], f: js.Function1[/* w */ W, W]): fpDashTsLib.es6WriterMod.Writer[W, A] = js.native
  def censor2v[W](f: js.Function1[/* w */ W, W]): js.Function1[
    /* fa */ fpDashTsLib.es6WriterMod.Writer[W, _], 
    fpDashTsLib.es6WriterMod.Writer[W, _]
  ] = js.native
  def evalWriter[W, A](fa: fpDashTsLib.es6WriterMod.Writer[W, A]): A = js.native
  def execWriter[W, A](fa: fpDashTsLib.es6WriterMod.Writer[W, A]): W = js.native
  def getMonad[W](M: fpDashTsLib.es6MonoidMod.Monoid[W]): fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, W] = js.native
  def listen[W, A](fa: fpDashTsLib.es6WriterMod.Writer[W, A]): fpDashTsLib.es6WriterMod.Writer[W, js.Tuple2[A, W]] = js.native
  def listens[W, A, B](fa: fpDashTsLib.es6WriterMod.Writer[W, A], f: js.Function1[/* w */ W, B]): fpDashTsLib.es6WriterMod.Writer[W, js.Tuple2[A, B]] = js.native
  def listens2v[W, B](f: js.Function1[/* w */ W, B]): js.Function1[
    /* fa */ fpDashTsLib.es6WriterMod.Writer[W, _], 
    fpDashTsLib.es6WriterMod.Writer[W, js.Tuple2[_, B]]
  ] = js.native
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.es6WriterMod.Writer[_, A], 
    fpDashTsLib.es6WriterMod.Writer[_, B]
  ] = js.native
  def pass[W, A](fa: fpDashTsLib.es6WriterMod.Writer[W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): fpDashTsLib.es6WriterMod.Writer[W, A] = js.native
  def tell[W](w: W): fpDashTsLib.es6WriterMod.Writer[W, scala.Unit] = js.native
}

