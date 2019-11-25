package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringList extends js.Object {
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[String]] = js.undefined
}

object StringList {
  @scala.inline
  def apply(elements: js.Array[String] = null): StringList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringList]
  }
}

