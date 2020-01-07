package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating an embedded Google Sheets chart.
  */
@js.native
trait Schema$CreateSheetsChartResponse extends js.Object {
  /**
    * The object ID of the created chart.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$CreateSheetsChartResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$CreateSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateSheetsChartResponse]
  }
}

