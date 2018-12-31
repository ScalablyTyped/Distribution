package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickTag extends js.Object {
  /**
    * Advertiser event name associated with the click tag. This field is used by DISPLAY_IMAGE_GALLERY and HTML5_BANNER creatives. Applicable to DISPLAY when
    * the primary asset type is not HTML_IMAGE.
    */
  var eventName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Parameter name for the specified click tag. For DISPLAY_IMAGE_GALLERY creative assets, this field must match the value of the creative asset's
    * creativeAssetId.name field.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parameter value for the specified click tag. This field contains a click-through url. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

