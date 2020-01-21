package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaErrorProto extends js.Object {
  /**
    * Debugging information. This property is internal to Google and should not
    * be used.
    */
  var debugInfo: js.UndefOr[String] = js.native
  /**
    * Specifies where the error occurred, if present.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * A human-readable description of the error.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * A short error code that summarizes the error.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaErrorProto {
  @scala.inline
  def apply(debugInfo: String = null, location: String = null, message: String = null, reason: String = null): SchemaErrorProto = {
    val __obj = js.Dynamic.literal()
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorProto]
  }
}

