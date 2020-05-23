package typings.gapiClientPagespeedonline.anon

import typings.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /** Heading to be displayed with the list of URLs. */
  var header: js.UndefOr[PagespeedApiFormatStringV2] = js.undefined
  /** List of entries that provide information about URLs in the url block. Optional. */
  var urls: js.UndefOr[js.Array[Details]] = js.undefined
}

object Header {
  @scala.inline
  def apply(header: PagespeedApiFormatStringV2 = null, urls: js.Array[Details] = null): Header = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

