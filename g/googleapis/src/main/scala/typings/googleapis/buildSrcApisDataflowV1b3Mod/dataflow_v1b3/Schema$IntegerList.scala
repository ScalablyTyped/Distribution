package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing a list of integers.
  */
@js.native
trait Schema$IntegerList extends js.Object {
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[Schema$SplitInt64]] = js.native
}

object Schema$IntegerList {
  @scala.inline
  def apply(elements: js.Array[Schema$SplitInt64] = null): Schema$IntegerList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IntegerList]
  }
}

