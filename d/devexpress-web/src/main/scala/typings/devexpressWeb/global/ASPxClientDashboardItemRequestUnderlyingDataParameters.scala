package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains parameters used to obtain the underlying data for the dashboard item.
  */
@JSGlobal("ASPxClientDashboardItemRequestUnderlyingDataParameters")
@js.native
open class ASPxClientDashboardItemRequestUnderlyingDataParameters ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardItemRequestUnderlyingDataParameters {
  
  /**
    * Gets or sets axis points used to obtain the underlying data.
    */
  /* CompleteClass */
  var AxisPoints: js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataAxisPoint] = js.native
  
  /**
    * Gets or sets an array of data member identifiers used to obtain underlying data.
    */
  /* CompleteClass */
  var DataMembers: js.Array[String] = js.native
  
  /**
    * Gets or sets the unique dimension value used to obtain the underlying data.
    */
  /* CompleteClass */
  var UniqueValuesByAxisName: Any = js.native
  
  /**
    * Gets or sets the dimension value used to obtain the underlying data.
    */
  /* CompleteClass */
  var ValuesByAxisName: Any = js.native
}
