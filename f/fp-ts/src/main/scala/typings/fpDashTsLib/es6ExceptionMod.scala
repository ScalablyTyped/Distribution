package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Exception", JSImport.Namespace)
@js.native
object es6ExceptionMod extends js.Object {
  def catchError[A](
    ma: fpDashTsLib.es6IOMod.IO[A],
    handler: js.Function1[/* e */ stdLib.Error, fpDashTsLib.es6IOMod.IO[A]]
  ): fpDashTsLib.es6IOMod.IO[A] = js.native
  def error(message: java.lang.String): stdLib.Error = js.native
  def message(e: stdLib.Error): java.lang.String = js.native
  def stack(e: stdLib.Error): fpDashTsLib.es6OptionMod.Option[java.lang.String] = js.native
  def throwError[A](e: stdLib.Error): fpDashTsLib.es6IOMod.IO[A] = js.native
  def tryCatch[A](ma: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6IOMod.IO[fpDashTsLib.es6EitherMod.Either[stdLib.Error, A]] = js.native
}

