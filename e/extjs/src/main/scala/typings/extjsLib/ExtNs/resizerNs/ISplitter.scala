package typings
package extjsLib.ExtNs.resizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplitter
  extends extjsLib.ExtNs.IComponent {
  /** [Config Option] (Boolean) */
  var collapseOnDblClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/Ext.panel.Panel) */
  var collapseTarget: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var defaultSplitMax: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var defaultSplitMin: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the config object with an xclass property for the splitter tracker  */
  var getTrackerConfig: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_ISplitter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (String) */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var performCollapse: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Work around IE bug
  		* @returns Ext.Component this
  		*/
  @JSName("setSize")
  var setSize_ISplitter: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Config Option] (Number) */
  var size: js.UndefOr[scala.Double] = js.undefined
}

