package typings
package extjsLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IArea extends ICartesian {
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Highlight this entire series
  		* @param item Object Info about the item; same format as returned by getItemForPoint.
  		*/
  var highlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Method] Un highlights the specified item
  		* @param item Object Info about the item; same format as returned by getItemForPoint
  		*/
  @JSName("unHighlightItem")
  var unHighlightItem_IArea: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] UnHighlight this entire series
  		* @param item Object Info about the item; same format as returned by getItemForPoint.
  		*/
  var unHighlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

