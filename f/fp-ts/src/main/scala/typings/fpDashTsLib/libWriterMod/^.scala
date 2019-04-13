package typings
package fpDashTsLib.libWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Writer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Writer = js.native
  val writer: fpDashTsLib.libFunctorMod.Functor2[URI] = js.native
  def censor[W, A](fa: Writer[W, A], f: js.Function1[/* w */ W, W]): Writer[W, A] = js.native
  def getMonad[W](M: fpDashTsLib.libMonoidMod.Monoid[W]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, W] = js.native
  def listen[W, A](fa: Writer[W, A]): Writer[W, js.Tuple2[A, W]] = js.native
  def listens[W, A, B](fa: Writer[W, A], f: js.Function1[/* w */ W, B]): Writer[W, js.Tuple2[A, B]] = js.native
  def pass[W, A](fa: Writer[W, js.Tuple2[A, js.Function1[/* w */ W, W]]]): Writer[W, A] = js.native
  def tell[W](w: W): Writer[W, scala.Unit] = js.native
}

