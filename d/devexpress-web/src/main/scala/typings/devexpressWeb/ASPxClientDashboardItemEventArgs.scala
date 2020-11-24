package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base class for classes that provide data for client-side events related to dashboard items.
  */
@js.native
trait ASPxClientDashboardItemEventArgs extends ASPxClientEventArgs {
  
  /**
    * Returns whether the specified value is null. true, if the specified value is null; otherwise, false.
    * @param value The specified value.
    */
  def IsNullValue(value: js.Any): Boolean = js.native
  
  /**
    * Returns whether the specified value is 'others'. true, if the specified value is 'others'; otherwise, false.
    * @param value The specified value.
    */
  def IsOthersValue(value: js.Any): Boolean = js.native
  
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String = js.native
}
object ASPxClientDashboardItemEventArgs {
  
  @scala.inline
  def apply(IsNullValue: js.Any => Boolean, IsOthersValue: js.Any => Boolean, ItemName: String): ASPxClientDashboardItemEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemEventArgsOps[Self <: ASPxClientDashboardItemEventArgs] (val x: Self) extends AnyVal {
    
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
    def setIsNullValue(value: js.Any => Boolean): Self = this.set("IsNullValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsOthersValue(value: js.Any => Boolean): Self = this.set("IsOthersValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemName(value: String): Self = this.set("ItemName", value.asInstanceOf[js.Any])
  }
}
