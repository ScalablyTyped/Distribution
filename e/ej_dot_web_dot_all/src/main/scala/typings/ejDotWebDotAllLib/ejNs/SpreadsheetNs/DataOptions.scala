package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOptions extends js.Object {
  /** Pass the type to update
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the value to update
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Pass the value2 to update
    */
  var value2: js.UndefOr[scala.Double] = js.undefined
}

object DataOptions {
  @scala.inline
  def apply(
    `type`: java.lang.String = null,
    value: scala.Int | scala.Double = null,
    value2: scala.Int | scala.Double = null
  ): DataOptions = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (value2 != null) __obj.updateDynamic("value2")(value2.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

