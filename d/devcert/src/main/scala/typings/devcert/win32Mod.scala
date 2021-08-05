package typings.devcert

import typings.devcert.platformsMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object win32Mod {
  
  @JSImport("devcert/dist/platforms/win32", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with WindowsPlatform
  
  @js.native
  trait WindowsPlatform
    extends StObject
       with Platform {
    
    /* private */ var HOST_FILE_PATH: js.Any = js.native
    
    /* private */ var decrypt: js.Any = js.native
    
    /* private */ var encrypt: js.Any = js.native
  }
}
