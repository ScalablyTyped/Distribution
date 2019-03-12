package typings
package devexpressDashWebLib

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
  def GetDisplayText(): java.lang.String
  /**
    * Returns a parameter value.
    */
  def GetValue(): js.Object
}

object ASPxClientDashboardParameterValue {
  @scala.inline
  def apply(GetDisplayText: () => java.lang.String, GetValue: () => js.Object): ASPxClientDashboardParameterValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetValue = js.Any.fromFunction0(GetValue))
  
    __obj.asInstanceOf[ASPxClientDashboardParameterValue]
  }
}

