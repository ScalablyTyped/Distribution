package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains parameters used to obtain the underlying data for the dashboard item.
  */
@JSGlobal("ASPxClientDashboardItemRequestUnderlyingDataParameters")
@js.native
class ASPxClientDashboardItemRequestUnderlyingDataParameters ()
  extends typings.devexpressWeb.ASPxClientDashboardItemRequestUnderlyingDataParameters {
  /**
    * Gets or sets axis points used to obtain the underlying data.
    */
  /* CompleteClass */
  override var AxisPoints: js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataAxisPoint] = js.native
  /**
    * Gets or sets an array of data member identifiers used to obtain underlying data.
    */
  /* CompleteClass */
  override var DataMembers: js.Array[String] = js.native
  /**
    * Gets or sets the unique dimension value used to obtain the underlying data.
    */
  /* CompleteClass */
  override var UniqueValuesByAxisName: js.Any = js.native
  /**
    * Gets or sets the dimension value used to obtain the underlying data.
    */
  /* CompleteClass */
  override var ValuesByAxisName: js.Any = js.native
}

