package typings.devcert

import typings.devcert.platformsMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linuxMod {
  
  @JSImport("devcert/dist/platforms/linux", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with LinuxPlatform
  
  @js.native
  trait LinuxPlatform
    extends StObject
       with Platform {
    
    /* private */ var CHROME_BIN_PATH: js.Any = js.native
    
    /* private */ var CHROME_NSS_DIR: js.Any = js.native
    
    /* private */ var FIREFOX_BIN_PATH: js.Any = js.native
    
    /* private */ var FIREFOX_NSS_DIR: js.Any = js.native
    
    /* private */ var HOST_FILE_PATH: js.Any = js.native
    
    /* private */ var isChromeInstalled: js.Any = js.native
    
    /* private */ var isFirefoxInstalled: js.Any = js.native
  }
}
