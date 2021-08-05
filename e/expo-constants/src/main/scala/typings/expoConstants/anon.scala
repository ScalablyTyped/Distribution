package typings.expoConstants

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dev
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var hostType: js.UndefOr[String] = js.undefined
    
    var lanType: js.UndefOr[String] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var urlRandomness: js.UndefOr[String] = js.undefined
    
    var urlType: js.UndefOr[String] = js.undefined
  }
  object Dev {
    
    inline def apply(): Dev = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dev]
    }
    
    extension [Self <: Dev](x: Self) {
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setHostType(value: String): Self = StObject.set(x, "hostType", value.asInstanceOf[js.Any])
      
      inline def setHostTypeUndefined: Self = StObject.set(x, "hostType", js.undefined)
      
      inline def setLanType(value: String): Self = StObject.set(x, "lanType", value.asInstanceOf[js.Any])
      
      inline def setLanTypeUndefined: Self = StObject.set(x, "lanType", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setUrlRandomness(value: String): Self = StObject.set(x, "urlRandomness", value.asInstanceOf[js.Any])
      
      inline def setUrlRandomnessUndefined: Self = StObject.set(x, "urlRandomness", js.undefined)
      
      inline def setUrlType(value: String): Self = StObject.set(x, "urlType", value.asInstanceOf[js.Any])
      
      inline def setUrlTypeUndefined: Self = StObject.set(x, "urlType", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var color: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  trait Icon
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var icon: js.UndefOr[String] = js.undefined
  }
  object Icon {
    
    inline def apply(): Icon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icon]
    }
    
    extension [Self <: Icon](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  trait Scheme
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var scheme: js.UndefOr[String] = js.undefined
  }
  object Scheme {
    
    inline def apply(): Scheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scheme]
    }
    
    extension [Self <: Scheme](x: Self) {
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
  
  trait Tool
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var tool: js.UndefOr[String] = js.undefined
  }
  object Tool {
    
    inline def apply(): Tool = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tool]
    }
    
    extension [Self <: Tool](x: Self) {
      
      inline def setTool(value: String): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
    }
  }
}
