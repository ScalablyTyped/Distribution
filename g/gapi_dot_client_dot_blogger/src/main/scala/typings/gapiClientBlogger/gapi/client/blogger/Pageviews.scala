package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClientBlogger.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pageviews extends js.Object {
  /** Blog Id */
  var blogId: js.UndefOr[String] = js.undefined
  /** The container of posts in this blog. */
  var counts: js.UndefOr[js.Array[AnonCount]] = js.undefined
  /** The kind of this entry. Always blogger#page_views */
  var kind: js.UndefOr[String] = js.undefined
}

object Pageviews {
  @scala.inline
  def apply(blogId: String = null, counts: js.Array[AnonCount] = null, kind: String = null): Pageviews = {
    val __obj = js.Dynamic.literal()
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pageviews]
  }
}

