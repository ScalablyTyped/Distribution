package typings.gapiClientBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelfLink extends js.Object {
  /** The URL of the container for pages in this blog. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The count of pages in this blog. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object AnonSelfLink {
  @scala.inline
  def apply(selfLink: String = null, totalItems: Int | Double = null): AnonSelfLink = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelfLink]
  }
}

