package typings
package ejDotWebDotAllLib.ejNs.DropDownTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupSettings extends js.Object {
  /** Defines the height of the popup wrapper in the DropDownTree control.
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** The DropDownTree control is displayed with the popup.
    */
  var showPopupOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the width of the popup wrapper in the DropDownTree control.
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object PopupSettings {
  @scala.inline
  def apply(
    height: java.lang.String | scala.Double = null,
    showPopupOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double = null
  ): PopupSettings = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopupOnLoad)) __obj.updateDynamic("showPopupOnLoad")(showPopupOnLoad)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupSettings]
  }
}

