package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsSelfLink extends js.Object {
  /** The List of Comments for this Post. */
  var items: js.UndefOr[js.Array[gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.Comment]] = js.undefined
  /** The URL of the comments on this post. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The count of comments on this post. */
  var totalItems: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ItemsSelfLink {
  @scala.inline
  def apply(
    items: js.Array[gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.Comment] = null,
    selfLink: java.lang.String = null,
    totalItems: java.lang.String = null
  ): Anon_ItemsSelfLink = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems)
    __obj.asInstanceOf[Anon_ItemsSelfLink]
  }
}

