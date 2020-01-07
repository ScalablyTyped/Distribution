package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DICOM store.
  */
@js.native
trait Schema$DicomStore extends js.Object {
  /**
    * User-supplied key-value pairs used to organize DICOM stores.  Label keys
    * must be between 1 and 63 characters long, have a UTF-8 encoding of
    * maximum 128 bytes, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}{0,62}  Label values are optional, must be
    * between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
    * bytes, and must conform to the following PCRE regular expression:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63}  No more than 64 labels can be associated
    * with a given store.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. Resource name of the DICOM store, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Notification destination for new DICOM instances. Supplied by the client.
    */
  var notificationConfig: js.UndefOr[Schema$NotificationConfig] = js.native
}

object Schema$DicomStore {
  @scala.inline
  def apply(
    labels: StringDictionary[String] = null,
    name: String = null,
    notificationConfig: Schema$NotificationConfig = null
  ): Schema$DicomStore = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notificationConfig != null) __obj.updateDynamic("notificationConfig")(notificationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DicomStore]
  }
}

