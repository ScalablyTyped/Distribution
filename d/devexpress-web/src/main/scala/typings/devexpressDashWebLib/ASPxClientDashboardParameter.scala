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

