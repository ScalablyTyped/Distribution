package typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs

import typings.gapiDotClientDotBlogger.Anon_DisplayName
import typings.gapiDotClientDotBlogger.Anon_Id
import typings.gapiDotClientDotBlogger.Anon_ItemsSelfLink
import typings.gapiDotClientDotBlogger.Anon_Lat
import typings.gapiDotClientDotBlogger.Anon_Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  /** The author of this Post. */
  var author: js.UndefOr[Anon_DisplayName] = js.undefined
  /** Data about the blog containing this Post. */
  var blog: js.UndefOr[Anon_Id] = js.undefined
  /** The content of the Post. May contain HTML markup. */
  var content: js.UndefOr[String] = js.undefined
  /** The JSON meta-data for the Post. */
  var customMetaData: js.UndefOr[String] = js.undefined
  /** Etag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The identifier of this Post. */
  var id: js.UndefOr[String] = js.undefined
  /** Display image for the Post. */
  var images: js.UndefOr[js.Array[Anon_Url]] = js.undefined
  /** The kind of this entity. Always blogger#post */
  var kind: js.UndefOr[String] = js.undefined
  /** The list of labels this Post was tagged with. */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  /** The location for geotagged posts. */
  var location: js.UndefOr[Anon_Lat] = js.undefined
  /** RFC 3339 date-time when this Post was published. */
  var published: js.UndefOr[String] = js.undefined
  /** Comment control and display setting for readers of this post. */
  var readerComments: js.UndefOr[String] = js.undefined
  /** The container of comments on this Post. */
  var replies: js.UndefOr[Anon_ItemsSelfLink] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Status of the post. Only set for admin-level requests */
  var status: js.UndefOr[String] = js.undefined
  /** The title of the Post. */
  var title: js.UndefOr[String] = js.undefined
  /** The title link URL, similar to atom's related link. */
  var titleLink: js.UndefOr[String] = js.undefined
  /** RFC 3339 date-time when this Post was last updated. */
  var updated: js.UndefOr[String] = js.undefined
  /** The URL where this Post is displayed. */
  var url: js.UndefOr[String] = js.undefined
}

object Post {
  @scala.inline
  def apply(
    author: Anon_DisplayName = null,
    blog: Anon_Id = null,
    content: String = null,
    customMetaData: String = null,
    etag: String = null,
    id: String = null,
    images: js.Array[Anon_Url] = null,
    kind: String = null,
    labels: js.Array[String] = null,
    location: Anon_Lat = null,
    published: String = null,
    readerComments: String = null,
    replies: Anon_ItemsSelfLink = null,
    selfLink: String = null,
    status: String = null,
    title: String = null,
    titleLink: String = null,
    updated: String = null,
    url: String = null
  ): Post = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (blog != null) __obj.updateDynamic("blog")(blog)
    if (content != null) __obj.updateDynamic("content")(content)
    if (customMetaData != null) __obj.updateDynamic("customMetaData")(customMetaData)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (images != null) __obj.updateDynamic("images")(images)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (location != null) __obj.updateDynamic("location")(location)
    if (published != null) __obj.updateDynamic("published")(published)
    if (readerComments != null) __obj.updateDynamic("readerComments")(readerComments)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleLink != null) __obj.updateDynamic("titleLink")(titleLink)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Post]
  }
}

