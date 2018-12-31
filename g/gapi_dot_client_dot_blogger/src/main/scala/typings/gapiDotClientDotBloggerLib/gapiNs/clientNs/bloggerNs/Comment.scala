package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** The author of this Comment. */
  var author: js.UndefOr[gapiDotClientDotBloggerLib.Anon_DisplayName] = js.undefined
  /** Data about the blog containing this comment. */
  var blog: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Id] = js.undefined
  /** The actual content of the comment. May include HTML markup. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** The identifier for this resource. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Data about the comment this is in reply to. */
  var inReplyTo: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Id] = js.undefined
  /** The kind of this entry. Always blogger#comment */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Data about the post containing this comment. */
  var post: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Id] = js.undefined
  /** RFC 3339 date-time when this comment was published. */
  var published: js.UndefOr[java.lang.String] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the comment (only populated for admin users) */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 date-time when this comment was last updated. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

