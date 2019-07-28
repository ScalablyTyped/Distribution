package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1StorageConfig extends js.Object {
  /** BigQuery options specification. */
  var bigQueryOptions: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryOptions] = js.undefined
  /** Google Cloud Storage options specification. */
  var cloudStorageOptions: js.UndefOr[GooglePrivacyDlpV2beta1CloudStorageOptions] = js.undefined
  /** Google Cloud Datastore options specification. */
  var datastoreOptions: js.UndefOr[GooglePrivacyDlpV2beta1DatastoreOptions] = js.undefined
}

object GooglePrivacyDlpV2beta1StorageConfig {
  @scala.inline
  def apply(
    bigQueryOptions: GooglePrivacyDlpV2beta1BigQueryOptions = null,
    cloudStorageOptions: GooglePrivacyDlpV2beta1CloudStorageOptions = null,
    datastoreOptions: GooglePrivacyDlpV2beta1DatastoreOptions = null
  ): GooglePrivacyDlpV2beta1StorageConfig = {
    val __obj = js.Dynamic.literal()
    if (bigQueryOptions != null) __obj.updateDynamic("bigQueryOptions")(bigQueryOptions)
    if (cloudStorageOptions != null) __obj.updateDynamic("cloudStorageOptions")(cloudStorageOptions)
    if (datastoreOptions != null) __obj.updateDynamic("datastoreOptions")(datastoreOptions)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1StorageConfig]
  }
}

