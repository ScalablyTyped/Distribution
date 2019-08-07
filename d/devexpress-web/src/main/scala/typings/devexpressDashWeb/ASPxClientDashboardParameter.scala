package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side dashboard parameter.
  */
@JSGlobal("ASPxClientDashboardParameter")
@js.native
class ASPxClientDashboardParameter () extends js.Object {
  /** @deprecated Use the GetName method instead. */
  /**
    * Gets the dashboard parameter name on the client side.
    */
  var Name: String = js.native
  /** @deprecated Use the GetValue method instead. */
  /**
    * Gets the dashboard parameter value on the client side.
    */
  var Value: js.Any = js.native
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
  /**
    * Specifies the current parameter value(s).
    * @param value The current parameter value(s).
    */
  def SetValue(value: js.Any): Unit = js.native
}

