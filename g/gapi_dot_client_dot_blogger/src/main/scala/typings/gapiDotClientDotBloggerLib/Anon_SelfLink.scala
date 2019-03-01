package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelfLink extends js.Object {
  /** The URL of the container for pages in this blog. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The count of pages in this blog. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object Anon_SelfLink {
  @scala.inline
  def apply(selfLink: java.lang.String = null, totalItems: scala.Int | scala.Double = null): Anon_SelfLink = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SelfLink]
  }
}

