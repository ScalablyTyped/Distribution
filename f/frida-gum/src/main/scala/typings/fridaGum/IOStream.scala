package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOStream extends StObject {
  
  /**
    * Closes the stream, releasing resources related to it. This will also close the individual input and output
    * streams. Once the stream is closed, all other operations will fail. Closing a stream multiple times is allowed
    * and will not result in an error.
    */
  def close(): js.Promise[Unit]
  
  /**
    * The `InputStream` to read from.
    */
  var input: InputStream
  
  /**
    * The `OutputStream` to write to.
    */
  var output: OutputStream
}
object IOStream {
  
  inline def apply(close: () => js.Promise[Unit], input: InputStream, output: OutputStream): IOStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOStream]
  }
  
  extension [Self <: IOStream](x: Self) {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setInput(value: InputStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: OutputStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
