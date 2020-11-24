package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains parameters used to obtain the underlying data for the dashboard item.
  */
@js.native
trait ASPxClientDashboardItemRequestUnderlyingDataParameters extends js.Object {
  
  /**
    * Gets or sets axis points used to obtain the underlying data.
    */
  var AxisPoints: js.Array[ASPxClientDashboardItemDataAxisPoint] = js.native
  
  /**
    * Gets or sets an array of data member identifiers used to obtain underlying data.
    */
  var DataMembers: js.Array[String] = js.native
  
  /**
    * Gets or sets the unique dimension value used to obtain the underlying data.
    */
  var UniqueValuesByAxisName: js.Any = js.native
  
  /**
    * Gets or sets the dimension value used to obtain the underlying data.
    */
  var ValuesByAxisName: js.Any = js.native
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
  
  @scala.inline
  implicit class ASPxClientDashboardItemRequestUnderlyingDataParametersOps[Self <: ASPxClientDashboardItemRequestUnderlyingDataParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxisPointsVarargs(value: ASPxClientDashboardItemDataAxisPoint*): Self = this.set("AxisPoints", js.Array(value :_*))
    
    @scala.inline
    def setAxisPoints(value: js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = this.set("AxisPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMembersVarargs(value: String*): Self = this.set("DataMembers", js.Array(value :_*))
    
    @scala.inline
    def setDataMembers(value: js.Array[String]): Self = this.set("DataMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueValuesByAxisName(value: js.Any): Self = this.set("UniqueValuesByAxisName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesByAxisName(value: js.Any): Self = this.set("ValuesByAxisName", value.asInstanceOf[js.Any])
  }
}
