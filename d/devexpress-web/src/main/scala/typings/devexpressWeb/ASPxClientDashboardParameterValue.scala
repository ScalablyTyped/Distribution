package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the parameter value and display text.
  */
@js.native
trait ASPxClientDashboardParameterValue extends StObject {
  
  /**
    * Returns the parameter display text.
    */
  def GetDisplayText(): String = js.native
  
  /**
    * Returns a parameter value.
    */
  def GetValue(): js.Any = js.native
}
object ASPxClientDashboardParameterValue {
  
  @scala.inline
  def apply(GetDisplayText: () => String, GetValue: () => js.Any): ASPxClientDashboardParameterValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardParameterValue]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardParameterValueMutableBuilder[Self <: ASPxClientDashboardParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDisplayText(value: () => String): Self = StObject.set(x, "GetDisplayText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
  }
}
