package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ioEither")
@js.native
object ioEitherNs extends js.Object {
  @js.native
  class IOEither[L, A] protected ()
    extends fpDashTsLib.libIOEitherMod.IOEither[L, A] {
    def this(value: fpDashTsLib.libIOMod.IO[fpDashTsLib.libEitherMod.Either[L, A]]) = this()
  }
  
  val URI: /* IOEither */ java.lang.String = js.native
  val ioEither: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libIOEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libIOEitherMod.URI] with fpDashTsLib.libAltMod.Alt2[fpDashTsLib.libIOEitherMod.URI] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
  def fromLeft[L, A](l: L): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
  def left[L, A](fa: fpDashTsLib.libIOMod.IO[L]): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
  def right[L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A]): fpDashTsLib.libIOEitherMod.IOEither[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, stdLib.Error]): fpDashTsLib.libIOEitherMod.IOEither[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, L]): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
}

