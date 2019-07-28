package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiOutputInfo extends js.Object {
  /**
    * The id of the tag the user code will emit to this output by; this
    * should correspond to the tag of some SideInputInfo.
    */
  var tag: js.UndefOr[String] = js.undefined
}

object MultiOutputInfo {
  @scala.inline
  def apply(tag: String = null): MultiOutputInfo = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[MultiOutputInfo]
  }
}

