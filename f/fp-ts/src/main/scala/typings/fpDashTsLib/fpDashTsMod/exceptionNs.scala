package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "exception")
@js.native
object exceptionNs extends js.Object {
  def catchError[A](
    ma: fpDashTsLib.libIOMod.IO[A],
    handler: js.Function1[/* e */ stdLib.Error, fpDashTsLib.libIOMod.IO[A]]
  ): fpDashTsLib.libIOMod.IO[A] = js.native
  def error(message: java.lang.String): stdLib.Error = js.native
  def message(e: stdLib.Error): java.lang.String = js.native
  def stack(e: stdLib.Error): fpDashTsLib.libOptionMod.Option[java.lang.String] = js.native
  def throwError[A](e: stdLib.Error): fpDashTsLib.libIOMod.IO[A] = js.native
  def tryCatch[A](ma: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libIOMod.IO[fpDashTsLib.libEitherMod.Either[stdLib.Error, A]] = js.native
}

