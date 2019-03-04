package typings
package googleDotPickerLib.googleNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Picker extends js.Object {
  def isVisible(): scala.Boolean
  def setCallback(method: js.Function): Picker
  def setRelayUrl(url: java.lang.String): Picker
  def setVisible(visible: scala.Boolean): Picker
}

object Picker {
  @scala.inline
  def apply(
    isVisible: js.Function0[scala.Boolean],
    setCallback: js.Function1[js.Function, Picker],
    setRelayUrl: js.Function1[java.lang.String, Picker],
    setVisible: js.Function1[scala.Boolean, Picker]
  ): Picker = {
    val __obj = js.Dynamic.literal(isVisible = isVisible, setCallback = setCallback, setRelayUrl = setRelayUrl, setVisible = setVisible)
  
    __obj.asInstanceOf[Picker]
  }
}

