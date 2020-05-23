package typings.documentdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /** Conditional HTTP method header value. */
  var condition: String
  /** Conditional HTTP method header type. */
  var `type`: String
}

object Condition {
  @scala.inline
  def apply(condition: String, `type`: String): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

