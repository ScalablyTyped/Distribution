package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.googleapis.Anon_DisplayNameId
import typings.googleapis.Anon_IdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Page extends js.Object {
  /**
    * The author of this Page.
    */
  var author: js.UndefOr[Anon_DisplayNameId] = js.native
  /**
    * Data about the blog containing this Page.
    */
  var blog: js.UndefOr[Anon_IdString] = js.native
  /**
    * The body content of this Page, in HTML.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Etag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The identifier for this resource.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of this entity. Always blogger#page
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * RFC 3339 date-time when this Page was published.
    */
  var published: js.UndefOr[String] = js.native
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The status of the page for admin resources (either LIVE or DRAFT).
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The title of this entity. This is the name displayed in the Admin user
    * interface.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * RFC 3339 date-time when this Page was last updated.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The URL that this Page is displayed at.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$Page {
  @scala.inline
  def apply(
    author: Anon_DisplayNameId = null,
    blog: Anon_IdString = null,
    content: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    published: String = null,
    selfLink: String = null,
    status: String = null,
    title: String = null,
    updated: String = null,
    url: String = null
  ): Schema$Page = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (blog != null) __obj.updateDynamic("blog")(blog.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Page]
  }
}

