package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameter interface for parameterized queries */
trait IQueryParam extends js.Object {
  /** Name to use in the query */
  var name: String
  /** Value of the parameter */
  var value: js.Any
}

object IQueryParam {
  @scala.inline
  def apply(name: String, value: js.Any): IQueryParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryParam]
  }
}

