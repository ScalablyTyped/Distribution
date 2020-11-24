package typings.devcert

import typings.devcert.platformsMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devcert/dist/platforms/win32", JSImport.Namespace)
@js.native
object win32Mod extends js.Object {
  
  @js.native
  trait WindowsPlatform extends Platform {
    
    var HOST_FILE_PATH: js.Any = js.native
    
    var decrypt: js.Any = js.native
    
    var encrypt: js.Any = js.native
  }
  
  @js.native
  class default () extends WindowsPlatform
}
