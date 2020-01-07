package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.googleapis.Anon_Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Pageviews extends js.Object {
  /**
    * Blog Id
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * The container of posts in this blog.
    */
  var counts: js.UndefOr[js.Array[Anon_Count]] = js.native
  /**
    * The kind of this entry. Always blogger#page_views
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Pageviews {
  @scala.inline
  def apply(blogId: String = null, counts: js.Array[Anon_Count] = null, kind: String = null): Schema$Pageviews = {
    val __obj = js.Dynamic.literal()
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Pageviews]
  }
}

