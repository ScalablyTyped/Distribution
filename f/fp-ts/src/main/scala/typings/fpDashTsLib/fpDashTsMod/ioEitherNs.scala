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
  val fromEither: js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
    fpDashTsLib.libIOEitherMod.IOEither[js.Any, js.Any]
  ] = js.native
  val fromLeft: js.Function1[/* l */ js.Any, fpDashTsLib.libIOEitherMod.IOEither[js.Any, js.Any]] = js.native
  val ioEither: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libIOEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libIOEitherMod.URI] with fpDashTsLib.libAltMod.Alt2[fpDashTsLib.libIOEitherMod.URI] = js.native
  val left: js.Function1[
    /* fa */ fpDashTsLib.libIOMod.IO[js.Any], 
    fpDashTsLib.libIOEitherMod.IOEither[js.Any, js.Any]
  ] = js.native
  val right: js.Function1[
    /* fa */ fpDashTsLib.libIOMod.IO[js.Any], 
    fpDashTsLib.libIOEitherMod.IOEither[js.Any, js.Any]
  ] = js.native
  val tryCatch: js.Function2[
    /* f */ fpDashTsLib.libFunctionMod.Lazy[js.Any], 
    /* onerror */ js.UndefOr[js.Function1[/* reason */ js.Object, stdLib.Error]], 
    fpDashTsLib.libIOEitherMod.IOEither[stdLib.Error, js.Any]
  ] = js.native
}

