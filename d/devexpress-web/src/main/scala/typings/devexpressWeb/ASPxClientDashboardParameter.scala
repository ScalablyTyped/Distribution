package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side dashboard parameter.
  */
@js.native
trait ASPxClientDashboardParameter extends StObject {
  
  /**
    * Returns a default parameter value.
    */
  def GetDefaultValue(): js.Any = js.native
  
  /**
    * Returns the parameter's description displayed to an end-user.
    */
  def GetDescription(): String = js.native
  
  /**
    * Returns a parameter name.
    */
  def GetName(): String = js.native
  
  /**
    * Returns a parameter type.
    */
  def GetType(): String = js.native
  
  /**
    * Returns a current parameter value(s).
    */
  def GetValue(): js.Any = js.native
  
  /**
    * Returns possible parameter values.
    */
  def GetValues(): js.Array[ASPxClientDashboardParameterValue] = js.native
  
  /** @deprecated Use the GetName method instead. */
  /**
    * Gets the dashboard parameter name on the client side.
    */
  var Name: String = js.native
  
  /**
    * Specifies the current parameter value(s).
    * @param value The current parameter value(s).
    */
  def SetValue(value: js.Any): Unit = js.native
  
  /** @deprecated Use the GetValue method instead. */
  /**
    * Gets the dashboard parameter value on the client side.
    */
  var Value: js.Any = js.native
}
object ASPxClientDashboardParameter {
  
  @scala.inline
  def apply(
    GetDefaultValue: () => js.Any,
    GetDescription: () => String,
    GetName: () => String,
    GetType: () => String,
    GetValue: () => js.Any,
    GetValues: () => js.Array[ASPxClientDashboardParameterValue],
    Name: String,
    SetValue: js.Any => Unit,
    Value: js.Any
  ): ASPxClientDashboardParameter = {
    val __obj = js.Dynamic.literal(GetDefaultValue = js.Any.fromFunction0(GetDefaultValue), GetDescription = js.Any.fromFunction0(GetDescription), GetName = js.Any.fromFunction0(GetName), GetType = js.Any.fromFunction0(GetType), GetValue = js.Any.fromFunction0(GetValue), GetValues = js.Any.fromFunction0(GetValues), Name = Name.asInstanceOf[js.Any], SetValue = js.Any.fromFunction1(SetValue), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardParameter]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardParameterMutableBuilder[Self <: ASPxClientDashboardParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDefaultValue(value: () => js.Any): Self = StObject.set(x, "GetDefaultValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDescription(value: () => String): Self = StObject.set(x, "GetDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "GetName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => String): Self = StObject.set(x, "GetType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValues(value: () => js.Array[ASPxClientDashboardParameterValue]): Self = StObject.set(x, "GetValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "SetValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
