package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Findings container location data.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ContentLocation extends js.Object {
  /**
    * Name of the container where the finding is located. The top level name is
    * the source file name or table name. Names of some common storage
    * containers are formatted as follows:  * BigQuery tables:
    * `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;` * Cloud Storage
    * files: `gs://&lt;bucket&gt;/&lt;path&gt;` * Datastore namespace:
    * &lt;namespace&gt;  Nested names could be absent if the embedded object
    * has no string identifier (for an example an image contained within a
    * document).
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * Findings container modification timestamp, if applicable. For Google
    * Cloud Storage contains last file modification timestamp. For BigQuery
    * table contains last_modified_time property. For Datastore - not
    * populated.
    */
  var containerTimestamp: js.UndefOr[String] = js.native
  /**
    * Findings container version, if available (&quot;generation&quot; for
    * Google Cloud Storage).
    */
  var containerVersion: js.UndefOr[String] = js.native
  /**
    * Location data for document files.
    */
  var documentLocation: js.UndefOr[Schema$GooglePrivacyDlpV2DocumentLocation] = js.native
  /**
    * Location within an image&#39;s pixels.
    */
  var imageLocation: js.UndefOr[Schema$GooglePrivacyDlpV2ImageLocation] = js.native
  /**
    * Location within a row or record of a database table.
    */
  var recordLocation: js.UndefOr[Schema$GooglePrivacyDlpV2RecordLocation] = js.native
}

object Schema$GooglePrivacyDlpV2ContentLocation {
  @scala.inline
  def apply(
    containerName: String = null,
    containerTimestamp: String = null,
    containerVersion: String = null,
    documentLocation: Schema$GooglePrivacyDlpV2DocumentLocation = null,
    imageLocation: Schema$GooglePrivacyDlpV2ImageLocation = null,
    recordLocation: Schema$GooglePrivacyDlpV2RecordLocation = null
  ): Schema$GooglePrivacyDlpV2ContentLocation = {
    val __obj = js.Dynamic.literal()
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (containerTimestamp != null) __obj.updateDynamic("containerTimestamp")(containerTimestamp.asInstanceOf[js.Any])
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    if (documentLocation != null) __obj.updateDynamic("documentLocation")(documentLocation.asInstanceOf[js.Any])
    if (imageLocation != null) __obj.updateDynamic("imageLocation")(imageLocation.asInstanceOf[js.Any])
    if (recordLocation != null) __obj.updateDynamic("recordLocation")(recordLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ContentLocation]
  }
}

