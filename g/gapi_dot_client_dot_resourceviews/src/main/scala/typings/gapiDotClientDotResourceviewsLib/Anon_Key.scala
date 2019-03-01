package typings
package gapiDotClientDotResourceviewsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  /** [Output Only] Metadata key for this warning. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Metadata value for this warning. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String = null, value: java.lang.String = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Key]
  }
}

