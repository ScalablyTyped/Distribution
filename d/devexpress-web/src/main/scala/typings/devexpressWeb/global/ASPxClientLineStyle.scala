package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines line style settings.
  */
@JSGlobal("ASPxClientLineStyle")
@js.native
class ASPxClientLineStyle ()
  extends typings.devexpressWeb.ASPxClientLineStyle {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the dash style used to paint the line.
    */
  /* CompleteClass */
  override var dashStyle: String = js.native
  /**
    * Returns the join style for the ends of consecutive lines.
    */
  /* CompleteClass */
  override var lineJoin: String = js.native
  /**
    * Gets the thickness that corresponds to the value of the current ASPxClientLineStyle object.
    */
  /* CompleteClass */
  override var thickness: Double = js.native
}

