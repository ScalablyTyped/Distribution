package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared message indicating Cloud storage type.
  */
@js.native
trait Schema$GooglePrivacyDlpV2StorageConfig extends js.Object {
  /**
    * BigQuery options specification.
    */
  var bigQueryOptions: js.UndefOr[Schema$GooglePrivacyDlpV2BigQueryOptions] = js.native
  /**
    * Google Cloud Storage options specification.
    */
  var cloudStorageOptions: js.UndefOr[Schema$GooglePrivacyDlpV2CloudStorageOptions] = js.native
  /**
    * Google Cloud Datastore options specification.
    */
  var datastoreOptions: js.UndefOr[Schema$GooglePrivacyDlpV2DatastoreOptions] = js.native
  var timespanConfig: js.UndefOr[Schema$GooglePrivacyDlpV2TimespanConfig] = js.native
}

object Schema$GooglePrivacyDlpV2StorageConfig {
  @scala.inline
  def apply(
    bigQueryOptions: Schema$GooglePrivacyDlpV2BigQueryOptions = null,
    cloudStorageOptions: Schema$GooglePrivacyDlpV2CloudStorageOptions = null,
    datastoreOptions: Schema$GooglePrivacyDlpV2DatastoreOptions = null,
    timespanConfig: Schema$GooglePrivacyDlpV2TimespanConfig = null
  ): Schema$GooglePrivacyDlpV2StorageConfig = {
    val __obj = js.Dynamic.literal()
    if (bigQueryOptions != null) __obj.updateDynamic("bigQueryOptions")(bigQueryOptions.asInstanceOf[js.Any])
    if (cloudStorageOptions != null) __obj.updateDynamic("cloudStorageOptions")(cloudStorageOptions.asInstanceOf[js.Any])
    if (datastoreOptions != null) __obj.updateDynamic("datastoreOptions")(datastoreOptions.asInstanceOf[js.Any])
    if (timespanConfig != null) __obj.updateDynamic("timespanConfig")(timespanConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2StorageConfig]
  }
}

