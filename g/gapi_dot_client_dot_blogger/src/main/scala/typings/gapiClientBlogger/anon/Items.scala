package typings.gapiClientBlogger.anon

import typings.gapiClientBlogger.gapi.client.blogger.Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends js.Object {
  /** The List of Posts for this Blog. */
  var items: js.UndefOr[js.Array[Post]] = js.undefined
  /** The URL of the container for posts in this blog. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The count of posts in this blog. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object Items {
  @scala.inline
  def apply(
    items: js.Array[Post] = null,
    selfLink: String = null,
    totalItems: js.UndefOr[Double] = js.undefined
  ): Items = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

