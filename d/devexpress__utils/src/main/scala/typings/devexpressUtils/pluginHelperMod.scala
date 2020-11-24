package typings.devexpressUtils

import typings.std.ActiveXObject
import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/pdf/plugin-helper", JSImport.Namespace)
@js.native
object pluginHelperMod extends js.Object {
  
  @js.native
  class PdfPluginHelper () extends js.Object
  /* static members */
  @js.native
  object PdfPluginHelper extends js.Object {
    
    def getActiveXObject(name: String): ActiveXObject | Null = js.native
    
    def getNavigatorPlugin(name: String): Plugin | Null = js.native
    
    def getPdfPlugin(): js.Any = js.native
    
    def getVersion(): Double | Null = js.native
    
    def isInstalled(): Boolean = js.native
    
    var plugin: js.Any = js.native
  }
}
