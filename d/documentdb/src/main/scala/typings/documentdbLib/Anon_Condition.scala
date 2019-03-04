package typings
package documentdbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition extends js.Object {
  /** Conditional HTTP method header value. */
  var condition: java.lang.String
  /** Conditional HTTP method header type. */
  var `type`: java.lang.String
}

object Anon_Condition {
  @scala.inline
  def apply(condition: java.lang.String, `type`: java.lang.String): Anon_Condition = {
    val __obj = js.Dynamic.literal(condition = condition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Condition]
  }
}

