package typings
package extjsLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INavigation
  extends extjsLib.ExtNs.IBase {
  /** [Method] Restores the zoom to the original value  */
  var restoreZoom: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Zooms the chart to the specified selection range
  		* @param zoomConfig Object
  		*/
  var setZoom: js.UndefOr[js.Function1[/* zoomConfig */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

