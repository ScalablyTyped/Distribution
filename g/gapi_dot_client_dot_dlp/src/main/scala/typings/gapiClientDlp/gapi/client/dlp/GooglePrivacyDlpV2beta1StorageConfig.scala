package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1StorageConfig extends js.Object {
  /** BigQuery options specification. */
  var bigQueryOptions: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryOptions] = js.native
  /** Google Cloud Storage options specification. */
  var cloudStorageOptions: js.UndefOr[GooglePrivacyDlpV2beta1CloudStorageOptions] = js.native
  /** Google Cloud Datastore options specification. */
  var datastoreOptions: js.UndefOr[GooglePrivacyDlpV2beta1DatastoreOptions] = js.native
}

object GooglePrivacyDlpV2beta1StorageConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1StorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1StorageConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1StorageConfigOps[Self <: GooglePrivacyDlpV2beta1StorageConfig] (val x: Self) extends AnyVal {
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
    def setBigQueryOptions(value: GooglePrivacyDlpV2beta1BigQueryOptions): Self = this.set("bigQueryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigQueryOptions: Self = this.set("bigQueryOptions", js.undefined)
    @scala.inline
    def setCloudStorageOptions(value: GooglePrivacyDlpV2beta1CloudStorageOptions): Self = this.set("cloudStorageOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudStorageOptions: Self = this.set("cloudStorageOptions", js.undefined)
    @scala.inline
    def setDatastoreOptions(value: GooglePrivacyDlpV2beta1DatastoreOptions): Self = this.set("datastoreOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatastoreOptions: Self = this.set("datastoreOptions", js.undefined)
  }
  
}

