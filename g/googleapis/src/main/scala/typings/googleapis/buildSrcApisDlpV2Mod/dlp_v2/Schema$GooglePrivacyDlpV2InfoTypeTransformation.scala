package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transformation to apply to text that is identified as a specific
  * info_type.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InfoTypeTransformation extends js.Object {
  /**
    * InfoTypes to apply the transformation to. An empty list will cause this
    * transformation to apply to all findings that correspond to infoTypes that
    * were requested in `InspectConfig`.
    */
  var infoTypes: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2InfoType]] = js.native
  /**
    * Primitive transformation to apply to the infoType. [required]
    */
  var primitiveTransformation: js.UndefOr[Schema$GooglePrivacyDlpV2PrimitiveTransformation] = js.native
}

object Schema$GooglePrivacyDlpV2InfoTypeTransformation {
  @scala.inline
  def apply(
    infoTypes: js.Array[Schema$GooglePrivacyDlpV2InfoType] = null,
    primitiveTransformation: Schema$GooglePrivacyDlpV2PrimitiveTransformation = null
  ): Schema$GooglePrivacyDlpV2InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes.asInstanceOf[js.Any])
    if (primitiveTransformation != null) __obj.updateDynamic("primitiveTransformation")(primitiveTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InfoTypeTransformation]
  }
}

