package typings.domSerial

import typings.domSerial.anon.PartialSerialPortInfo
import typings.std.Event
import typings.std.EventTarget
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialPort
  extends StObject
     with EventTarget {
  
  def close(): js.Promise[Unit] = js.native
  
  def forget(): js.Promise[Unit] = js.native
  
  def getInfo(): PartialSerialPortInfo = js.native
  
  def onconnect(event: Event): Unit = js.native
  @JSName("onconnect")
  var onconnect_Original: EventHandler = js.native
  
  def ondisconnect(event: Event): Unit = js.native
  @JSName("ondisconnect")
  var ondisconnect_Original: EventHandler = js.native
  
  // Chromium implementation (spec: out)
  def open(options: SerialOptions): js.Promise[Unit] = js.native
  
  val readable: ReadableStream[Any] = js.native
  
  // Chromium implementation (spec: in)
  val writable: WritableStream[Any] = js.native
}
