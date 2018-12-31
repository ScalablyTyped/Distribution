package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClickRepeater extends IObservable {
  /** [Config Option] (Boolean) */
  var accelerate: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Disables the repeater and stops events from firing
  		* @param force Object
  		*/
  var disable: js.UndefOr[js.Function1[/* force */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var el: js.UndefOr[js.Any] = js.undefined
  /** [Method] Enables the repeater and allows events to fire  */
  var enable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Convenience function for setting disabled enabled by boolean
  		* @param disabled Boolean
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var stopDefault: js.UndefOr[scala.Boolean] = js.undefined
}

