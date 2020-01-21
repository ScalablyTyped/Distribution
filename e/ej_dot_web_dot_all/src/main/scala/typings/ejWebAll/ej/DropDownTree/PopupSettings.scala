package typings.ejWebAll.ej.DropDownTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupSettings extends js.Object {
  /** Defines the height of the popup wrapper in the DropDownTree control.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** The DropDownTree control is displayed with the popup.
    */
  var showPopupOnLoad: js.UndefOr[Boolean] = js.undefined
  /** Defines the width of the popup wrapper in the DropDownTree control.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object PopupSettings {
  @scala.inline
  def apply(
    height: String | Double = null,
    showPopupOnLoad: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null
  ): PopupSettings = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopupOnLoad)) __obj.updateDynamic("showPopupOnLoad")(showPopupOnLoad.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupSettings]
  }
}

