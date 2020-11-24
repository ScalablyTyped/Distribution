package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides dimension values at the specified axis point.
  */
@js.native
trait ASPxClientDashboardItemDataDimensionValue extends js.Object {
  
  /**
    * Gets the display text for the current dimension value.
    */
  def GetDisplayText(): String = js.native
  
  /**
    * Gets the unique value for the current dimension value.
    */
  def GetUniqueValue(): js.Any = js.native
  
  /**
    * Gets the current dimension value.
    */
  def GetValue(): js.Any = js.native
}
object ASPxClientDashboardItemDataDimensionValue {
  
  @scala.inline
  def apply(GetDisplayText: () => String, GetUniqueValue: () => js.Any, GetValue: () => js.Any): ASPxClientDashboardItemDataDimensionValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetUniqueValue = js.Any.fromFunction0(GetUniqueValue), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimensionValue]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemDataDimensionValueOps[Self <: ASPxClientDashboardItemDataDimensionValue] (val x: Self) extends AnyVal {
    
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
    def setGetDisplayText(value: () => String): Self = this.set("GetDisplayText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUniqueValue(value: () => js.Any): Self = this.set("GetUniqueValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("GetValue", js.Any.fromFunction0(value))
  }
}
