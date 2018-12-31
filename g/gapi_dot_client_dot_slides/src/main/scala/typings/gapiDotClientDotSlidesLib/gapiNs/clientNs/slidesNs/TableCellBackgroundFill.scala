package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

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
  var propertyState: js.UndefOr[java.lang.String] = js.undefined
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}

