package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableFieldSchemaCategories extends js.Object {
  var names: js.UndefOr[js.Array[String]] = js.undefined
}

object TableFieldSchemaCategories {
  @scala.inline
  def apply(names: js.Array[String] = null): TableFieldSchemaCategories = {
    val __obj = js.Dynamic.literal()
    if (names != null) __obj.updateDynamic("names")(names)
    __obj.asInstanceOf[TableFieldSchemaCategories]
  }
}

