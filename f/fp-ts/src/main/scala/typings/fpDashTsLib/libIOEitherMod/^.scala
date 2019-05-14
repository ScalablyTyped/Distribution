package typings
package fpDashTsLib.libIOEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/IOEither", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.IOEither = js.native
  val ioEither: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libAltMod.Alt2[URI] with fpDashTsLib.libMonadThrowMod.MonadThrow2[URI] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): IOEither[L, A] = js.native
  def fromLeft[L, A](l: L): IOEither[L, A] = js.native
  def left[L, A](fa: fpDashTsLib.libIOMod.IO[L]): IOEither[L, A] = js.native
  def right[L, A](fa: fpDashTsLib.libIOMod.IO[A]): IOEither[L, A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A]): IOEither[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, stdLib.Error]): IOEither[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, L]): IOEither[L, A] = js.native
}

