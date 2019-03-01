package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  /** The List of Posts for this Blog. */
  var items: js.UndefOr[js.Array[gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.Post]] = js.undefined
  /** The URL of the container for posts in this blog. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The count of posts in this blog. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Items {
  @scala.inline
  def apply(
    items: js.Array[gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.Post] = null,
    selfLink: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null
  ): Anon_Items = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Items]
  }
}

