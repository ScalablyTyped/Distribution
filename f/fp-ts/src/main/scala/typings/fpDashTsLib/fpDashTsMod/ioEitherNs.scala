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
  
  val URI: fpDashTsLib.fpDashTsLibStrings.IOEither = js.native
  val ioEither: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libIOEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libIOEitherMod.URI] with fpDashTsLib.libAltMod.Alt2[fpDashTsLib.libIOEitherMod.URI] with fpDashTsLib.libMonadThrowMod.MonadThrow2[fpDashTsLib.libIOEitherMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, flatten, map, mapLeft, fromOption, fromPredicate, filterOrElse) */ def alt[L, A](that: js.Function0[fpDashTsLib.libIOEitherMod.IOEither[L, A]]): js.Function1[
    /* fa */ fpDashTsLib.libIOEitherMod.IOEither[L, A], 
    fpDashTsLib.libIOEitherMod.IOEither[L, A]
  ] = js.native
  def fold[E, A, R](
    onLeft: js.Function1[/* e */ E, fpDashTsLib.libIOMod.IO[R]],
    onRight: js.Function1[/* a */ A, fpDashTsLib.libIOMod.IO[R]]
  ): js.Function1[/* ma */ fpDashTsLib.libIOEitherMod.IOEither[E, A], fpDashTsLib.libIOMod.IO[R]] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
  def fromLeft[L, A](l: L): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
  def left[L, A](fa: fpDashTsLib.libIOMod.IO[L]): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
  def left2v[L](l: L): fpDashTsLib.libIOEitherMod.IOEither[L, scala.Nothing] = js.native
  def leftIO[E](me: fpDashTsLib.libIOMod.IO[E]): fpDashTsLib.libIOEitherMod.IOEither[E, scala.Nothing] = js.native
  def orElse[E, A, M](f: js.Function1[/* e */ E, fpDashTsLib.libIOEitherMod.IOEither[M, A]]): js.Function1[
    /* ma */ fpDashTsLib.libIOEitherMod.IOEither[E, A], 
    fpDashTsLib.libIOEitherMod.IOEither[M, A]
  ] = js.native
  def right[L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
  def right2v[A](a: A): fpDashTsLib.libIOEitherMod.IOEither[scala.Nothing, A] = js.native
  def rightIO[A](ma: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libIOEitherMod.IOEither[scala.Nothing, A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A]): fpDashTsLib.libIOEitherMod.IOEither[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, stdLib.Error]): fpDashTsLib.libIOEitherMod.IOEither[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* reason */ js.Any, L]): fpDashTsLib.libIOEitherMod.IOEither[L, A] = js.native
}

