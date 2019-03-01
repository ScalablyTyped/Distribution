package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /** The collection of elements in the group. The minimum size of a group is 2. */
  var children: js.UndefOr[js.Array[PageElement]] = js.undefined
}

object Group {
  @scala.inline
  def apply(children: js.Array[PageElement] = null): Group = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Group]
  }
}

