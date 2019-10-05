package typings.gapiDotClientDotBlogger.gapi.client.blogger

import typings.gapiDotClientDotBlogger.Anon_Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pageviews extends js.Object {
  /** Blog Id */
  var blogId: js.UndefOr[String] = js.undefined
  /** The container of posts in this blog. */
  var counts: js.UndefOr[js.Array[Anon_Count]] = js.undefined
  /** The kind of this entry. Always blogger#page_views */
  var kind: js.UndefOr[String] = js.undefined
}

object Pageviews {
  @scala.inline
  def apply(blogId: String = null, counts: js.Array[Anon_Count] = null, kind: String = null): Pageviews = {
    val __obj = js.Dynamic.literal()
    if (blogId != null) __obj.updateDynamic("blogId")(blogId)
    if (counts != null) __obj.updateDynamic("counts")(counts)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Pageviews]
  }
}

