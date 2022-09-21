package typings.feathersjsPrimusClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/primus-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: Any): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def default(socket: Any, options: FeathersPrimusClientOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  trait FeathersPrimusClientOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FeathersPrimusClientOptions {
    
    inline def apply(): FeathersPrimusClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeathersPrimusClientOptions]
    }
    
    extension [Self <: FeathersPrimusClientOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
