package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains parameters used to obtain the underlying data for the dashboard item.
  */
trait ASPxClientDashboardItemRequestUnderlyingDataParameters extends js.Object {
  /**
    * Gets or sets axis points used to obtain the underlying data.
    */
  var AxisPoints: js.Array[ASPxClientDashboardItemDataAxisPoint]
  /**
    * Gets or sets an array of data member identifiers used to obtain underlying data.
    */
  var DataMembers: js.Array[String]
  /**
    * Gets or sets the unique dimension value used to obtain the underlying data.
    */
  var UniqueValuesByAxisName: js.Any
  /**
    * Gets or sets the dimension value used to obtain the underlying data.
    */
  var ValuesByAxisName: js.Any
}

object ASPxClientDashboardItemRequestUnderlyingDataParameters {
  @scala.inline
  def apply(
    AxisPoints: js.Array[ASPxClientDashboardItemDataAxisPoint],
    DataMembers: js.Array[String],
    UniqueValuesByAxisName: js.Any,
    ValuesByAxisName: js.Any
  ): ASPxClientDashboardItemRequestUnderlyingDataParameters = {
    val __obj = js.Dynamic.literal(AxisPoints = AxisPoints.asInstanceOf[js.Any], DataMembers = DataMembers.asInstanceOf[js.Any], UniqueValuesByAxisName = UniqueValuesByAxisName.asInstanceOf[js.Any], ValuesByAxisName = ValuesByAxisName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemRequestUnderlyingDataParameters]
  }
}

