package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of ASPxClientDashboardParameter objects.
  */
trait ASPxClientDashboardParameters extends js.Object {
  /**
    * Returns a dashboard parameter by its index in the ASPxClientDashboardParameters collection.
    * @param index An integer value that specifies the parameter index.
    */
  def GetParameterByIndex(index: scala.Double): ASPxClientDashboardParameter
  /**
    * Returns a dashboard parameter by its name.
    * @param name A String object that specifies the parameter name.
    */
  def GetParameterByName(name: java.lang.String): ASPxClientDashboardParameter
  /**
    * Returns an array of dashboard parameters from the ASPxClientDashboardParameters collection.
    */
  def GetParameterList(): js.Array[ASPxClientDashboardParameter]
}

object ASPxClientDashboardParameters {
  @scala.inline
  def apply(
    GetParameterByIndex: scala.Double => ASPxClientDashboardParameter,
    GetParameterByName: java.lang.String => ASPxClientDashboardParameter,
    GetParameterList: () => js.Array[ASPxClientDashboardParameter]
  ): ASPxClientDashboardParameters = {
    val __obj = js.Dynamic.literal(GetParameterByIndex = js.Any.fromFunction1(GetParameterByIndex), GetParameterByName = js.Any.fromFunction1(GetParameterByName), GetParameterList = js.Any.fromFunction0(GetParameterList))
  
    __obj.asInstanceOf[ASPxClientDashboardParameters]
  }
}

