package typings.gapiClientPagespeedonline.anon

import typings.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  /** Heading to be displayed with the list of URLs. */
  var header: js.UndefOr[PagespeedApiFormatStringV2] = js.native
  /** List of entries that provide information about URLs in the url block. Optional. */
  var urls: js.UndefOr[js.Array[Details]] = js.native
}

object Header {
  @scala.inline
  def apply(): Header = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeader(value: PagespeedApiFormatStringV2): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: Details*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[Details]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

