package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Schema resource in Directory API.
  */
@js.native
trait Schema$Schema extends js.Object {
  /**
    * Display name for the schema.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Fields of Schema
    */
  var fields: js.UndefOr[js.Array[Schema$SchemaFieldSpec]] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Unique identifier of Schema (Read-only)
    */
  var schemaId: js.UndefOr[String] = js.native
  /**
    * Schema name
    */
  var schemaName: js.UndefOr[String] = js.native
}

object Schema$Schema {
  @scala.inline
  def apply(
    displayName: String = null,
    etag: String = null,
    fields: js.Array[Schema$SchemaFieldSpec] = null,
    kind: String = null,
    schemaId: String = null,
    schemaName: String = null
  ): Schema$Schema = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (schemaId != null) __obj.updateDynamic("schemaId")(schemaId.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Schema]
  }
}

