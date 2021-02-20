package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemMasterFilterStateChanged event.
  */
@js.native
trait ASPxClientDashboardItemMasterFilterStateChangedEventArgs extends ASPxClientDashboardItemEventArgs {
  
  /**
    * Gets the currently selected values.
    */
  var Values: js.Array[js.Array[js.Object]] = js.native
}
object ASPxClientDashboardItemMasterFilterStateChangedEventArgs {
  
  @scala.inline
  def apply(
    IsNullValue: js.Any => Boolean,
    IsOthersValue: js.Any => Boolean,
    ItemName: String,
    Values: js.Array[js.Array[js.Object]]
  ): ASPxClientDashboardItemMasterFilterStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemMasterFilterStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemMasterFilterStateChangedEventArgsMutableBuilder[Self <: ASPxClientDashboardItemMasterFilterStateChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[js.Array[js.Object]]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Object]*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
