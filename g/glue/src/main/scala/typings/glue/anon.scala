package typings.glue

import typings.glue.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Options extends StObject {
    
    var options: js.UndefOr[js.Any] = js.native
    
    var register: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(register: String): Options = {
      val __obj = js.Dynamic.literal(register = register.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRegister(value: String): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Plugins extends StObject {
    
    var plugins: js.Array[Plugin | String] = js.native
  }
  object Plugins {
    
    @scala.inline
    def apply(plugins: js.Array[Plugin | String]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    @scala.inline
    implicit class PluginsMutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin | String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: (Plugin | String)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
