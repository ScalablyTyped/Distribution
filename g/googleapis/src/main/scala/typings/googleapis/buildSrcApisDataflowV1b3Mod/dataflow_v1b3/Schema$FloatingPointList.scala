package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing a list of floating point numbers.
  */
@js.native
trait Schema$FloatingPointList extends js.Object {
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[Double]] = js.native
}

object Schema$FloatingPointList {
  @scala.inline
  def apply(elements: js.Array[Double] = null): Schema$FloatingPointList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FloatingPointList]
  }
}

