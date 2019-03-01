package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pageviews extends js.Object {
  /** Blog Id */
  var blogId: js.UndefOr[java.lang.String] = js.undefined
  /** The container of posts in this blog. */
  var counts: js.UndefOr[js.Array[gapiDotClientDotBloggerLib.Anon_Count]] = js.undefined
  /** The kind of this entry. Always blogger#page_views */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Pageviews {
  @scala.inline
  def apply(
    blogId: java.lang.String = null,
    counts: js.Array[gapiDotClientDotBloggerLib.Anon_Count] = null,
    kind: java.lang.String = null
  ): Pageviews = {
    val __obj = js.Dynamic.literal()
    if (blogId != null) __obj.updateDynamic("blogId")(blogId)
    if (counts != null) __obj.updateDynamic("counts")(counts)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Pageviews]
  }
}

