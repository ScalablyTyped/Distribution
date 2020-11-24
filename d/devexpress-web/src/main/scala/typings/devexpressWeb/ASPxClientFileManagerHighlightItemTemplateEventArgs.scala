package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.HighlightItemTemplate event.
  */
@js.native
trait ASPxClientFileManagerHighlightItemTemplateEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a string that is a filter value specified by the filter box.
    */
  var filterValue: String = js.native
  
  /**
    * Get the name of the cascading style sheet (CSS) class associated with an item in the highlighted state.
    */
  var highlightCssClassName: String = js.native
  
  /**
    * Gets the name of the item currently being processed.
    */
  var itemName: String = js.native
  
  /**
    * Gets an element containing the item template.
    */
  var templateElement: String = js.native
}
object ASPxClientFileManagerHighlightItemTemplateEventArgs {
  
  @scala.inline
  def apply(filterValue: String, highlightCssClassName: String, itemName: String, templateElement: String): ASPxClientFileManagerHighlightItemTemplateEventArgs = {
    val __obj = js.Dynamic.literal(filterValue = filterValue.asInstanceOf[js.Any], highlightCssClassName = highlightCssClassName.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], templateElement = templateElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerHighlightItemTemplateEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerHighlightItemTemplateEventArgsOps[Self <: ASPxClientFileManagerHighlightItemTemplateEventArgs] (val x: Self) extends AnyVal {
    
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
    def setFilterValue(value: String): Self = this.set("filterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightCssClassName(value: String): Self = this.set("highlightCssClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemName(value: String): Self = this.set("itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateElement(value: String): Self = this.set("templateElement", value.asInstanceOf[js.Any])
  }
}
