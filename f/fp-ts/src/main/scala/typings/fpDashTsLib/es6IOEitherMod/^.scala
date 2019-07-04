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
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, flatten, map, mapLeft, fromOption, fromPredicate, filterOrElse) */ def alt[L, A](that: js.Function0[IOEither[L, A]]): js.Function1[/* fa */ IOEither[L, A], IOEither[L, A]] = js.native
  def fold[E, A, R](
    onLeft: js.Function1[/* e */ E, fpDashTsLib.es6IOMod.IO[R]],
    onRight: js.Function1[/* a */ A, fpDashTsLib.es6IOMod.IO[R]]
  ): js.Function1[/* ma */ IOEither[E, A], fpDashTsLib.es6IOMod.IO[R]] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): IOEither[L, A] = js.native
  def fromLeft[L, A](l: L): IOEither[L, A] = js.native
  def left[L, A](fa: fpDashTsLib.es6IOMod.IO[L]): IOEither[L, A] = js.native
  def left2v[E, A](l: E): IOEither[E, A] = js.native
  def leftIO[E, A](me: fpDashTsLib.es6IOMod.IO[E]): IOEither[E, A] = js.native
  def orElse[E, A, M](f: js.Function1[/* e */ E, IOEither[M, A]]): js.Function1[/* ma */ IOEither[E, A], IOEither[M, A]] = js.native
  def right[L, A](fa: fpDashTsLib.es6IOMod.IO[A]): IOEither[L, A] = js.native
  def right2v[E, A](a: A): IOEither[E, A] = js.native
  def rightIO[E, A](ma: fpDashTsLib.es6IOMod.IO[A]): IOEither[E, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A]): IOEither[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, stdLib.Error]): IOEither[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, L]): IOEither[L, A] = js.native
}

