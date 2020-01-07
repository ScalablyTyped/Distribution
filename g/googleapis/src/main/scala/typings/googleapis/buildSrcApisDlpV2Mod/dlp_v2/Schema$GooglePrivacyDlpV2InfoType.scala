package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type of information detected by the API.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InfoType extends js.Object {
  /**
    * Name of the information type. Either a name of your choosing when
    * creating a CustomInfoType, or one of the names listed at
    * https://cloud.google.com/dlp/docs/infotypes-reference when specifying a
    * built-in type. InfoType names should conform to the pattern
    * [a-zA-Z0-9_]{1,64}.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2InfoType {
  @scala.inline
  def apply(name: String = null): Schema$GooglePrivacyDlpV2InfoType = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InfoType]
  }
}

