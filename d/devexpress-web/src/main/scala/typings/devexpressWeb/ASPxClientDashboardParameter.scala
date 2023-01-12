package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side dashboard parameter.
  */
trait ASPxClientDashboardParameter extends StObject {
  
  /**
    * Returns a default parameter value.
    */
  def GetDefaultValue(): Any
  
  /**
    * Returns the parameter's description displayed to an end-user.
    */
  def GetDescription(): String
  
  /**
    * Returns a parameter name.
    */
  def GetName(): String
  
  /**
    * Returns a parameter type.
    */
  def GetType(): String
  
  /**
    * Returns a current parameter value(s).
    */
  def GetValue(): Any
  
  /**
    * Returns possible parameter values.
    */
  def GetValues(): js.Array[ASPxClientDashboardParameterValue]
  
  /** @deprecated Use the GetName method instead. */
  /**
    * Gets the dashboard parameter name on the client side.
    */
  var Name: String
  
  /**
    * Specifies the current parameter value(s).
    * @param value The current parameter value(s).
    */
  def SetValue(value: Any): Unit
  
  /** @deprecated Use the GetValue method instead. */
  /**
    * Gets the dashboard parameter value on the client side.
    */
  var Value: Any
}
object ASPxClientDashboardParameter {
  
  inline def apply(
    GetDefaultValue: () => Any,
    GetDescription: () => String,
    GetName: () => String,
    GetType: () => String,
    GetValue: () => Any,
    GetValues: () => js.Array[ASPxClientDashboardParameterValue],
    Name: String,
    SetValue: Any => Unit,
    Value: Any
  ): ASPxClientDashboardParameter = {
    val __obj = js.Dynamic.literal(GetDefaultValue = js.Any.fromFunction0(GetDefaultValue), GetDescription = js.Any.fromFunction0(GetDescription), GetName = js.Any.fromFunction0(GetName), GetType = js.Any.fromFunction0(GetType), GetValue = js.Any.fromFunction0(GetValue), GetValues = js.Any.fromFunction0(GetValues), Name = Name.asInstanceOf[js.Any], SetValue = js.Any.fromFunction1(SetValue), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDashboardParameter] (val x: Self) extends AnyVal {
    
    inline def setGetDefaultValue(value: () => Any): Self = StObject.set(x, "GetDefaultValue", js.Any.fromFunction0(value))
    
    inline def setGetDescription(value: () => String): Self = StObject.set(x, "GetDescription", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "GetName", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => String): Self = StObject.set(x, "GetType", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => Any): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
    
    inline def setGetValues(value: () => js.Array[ASPxClientDashboardParameterValue]): Self = StObject.set(x, "GetValues", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSetValue(value: Any => Unit): Self = StObject.set(x, "SetValue", js.Any.fromFunction1(value))
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
