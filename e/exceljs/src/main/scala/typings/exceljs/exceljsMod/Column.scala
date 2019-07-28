package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /**
  	 * Can be a string to set one row high header or an array to set multi-row high header
  	 */
  var header: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
  	 * Hides the column
  	 */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The name of the properties associated with this column in each row
  	 */
  var key: js.UndefOr[String] = js.undefined
  /**
  	 * Set an outline level for columns
  	 */
  var outlineLevel: js.UndefOr[Double] = js.undefined
  /**
  	 * Styles applied to the column
  	 */
  var style: js.UndefOr[Style] = js.undefined
  /**
  	 * The width of the column
  	 */
  var width: js.UndefOr[Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    header: String | js.Array[String] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    outlineLevel: Int | Double = null,
    style: Style = null,
    width: Int | Double = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (key != null) __obj.updateDynamic("key")(key)
    if (outlineLevel != null) __obj.updateDynamic("outlineLevel")(outlineLevel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

