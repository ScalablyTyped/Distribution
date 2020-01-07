package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a custom dictionary created from a data source of any
  * size up to the maximum size defined in the
  * [limits](https://cloud.google.com/dlp/limits) page. The artifacts of
  * dictionary creation are stored in the specified Google Cloud Storage
  * location. Consider using `CustomInfoType.Dictionary` for smaller
  * dictionaries that satisfy the size requirements.
  */
@js.native
trait Schema$GooglePrivacyDlpV2LargeCustomDictionaryConfig extends js.Object {
  /**
    * Field in a BigQuery table where each cell represents a dictionary phrase.
    */
  var bigQueryField: js.UndefOr[Schema$GooglePrivacyDlpV2BigQueryField] = js.native
  /**
    * Set of files containing newline-delimited lists of dictionary phrases.
    */
  var cloudStorageFileSet: js.UndefOr[Schema$GooglePrivacyDlpV2CloudStorageFileSet] = js.native
  /**
    * Location to store dictionary artifacts in Google Cloud Storage. These
    * files will only be accessible by project owners and the DLP API. If any
    * of these artifacts are modified, the dictionary is considered invalid and
    * can no longer be used.
    */
  var outputPath: js.UndefOr[Schema$GooglePrivacyDlpV2CloudStoragePath] = js.native
}

object Schema$GooglePrivacyDlpV2LargeCustomDictionaryConfig {
  @scala.inline
  def apply(
    bigQueryField: Schema$GooglePrivacyDlpV2BigQueryField = null,
    cloudStorageFileSet: Schema$GooglePrivacyDlpV2CloudStorageFileSet = null,
    outputPath: Schema$GooglePrivacyDlpV2CloudStoragePath = null
  ): Schema$GooglePrivacyDlpV2LargeCustomDictionaryConfig = {
    val __obj = js.Dynamic.literal()
    if (bigQueryField != null) __obj.updateDynamic("bigQueryField")(bigQueryField.asInstanceOf[js.Any])
    if (cloudStorageFileSet != null) __obj.updateDynamic("cloudStorageFileSet")(cloudStorageFileSet.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2LargeCustomDictionaryConfig]
  }
}

