package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines line style settings.
  */
@JSGlobal("ASPxClientLineStyle")
@js.native
class ASPxClientLineStyle () extends ASPxClientWebChartElement {
  /**
    * Gets the dash style used to paint the line.
    */
  var dashStyle: String = js.native
  /**
    * Returns the join style for the ends of consecutive lines.
    */
  var lineJoin: String = js.native
  /**
    * Gets the thickness that corresponds to the value of the current ASPxClientLineStyle object.
    */
  var thickness: Double = js.native
}

