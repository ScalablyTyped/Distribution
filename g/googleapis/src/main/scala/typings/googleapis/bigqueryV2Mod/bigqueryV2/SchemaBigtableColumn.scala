package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBigtableColumn extends js.Object {
  /**
    * [Optional] The encoding of the values when the type is not STRING.
    * Acceptable encoding values are: TEXT - indicates values are alphanumeric
    * text strings. BINARY - indicates values are encoded using HBase
    * Bytes.toBytes family of functions. &#39;encoding&#39; can also be set at
    * the column family level. However, the setting at this level takes
    * precedence if &#39;encoding&#39; is set at both levels.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * [Optional] If the qualifier is not a valid BigQuery field identifier i.e.
    * does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided
    * as the column field name and is used as field name in queries.
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * [Optional] If this is set, only the latest version of value in this
    * column are exposed. &#39;onlyReadLatest&#39; can also be set at the
    * column family level. However, the setting at this level takes precedence
    * if &#39;onlyReadLatest&#39; is set at both levels.
    */
  var onlyReadLatest: js.UndefOr[Boolean] = js.native
  /**
    * [Required] Qualifier of the column. Columns in the parent column family
    * that has this exact qualifier are exposed as . field. If the qualifier is
    * valid UTF-8 string, it can be specified in the qualifier_string field.
    * Otherwise, a base-64 encoded value must be set to qualifier_encoded. The
    * column field name is the same as the column qualifier. However, if the
    * qualifier is not a valid BigQuery field identifier i.e. does not match
    * [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as field_name.
    */
  var qualifierEncoded: js.UndefOr[String] = js.native
  var qualifierString: js.UndefOr[String] = js.native
  /**
    * [Optional] The type to convert the value in cells of this column. The
    * values are expected to be encoded using HBase Bytes.toBytes function when
    * using the BINARY encoding value. Following BigQuery types are allowed
    * (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is
    * BYTES. &#39;type&#39; can also be set at the column family level.
    * However, the setting at this level takes precedence if &#39;type&#39; is
    * set at both levels.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaBigtableColumn {
  @scala.inline
  def apply(): SchemaBigtableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigtableColumn]
  }
  @scala.inline
  implicit class SchemaBigtableColumnOps[Self <: SchemaBigtableColumn] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setOnlyReadLatest(value: Boolean): Self = this.set("onlyReadLatest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyReadLatest: Self = this.set("onlyReadLatest", js.undefined)
    @scala.inline
    def setQualifierEncoded(value: String): Self = this.set("qualifierEncoded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifierEncoded: Self = this.set("qualifierEncoded", js.undefined)
    @scala.inline
    def setQualifierString(value: String): Self = this.set("qualifierString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifierString: Self = this.set("qualifierString", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

