package typings.gapiClientBlogger

import typings.gapiClientBlogger.gapi.client.blogger.Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  /** The List of Posts for this Blog. */
  var items: js.UndefOr[js.Array[Post]] = js.undefined
  /** The URL of the container for posts in this blog. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The count of posts in this blog. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[Post] = null, selfLink: String = null, totalItems: Int | Double = null): AnonItems = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}

