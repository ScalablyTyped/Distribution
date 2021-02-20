package typings.feathersjsSocketioClient

import typings.socketIoClient.SocketIOClient.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/socketio-client", JSImport.Default)
  @js.native
  def default(socket: Socket): js.Function0[Unit] = js.native
  @JSImport("@feathersjs/socketio-client", JSImport.Default)
  @js.native
  def default(socket: Socket, options: FeathersSocketIOClientOptions): js.Function0[Unit] = js.native
  
  @js.native
  trait FeathersSocketIOClientOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object FeathersSocketIOClientOptions {
    
    @scala.inline
    def apply(): FeathersSocketIOClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeathersSocketIOClientOptions]
    }
    
    @scala.inline
    implicit class FeathersSocketIOClientOptionsMutableBuilder[Self <: FeathersSocketIOClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
