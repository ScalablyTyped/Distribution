package typings
package atFeathersjsErrorsLib.atFeathersjsErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersErrorJSON extends js.Object {
  val className: java.lang.String
  val code: scala.Double
  val data: js.Any
  val errors: js.Any
  val message: java.lang.String
  val name: java.lang.String
}

object FeathersErrorJSON {
  @scala.inline
  def apply(
    className: java.lang.String,
    code: scala.Double,
    data: js.Any,
    errors: js.Any,
    message: java.lang.String,
    name: java.lang.String
  ): FeathersErrorJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FeathersErrorJSON]
  }
}

