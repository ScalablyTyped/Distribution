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
    GetParameterByIndex: js.Function1[scala.Double, ASPxClientDashboardParameter],
    GetParameterByName: js.Function1[java.lang.String, ASPxClientDashboardParameter],
    GetParameterList: js.Function0[js.Array[ASPxClientDashboardParameter]]
  ): ASPxClientDashboardParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetParameterByIndex")(GetParameterByIndex)
    __obj.updateDynamic("GetParameterByName")(GetParameterByName)
    __obj.updateDynamic("GetParameterList")(GetParameterList)
    __obj.asInstanceOf[ASPxClientDashboardParameters]
  }
}

