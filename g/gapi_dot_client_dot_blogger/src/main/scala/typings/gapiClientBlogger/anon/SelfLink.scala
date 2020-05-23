package typings.gapiClientBlogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelfLink extends js.Object {
  /** The URL of the container for pages in this blog. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The count of pages in this blog. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object SelfLink {
  @scala.inline
  def apply(selfLink: String = null, totalItems: js.UndefOr[Double] = js.undefined): SelfLink = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfLink]
  }
}

