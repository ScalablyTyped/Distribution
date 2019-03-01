package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  /** The author of this Post. */
  var author: js.UndefOr[gapiDotClientDotBloggerLib.Anon_DisplayName] = js.undefined
  /** Data about the blog containing this Post. */
  var blog: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Id] = js.undefined
  /** The content of the Post. May contain HTML markup. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** The JSON meta-data for the Post. */
  var customMetaData: js.UndefOr[java.lang.String] = js.undefined
  /** Etag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The identifier of this Post. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Display image for the Post. */
  var images: js.UndefOr[js.Array[gapiDotClientDotBloggerLib.Anon_Url]] = js.undefined
  /** The kind of this entity. Always blogger#post */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The list of labels this Post was tagged with. */
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The location for geotagged posts. */
  var location: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Lat] = js.undefined
  /** RFC 3339 date-time when this Post was published. */
  var published: js.UndefOr[java.lang.String] = js.undefined
  /** Comment control and display setting for readers of this post. */
  var readerComments: js.UndefOr[java.lang.String] = js.undefined
  /** The container of comments on this Post. */
  var replies: js.UndefOr[gapiDotClientDotBloggerLib.Anon_ItemsSelfLink] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the post. Only set for admin-level requests */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the Post. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The title link URL, similar to atom's related link. */
  var titleLink: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 date-time when this Post was last updated. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The URL where this Post is displayed. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Post {
  @scala.inline
  def apply(
    author: gapiDotClientDotBloggerLib.Anon_DisplayName = null,
    blog: gapiDotClientDotBloggerLib.Anon_Id = null,
    content: java.lang.String = null,
    customMetaData: java.lang.String = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    images: js.Array[gapiDotClientDotBloggerLib.Anon_Url] = null,
    kind: java.lang.String = null,
    labels: js.Array[java.lang.String] = null,
    location: gapiDotClientDotBloggerLib.Anon_Lat = null,
    published: java.lang.String = null,
    readerComments: java.lang.String = null,
    replies: gapiDotClientDotBloggerLib.Anon_ItemsSelfLink = null,
    selfLink: java.lang.String = null,
    status: java.lang.String = null,
    title: java.lang.String = null,
    titleLink: java.lang.String = null,
    updated: java.lang.String = null,
    url: java.lang.String = null
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

