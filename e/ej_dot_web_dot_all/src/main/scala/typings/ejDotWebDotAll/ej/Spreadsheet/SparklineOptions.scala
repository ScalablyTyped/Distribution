package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineOptions extends js.Object {
  /** Pass the high point color to create sparkline
    */
  var highPointColor: js.UndefOr[String] = js.undefined
  /** Pass the marker settings object to create sparkline
    */
  var markerSettings: js.UndefOr[js.Any] = js.undefined
  /** Pass the negative point color to create sparkline
    */
  var negativePointColor: js.UndefOr[String] = js.undefined
  /** Pass the start point color to create sparkline
    */
  var startPointColor: js.UndefOr[String] = js.undefined
}

object SparklineOptions {
  @scala.inline
  def apply(
    highPointColor: String = null,
    markerSettings: js.Any = null,
    negativePointColor: String = null,
    startPointColor: String = null
  ): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    if (highPointColor != null) __obj.updateDynamic("highPointColor")(highPointColor)
    if (markerSettings != null) __obj.updateDynamic("markerSettings")(markerSettings)
    if (negativePointColor != null) __obj.updateDynamic("negativePointColor")(negativePointColor)
    if (startPointColor != null) __obj.updateDynamic("startPointColor")(startPointColor)
    __obj.asInstanceOf[SparklineOptions]
  }
}

