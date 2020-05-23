package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

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
    columns: js.UndefOr[Double] = js.undefined,
    elementProperties: PageElementProperties = null,
    objectId: String = null,
    rows: js.UndefOr[Double] = js.undefined
  ): CreateTableRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableRequest]
  }
}

