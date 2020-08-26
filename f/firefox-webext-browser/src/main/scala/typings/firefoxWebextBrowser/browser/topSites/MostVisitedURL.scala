package typings.firefoxWebextBrowser.browser.topSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* topSites types */
/** An object encapsulating a most visited URL, such as the URLs on the new tab page. */
@js.native
trait MostVisitedURL extends js.Object {
  /** Data URL for the favicon, if available. */
  var favicon: js.UndefOr[String] = js.native
  /** The title of the page. */
  var title: js.UndefOr[String] = js.native
  /** The entry type, either `url` for a normal page link, or `search` for a search shortcut. */
  var `type`: js.UndefOr[MostVisitedURLType] = js.native
  /** The most visited URL. */
  var url: String = js.native
}

object MostVisitedURL {
  @scala.inline
  def apply(url: String): MostVisitedURL = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MostVisitedURL]
  }
  @scala.inline
  implicit class MostVisitedURLOps[Self <: MostVisitedURL] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setFavicon(value: String): Self = this.set("favicon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFavicon: Self = this.set("favicon", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: MostVisitedURLType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

