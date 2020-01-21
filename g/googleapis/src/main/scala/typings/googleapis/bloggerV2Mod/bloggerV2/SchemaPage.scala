package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleapis.AnonDisplayNameId
import typings.googleapis.AnonIdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPage extends js.Object {
  /**
    * The author of this Page.
    */
  var author: js.UndefOr[AnonDisplayNameId] = js.native
  /**
    * Data about the blog containing this Page.
    */
  var blog: js.UndefOr[AnonIdString] = js.native
  /**
    * The body content of this Page, in HTML.
    */
  var content: js.UndefOr[String] = js.native
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

object SchemaPage {
  @scala.inline
  def apply(
    author: AnonDisplayNameId = null,
    blog: AnonIdString = null,
    content: String = null,
    id: String = null,
    kind: String = null,
    published: String = null,
    selfLink: String = null,
    title: String = null,
    updated: String = null,
    url: String = null
  ): SchemaPage = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (blog != null) __obj.updateDynamic("blog")(blog.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPage]
  }
}

