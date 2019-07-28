package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshSheetsChartRequest extends js.Object {
  /** The object ID of the chart to refresh. */
  var objectId: js.UndefOr[String] = js.undefined
}

object RefreshSheetsChartRequest {
  @scala.inline
  def apply(objectId: String = null): RefreshSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[RefreshSheetsChartRequest]
  }
}

