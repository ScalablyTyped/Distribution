package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableFieldSchema extends js.Object {
  var categories: js.UndefOr[TableFieldSchemaCategories] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object TableFieldSchema {
  @scala.inline
  def apply(
    categories: TableFieldSchemaCategories = null,
    description: String = null,
    fields: js.Array[TableFieldSchema] = null,
    mode: String = null,
    name: String = null,
    `type`: String = null
  ): TableFieldSchema = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFieldSchema]
  }
}

