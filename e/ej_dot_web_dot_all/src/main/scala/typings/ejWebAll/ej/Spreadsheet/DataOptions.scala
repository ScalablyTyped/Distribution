package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOptions extends js.Object {
  /** Pass the type to update
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Pass the value to update
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Pass the value2 to update
    */
  var value2: js.UndefOr[Double] = js.undefined
}

object DataOptions {
  @scala.inline
  def apply(
    `type`: String = null,
    value: js.UndefOr[Double] = js.undefined,
    value2: js.UndefOr[Double] = js.undefined
  ): DataOptions = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value2)) __obj.updateDynamic("value2")(value2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

