package typings.googleDashDriveDashRealtimeDashApi.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime")
@js.native
object ^ extends js.Object {
  def debug(): Unit = js.native
  def load(fileId: String): Unit = js.native
  def load(fileId: String, onLoaded: js.Function1[/* d */ Document, Unit]): Unit = js.native
  def load(
    fileId: String,
    onLoaded: js.Function1[/* d */ Document, Unit],
    opt_initializerFn: js.Function1[/* m */ Model, Unit]
  ): Unit = js.native
  def load(
    fileId: String,
    onLoaded: js.Function1[/* d */ Document, Unit],
    opt_initializerFn: js.Function1[/* m */ Model, Unit],
    opt_errorFn: js.Function1[/* e */ Error, Unit]
  ): Unit = js.native
  def loadAppDataDocument(onLoaded: js.Function1[/* x */ Document, Unit]): Unit = js.native
  def loadAppDataDocument(
    onLoaded: js.Function1[/* x */ Document, Unit],
    opt_initializerFn: js.Function1[/* x */ Model, Unit]
  ): Unit = js.native
  def loadAppDataDocument(
    onLoaded: js.Function1[/* x */ Document, Unit],
    opt_initializerFn: js.Function1[/* x */ Model, Unit],
    opt_errorFn: js.Function1[/* e */ Error, Unit]
  ): Unit = js.native
  def loadFromJson(json: String): Document = js.native
  def loadFromJson(json: String, opt_errorFn: js.Function1[/* e */ Error, Unit]): Document = js.native
  def newInMemoryDocument(): Document = js.native
  def newInMemoryDocument(opt_onLoaded: js.Function1[/* d */ Document, Unit]): Document = js.native
  def newInMemoryDocument(
    opt_onLoaded: js.Function1[/* d */ Document, Unit],
    opt_initializerFn: js.Function1[/* m */ Model, Unit]
  ): Document = js.native
  def newInMemoryDocument(
    opt_onLoaded: js.Function1[/* d */ Document, Unit],
    opt_initializerFn: js.Function1[/* m */ Model, Unit],
    opt_errorFn: js.Function1[/* e */ Error, Unit]
  ): Document = js.native
}

