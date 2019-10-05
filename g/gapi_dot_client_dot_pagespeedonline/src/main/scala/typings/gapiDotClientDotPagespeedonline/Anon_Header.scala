package typings.gapiDotClientDotPagespeedonline

import typings.gapiDotClientDotPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  /** Heading to be displayed with the list of URLs. */
  var header: js.UndefOr[PagespeedApiFormatStringV2] = js.undefined
  /** List of entries that provide information about URLs in the url block. Optional. */
  var urls: js.UndefOr[js.Array[Anon_Details]] = js.undefined
}

object Anon_Header {
  @scala.inline
  def apply(header: PagespeedApiFormatStringV2 = null, urls: js.Array[Anon_Details] = null): Anon_Header = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[Anon_Header]
  }
}

