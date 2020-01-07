package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for a unique key indicating a record that contains a finding.
  */
@js.native
trait Schema$GooglePrivacyDlpV2RecordKey extends js.Object {
  var bigQueryKey: js.UndefOr[Schema$GooglePrivacyDlpV2BigQueryKey] = js.native
  var datastoreKey: js.UndefOr[Schema$GooglePrivacyDlpV2DatastoreKey] = js.native
  /**
    * Values of identifying columns in the given row. Order of values matches
    * the order of field identifiers specified in the scanning request.
    */
  var idValues: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GooglePrivacyDlpV2RecordKey {
  @scala.inline
  def apply(
    bigQueryKey: Schema$GooglePrivacyDlpV2BigQueryKey = null,
    datastoreKey: Schema$GooglePrivacyDlpV2DatastoreKey = null,
    idValues: js.Array[String] = null
  ): Schema$GooglePrivacyDlpV2RecordKey = {
    val __obj = js.Dynamic.literal()
    if (bigQueryKey != null) __obj.updateDynamic("bigQueryKey")(bigQueryKey.asInstanceOf[js.Any])
    if (datastoreKey != null) __obj.updateDynamic("datastoreKey")(datastoreKey.asInstanceOf[js.Any])
    if (idValues != null) __obj.updateDynamic("idValues")(idValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2RecordKey]
  }
}

