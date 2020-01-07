package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an output of a multi-output DoFn.
  */
@js.native
trait Schema$MultiOutputInfo extends js.Object {
  /**
    * The id of the tag the user code will emit to this output by; this should
    * correspond to the tag of some SideInputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$MultiOutputInfo {
  @scala.inline
  def apply(tag: String = null): Schema$MultiOutputInfo = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MultiOutputInfo]
  }
}

