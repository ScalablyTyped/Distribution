package typings.googlePicker.google.picker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Picker extends StObject {
  
  def dispose(): Unit
  
  def isVisible(): Boolean
  
  def setCallback(method: js.Function1[/* result */ ResponseObject, Unit]): Picker
  
  def setRelayUrl(url: String): Picker
  
  def setVisible(visible: Boolean): Picker
}
object Picker {
  
  inline def apply(
    dispose: () => Unit,
    isVisible: () => Boolean,
    setCallback: js.Function1[/* result */ ResponseObject, Unit] => Picker,
    setRelayUrl: String => Picker,
    setVisible: Boolean => Picker
  ): Picker = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isVisible = js.Any.fromFunction0(isVisible), setCallback = js.Any.fromFunction1(setCallback), setRelayUrl = js.Any.fromFunction1(setRelayUrl), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[Picker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Picker] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setSetCallback(value: js.Function1[/* result */ ResponseObject, Unit] => Picker): Self = StObject.set(x, "setCallback", js.Any.fromFunction1(value))
    
    inline def setSetRelayUrl(value: String => Picker): Self = StObject.set(x, "setRelayUrl", js.Any.fromFunction1(value))
    
    inline def setSetVisible(value: Boolean => Picker): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
