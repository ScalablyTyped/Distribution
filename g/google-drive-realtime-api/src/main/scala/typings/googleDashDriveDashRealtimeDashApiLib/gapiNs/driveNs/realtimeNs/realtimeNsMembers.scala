package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime")
@js.native
object realtimeNsMembers extends js.Object {
  val ErrorType: googleDashDriveDashRealtimeDashApiLib.Anon_CLIENTERROR = js.native
  val EventType: googleDashDriveDashRealtimeDashApiLib.Anon_ATTRIBUTECHANGED = js.native
  def debug(): scala.Unit = js.native
  def load(fileId: java.lang.String): scala.Unit = js.native
  def load(fileId: java.lang.String, onLoaded: js.Function1[/* d */ Document, scala.Unit]): scala.Unit = js.native
  def load(
    fileId: java.lang.String,
    onLoaded: js.Function1[/* d */ Document, scala.Unit],
    opt_initializerFn: js.Function1[/* m */ Model, scala.Unit]
  ): scala.Unit = js.native
  def load(
    fileId: java.lang.String,
    onLoaded: js.Function1[/* d */ Document, scala.Unit],
    opt_initializerFn: js.Function1[/* m */ Model, scala.Unit],
    opt_errorFn: js.Function1[/* e */ Error, scala.Unit]
  ): scala.Unit = js.native
  def loadAppDataDocument(onLoaded: js.Function1[/* x */ Document, scala.Unit]): scala.Unit = js.native
  def loadAppDataDocument(
    onLoaded: js.Function1[/* x */ Document, scala.Unit],
    opt_initializerFn: js.Function1[/* x */ Model, scala.Unit]
  ): scala.Unit = js.native
  def loadAppDataDocument(
    onLoaded: js.Function1[/* x */ Document, scala.Unit],
    opt_initializerFn: js.Function1[/* x */ Model, scala.Unit],
    opt_errorFn: js.Function1[/* e */ Error, scala.Unit]
  ): scala.Unit = js.native
  def loadFromJson(json: java.lang.String): Document = js.native
  def loadFromJson(json: java.lang.String, opt_errorFn: js.Function1[/* e */ Error, scala.Unit]): Document = js.native
  def newInMemoryDocument(): Document = js.native
  def newInMemoryDocument(opt_onLoaded: js.Function1[/* d */ Document, scala.Unit]): Document = js.native
  def newInMemoryDocument(
    opt_onLoaded: js.Function1[/* d */ Document, scala.Unit],
    opt_initializerFn: js.Function1[/* m */ Model, scala.Unit]
  ): Document = js.native
  def newInMemoryDocument(
    opt_onLoaded: js.Function1[/* d */ Document, scala.Unit],
    opt_initializerFn: js.Function1[/* m */ Model, scala.Unit],
    opt_errorFn: js.Function1[/* e */ Error, scala.Unit]
  ): Document = js.native
}

