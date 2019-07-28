package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains parameters used to obtain the underlying data for the dashboard item.
  */
trait ASPxClientDashboardItemRequestUnderlyingDataParameters extends js.Object {
  /**
    * Gets or sets axis points used to obtain the underlying data.
    * Value: An array of ASPxClientDashboardItemDataAxisPoint objects that represent axis points.
    */
  var AxisPoints: js.Array[ASPxClientDashboardItemDataAxisPoint]
  /**
    * Gets or sets an array of data member identifiers used to obtain underlying data.
    * Value: An array of string values that specify data member identifiers.
    */
  var DataMembers: js.Array[String]
  /**
    * Gets or sets the unique dimension value used to obtain the underlying data.
    * Value: The unique dimension value.
    */
  var UniqueValuesByAxisName: js.Object
  /**
    * Gets or sets the dimension value used to obtain the underlying data.
    * Value: The dimension value.
    */
  var ValuesByAxisName: js.Object
}

object ASPxClientDashboardItemRequestUnderlyingDataParameters {
  @scala.inline
  def apply(
    AxisPoints: js.Array[ASPxClientDashboardItemDataAxisPoint],
    DataMembers: js.Array[String],
    UniqueValuesByAxisName: js.Object,
    ValuesByAxisName: js.Object
  ): ASPxClientDashboardItemRequestUnderlyingDataParameters = {
    val __obj = js.Dynamic.literal(AxisPoints = AxisPoints, DataMembers = DataMembers, UniqueValuesByAxisName = UniqueValuesByAxisName, ValuesByAxisName = ValuesByAxisName)
  
    __obj.asInstanceOf[ASPxClientDashboardItemRequestUnderlyingDataParameters]
  }
}

