package typings.gapiClientPagespeedonline

import typings.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeader extends js.Object {
  /** Heading to be displayed with the list of URLs. */
  var header: js.UndefOr[PagespeedApiFormatStringV2] = js.undefined
  /** List of entries that provide information about URLs in the url block. Optional. */
  var urls: js.UndefOr[js.Array[AnonDetails]] = js.undefined
}

object AnonHeader {
  @scala.inline
  def apply(header: PagespeedApiFormatStringV2 = null, urls: js.Array[AnonDetails] = null): AnonHeader = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
}

