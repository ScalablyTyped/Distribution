package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringList extends js.Object {
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object StringList {
  @scala.inline
  def apply(elements: js.Array[java.lang.String] = null): StringList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements)
    __obj.asInstanceOf[StringList]
  }
}

