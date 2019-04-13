package typings
package expressDashValidatorLib.expressDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorFunction extends js.Object {
  def apply(item: java.lang.String): Validator = js.native
  def apply(item: java.lang.String, message: js.Any): Validator = js.native
  def apply(item: js.Array[java.lang.String]): Validator = js.native
  def apply(item: js.Array[java.lang.String], message: js.Any): Validator = js.native
  def apply(item: scala.Double): Validator = js.native
  def apply(item: scala.Double, message: js.Any): Validator = js.native
  def apply(schema: js.Object): Validator = js.native
}

