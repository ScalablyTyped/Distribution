package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorksheetViewCommon extends js.Object {
  /**
  	 * The currently selected cell
  	 */
  var activeCell: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets the worksheet view's orientation to right-to-left, `false` by default
  	 */
  var rightToLeft: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows or hides the gridlines (shown for cells where borders have not been defined),
  	 * `true` by default
  	 */
  var showGridLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows or hides the row and column headers (e.g. A1, B1 at the top and 1,2,3 on the left,
  	 * `true` by default
  	 */
  var showRowColHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows or hides the ruler in Page Layout, `true` by default
  	 */
  var showRuler: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * 	Percentage zoom to use for the view, `100` by default
  	 */
  var zoomScale: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * 	Normal zoom for the view, `100` by default
  	 */
  var zoomScaleNormal: js.UndefOr[scala.Double] = js.undefined
}

