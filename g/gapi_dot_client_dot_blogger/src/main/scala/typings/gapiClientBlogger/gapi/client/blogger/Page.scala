package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClientBlogger.anon.DisplayName
import typings.gapiClientBlogger.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  /** The author of this Page. */
  var author: js.UndefOr[DisplayName] = js.native
  /** Data about the blog containing this Page. */
  var blog: js.UndefOr[Id] = js.native
  /** The body content of this Page, in HTML. */
  var content: js.UndefOr[String] = js.native
  /** Etag of the resource. */
  var etag: js.UndefOr[String] = js.native
  /** The identifier for this resource. */
  var id: js.UndefOr[String] = js.native
  /** The kind of this entity. Always blogger#page */
  var kind: js.UndefOr[String] = js.native
  /** RFC 3339 date-time when this Page was published. */
  var published: js.UndefOr[String] = js.native
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.native
  /** The status of the page for admin resources (either LIVE or DRAFT). */
  var status: js.UndefOr[String] = js.native
  /** The title of this entity. This is the name displayed in the Admin user interface. */
  var title: js.UndefOr[String] = js.native
  /** RFC 3339 date-time when this Page was last updated. */
  var updated: js.UndefOr[String] = js.native
  /** The URL that this Page is displayed at. */
  var url: js.UndefOr[String] = js.native
}

object Page {
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
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
    def setAuthor(value: DisplayName): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setBlog(value: Id): Self = this.set("blog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlog: Self = this.set("blog", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPublished(value: String): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

