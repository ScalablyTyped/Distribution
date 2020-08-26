package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request
import typings.gapiClientWebmasters.anon.Feedpath
import typings.gapiClientWebmasters.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitemapsResource extends js.Object {
  /** Deletes a sitemap from this site. */
  def delete(request: Feedpath): Request[Unit] = js.native
  /** Retrieves information about a specific sitemap. */
  def get(request: Feedpath): Request[WmxSitemap] = js.native
  /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
  def list(request: Fields): Request[SitemapsListResponse] = js.native
  /** Submits a sitemap for a site. */
  def submit(request: Feedpath): Request[Unit] = js.native
}

object SitemapsResource {
  @scala.inline
  def apply(
    delete: Feedpath => Request[Unit],
    get: Feedpath => Request[WmxSitemap],
    list: Fields => Request[SitemapsListResponse],
    submit: Feedpath => Request[Unit]
  ): SitemapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[SitemapsResource]
  }
  @scala.inline
  implicit class SitemapsResourceOps[Self <: SitemapsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Feedpath => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Feedpath => Request[WmxSitemap]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[SitemapsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSubmit(value: Feedpath => Request[Unit]): Self = this.set("submit", js.Any.fromFunction1(value))
  }
  
}

