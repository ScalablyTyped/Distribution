package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the measure value and display text.
  */
trait ASPxClientDashboardItemDataMeasureValue extends StObject {
  
  /**
    * Gets the measure display text.
    */
  def GetDisplayText(): String
  
  /**
    * Gets the measure value.
    */
  def GetValue(): js.Any
}
object ASPxClientDashboardItemDataMeasureValue {
  
  @scala.inline
  def apply(GetDisplayText: () => String, GetValue: () => js.Any): ASPxClientDashboardItemDataMeasureValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasureValue]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemDataMeasureValueMutableBuilder[Self <: ASPxClientDashboardItemDataMeasureValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDisplayText(value: () => String): Self = StObject.set(x, "GetDisplayText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
  }
}
