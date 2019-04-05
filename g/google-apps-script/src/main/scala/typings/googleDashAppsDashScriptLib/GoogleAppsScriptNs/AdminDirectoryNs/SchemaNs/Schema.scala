package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[js.Array[SchemaFieldSpec]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var schemaId: js.UndefOr[java.lang.String] = js.undefined
  var schemaName: js.UndefOr[java.lang.String] = js.undefined
}

object Schema {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    etag: java.lang.String = null,
    fields: js.Array[SchemaFieldSpec] = null,
    kind: java.lang.String = null,
    schemaId: java.lang.String = null,
    schemaName: java.lang.String = null
  ): Schema = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (schemaId != null) __obj.updateDynamic("schemaId")(schemaId)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    __obj.asInstanceOf[Schema]
  }
}

