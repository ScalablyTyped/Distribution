package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Strip class.
  */
@JSGlobal("ASPxClientStrip")
@js.native
class ASPxClientStrip ()
  extends typings.devexpressWeb.ASPxClientStrip {
  /**
    * Gets the axis that owns the current strip object.
    */
  /* CompleteClass */
  override var axis: typings.devexpressWeb.ASPxClientAxis = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the maximum value of the strip's range.
    */
  /* CompleteClass */
  override var maxValue: js.Any = js.native
  /**
    * Gets the minimum value of the strip's range.
    */
  /* CompleteClass */
  override var minValue: js.Any = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
}

