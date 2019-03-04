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
    val __obj = js.Dynamic.literal(className = className, code = code, data = data, errors = errors, message = message, name = name)
  
    __obj.asInstanceOf[FeathersErrorJSON]
  }
}

