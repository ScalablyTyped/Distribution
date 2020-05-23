package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataInsertAllResponseInsertErrors extends js.Object {
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
}

object TableDataInsertAllResponseInsertErrors {
  @scala.inline
  def apply(errors: js.Array[ErrorProto] = null, index: js.UndefOr[Double] = js.undefined): TableDataInsertAllResponseInsertErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDataInsertAllResponseInsertErrors]
  }
}

