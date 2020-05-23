package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisTitle class.
  */
@JSGlobal("ASPxClientAxisTitle")
@js.native
class ASPxClientAxisTitle ()
  extends typings.devexpressWeb.ASPxClientAxisTitle {
  /**
    * Gets the axis to which the axis title belongs.
    */
  /* CompleteClass */
  override var axis: typings.devexpressWeb.ASPxClientAxisBase = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the text of the axis title.
    */
  /* CompleteClass */
  override var text: String = js.native
}

