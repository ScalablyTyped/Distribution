package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the measure value and display text.
  */
@js.native
trait ASPxClientDashboardItemDataMeasureValue extends js.Object {
  
  /**
    * Gets the measure display text.
    */
  def GetDisplayText(): String = js.native
  
  /**
    * Gets the measure value.
    */
  def GetValue(): js.Any = js.native
}
object ASPxClientDashboardItemDataMeasureValue {
  
  @scala.inline
  def apply(GetDisplayText: () => String, GetValue: () => js.Any): ASPxClientDashboardItemDataMeasureValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasureValue]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemDataMeasureValueOps[Self <: ASPxClientDashboardItemDataMeasureValue] (val x: Self) extends AnyVal {
    
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
    def setGetValue(value: () => js.Any): Self = this.set("GetValue", js.Any.fromFunction0(value))
  }
}
