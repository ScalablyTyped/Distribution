package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.keyinEventNameFunction
import typings.devextreme.devextremeStrings.landscape
import typings.devextreme.devextremeStrings.portrait
import typings.devextreme.mod.DevExpress.core.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesObject extends StObject {
  
  /**
    * Gets information on the current device.
    */
  def current(): Device = js.native
  /**
    * Overrides actual device information to force the application to operate as if it was running on a specified device.
    */
  def current(deviceName: String): Unit = js.native
  def current(deviceName: Device): Unit = js.native
  
  def isSimulator(): Boolean = js.native
  
  /**
    * Detaches all event handlers from a single event.
    */
  def off(eventName: EventName): this.type = js.native
  /**
    * Detaches a particular event handler from a single event.
    */
  def off(eventName: EventName, eventHandler: js.Function): this.type = js.native
  
  /**
    * Subscribes to an event.
    */
  def on(eventName: EventName, eventHandler: js.Function): this.type = js.native
  /**
    * Subscribes to events.
    */
  def on(events: keyinEventNameFunction): this.type = js.native
  
  /**
    * Returns the current device orientation.
    */
  def orientation(): js.UndefOr[portrait | landscape] = js.native
  
  /**
    * Returns real information about the current device regardless of the value passed to the DevExpress.devices.current(deviceName) method.
    */
  def real(): Device = js.native
}
