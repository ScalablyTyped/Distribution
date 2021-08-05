package typings.devtools

import typings.devtools.anon.HeightWidth
import typings.puppeteerCore.browserMod.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launcherMod {
  
  @JSImport("devtools/build/launcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(capabilities: ExtendedCapabilities): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(capabilities.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]
  
  trait DevToolsOptions extends StObject {
    
    var defaultViewport: js.UndefOr[HeightWidth] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDefaultArgs: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  }
  object DevToolsOptions {
    
    inline def apply(): DevToolsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevToolsOptions]
    }
    
    extension [Self <: DevToolsOptions](x: Self) {
      
      inline def setDefaultViewport(value: HeightWidth): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setIgnoreDefaultArgs(value: js.Array[String] | Boolean): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDefaultArgsUndefined: Self = StObject.set(x, "ignoreDefaultArgs", js.undefined)
      
      inline def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value :_*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Capabilities * / any */ trait ExtendedCapabilities extends StObject {
    
    @JSName("wdio:devtoolsOptions")
    var wdioColondevtoolsOptions: js.UndefOr[DevToolsOptions] = js.undefined
  }
  object ExtendedCapabilities {
    
    inline def apply(): ExtendedCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedCapabilities]
    }
    
    extension [Self <: ExtendedCapabilities](x: Self) {
      
      inline def setWdioColondevtoolsOptions(value: DevToolsOptions): Self = StObject.set(x, "wdio:devtoolsOptions", value.asInstanceOf[js.Any])
      
      inline def setWdioColondevtoolsOptionsUndefined: Self = StObject.set(x, "wdio:devtoolsOptions", js.undefined)
    }
  }
}
