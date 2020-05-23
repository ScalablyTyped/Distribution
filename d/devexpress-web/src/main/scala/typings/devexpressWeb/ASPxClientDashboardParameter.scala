package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side dashboard parameter.
  */
trait ASPxClientDashboardParameter extends js.Object {
  /** @deprecated Use the GetName method instead. */
  /**
    * Gets the dashboard parameter name on the client side.
    */
  var Name: String
  /** @deprecated Use the GetValue method instead. */
  /**
    * Gets the dashboard parameter value on the client side.
    */
  var Value: js.Any
  /**
    * Returns a default parameter value.
    */
  def GetDefaultValue(): js.Any
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
  def GetValue(): js.Any
  /**
    * Returns possible parameter values.
    */
  def GetValues(): js.Array[ASPxClientDashboardParameterValue]
  /**
    * Specifies the current parameter value(s).
    * @param value The current parameter value(s).
    */
  def SetValue(value: js.Any): Unit
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
}

