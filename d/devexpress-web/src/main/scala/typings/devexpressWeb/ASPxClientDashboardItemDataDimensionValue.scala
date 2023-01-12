package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides dimension values at the specified axis point.
  */
trait ASPxClientDashboardItemDataDimensionValue extends StObject {
  
  /**
    * Gets the display text for the current dimension value.
    */
  def GetDisplayText(): String
  
  /**
    * Gets the unique value for the current dimension value.
    */
  def GetUniqueValue(): Any
  
  /**
    * Gets the current dimension value.
    */
  def GetValue(): Any
}
object ASPxClientDashboardItemDataDimensionValue {
  
  inline def apply(GetDisplayText: () => String, GetUniqueValue: () => Any, GetValue: () => Any): ASPxClientDashboardItemDataDimensionValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetUniqueValue = js.Any.fromFunction0(GetUniqueValue), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimensionValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDashboardItemDataDimensionValue] (val x: Self) extends AnyVal {
    
    inline def setGetDisplayText(value: () => String): Self = StObject.set(x, "GetDisplayText", js.Any.fromFunction0(value))
    
    inline def setGetUniqueValue(value: () => Any): Self = StObject.set(x, "GetUniqueValue", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => Any): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
  }
}
