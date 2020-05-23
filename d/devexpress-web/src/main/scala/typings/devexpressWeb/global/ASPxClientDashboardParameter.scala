package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side dashboard parameter.
  */
@JSGlobal("ASPxClientDashboardParameter")
@js.native
class ASPxClientDashboardParameter ()
  extends typings.devexpressWeb.ASPxClientDashboardParameter {
  /** @deprecated Use the GetName method instead. */
  /**
    * Gets the dashboard parameter name on the client side.
    */
  /* CompleteClass */
  override var Name: String = js.native
  /** @deprecated Use the GetValue method instead. */
  /**
    * Gets the dashboard parameter value on the client side.
    */
  /* CompleteClass */
  override var Value: js.Any = js.native
  /**
    * Returns a default parameter value.
    */
  /* CompleteClass */
  override def GetDefaultValue(): js.Any = js.native
  /**
    * Returns the parameter's description displayed to an end-user.
    */
  /* CompleteClass */
  override def GetDescription(): String = js.native
  /**
    * Returns a parameter name.
    */
  /* CompleteClass */
  override def GetName(): String = js.native
  /**
    * Returns a parameter type.
    */
  /* CompleteClass */
  override def GetType(): String = js.native
  /**
    * Returns a current parameter value(s).
    */
  /* CompleteClass */
  override def GetValue(): js.Any = js.native
  /**
    * Returns possible parameter values.
    */
  /* CompleteClass */
  override def GetValues(): js.Array[typings.devexpressWeb.ASPxClientDashboardParameterValue] = js.native
  /**
    * Specifies the current parameter value(s).
    * @param value The current parameter value(s).
    */
  /* CompleteClass */
  override def SetValue(value: js.Any): Unit = js.native
}

