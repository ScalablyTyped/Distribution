package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldsTarget extends js.Object {
  /**
  			 * Selector specifying which fields to include in a partial response.
  			 */
  var fields: js.UndefOr[String] = js.undefined
  /**
  			 * the language and collation in which the localized results should be returned
  			 */
  var target: js.UndefOr[String] = js.undefined
}

object AnonFieldsTarget {
  @scala.inline
  def apply(fields: String = null, target: String = null): AnonFieldsTarget = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldsTarget]
  }
}

