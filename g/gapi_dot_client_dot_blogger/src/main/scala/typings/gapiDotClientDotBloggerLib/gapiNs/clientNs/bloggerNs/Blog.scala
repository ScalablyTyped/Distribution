package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Blog extends js.Object {
  /** The JSON custom meta-data for the Blog */
  var customMetaData: js.UndefOr[java.lang.String] = js.undefined
  /** The description of this blog. This is displayed underneath the title. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The identifier for this resource. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of this entry. Always blogger#blog */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The locale this Blog is set to. */
  var locale: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Country] = js.undefined
  /** The name of this blog. This is displayed as the title. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The container of pages in this blog. */
  var pages: js.UndefOr[gapiDotClientDotBloggerLib.Anon_SelfLinkTotalItems] = js.undefined
  /** The container of posts in this blog. */
  var posts: js.UndefOr[gapiDotClientDotBloggerLib.Anon_SelfLink] = js.undefined
  /** RFC 3339 date-time when this blog was published. */
  var published: js.UndefOr[java.lang.String] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the blog. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 date-time when this blog was last updated. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The URL where this blog is published. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

