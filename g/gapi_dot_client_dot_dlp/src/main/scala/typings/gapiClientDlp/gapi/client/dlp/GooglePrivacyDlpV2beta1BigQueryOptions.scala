package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1BigQueryOptions extends js.Object {
  /**
    * References to fields uniquely identifying rows within the table.
    * Nested fields in the format, like `person.birthdate.year`, are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.undefined
  /** Complete BigQuery table reference. */
  var tableReference: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.undefined
}

object GooglePrivacyDlpV2beta1BigQueryOptions {
  @scala.inline
  def apply(
    identifyingFields: js.Array[GooglePrivacyDlpV2beta1FieldId] = null,
    tableReference: GooglePrivacyDlpV2beta1BigQueryTable = null
  ): GooglePrivacyDlpV2beta1BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (identifyingFields != null) __obj.updateDynamic("identifyingFields")(identifyingFields.asInstanceOf[js.Any])
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1BigQueryOptions]
  }
}

