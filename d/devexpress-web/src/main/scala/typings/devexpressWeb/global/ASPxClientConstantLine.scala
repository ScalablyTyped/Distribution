package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ConstantLine class.
  */
@JSGlobal("ASPxClientConstantLine")
@js.native
class ASPxClientConstantLine ()
  extends typings.devexpressWeb.ASPxClientConstantLine {
  /**
    * Gets the axis that owns the current constant line object.
    */
  /* CompleteClass */
  override var axis: typings.devexpressWeb.ASPxClientAxis = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the constant line title.
    */
  /* CompleteClass */
  override var title: String = js.native
  /**
    * Gets the constant line's position along the axis.
    */
  /* CompleteClass */
  override var value: js.Any = js.native
}

