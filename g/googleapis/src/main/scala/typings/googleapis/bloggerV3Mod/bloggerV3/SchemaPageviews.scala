package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapis.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPageviews extends js.Object {
  /**
    * Blog Id
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * The container of posts in this blog.
    */
  var counts: js.UndefOr[js.Array[AnonCount]] = js.native
  /**
    * The kind of this entry. Always blogger#page_views
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPageviews {
  @scala.inline
  def apply(blogId: String = null, counts: js.Array[AnonCount] = null, kind: String = null): SchemaPageviews = {
    val __obj = js.Dynamic.literal()
    if (blogId != null) __obj.updateDynamic("blogId")(blogId.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageviews]
  }
}

