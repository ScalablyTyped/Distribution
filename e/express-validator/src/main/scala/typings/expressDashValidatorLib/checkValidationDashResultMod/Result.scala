package typings
package expressDashValidatorLib.checkValidationDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result[T] extends js.Object {
  def array(): js.Array[T] = js.native
  def array(options: expressDashValidatorLib.Anon_OnlyFirstError): js.Array[T] = js.native
  def formatWith(formatter: ErrorFormatter[T]): this.type = js.native
  def isEmpty(): scala.Boolean = js.native
  def mapped(): stdLib.Record[java.lang.String, T] = js.native
  def `throw`(): scala.Unit = js.native
}

