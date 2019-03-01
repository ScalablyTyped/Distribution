package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side dashboard parameter.
  */
trait ASPxClientDashboardParameter extends js.Object {
  /**
    * Gets the dashboard parameter name on the client side.
    * Value: A string value that is the dashboard parameter name on the client side.
    */
  var Name: java.lang.String
  /**
    * Gets the dashboard parameter value on the client side.
    * Value: A string value that specifies the dashboard parameter value on the client side.
    */
  var Value: js.Object
  /**
    * Returns a default parameter value.
    */
  def GetDefaultValue(): js.Object
  /**
    * Returns the parameter's description displayed to an end-user.
    */
  def GetDescription(): java.lang.String
  /**
    * Returns a parameter name.
    */
  def GetName(): java.lang.String
  /**
    * Returns a parameter type.
    */
  def GetType(): java.lang.String
  /**
    * Returns a current parameter value(s).
    */
  def GetValue(): js.Object
  /**
    * Returns possible parameter values.
    */
  def GetValues(): js.Array[ASPxClientDashboardParameterValue]
  /**
    * Specifies the current parameter value(s).
    * @param value The current parameter value(s).
    */
  def SetValue(value: js.Object): scala.Unit
}

object ASPxClientDashboardParameter {
  @scala.inline
  def apply(
    GetDefaultValue: js.Function0[js.Object],
    GetDescription: js.Function0[java.lang.String],
    GetName: js.Function0[java.lang.String],
    GetType: js.Function0[java.lang.String],
    GetValue: js.Function0[js.Object],
    GetValues: js.Function0[js.Array[ASPxClientDashboardParameterValue]],
    Name: java.lang.String,
    SetValue: js.Function1[js.Object, scala.Unit],
    Value: js.Object
  ): ASPxClientDashboardParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetDefaultValue")(GetDefaultValue)
    __obj.updateDynamic("GetDescription")(GetDescription)
    __obj.updateDynamic("GetName")(GetName)
    __obj.updateDynamic("GetType")(GetType)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.updateDynamic("GetValues")(GetValues)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ASPxClientDashboardParameter]
  }
}

