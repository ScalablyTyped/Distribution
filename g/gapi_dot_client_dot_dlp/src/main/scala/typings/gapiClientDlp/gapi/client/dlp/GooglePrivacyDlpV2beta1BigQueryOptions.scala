package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1BigQueryOptions extends js.Object {
  /**
    * References to fields uniquely identifying rows within the table.
    * Nested fields in the format, like `person.birthdate.year`, are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.native
  /** Complete BigQuery table reference. */
  var tableReference: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.native
}

object GooglePrivacyDlpV2beta1BigQueryOptions {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1BigQueryOptions]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1BigQueryOptionsOps[Self <: GooglePrivacyDlpV2beta1BigQueryOptions] (val x: Self) extends AnyVal {
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
    def setIdentifyingFieldsVarargs(value: GooglePrivacyDlpV2beta1FieldId*): Self = this.set("identifyingFields", js.Array(value :_*))
    @scala.inline
    def setIdentifyingFields(value: js.Array[GooglePrivacyDlpV2beta1FieldId]): Self = this.set("identifyingFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifyingFields: Self = this.set("identifyingFields", js.undefined)
    @scala.inline
    def setTableReference(value: GooglePrivacyDlpV2beta1BigQueryTable): Self = this.set("tableReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableReference: Self = this.set("tableReference", js.undefined)
  }
  
}

