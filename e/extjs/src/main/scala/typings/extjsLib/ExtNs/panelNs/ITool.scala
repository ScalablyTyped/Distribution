package typings
package extjsLib.ExtNs.panelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITool
  extends extjsLib.ExtNs.IComponent {
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var isTool: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the type of the tool
  		* @param type String The new type. See the type config.
  		* @returns Ext.panel.Tool this
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var stopEvent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.Component) */
  var toolOwner: js.UndefOr[extjsLib.ExtNs.IComponent] = js.undefined
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

