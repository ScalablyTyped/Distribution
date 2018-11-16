package typings
package expressDashValidatorLib.checkValidationDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultFactory extends js.Object {
  def apply[T](req: expressLib.expressMod.eNs.Request): Result[T] = js.native
  def withDefaults(): this.type = js.native
  def withDefaults(options: stdLib.Partial[ResultFactoryBuilderOptions]): this.type = js.native
}

