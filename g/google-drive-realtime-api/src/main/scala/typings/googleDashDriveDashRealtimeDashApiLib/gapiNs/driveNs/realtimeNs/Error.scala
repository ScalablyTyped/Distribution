package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.Error")
@js.native
class Error protected () extends js.Object {
  def this(`type`: java.lang.String, message: java.lang.String, isFatal: scala.Boolean) = this()
  // Whether the error is fatal. Fatal errors cannot be recovered
  // from and require the document to be reloaded.
  var isFatal: scala.Boolean = js.native
  // A message describing the error.
  var message: java.lang.String = js.native
  // The type of the error that occurred.
  var `type`: ErrorType = js.native
}

