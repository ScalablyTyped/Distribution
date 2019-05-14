package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "ioEither")
@js.native
object ioEitherNs extends js.Object {
  @js.native
  class IOEither[L, A] protected ()
    extends fpDashTsLib.es6IOEitherMod.IOEither[L, A] {
    def this(value: fpDashTsLib.es6IOMod.IO[fpDashTsLib.es6EitherMod.Either[L, A]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.IOEither = js.native
  val ioEither: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.es6IOEitherMod.URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[fpDashTsLib.es6IOEitherMod.URI] with fpDashTsLib.es6AltMod.Alt2[fpDashTsLib.es6IOEitherMod.URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow2[fpDashTsLib.es6IOEitherMod.URI] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
  def fromLeft[L, A](l: L): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
  def left[L, A](fa: fpDashTsLib.es6IOMod.IO[L]): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
  def right[L, A](fa: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A]): fpDashTsLib.es6IOEitherMod.IOEither[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, stdLib.Error]): fpDashTsLib.es6IOEitherMod.IOEither[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, L]): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
}

