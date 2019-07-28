package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellBackgroundFill extends js.Object {
  /**
    * The background fill property state.
    *
    * Updating the the fill on a table cell will implicitly update this field
    * to `RENDERED`, unless another value is specified in the same request. To
    * have no fill on a table cell, set this field to `NOT_RENDERED`. In this
    * case, any other fill fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.undefined
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}

object TableCellBackgroundFill {
  @scala.inline
  def apply(propertyState: String = null, solidFill: SolidFill = null): TableCellBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState)
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill)
    __obj.asInstanceOf[TableCellBackgroundFill]
  }
}

