package typings.devcert

import typings.devcert.distPlatformsMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformsWin32Mod {
  
  @JSImport("devcert/dist/platforms/win32", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with WindowsPlatform
  
  @js.native
  trait WindowsPlatform
    extends StObject
       with Platform {
    
    /* private */ var HOST_FILE_PATH: Any = js.native
    
    /* private */ var decrypt: Any = js.native
    
    /* private */ var encrypt: Any = js.native
  }
}
