package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A range in the Range Filter or Date Filter dashboard item.
  */
trait ASPxClientDashboardRangeFilterSelection extends StObject {
  
  /**
    * Gets or sets a maximum value in the range of the Range Filter dashboard item.
    */
  var Maximum: js.Any
  
  /**
    * Gets or sets a minimum value in the range of the Range Filter dashboard item.
    */
  var Minimum: js.Any
}
object ASPxClientDashboardRangeFilterSelection {
  
  @scala.inline
  def apply(Maximum: js.Any, Minimum: js.Any): ASPxClientDashboardRangeFilterSelection = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardRangeFilterSelection]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardRangeFilterSelectionMutableBuilder[Self <: ASPxClientDashboardRangeFilterSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: js.Any): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: js.Any): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
  }
}
