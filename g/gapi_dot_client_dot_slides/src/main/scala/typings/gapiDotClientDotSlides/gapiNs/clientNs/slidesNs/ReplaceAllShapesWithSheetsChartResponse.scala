package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithSheetsChartResponse extends js.Object {
  /** The number of shapes replaced with charts. */
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}

object ReplaceAllShapesWithSheetsChartResponse {
  @scala.inline
  def apply(occurrencesChanged: Int | Double = null): ReplaceAllShapesWithSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartResponse]
  }
}

