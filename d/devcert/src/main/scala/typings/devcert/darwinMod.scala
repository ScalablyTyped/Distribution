package typings.devcert

import typings.devcert.platformsMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object darwinMod {
  
  @JSImport("devcert/dist/platforms/darwin", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with MacOSPlatform
  
  @js.native
  trait MacOSPlatform
    extends StObject
       with Platform {
    
    /* private */ var FIREFOX_BIN_PATH: js.Any = js.native
    
    /* private */ var FIREFOX_BUNDLE_PATH: js.Any = js.native
    
    /* private */ var FIREFOX_NSS_DIR: js.Any = js.native
    
    /* private */ var HOST_FILE_PATH: js.Any = js.native
    
    /* private */ var isFirefoxInstalled: js.Any = js.native
    
    /* private */ var isNSSInstalled: js.Any = js.native
  }
}
