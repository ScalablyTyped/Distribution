package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  /**
  			 * Selector specifying which fields to include in a partial response.
  			 */
  var fields: js.UndefOr[String] = js.undefined
  /**
  			 * The text to detect
  			 */
  var q: js.Array[String]
}

object AnonFields {
  @scala.inline
  def apply(q: js.Array[String], fields: String = null): AnonFields = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}

