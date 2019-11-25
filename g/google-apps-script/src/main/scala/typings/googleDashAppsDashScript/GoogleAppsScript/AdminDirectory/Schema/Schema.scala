package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Array[SchemaFieldSpec]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var schemaId: js.UndefOr[String] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
}

object Schema {
  @scala.inline
  def apply(
    displayName: String = null,
    etag: String = null,
    fields: js.Array[SchemaFieldSpec] = null,
    kind: String = null,
    schemaId: String = null,
    schemaName: String = null
  ): Schema = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (schemaId != null) __obj.updateDynamic("schemaId")(schemaId.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

