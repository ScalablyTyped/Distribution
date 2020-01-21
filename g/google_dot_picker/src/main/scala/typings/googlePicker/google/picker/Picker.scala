package typings.googlePicker.google.picker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Picker extends js.Object {
  def dispose(): Unit
  def isVisible(): Boolean
  def setCallback(method: js.Function): Picker
  def setRelayUrl(url: String): Picker
  def setVisible(visible: Boolean): Picker
}

object Picker {
  @scala.inline
  def apply(
    dispose: () => Unit,
    isVisible: () => Boolean,
    setCallback: js.Function => Picker,
    setRelayUrl: String => Picker,
    setVisible: Boolean => Picker
  ): Picker = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isVisible = js.Any.fromFunction0(isVisible), setCallback = js.Any.fromFunction1(setCallback), setRelayUrl = js.Any.fromFunction1(setRelayUrl), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[Picker]
  }
}

