package typings.glue

import typings.glue.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Options extends StObject {
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    var register: String
  }
  object Options {
    
    inline def apply(register: String): Options = {
      val __obj = js.Dynamic.literal(register = register.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRegister(value: String): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plugins extends StObject {
    
    var plugins: js.Array[Plugin | String]
  }
  object Plugins {
    
    inline def apply(plugins: js.Array[Plugin | String]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[Plugin | String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: (Plugin | String)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
