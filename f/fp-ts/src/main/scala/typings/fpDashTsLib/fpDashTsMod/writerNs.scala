package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "writer")
@js.native
object writerNs extends js.Object {
  @js.native
  class Writer[W, A] protected ()
    extends fpDashTsLib.libWriterMod.Writer[W, A] {
    def this(run: js.Function0[js.Tuple2[A, W]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Writer = js.native
  val writer: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libWriterMod.URI] = js.native
  def censor[W, A](fa: fpDashTsLib.libWriterMod.Writer[W, A], f: js.Function1[/* w */ W, W]): fpDashTsLib.libWriterMod.Writer[W, A] = js.native
  def censor2v[W](f: js.Function1[/* w */ W, W]): js.Function1[
    /* fa */ fpDashTsLib.libWriterMod.Writer[W, _], 
    fpDashTsLib.libWriterMod.Writer[W, _]
  ] = js.native
  def evalWriter[W, A](fa: fpDashTsLib.libWriterMod.Writer[W, A]): A = js.native
  def execWriter[W, A](fa: fpDashTsLib.libWriterMod.Writer[W, A]): W = js.native
  def getMonad[W](M: fpDashTsLib.libMonoidMod.Monoid[W]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, W] = js.native
  def listen[W, A](fa: fpDashTsLib.libWriterMod.Writer[W, A]): fpDashTsLib.libWriterMod.Writer[W, js.Tuple2[A, W]] = js.native
  def listens[W, A, B](fa: fpDashTsLib.libWriterMod.Writer[W, A], f: js.Function1[/* w */ W, B]): fpDashTsLib.libWriterMod.Writer[W, js.Tuple2[A, B]] = js.native
  def listens2v[W, B](f: js.Function1[/* w */ W, B]): js.Function1[
    /* fa */ fpDashTsLib.libWriterMod.Writer[W, _], 
    fpDashTsLib.libWriterMod.Writer[W, js.Tuple2[_, B]]
  ] = js.native
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.libWriterMod.Writer[_, A], 
    fpDashTsLib.libWriterMod.Writer[_, B]
  ] = js.native
  def pass[W, A](fa: fpDashTsLib.libWriterMod.Writer[W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): fpDashTsLib.libWriterMod.Writer[W, A] = js.native
  def tell[W](w: W): fpDashTsLib.libWriterMod.Writer[W, scala.Unit] = js.native
}

