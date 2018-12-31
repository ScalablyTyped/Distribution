package typings
package extjsLib.ExtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBar
  extends extjsLib.ExtNs.panelNs.IHeader {
  /** [Method] Called by the layout system after the Component has been laid out
  		* @param width Object
  		*/
  @JSName("afterComponentLayout")
  var afterComponentLayout_IBar: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isTabBar: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Method] This method is invoked after a new Component has been removed
  		* @param tab Object
  		*/
  @JSName("onRemove")
  var onRemove_IBar: js.UndefOr[js.Function1[/* tab */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IBar: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[scala.Boolean] = js.undefined
}

