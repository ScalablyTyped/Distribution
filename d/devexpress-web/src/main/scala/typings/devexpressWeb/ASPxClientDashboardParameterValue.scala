package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the parameter value and display text.
  */
trait ASPxClientDashboardParameterValue extends StObject {
  
  /**
    * Returns the parameter display text.
    */
  def GetDisplayText(): String
  
  /**
    * Returns a parameter value.
    */
  def GetValue(): Any
}
object ASPxClientDashboardParameterValue {
  
  inline def apply(GetDisplayText: () => String, GetValue: () => Any): ASPxClientDashboardParameterValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardParameterValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDashboardParameterValue] (val x: Self) extends AnyVal {
    
    inline def setGetDisplayText(value: () => String): Self = StObject.set(x, "GetDisplayText", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => Any): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
  }
}
