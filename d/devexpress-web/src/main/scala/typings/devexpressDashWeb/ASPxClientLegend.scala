package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Legend class.
  */
@JSGlobal("ASPxClientLegend")
@js.native
class ASPxClientLegend () extends ASPxClientWebChartEmptyElement {
  /**
    * Returns a collection of custom legend items of the legend.
    */
  var customItems: js.Array[ASPxClientCustomLegendItem] = js.native
  /**
    * Returns the name of the legend.
    */
  var name: String = js.native
  /**
    * Returns a value which determines whether to use checkboxes instead of markers on a chart legend for all legend items.
    */
  var useCheckBoxes: Boolean = js.native
}

