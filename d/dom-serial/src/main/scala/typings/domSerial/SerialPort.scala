package typings.domSerial

import typings.domSerial.anon.PartialSerialPortInfo
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPort extends StObject {
  
  // Chromium implementation (spec: out)
  def getInfo(): PartialSerialPortInfo
  
  def open(options: SerialOptions): js.Promise[Unit]
  
  val readable: ReadableStream[js.Any]
  
  // Chromium implementation (spec: in)
  val writable: WritableStream[js.Any]
}
object SerialPort {
  
  @scala.inline
  def apply(
    getInfo: () => PartialSerialPortInfo,
    open: SerialOptions => js.Promise[Unit],
    readable: ReadableStream[js.Any],
    writable: WritableStream[js.Any]
  ): SerialPort = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo), open = js.Any.fromFunction1(open), readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPort]
  }
  
  @scala.inline
  implicit class SerialPortMutableBuilder[Self <: SerialPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInfo(value: () => PartialSerialPortInfo): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: SerialOptions => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadable(value: ReadableStream[js.Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: WritableStream[js.Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
