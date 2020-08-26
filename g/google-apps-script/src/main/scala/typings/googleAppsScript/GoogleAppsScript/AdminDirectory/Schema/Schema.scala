package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var fields: js.UndefOr[js.Array[SchemaFieldSpec]] = js.native
  var kind: js.UndefOr[String] = js.native
  var schemaId: js.UndefOr[String] = js.native
  var schemaName: js.UndefOr[String] = js.native
}

object Schema {
  @scala.inline
  def apply(): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schema]
  }
  @scala.inline
  implicit class SchemaOps[Self <: typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: SchemaFieldSpec*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[SchemaFieldSpec]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSchemaId(value: String): Self = this.set("schemaId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaId: Self = this.set("schemaId", js.undefined)
    @scala.inline
    def setSchemaName(value: String): Self = this.set("schemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaName: Self = this.set("schemaName", js.undefined)
  }
  
}

