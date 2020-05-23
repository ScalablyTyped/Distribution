package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisBase class.
  */
@JSGlobal("ASPxClientAxisBase")
@js.native
class ASPxClientAxisBase ()
  extends typings.devexpressWeb.ASPxClientAxisBase {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Provides access to the XY-diagram which contains the current axis.
    */
  /* CompleteClass */
  override var diagram: typings.devexpressWeb.ASPxClientXYDiagramBase = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Provides acess to the range of the axis coordinates.
    */
  /* CompleteClass */
  override var range: typings.devexpressWeb.ASPxClientAxisRange = js.native
}

