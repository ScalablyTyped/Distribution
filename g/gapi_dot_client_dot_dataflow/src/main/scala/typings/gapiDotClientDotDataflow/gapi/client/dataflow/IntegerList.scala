package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerList extends js.Object {
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[SplitInt64]] = js.undefined
}

object IntegerList {
  @scala.inline
  def apply(elements: js.Array[SplitInt64] = null): IntegerList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements)
    __obj.asInstanceOf[IntegerList]
  }
}

