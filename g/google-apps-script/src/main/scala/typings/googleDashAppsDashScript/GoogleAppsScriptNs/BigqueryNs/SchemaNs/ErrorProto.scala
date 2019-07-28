package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorProto extends js.Object {
  var debugInfo: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
}

object ErrorProto {
  @scala.inline
  def apply(debugInfo: String = null, location: String = null, message: String = null, reason: String = null): ErrorProto = {
    val __obj = js.Dynamic.literal()
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo)
    if (location != null) __obj.updateDynamic("location")(location)
    if (message != null) __obj.updateDynamic("message")(message)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[ErrorProto]
  }
}

