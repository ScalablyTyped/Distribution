package typings.electron.Electron

import typings.electron.electronStrings.`console-message`
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkers extends EventEmitter {
  
  @JSName("addListener")
  def addListener_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event, /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  
  /**
    * A ServiceWorkerInfo object where the keys are the service worker version ID and
    * the values are the information about that service worker.
    */
  def getAllRunning(): Record[Double, ServiceWorkerInfo] = js.native
  
  /**
    * Information about this service worker
    *
    * If the service worker does not exist or is not running this method will throw an
    * exception.
    */
  def getFromVersionID(versionId: Double): ServiceWorkerInfo = js.native
  
  // Docs: https://electronjs.org/docs/api/service-workers
  /**
    * Emitted when a service worker logs something to the console.
    */
  @JSName("on")
  def on_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event, /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event, /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event, /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
}
