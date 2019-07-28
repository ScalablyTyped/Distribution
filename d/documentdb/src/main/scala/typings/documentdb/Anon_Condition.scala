package typings.documentdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition extends js.Object {
  /** Conditional HTTP method header value. */
  var condition: String
  /** Conditional HTTP method header type. */
  var `type`: String
}

object Anon_Condition {
  @scala.inline
  def apply(condition: String, `type`: String): Anon_Condition = {
    val __obj = js.Dynamic.literal(condition = condition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Condition]
  }
}

