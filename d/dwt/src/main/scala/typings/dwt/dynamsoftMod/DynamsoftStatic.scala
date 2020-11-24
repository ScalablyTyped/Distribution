package typings.dwt.dynamsoftMod

import typings.dwt.addonOCRProMod.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dwt/Dynamsoft", "DynamsoftStatic")
@js.native
object DynamsoftStatic extends js.Object {
  
  var FileUploader: typings.dwt.dynamsoftFileUploaderMod.FileUploader = js.native
  
  var Lib: DynamsoftLib = js.native
  
  var MSG: Messages = js.native
  
  var WebTwainEnv: typings.dwt.dynamsoftMod.WebTwainEnv = js.native
  
  var managerEnv: ManagerEnv = js.native
  
  @js.native
  object WebTwain extends js.Object {
    
    @js.native
    object Addon extends js.Object {
      
      @js.native
      object OCRPro extends js.Object {
        
        def NewSettings(): Settings = js.native
      }
    }
  }
}
