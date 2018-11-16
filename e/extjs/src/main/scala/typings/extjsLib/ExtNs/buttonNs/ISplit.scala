package typings
package extjsLib.ExtNs.buttonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISplit extends IButton {
  /** [Config Option] (Function) */
  var arrowHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var arrowTooltip: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets this button s arrow click handler
  		* @param handler Function The function to call when the arrow is clicked.
  		* @param scope Object Scope for the function passed above.
  		*/
  var setArrowHandler: js.UndefOr[
    js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

