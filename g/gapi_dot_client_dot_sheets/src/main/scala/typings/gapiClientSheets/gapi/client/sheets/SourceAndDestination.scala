package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndDestination extends js.Object {
  /** The dimension that data should be filled into. */
  var dimension: js.UndefOr[String] = js.undefined
  /**
    * The number of rows or columns that data should be filled into.
    * Positive numbers expand beyond the last row or last column
    * of the source.  Negative numbers expand before the first row
    * or first column of the source.
    */
  var fillLength: js.UndefOr[Double] = js.undefined
  /** The location of the data to use as the source of the autofill. */
  var source: js.UndefOr[GridRange] = js.undefined
}

object SourceAndDestination {
  @scala.inline
  def apply(dimension: String = null, fillLength: Int | Double = null, source: GridRange = null): SourceAndDestination = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (fillLength != null) __obj.updateDynamic("fillLength")(fillLength.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAndDestination]
  }
}

