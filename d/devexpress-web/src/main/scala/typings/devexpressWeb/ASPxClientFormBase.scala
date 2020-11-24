package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides base functionality for the ASPxClientScheduler's forms.
  */
@js.native
trait ASPxClientFormBase extends js.Object {
  
  /**
    * Closes the form.
    */
  def Close(): Unit = js.native
  
  /**
    * Occurs when the form has been closed.
    */
  var FormClosed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]] = js.native
  
  /**
    * Sets the visibility state of the specified form element.
    * @param element An object specifying the element whose visibility state should be changed.
    * @param isVisible true to display the element; false to hide the element.
    */
  def SetVisibleCore(element: js.Any, isVisible: Boolean): Unit = js.native
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
  implicit class ASPxClientFormBaseOps[Self <: ASPxClientFormBase] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormClosed(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]]): Self = this.set("FormClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetVisibleCore(value: (js.Any, Boolean) => Unit): Self = this.set("SetVisibleCore", js.Any.fromFunction2(value))
  }
}
