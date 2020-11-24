package typings.domSerial

import typings.domSerial.anon.PartialSerialPortInfo
import typings.std.ReadableStream
import typings.std.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialPort extends js.Object {
  
   // Chromium implementation (spec: out)
  def getInfo(): PartialSerialPortInfo = js.native
  
  def open(options: SerialOptions): js.Promise[Unit] = js.native
  
  val readable: ReadableStream[_] = js.native
  
   // Chromium implementation (spec: in)
  val writable: WritableStream[_] = js.native
}
object SerialPort {
  
  @scala.inline
  def apply(
    getInfo: () => PartialSerialPortInfo,
    open: SerialOptions => js.Promise[Unit],
    readable: ReadableStream[_],
    writable: WritableStream[_]
  ): SerialPort = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo), open = js.Any.fromFunction1(open), readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPort]
  }
  
  @scala.inline
  implicit class SerialPortOps[Self <: SerialPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetInfo(value: () => PartialSerialPortInfo): Self = this.set("getInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: SerialOptions => js.Promise[Unit]): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadable(value: ReadableStream[_]): Self = this.set("readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: WritableStream[_]): Self = this.set("writable", value.asInstanceOf[js.Any])
  }
}
