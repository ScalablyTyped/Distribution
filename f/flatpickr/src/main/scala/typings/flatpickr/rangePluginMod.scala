package typings.flatpickr

import typings.flatpickr.flatpickrStrings.left
import typings.flatpickr.optionsMod.Plugin
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangePluginMod {
  
  @JSImport("flatpickr/dist/plugins/rangePlugin", JSImport.Default)
  @js.native
  def default(): Plugin[js.Object] = js.native
  @JSImport("flatpickr/dist/plugins/rangePlugin", JSImport.Default)
  @js.native
  def default(config: Config): Plugin[js.Object] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var input: js.UndefOr[String | HTMLInputElement] = js.native
    
    var position: js.UndefOr[left] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: String | HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setPosition(value: left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
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
