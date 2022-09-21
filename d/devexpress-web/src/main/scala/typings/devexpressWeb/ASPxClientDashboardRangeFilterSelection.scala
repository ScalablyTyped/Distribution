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
  var Maximum: Any
  
  /**
    * Gets or sets a minimum value in the range of the Range Filter dashboard item.
    */
  var Minimum: Any
}
object ASPxClientDashboardRangeFilterSelection {
  
  inline def apply(Maximum: Any, Minimum: Any): ASPxClientDashboardRangeFilterSelection = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardRangeFilterSelection]
  }
  
  extension [Self <: ASPxClientDashboardRangeFilterSelection](x: Self) {
    
    inline def setMaximum(value: Any): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Any): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
  }
}
