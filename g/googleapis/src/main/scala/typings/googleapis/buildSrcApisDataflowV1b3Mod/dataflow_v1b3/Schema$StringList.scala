package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing a list of strings.
  */
@js.native
trait Schema$StringList extends js.Object {
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[String]] = js.native
}

object Schema$StringList {
  @scala.inline
  def apply(elements: js.Array[String] = null): Schema$StringList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StringList]
  }
}

