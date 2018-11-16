package typings
package fpDashTsLib.libIOEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/IOEither", JSImport.Namespace)
@js.native
object libIOEitherModMembers extends js.Object {
  val URI: /* IOEither */ java.lang.String = js.native
  val fromEither: js.Function1[/* fa */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], IOEither[js.Any, js.Any]] = js.native
  val fromLeft: js.Function1[/* l */ js.Any, IOEither[js.Any, js.Any]] = js.native
  val ioEither: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libAltMod.Alt2[URI] = js.native
  val left: js.Function1[/* fa */ fpDashTsLib.libIOMod.IO[js.Any], IOEither[js.Any, js.Any]] = js.native
  val right: js.Function1[/* fa */ fpDashTsLib.libIOMod.IO[js.Any], IOEither[js.Any, js.Any]] = js.native
  val tryCatch: js.Function2[
    /* f */ fpDashTsLib.libFunctionMod.Lazy[js.Any], 
    /* onerror */ js.UndefOr[js.Function1[/* reason */ js.Object, stdLib.Error]], 
    IOEither[stdLib.Error, js.Any]
  ] = js.native
}

