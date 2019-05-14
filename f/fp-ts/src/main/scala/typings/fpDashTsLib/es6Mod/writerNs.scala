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
  def getMonad[W](M: fpDashTsLib.es6MonoidMod.Monoid[W]): fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, W] = js.native
  def listen[W, A](fa: fpDashTsLib.es6WriterMod.Writer[W, A]): fpDashTsLib.es6WriterMod.Writer[W, js.Tuple2[A, W]] = js.native
  def listens[W, A, B](fa: fpDashTsLib.es6WriterMod.Writer[W, A], f: js.Function1[/* w */ W, B]): fpDashTsLib.es6WriterMod.Writer[W, js.Tuple2[A, B]] = js.native
  def pass[W, A](fa: fpDashTsLib.es6WriterMod.Writer[W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): fpDashTsLib.es6WriterMod.Writer[W, A] = js.native
  def tell[W](w: W): fpDashTsLib.es6WriterMod.Writer[W, scala.Unit] = js.native
}

