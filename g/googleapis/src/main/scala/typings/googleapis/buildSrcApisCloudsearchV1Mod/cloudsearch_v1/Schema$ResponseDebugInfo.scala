package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Debugging information about the response.
  */
@js.native
trait Schema$ResponseDebugInfo extends js.Object {
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}

object Schema$ResponseDebugInfo {
  @scala.inline
  def apply(formattedDebugInfo: String = null): Schema$ResponseDebugInfo = {
    val __obj = js.Dynamic.literal()
    if (formattedDebugInfo != null) __obj.updateDynamic("formattedDebugInfo")(formattedDebugInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResponseDebugInfo]
  }
}

