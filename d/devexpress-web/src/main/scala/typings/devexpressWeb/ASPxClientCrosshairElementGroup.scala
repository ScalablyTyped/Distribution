package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the CrosshairElementGroup class.
  */
@js.native
trait ASPxClientCrosshairElementGroup extends js.Object {
  
  /**
    * Returns the collection of elements that the Crosshair Cursor displays in the group.
    */
  var CrosshairElements: js.Array[ASPxClientCrosshairElement] = js.native
  
  /**
    * Returns the collection of indicator elements that the Crosshair Cursor displays in the group.
    */
  var CrosshairIndicatorElements: js.Array[ASPxClientCrosshairIndicatorElement] = js.native
  
  /**
    * Returns the Crosshair Cursor group's Header element.
    */
  var HeaderElement: ASPxClientCrosshairGroupHeaderElement = js.native
}
object ASPxClientCrosshairElementGroup {
  
  @scala.inline
  def apply(
    CrosshairElements: js.Array[ASPxClientCrosshairElement],
    CrosshairIndicatorElements: js.Array[ASPxClientCrosshairIndicatorElement],
    HeaderElement: ASPxClientCrosshairGroupHeaderElement
  ): ASPxClientCrosshairElementGroup = {
    val __obj = js.Dynamic.literal(CrosshairElements = CrosshairElements.asInstanceOf[js.Any], CrosshairIndicatorElements = CrosshairIndicatorElements.asInstanceOf[js.Any], HeaderElement = HeaderElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairElementGroup]
  }
  
  @scala.inline
  implicit class ASPxClientCrosshairElementGroupOps[Self <: ASPxClientCrosshairElementGroup] (val x: Self) extends AnyVal {
    
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
    def setCrosshairElementsVarargs(value: ASPxClientCrosshairElement*): Self = this.set("CrosshairElements", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairElements(value: js.Array[ASPxClientCrosshairElement]): Self = this.set("CrosshairElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairIndicatorElementsVarargs(value: ASPxClientCrosshairIndicatorElement*): Self = this.set("CrosshairIndicatorElements", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairIndicatorElements(value: js.Array[ASPxClientCrosshairIndicatorElement]): Self = this.set("CrosshairIndicatorElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderElement(value: ASPxClientCrosshairGroupHeaderElement): Self = this.set("HeaderElement", value.asInstanceOf[js.Any])
  }
}
