package typings.devcert

import typings.devcert.distPlatformsMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformsLinuxMod {
  
  @JSImport("devcert/dist/platforms/linux", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LinuxPlatform
  
  @js.native
  trait LinuxPlatform
    extends StObject
       with Platform {
    
    /* private */ var CHROME_BIN_PATH: Any = js.native
    
    /* private */ var CHROME_NSS_DIR: Any = js.native
    
    /* private */ var FIREFOX_BIN_PATH: Any = js.native
    
    /* private */ var FIREFOX_NSS_DIR: Any = js.native
    
    /* private */ var HOST_FILE_PATH: Any = js.native
    
    /* private */ var isChromeInstalled: Any = js.native
    
    /* private */ var isFirefoxInstalled: Any = js.native
  }
}
