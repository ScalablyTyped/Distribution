package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the TextAnnotation class.
  */
@JSGlobal("ASPxClientTextAnnotation")
@js.native
class ASPxClientTextAnnotation ()
  extends typings.devexpressWeb.ASPxClientTextAnnotation {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the lines of text within an annotation.
    */
  /* CompleteClass */
  override var lines: js.Array[String] = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
}

