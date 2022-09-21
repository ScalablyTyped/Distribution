package typings.expoDevcert

import typings.expoDevcert.platformsMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object darwinMod {
  
  @JSImport("@expo/devcert/dist/platforms/darwin", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MacOSPlatform
  
  @js.native
  trait MacOSPlatform
    extends StObject
       with Platform {
    
    /* private */ var FIREFOX_BIN_PATH: Any = js.native
    
    /* private */ var FIREFOX_BUNDLE_PATH: Any = js.native
    
    /* private */ var FIREFOX_NSS_DIR: Any = js.native
    
    /* private */ var HOST_FILE_PATH: Any = js.native
    
    /* private */ var isFirefoxInstalled: Any = js.native
    
    /* private */ var isNSSInstalled: Any = js.native
  }
}
