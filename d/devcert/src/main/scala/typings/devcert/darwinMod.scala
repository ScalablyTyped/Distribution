package typings.devcert

import typings.devcert.platformsMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devcert/dist/platforms/darwin", JSImport.Namespace)
@js.native
object darwinMod extends js.Object {
  
  @js.native
  trait MacOSPlatform extends Platform {
    
    var FIREFOX_BIN_PATH: js.Any = js.native
    
    var FIREFOX_BUNDLE_PATH: js.Any = js.native
    
    var FIREFOX_NSS_DIR: js.Any = js.native
    
    var HOST_FILE_PATH: js.Any = js.native
    
    var isFirefoxInstalled: js.Any = js.native
    
    var isNSSInstalled: js.Any = js.native
  }
  
  @js.native
  class default () extends MacOSPlatform
}
