package typings
package fpDashTsLib.es6IOEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/IOEither", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.IOEither = js.native
  val ioEither: fpDashTsLib.es6MonadMod.Monad2[URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[URI] with fpDashTsLib.es6AltMod.Alt2[URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow2[URI] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): IOEither[L, A] = js.native
  def fromLeft[L, A](l: L): IOEither[L, A] = js.native
  def left[L, A](fa: fpDashTsLib.es6IOMod.IO[L]): IOEither[L, A] = js.native
  def right[L, A](fa: fpDashTsLib.es6IOMod.IO[A]): IOEither[L, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A]): IOEither[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, stdLib.Error]): IOEither[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, L]): IOEither[L, A] = js.native
}

