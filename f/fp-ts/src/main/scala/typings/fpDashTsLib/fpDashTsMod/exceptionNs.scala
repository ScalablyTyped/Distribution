package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "exception")
@js.native
object exceptionNs extends js.Object {
  val catchError: js.Function2[
    /* ma */ fpDashTsLib.libIOMod.IO[js.Any], 
    /* handler */ js.Function1[/* e */ stdLib.Error, fpDashTsLib.libIOMod.IO[js.Any]], 
    fpDashTsLib.libIOMod.IO[js.Any]
  ] = js.native
  val error: js.Function1[/* message */ java.lang.String, stdLib.Error] = js.native
  val message: js.Function1[/* e */ stdLib.Error, java.lang.String] = js.native
  val stack: js.Function1[/* e */ stdLib.Error, fpDashTsLib.libOptionMod.Option[java.lang.String]] = js.native
  val throwError: js.Function1[/* e */ stdLib.Error, fpDashTsLib.libIOMod.IO[js.Any]] = js.native
  val tryCatch: js.Function1[
    /* ma */ fpDashTsLib.libIOMod.IO[js.Any], 
    fpDashTsLib.libIOMod.IO[fpDashTsLib.libEitherMod.Either[stdLib.Error, js.Any]]
  ] = js.native
}

