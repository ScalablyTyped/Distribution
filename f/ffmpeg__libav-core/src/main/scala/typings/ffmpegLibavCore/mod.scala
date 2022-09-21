package typings.ffmpegLibavCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[LibavCore] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[LibavCore]]
  
  @JSImport("@ffmpeg/libav-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LibavCore extends StObject {
    
    var NULL: Pointer
  }
  object LibavCore {
    
    inline def apply(NULL: Pointer): LibavCore = {
      val __obj = js.Dynamic.literal(NULL = NULL.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibavCore]
    }
    
    extension [Self <: LibavCore](x: Self) {
      
      inline def setNULL(value: Pointer): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
    }
  }
  
  type Pointer = Double
}
