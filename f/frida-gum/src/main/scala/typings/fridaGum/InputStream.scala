package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputStream extends StObject {
  
  /**
    * Closes the stream, releasing resources related to it. Once the stream is closed, all other operations will fail.
    * Closing a stream multiple times is allowed and will not result in an error.
    */
  def close(): js.Promise[Unit]
  
  /**
    * Reads up to `size` bytes from the stream. The resulting buffer is up to `size` bytes long. End of stream is
    * signalled through an empty buffer.
    */
  def read(size: Double): js.Promise[ArrayBuffer]
  
  /**
    * Keeps reading from the stream until exactly `size` bytes have been consumed. The resulting buffer is exactly
    * `size` bytes long. Premature error or end of stream results in an `Error` object with a `partialData` property
    * containing the incomplete data.
    */
  def readAll(size: Double): js.Promise[ArrayBuffer]
}
object InputStream {
  
  inline def apply(
    close: () => js.Promise[Unit],
    read: Double => js.Promise[ArrayBuffer],
    readAll: Double => js.Promise[ArrayBuffer]
  ): InputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), read = js.Any.fromFunction1(read), readAll = js.Any.fromFunction1(readAll))
    __obj.asInstanceOf[InputStream]
  }
  
  extension [Self <: InputStream](x: Self) {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setRead(value: Double => js.Promise[ArrayBuffer]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setReadAll(value: Double => js.Promise[ArrayBuffer]): Self = StObject.set(x, "readAll", js.Any.fromFunction1(value))
  }
}
