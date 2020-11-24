package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputStream extends js.Object {
  
  /**
    * Closes the stream, releasing resources related to it. Once the stream is closed, all other operations will fail.
    * Closing a stream multiple times is allowed and will not result in an error.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Reads up to `size` bytes from the stream. The resulting buffer is up to `size` bytes long. End of stream is
    * signalled through an empty buffer.
    */
  def read(size: Double): js.Promise[ArrayBuffer] = js.native
  
  /**
    * Keeps reading from the stream until exactly `size` bytes have been consumed. The resulting buffer is exactly
    * `size` bytes long. Premature error or end of stream results in an `Error` object with a `partialData` property
    * containing the incomplete data.
    */
  def readAll(size: Double): js.Promise[ArrayBuffer] = js.native
}
object InputStream {
  
  @scala.inline
  def apply(
    close: () => js.Promise[Unit],
    read: Double => js.Promise[ArrayBuffer],
    readAll: Double => js.Promise[ArrayBuffer]
  ): InputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), read = js.Any.fromFunction1(read), readAll = js.Any.fromFunction1(readAll))
    __obj.asInstanceOf[InputStream]
  }
  
  @scala.inline
  implicit class InputStreamOps[Self <: InputStream] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRead(value: Double => js.Promise[ArrayBuffer]): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadAll(value: Double => js.Promise[ArrayBuffer]): Self = this.set("readAll", js.Any.fromFunction1(value))
  }
}
