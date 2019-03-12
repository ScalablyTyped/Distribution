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
    isVisible: () => scala.Boolean,
    setCallback: js.Function => Picker,
    setRelayUrl: java.lang.String => Picker,
    setVisible: scala.Boolean => Picker
  ): Picker = {
    val __obj = js.Dynamic.literal(isVisible = js.Any.fromFunction0(isVisible), setCallback = js.Any.fromFunction1(setCallback), setRelayUrl = js.Any.fromFunction1(setRelayUrl), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[Picker]
  }
}

