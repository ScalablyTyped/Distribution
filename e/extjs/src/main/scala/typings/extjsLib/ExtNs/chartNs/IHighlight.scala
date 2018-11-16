package typings
package extjsLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IHighlight
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.undefined
  /** [Method] Highlight the given series item
  		* @param item Object Info about the item; same format as returned by #getItemForPoint.
  		*/
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

