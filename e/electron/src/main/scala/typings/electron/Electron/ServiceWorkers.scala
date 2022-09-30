package typings.electron.Electron

import typings.electron.electronStrings.`console-message`
import typings.electron.electronStrings.`registration-completed`
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkers extends EventEmitter {
  
  @JSName("addListener")
  def addListener_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event, /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationcompleted(
    event: `registration-completed`,
    listener: js.Function2[/* event */ Event, /* details */ RegistrationCompletedDetails, Unit]
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
  /**
    * Emitted when a service worker has been registered. Can occur after a call to
    * `navigator.serviceWorker.register('/sw.js')` successfully resolves or when a
    * Chrome extension is loaded.
    */
  @JSName("on")
  def on_registrationcompleted(
    event: `registration-completed`,
    listener: js.Function2[/* event */ Event, /* details */ RegistrationCompletedDetails, Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event, /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_registrationcompleted(
    event: `registration-completed`,
    listener: js.Function2[/* event */ Event, /* details */ RegistrationCompletedDetails, Unit]
  ): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event, /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_registrationcompleted(
    event: `registration-completed`,
    listener: js.Function2[/* event */ Event, /* details */ RegistrationCompletedDetails, Unit]
  ): this.type = js.native
}
