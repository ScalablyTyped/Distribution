package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickTag extends js.Object {
  /**
    * Advertiser event name associated with the click tag. This field is used by DISPLAY_IMAGE_GALLERY and HTML5_BANNER creatives. Applicable to DISPLAY when
    * the primary asset type is not HTML_IMAGE.
    */
  var eventName: js.UndefOr[String] = js.undefined
  /**
    * Parameter name for the specified click tag. For DISPLAY_IMAGE_GALLERY creative assets, this field must match the value of the creative asset's
    * creativeAssetId.name field.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Parameter value for the specified click tag. This field contains a click-through url. */
  var value: js.UndefOr[String] = js.undefined
}

object ClickTag {
  @scala.inline
  def apply(eventName: String = null, name: String = null, value: String = null): ClickTag = {
    val __obj = js.Dynamic.literal()
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickTag]
  }
}

