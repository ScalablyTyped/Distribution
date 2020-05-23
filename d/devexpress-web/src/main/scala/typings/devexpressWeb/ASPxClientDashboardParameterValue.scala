package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to the parameter value and display text.
  */
trait ASPxClientDashboardParameterValue extends js.Object {
  /**
    * Returns the parameter display text.
    */
  def GetDisplayText(): String
  /**
    * Returns a parameter value.
    */
  def GetValue(): js.Any
}

object ASPxClientDashboardParameterValue {
  @scala.inline
  def apply(GetDisplayText: () => String, GetValue: () => js.Any): ASPxClientDashboardParameterValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardParameterValue]
  }
}

