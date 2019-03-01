package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameter interface for parameterized queries */
trait IQueryParam extends js.Object {
  /** Name to use in the query */
  var name: java.lang.String
  /** Value of the parameter */
  var value: js.Any
}

object IQueryParam {
  @scala.inline
  def apply(name: java.lang.String, value: js.Any): IQueryParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IQueryParam]
  }
}

