package typings.devexpressUtils

import typings.std.ActiveXObject
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginHelperMod {
  
  @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper")
  @js.native
  class PdfPluginHelper () extends StObject
  /* static members */
  object PdfPluginHelper {
    
    @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper.getActiveXObject")
    @js.native
    def getActiveXObject(name: String): ActiveXObject | Null = js.native
    
    @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper.getNavigatorPlugin")
    @js.native
    def getNavigatorPlugin(name: String): Plugin | Null = js.native
    
    @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper.getPdfPlugin")
    @js.native
    def getPdfPlugin(): js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper.getVersion")
    @js.native
    def getVersion(): Double | Null = js.native
    
    @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper.isInstalled")
    @js.native
    def isInstalled(): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper.plugin")
    @js.native
    def plugin: js.Any = js.native
    @scala.inline
    def plugin_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugin")(x.asInstanceOf[js.Any])
  }
}
