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
  def GetValue(): Any
}
object ASPxClientDashboardItemDataMeasureValue {
  
  inline def apply(GetDisplayText: () => String, GetValue: () => Any): ASPxClientDashboardItemDataMeasureValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasureValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDashboardItemDataMeasureValue] (val x: Self) extends AnyVal {
    
    inline def setGetDisplayText(value: () => String): Self = StObject.set(x, "GetDisplayText", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => Any): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
  }
}
