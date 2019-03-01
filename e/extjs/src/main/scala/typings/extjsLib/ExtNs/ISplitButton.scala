package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplitButton
  extends extjsLib.ExtNs.buttonNs.IButton {
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

object ISplitButton {
  @scala.inline
  def apply(
    IButton: extjsLib.ExtNs.buttonNs.IButton = null,
    arrowHandler: js.Any = null,
    arrowTooltip: java.lang.String = null,
    setArrowHandler: js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null
  ): ISplitButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IButton)
    if (arrowHandler != null) __obj.updateDynamic("arrowHandler")(arrowHandler)
    if (arrowTooltip != null) __obj.updateDynamic("arrowTooltip")(arrowTooltip)
    if (setArrowHandler != null) __obj.updateDynamic("setArrowHandler")(setArrowHandler)
    __obj.asInstanceOf[ISplitButton]
  }
}

