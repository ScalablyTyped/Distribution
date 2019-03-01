package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingPointList extends js.Object {
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object FloatingPointList {
  @scala.inline
  def apply(elements: js.Array[scala.Double] = null): FloatingPointList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements)
    __obj.asInstanceOf[FloatingPointList]
  }
}

