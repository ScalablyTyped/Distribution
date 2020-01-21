package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleapis.AnonDisplayNameId
import typings.googleapis.AnonIdString
import typings.googleapis.AnonSelfLinkTotalItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPost extends js.Object {
  /**
    * The author of this Post.
    */
  var author: js.UndefOr[AnonDisplayNameId] = js.native
  /**
    * Data about the blog containing this Post.
    */
  var blog: js.UndefOr[AnonIdString] = js.native
  /**
    * The content of the Post. May contain HTML markup.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The identifier of this Post.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of this entity. Always blogger#post
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of labels this Post was tagged with.
    */
  var labels: js.UndefOr[js.Array[String]] = js.native
  /**
    * RFC 3339 date-time when this Post was published.
    */
  var published: js.UndefOr[String] = js.native
  /**
    * The container of comments on this Post.
    */
  var replies: js.UndefOr[AnonSelfLinkTotalItems] = js.native
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The title of the Post.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * RFC 3339 date-time when this Post was last updated.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The URL where this Post is displayed.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaPost {
  @scala.inline
  def apply(
    author: AnonDisplayNameId = null,
    blog: AnonIdString = null,
    content: String = null,
    id: String = null,
    kind: String = null,
    labels: js.Array[String] = null,
    published: String = null,
    replies: AnonSelfLinkTotalItems = null,
    selfLink: String = null,
    title: String = null,
    updated: String = null,
    url: String = null
  ): SchemaPost = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (blog != null) __obj.updateDynamic("blog")(blog.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPost]
  }
}

