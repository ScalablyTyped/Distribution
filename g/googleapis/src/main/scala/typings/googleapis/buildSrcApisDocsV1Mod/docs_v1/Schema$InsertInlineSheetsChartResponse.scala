package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of inserting an embedded Google Sheets chart.
  */
@js.native
trait Schema$InsertInlineSheetsChartResponse extends js.Object {
  /**
    * The object ID of the inserted chart.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$InsertInlineSheetsChartResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$InsertInlineSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InsertInlineSheetsChartResponse]
  }
}

