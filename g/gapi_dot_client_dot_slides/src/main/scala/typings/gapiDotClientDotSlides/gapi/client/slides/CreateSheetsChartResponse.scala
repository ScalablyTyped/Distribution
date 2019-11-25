package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSheetsChartResponse extends js.Object {
  /** The object ID of the created chart. */
  var objectId: js.UndefOr[String] = js.undefined
}

object CreateSheetsChartResponse {
  @scala.inline
  def apply(objectId: String = null): CreateSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSheetsChartResponse]
  }
}

