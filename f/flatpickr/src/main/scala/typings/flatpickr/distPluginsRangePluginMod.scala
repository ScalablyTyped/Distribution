package typings.flatpickr

import typings.flatpickr.distTypesOptionsMod.Plugin
import typings.flatpickr.flatpickrStrings.left
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsRangePluginMod {
  
  @JSImport("flatpickr/dist/plugins/rangePlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin[js.Object]]
  inline def default(config: Config): Plugin[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Plugin[js.Object]]
  
  trait Config extends StObject {
    
    var input: js.UndefOr[String | HTMLInputElement] = js.undefined
    
    var position: js.UndefOr[left] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setInput(value: String | HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setPosition(value: left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      def rangePlugin(): Unit = js.native
      def rangePlugin(config: Config): Unit = js.native
    }
  }
}
