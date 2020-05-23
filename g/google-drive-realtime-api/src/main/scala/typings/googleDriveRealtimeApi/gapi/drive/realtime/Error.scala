package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  // Whether the error is fatal. Fatal errors cannot be recovered
  // from and require the document to be reloaded.
  var isFatal: Boolean
  // A message describing the error.
  var message: String
  // The type of the error that occurred.
  var `type`: ErrorType
}

object Error {
  @scala.inline
  def apply(isFatal: Boolean, message: String, `type`: ErrorType): Error = {
    val __obj = js.Dynamic.literal(isFatal = isFatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

