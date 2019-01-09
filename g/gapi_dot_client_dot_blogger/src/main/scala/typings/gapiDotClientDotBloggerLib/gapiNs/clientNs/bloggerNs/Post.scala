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

