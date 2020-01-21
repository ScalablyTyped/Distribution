package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.load")
@js.native
object load extends js.Object {
  def apply(fileId: String): Unit = js.native
  def apply(fileId: String, onLoaded: js.Function1[/* d */ Document, Unit]): Unit = js.native
  def apply(
    fileId: String,
    onLoaded: js.Function1[/* d */ Document, Unit],
    opt_initializerFn: js.Function1[/* m */ Model, Unit]
  ): Unit = js.native
  def apply(
    fileId: String,
    onLoaded: js.Function1[/* d */ Document, Unit],
    opt_initializerFn: js.Function1[/* m */ Model, Unit],
    opt_errorFn: js.Function1[/* e */ Error, Unit]
  ): Unit = js.native
}

