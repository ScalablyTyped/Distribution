package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Column extends js.Object {
  /**
  	 * Can be a string to set one row high header or an array to set multi-row high header
  	 */
  var header: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
  	 * Hides the column
  	 */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The name of the properties associated with this column in each row
  	 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set an outline level for columns
  	 */
  var outlineLevel: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Styles applied to the column
  	 */
  var style: js.UndefOr[Style] = js.undefined
  /**
  	 * The width of the column
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

