package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHint.Hiding event.
  */
@js.native
trait ASPxClientHintHidingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the event should be canceled.
    */
  var cancel: Boolean = js.native
  
  /**
    * Gets the object that is the hint's content.
    */
  var contentElement: js.Any = js.native
  
  /**
    * Gets the object that is the hint element.
    */
  var hintElement: js.Any = js.native
  
  /**
    * Gets the object that is the hint's target element.
    */
  var targetElement: js.Any = js.native
  
  /**
    * Gets the object that is the hint's title.
    */
  var titleElement: js.Any = js.native
}
object ASPxClientHintHidingEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    contentElement: js.Any,
    hintElement: js.Any,
    targetElement: js.Any,
    titleElement: js.Any
  ): ASPxClientHintHidingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], contentElement = contentElement.asInstanceOf[js.Any], hintElement = hintElement.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any], titleElement = titleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHintHidingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHintHidingEventArgsOps[Self <: ASPxClientHintHidingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentElement(value: js.Any): Self = this.set("contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintElement(value: js.Any): Self = this.set("hintElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetElement(value: js.Any): Self = this.set("targetElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleElement(value: js.Any): Self = this.set("titleElement", value.asInstanceOf[js.Any])
  }
}
