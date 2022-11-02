package typings.framebus

import typings.framebus.distLibTypesMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibBroadcastMod {
  
  @JSImport("framebus/dist/lib/broadcast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcast(payload: String, options: BroadcastOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BroadcastOptions extends StObject {
    
    var frame: Window
    
    var origin: String
  }
  object BroadcastOptions {
    
    inline def apply(frame: Window, origin: String): BroadcastOptions = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastOptions]
    }
    
    extension [Self <: BroadcastOptions](x: Self) {
      
      inline def setFrame(value: Window): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
}
