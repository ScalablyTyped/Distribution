package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOStream extends StObject {
  
  /**
    * Closes the stream, releasing resources related to it. This will also close the individual input and output
    * streams. Once the stream is closed, all other operations will fail. Closing a stream multiple times is allowed
    * and will not result in an error.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * The `InputStream` to read from.
    */
  var input: InputStream = js.native
  
  /**
    * The `OutputStream` to write to.
    */
  var output: OutputStream = js.native
}
object IOStream {
  
  @scala.inline
  def apply(close: () => js.Promise[Unit], input: InputStream, output: OutputStream): IOStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOStream]
  }
  
  @scala.inline
  implicit class IOStreamMutableBuilder[Self <: IOStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInput(value: InputStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: OutputStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
