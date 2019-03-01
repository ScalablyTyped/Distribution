package typings
package gapiDotTranslateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  /**
  			 * Selector specifying which fields to include in a partial response.
  			 */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * The text to detect
  			 */
  var q: js.Array[java.lang.String]
}

object Anon_Fields {
  @scala.inline
  def apply(q: js.Array[java.lang.String], fields: java.lang.String = null): Anon_Fields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("q")(q)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[Anon_Fields]
  }
}

