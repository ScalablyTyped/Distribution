package typings.emberCliBabelPluginHelpers

import typings.emberCliBabelPluginHelpers.mod.BabelPluginConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Babel extends StObject {
    
    var babel: js.UndefOr[Plugins] = js.undefined
  }
  object Babel {
    
    inline def apply(): Babel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Babel]
    }
    
    extension [Self <: Babel](x: Self) {
      
      inline def setBabel(value: Plugins): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      inline def setBabelUndefined: Self = StObject.set(x, "babel", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Plugins extends StObject {
    
    var plugins: js.UndefOr[js.Array[BabelPluginConfig]] = js.undefined
  }
  object Plugins {
    
    inline def apply(): Plugins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[BabelPluginConfig]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: BabelPluginConfig*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
