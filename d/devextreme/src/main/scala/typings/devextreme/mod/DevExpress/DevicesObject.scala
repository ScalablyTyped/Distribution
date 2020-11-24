package typings.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesObject extends js.Object {
  
  /**
    * [descr:DevicesObject.current()]
    */
  def current(): Device = js.native
  /**
    * [descr:DevicesObject.current(deviceName)]
    */
  def current(deviceName: String): Unit = js.native
  def current(deviceName: Device): Unit = js.native
  
  /**
    * [descr:DevicesObject.off(eventName)]
    */
  def off(eventName: String): this.type = js.native
  /**
    * [descr:DevicesObject.off(eventName, eventHandler)]
    */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  
  /**
    * [descr:DevicesObject.on(eventName, eventHandler)]
    */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /**
    * [descr:DevicesObject.on(events)]
    */
  def on(events: js.Any): this.type = js.native
  
  /**
    * [descr:DevicesObject.orientation()]
    */
  def orientation(): String = js.native
  
  /**
    * [descr:DevicesObject.real()]
    */
  def real(): Device = js.native
}
