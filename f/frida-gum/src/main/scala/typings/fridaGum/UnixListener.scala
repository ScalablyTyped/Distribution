package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnixListener
  extends BaseListener
     with SocketListener {
  
  /**
    * Path being listened on.
    */
  var path: String = js.native
}
object UnixListener {
  
  @scala.inline
  def apply(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit], path: String): UnixListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixListener]
  }
  
  @scala.inline
  implicit class UnixListenerMutableBuilder[Self <: UnixListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
