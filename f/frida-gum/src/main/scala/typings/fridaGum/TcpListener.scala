package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpListener
  extends StObject
     with BaseListener
     with SocketListener {
  
  /**
    * IP port being listened on.
    */
  var port: Double
}
object TcpListener {
  
  @scala.inline
  def apply(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit], port: Double): TcpListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpListener]
  }
  
  @scala.inline
  implicit class TcpListenerMutableBuilder[Self <: TcpListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
