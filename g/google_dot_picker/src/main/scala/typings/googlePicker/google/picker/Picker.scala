package typings.googlePicker.google.picker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Picker extends js.Object {
  
  def dispose(): Unit = js.native
  
  def isVisible(): Boolean = js.native
  
  def setCallback(method: js.Function): Picker = js.native
  
  def setRelayUrl(url: String): Picker = js.native
  
  def setVisible(visible: Boolean): Picker = js.native
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
  
  @scala.inline
  implicit class PickerOps[Self <: Picker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCallback(value: js.Function => Picker): Self = this.set("setCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRelayUrl(value: String => Picker): Self = this.set("setRelayUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Picker): Self = this.set("setVisible", js.Any.fromFunction1(value))
  }
}
