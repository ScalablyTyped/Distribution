package typings.durandal.dialogMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Models a message box's message, title and options.
  * @class
  */
@js.native
trait Box extends js.Object {
  
  /**
    * Provides the view to the composition system.
    * @returns {DOMElement} The view of the message box.
    */
  def getView(): HTMLElement = js.native
  
  /**
    * Selects an option and closes the message box, returning the selected option through the dialog system's promise.
    * @param {string} dialogResult The result to select.
    */
  def selectOption(dialogResult: String): Unit = js.native
}
object Box {
  
  @scala.inline
  def apply(getView: () => HTMLElement, selectOption: String => Unit): Box = {
    val __obj = js.Dynamic.literal(getView = js.Any.fromFunction0(getView), selectOption = js.Any.fromFunction1(selectOption))
    __obj.asInstanceOf[Box]
  }
  
  @scala.inline
  implicit class BoxOps[Self <: Box] (val x: Self) extends AnyVal {
    
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
    def setGetView(value: () => HTMLElement): Self = this.set("getView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectOption(value: String => Unit): Self = this.set("selectOption", js.Any.fromFunction1(value))
  }
}
