package typings.fridaGum.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SocketConnection")
@js.native
abstract class SocketConnection ()
  extends StObject
     with typings.fridaGum.SocketConnection {
  
  /**
    * Closes the stream, releasing resources related to it. This will also close the individual input and output
    * streams. Once the stream is closed, all other operations will fail. Closing a stream multiple times is allowed
    * and will not result in an error.
    */
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  
  /**
    * The `InputStream` to read from.
    */
  /* CompleteClass */
  var input: typings.fridaGum.InputStream = js.native
  
  /**
    * The `OutputStream` to write to.
    */
  /* CompleteClass */
  var output: typings.fridaGum.OutputStream = js.native
  
  /**
    * Disables the Nagle algorithm if `noDelay` is `true`, otherwise enables it. The Nagle algorithm is enabled
    * by default, so it is only necessary to call this method if you wish to optimize for low delay instead of
    * high throughput.
    */
  /* CompleteClass */
  override def setNoDelay(noDelay: Boolean): js.Promise[Unit] = js.native
}
