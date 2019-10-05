package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTableRequest extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
}

object CreateTableRequest {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    elementProperties: PageElementProperties = null,
    objectId: String = null,
    rows: Int | Double = null
  ): CreateTableRequest = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableRequest]
  }
}

