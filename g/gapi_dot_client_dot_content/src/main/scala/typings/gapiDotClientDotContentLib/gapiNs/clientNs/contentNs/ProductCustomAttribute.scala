package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCustomAttribute extends js.Object {
  /** The name of the attribute. Underscores will be replaced by spaces upon insertion. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the attribute. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Free-form unit of the attribute. Unit can only be used for values of type INT or FLOAT. */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the attribute. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ProductCustomAttribute {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    `type`: java.lang.String = null,
    unit: java.lang.String = null,
    value: java.lang.String = null
  ): ProductCustomAttribute = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ProductCustomAttribute]
  }
}

