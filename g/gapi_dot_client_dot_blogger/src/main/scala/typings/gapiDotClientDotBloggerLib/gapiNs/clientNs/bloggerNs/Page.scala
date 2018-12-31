package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  /** The author of this Page. */
  var author: js.UndefOr[gapiDotClientDotBloggerLib.Anon_DisplayName] = js.undefined
  /** Data about the blog containing this Page. */
  var blog: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Id] = js.undefined
  /** The body content of this Page, in HTML. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Etag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The identifier for this resource. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of this entity. Always blogger#page */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 date-time when this Page was published. */
  var published: js.UndefOr[java.lang.String] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the page for admin resources (either LIVE or DRAFT). */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The title of this entity. This is the name displayed in the Admin user interface. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 date-time when this Page was last updated. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The URL that this Page is displayed at. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

