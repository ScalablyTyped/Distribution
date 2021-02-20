package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains parameters used to obtain the underlying data for the dashboard item.
  */
@js.native
trait ASPxClientDashboardItemRequestUnderlyingDataParameters extends StObject {
  
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
  implicit class ASPxClientDashboardItemRequestUnderlyingDataParametersMutableBuilder[Self <: ASPxClientDashboardItemRequestUnderlyingDataParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisPoints(value: js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = StObject.set(x, "AxisPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisPointsVarargs(value: ASPxClientDashboardItemDataAxisPoint*): Self = StObject.set(x, "AxisPoints", js.Array(value :_*))
    
    @scala.inline
    def setDataMembers(value: js.Array[String]): Self = StObject.set(x, "DataMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMembersVarargs(value: String*): Self = StObject.set(x, "DataMembers", js.Array(value :_*))
    
    @scala.inline
    def setUniqueValuesByAxisName(value: js.Any): Self = StObject.set(x, "UniqueValuesByAxisName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesByAxisName(value: js.Any): Self = StObject.set(x, "ValuesByAxisName", value.asInstanceOf[js.Any])
  }
}
