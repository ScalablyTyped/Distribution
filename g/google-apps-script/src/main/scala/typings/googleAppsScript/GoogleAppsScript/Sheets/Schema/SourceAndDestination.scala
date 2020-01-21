package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndDestination extends js.Object {
  var dimension: js.UndefOr[String] = js.undefined
  var fillLength: js.UndefOr[Double] = js.undefined
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

