package typings.feathersjsErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersErrorJSON extends js.Object {
  val className: String
  val code: Double
  val data: js.Any
  val errors: js.Any
  val message: String
  val name: String
}

object FeathersErrorJSON {
  @scala.inline
  def apply(className: String, code: Double, data: js.Any, errors: js.Any, message: String, name: String): FeathersErrorJSON = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersErrorJSON]
  }
}

