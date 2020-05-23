package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base class for all diagram classes, which have X and Y axes.
  */
@JSGlobal("ASPxClientXYDiagramBase")
@js.native
class ASPxClientXYDiagramBase ()
  extends typings.devexpressWeb.ASPxClientXYDiagramBase {
  /**
    * Gets the X-axis.
    */
  /* CompleteClass */
  override var axisX: typings.devexpressWeb.ASPxClientAxisBase = js.native
  /**
    * Gets the Y-axis.
    */
  /* CompleteClass */
  override var axisY: typings.devexpressWeb.ASPxClientAxisBase = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
}

