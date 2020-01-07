package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Debugging information about the result.
  */
@js.native
trait Schema$ResultDebugInfo extends js.Object {
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}

object Schema$ResultDebugInfo {
  @scala.inline
  def apply(formattedDebugInfo: String = null): Schema$ResultDebugInfo = {
    val __obj = js.Dynamic.literal()
    if (formattedDebugInfo != null) __obj.updateDynamic("formattedDebugInfo")(formattedDebugInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultDebugInfo]
  }
}

