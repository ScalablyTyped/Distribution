package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides base functionality for the ASPxClientScheduler's forms.
  */
trait ASPxClientFormBase extends StObject {
  
  /**
    * Closes the form.
    */
  def Close(): Unit
  
  /**
    * Occurs when the form has been closed.
    */
  var FormClosed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]]
  
  /**
    * Sets the visibility state of the specified form element.
    * @param element An object specifying the element whose visibility state should be changed.
    * @param isVisible true to display the element; false to hide the element.
    */
  def SetVisibleCore(element: js.Any, isVisible: Boolean): Unit
}
object ASPxClientFormBase {
  
  @scala.inline
  def apply(
    Close: () => Unit,
    FormClosed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]],
    SetVisibleCore: (js.Any, Boolean) => Unit
  ): ASPxClientFormBase = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), FormClosed = FormClosed.asInstanceOf[js.Any], SetVisibleCore = js.Any.fromFunction2(SetVisibleCore))
    __obj.asInstanceOf[ASPxClientFormBase]
  }
  
  @scala.inline
  implicit class ASPxClientFormBaseMutableBuilder[Self <: ASPxClientFormBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormClosed(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]]): Self = StObject.set(x, "FormClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetVisibleCore(value: (js.Any, Boolean) => Unit): Self = StObject.set(x, "SetVisibleCore", js.Any.fromFunction2(value))
  }
}
