package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.Error")
@js.native
class Error protected () extends js.Object {
  def this(`type`: String, message: String, isFatal: Boolean) = this()
  // Whether the error is fatal. Fatal errors cannot be recovered
  // from and require the document to be reloaded.
  var isFatal: Boolean = js.native
  // A message describing the error.
  var message: String = js.native
  // The type of the error that occurred.
  var `type`: ErrorType = js.native
}

