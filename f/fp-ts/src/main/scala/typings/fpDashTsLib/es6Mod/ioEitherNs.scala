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
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, flatten, map, mapLeft, fromOption, fromPredicate, filterOrElse) */ def alt[L, A](that: js.Function0[fpDashTsLib.es6IOEitherMod.IOEither[L, A]]): js.Function1[
    /* fa */ fpDashTsLib.es6IOEitherMod.IOEither[L, A], 
    fpDashTsLib.es6IOEitherMod.IOEither[L, A]
  ] = js.native
  def fold[E, A, R](
    onLeft: js.Function1[/* e */ E, fpDashTsLib.es6IOMod.IO[R]],
    onRight: js.Function1[/* a */ A, fpDashTsLib.es6IOMod.IO[R]]
  ): js.Function1[/* ma */ fpDashTsLib.es6IOEitherMod.IOEither[E, A], fpDashTsLib.es6IOMod.IO[R]] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
  def fromLeft[L, A](l: L): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
  def left[L, A](fa: fpDashTsLib.es6IOMod.IO[L]): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
  def left2v[E, A](l: E): fpDashTsLib.es6IOEitherMod.IOEither[E, A] = js.native
  def leftIO[E, A](me: fpDashTsLib.es6IOMod.IO[E]): fpDashTsLib.es6IOEitherMod.IOEither[E, A] = js.native
  def orElse[E, A, M](f: js.Function1[/* e */ E, fpDashTsLib.es6IOEitherMod.IOEither[M, A]]): js.Function1[
    /* ma */ fpDashTsLib.es6IOEitherMod.IOEither[E, A], 
    fpDashTsLib.es6IOEitherMod.IOEither[M, A]
  ] = js.native
  def right[L, A](fa: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
  def right2v[E, A](a: A): fpDashTsLib.es6IOEitherMod.IOEither[E, A] = js.native
  def rightIO[E, A](ma: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6IOEitherMod.IOEither[E, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A]): fpDashTsLib.es6IOEitherMod.IOEither[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, stdLib.Error]): fpDashTsLib.es6IOEitherMod.IOEither[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, L]): fpDashTsLib.es6IOEitherMod.IOEither[L, A] = js.native
}

