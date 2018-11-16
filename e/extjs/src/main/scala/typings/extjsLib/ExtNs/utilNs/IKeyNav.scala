package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IKeyNav
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var defaultEventAction: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Destroy this KeyNav
  		* @param removeEl Boolean Pass true to remove the element associated with this KeyNav.
  		*/
  var destroy: js.UndefOr[js.Function1[/* removeEl */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Disables this KeyNav  */
  var disable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Enables this KeyNav  */
  var enable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var eventName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var forceKeyDown: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.util.KeyMap) */
  var keyMap: js.UndefOr[IKeyMap] = js.undefined
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Convenience function for setting disabled enabled by boolean
  		* @param disabled Boolean
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.undefined
}

