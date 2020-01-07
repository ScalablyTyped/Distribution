package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the parameters needed for de-identification of DICOM stores.
  */
@js.native
trait Schema$DicomConfig extends js.Object {
  /**
    * Tag filtering profile that determines which tags to keep/remove.
    */
  var filterProfile: js.UndefOr[String] = js.native
  /**
    * List of tags to keep. Remove all other tags.
    */
  var keepList: js.UndefOr[Schema$TagFilterList] = js.native
  /**
    * List of tags to remove. Keep all other tags.
    */
  var removeList: js.UndefOr[Schema$TagFilterList] = js.native
}

object Schema$DicomConfig {
  @scala.inline
  def apply(
    filterProfile: String = null,
    keepList: Schema$TagFilterList = null,
    removeList: Schema$TagFilterList = null
  ): Schema$DicomConfig = {
    val __obj = js.Dynamic.literal()
    if (filterProfile != null) __obj.updateDynamic("filterProfile")(filterProfile.asInstanceOf[js.Any])
    if (keepList != null) __obj.updateDynamic("keepList")(keepList.asInstanceOf[js.Any])
    if (removeList != null) __obj.updateDynamic("removeList")(removeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DicomConfig]
  }
}

