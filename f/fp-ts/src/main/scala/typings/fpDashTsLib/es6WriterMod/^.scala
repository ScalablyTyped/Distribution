package typings
package fpDashTsLib.es6WriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Writer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Writer = js.native
  val writer: fpDashTsLib.es6FunctorMod.Functor2[URI] = js.native
  def censor[W, A](fa: Writer[W, A], f: js.Function1[/* w */ W, W]): Writer[W, A] = js.native
  def censor2v[W](f: js.Function1[/* w */ W, W]): js.Function1[/* fa */ Writer[W, _], Writer[W, _]] = js.native
  def evalWriter[W, A](fa: Writer[W, A]): A = js.native
  def execWriter[W, A](fa: Writer[W, A]): W = js.native
  def getMonad[W](M: fpDashTsLib.es6MonoidMod.Monoid[W]): fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, W] = js.native
  def listen[W, A](fa: Writer[W, A]): Writer[W, js.Tuple2[A, W]] = js.native
  def listens[W, A, B](fa: Writer[W, A], f: js.Function1[/* w */ W, B]): Writer[W, js.Tuple2[A, B]] = js.native
  def listens2v[W, B](f: js.Function1[/* w */ W, B]): js.Function1[/* fa */ Writer[W, _], Writer[W, js.Tuple2[_, B]]] = js.native
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Writer[_, A], Writer[_, B]] = js.native
  def pass[W, A](fa: Writer[W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): Writer[W, A] = js.native
  def tell[W](w: W): Writer[W, scala.Unit] = js.native
}

