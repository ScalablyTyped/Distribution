package typings.googleDashAuthDashLibrary.buildSrcMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Warning extends js.Object {
  var code: String
  var message: String
  var `type`: WarningTypes
  var warned: js.UndefOr[Boolean] = js.undefined
}

object Warning {
  @scala.inline
  def apply(code: String, message: String, `type`: WarningTypes, warned: js.UndefOr[Boolean] = js.undefined): Warning = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(warned)) __obj.updateDynamic("warned")(warned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
}

