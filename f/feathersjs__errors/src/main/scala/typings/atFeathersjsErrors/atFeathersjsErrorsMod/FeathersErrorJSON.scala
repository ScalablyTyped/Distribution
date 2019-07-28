package typings.atFeathersjsErrors.atFeathersjsErrorsMod

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
    val __obj = js.Dynamic.literal(className = className, code = code, data = data, errors = errors, message = message, name = name)
  
    __obj.asInstanceOf[FeathersErrorJSON]
  }
}

