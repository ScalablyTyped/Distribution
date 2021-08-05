package typings.feathersjsSocketioClient

import typings.socketIoClient.SocketIOClient.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/socketio-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: Socket): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def default(socket: Socket, options: FeathersSocketIOClientOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  trait FeathersSocketIOClientOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FeathersSocketIOClientOptions {
    
    inline def apply(): FeathersSocketIOClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeathersSocketIOClientOptions]
    }
    
    extension [Self <: FeathersSocketIOClientOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
