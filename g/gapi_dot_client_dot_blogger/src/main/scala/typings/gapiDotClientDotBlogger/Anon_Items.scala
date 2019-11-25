package typings.gapiDotClientDotBlogger

import typings.gapiDotClientDotBlogger.gapi.client.blogger.Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  /** The List of Posts for this Blog. */
  var items: js.UndefOr[js.Array[Post]] = js.undefined
  /** The URL of the container for posts in this blog. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The count of posts in this blog. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object Anon_Items {
  @scala.inline
  def apply(items: js.Array[Post] = null, selfLink: String = null, totalItems: Int | Double = null): Anon_Items = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Items]
  }
}

