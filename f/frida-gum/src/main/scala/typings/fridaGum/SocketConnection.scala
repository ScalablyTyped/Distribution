package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketConnection
  extends StObject
     with IOStream {
  
  /**
    * Disables the Nagle algorithm if `noDelay` is `true`, otherwise enables it. The Nagle algorithm is enabled
    * by default, so it is only necessary to call this method if you wish to optimize for low delay instead of
    * high throughput.
    */
  def setNoDelay(noDelay: Boolean): js.Promise[Unit]
}
object SocketConnection {
  
  @scala.inline
  def apply(
    close: () => js.Promise[Unit],
    input: InputStream,
    output: OutputStream,
    setNoDelay: Boolean => js.Promise[Unit]
  ): SocketConnection = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], setNoDelay = js.Any.fromFunction1(setNoDelay))
    __obj.asInstanceOf[SocketConnection]
  }
  
  @scala.inline
  implicit class SocketConnectionMutableBuilder[Self <: SocketConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetNoDelay(value: Boolean => js.Promise[Unit]): Self = StObject.set(x, "setNoDelay", js.Any.fromFunction1(value))
  }
}
