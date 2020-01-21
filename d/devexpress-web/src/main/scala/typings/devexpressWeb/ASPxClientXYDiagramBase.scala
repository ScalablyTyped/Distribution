package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base class for all diagram classes, which have X and Y axes.
  */
@JSGlobal("ASPxClientXYDiagramBase")
@js.native
class ASPxClientXYDiagramBase () extends ASPxClientWebChartElement {
  /**
    * Gets the X-axis.
    */
  var axisX: ASPxClientAxisBase = js.native
  /**
    * Gets the Y-axis.
    */
  var axisY: ASPxClientAxisBase = js.native
}

