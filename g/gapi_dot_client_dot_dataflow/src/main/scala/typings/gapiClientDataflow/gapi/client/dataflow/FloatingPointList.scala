package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingPointList extends js.Object {
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[Double]] = js.undefined
}

object FloatingPointList {
  @scala.inline
  def apply(elements: js.Array[Double] = null): FloatingPointList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingPointList]
  }
}

