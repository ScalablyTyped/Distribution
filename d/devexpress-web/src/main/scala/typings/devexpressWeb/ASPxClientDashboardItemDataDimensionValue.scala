package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides dimension values at the specified axis point.
  */
@js.native
trait ASPxClientDashboardItemDataDimensionValue extends StObject {
  
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
  implicit class ASPxClientDashboardItemDataDimensionValueMutableBuilder[Self <: ASPxClientDashboardItemDataDimensionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDisplayText(value: () => String): Self = StObject.set(x, "GetDisplayText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUniqueValue(value: () => js.Any): Self = StObject.set(x, "GetUniqueValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
  }
}
