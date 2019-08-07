package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisBase class.
  */
@JSGlobal("ASPxClientAxisBase")
@js.native
class ASPxClientAxisBase () extends ASPxClientWebChartElementNamed {
  /**
    * Provides access to the XY-diagram which contains the current axis.
    */
  var diagram: ASPxClientXYDiagramBase = js.native
  /**
    * Provides acess to the range of the axis coordinates.
    */
  var range: ASPxClientAxisRange = js.native
}

