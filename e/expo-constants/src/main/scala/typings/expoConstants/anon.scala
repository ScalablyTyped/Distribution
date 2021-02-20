package typings.expoConstants

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dev
    extends /* key */ StringDictionary[js.Any] {
    
    var dev: js.UndefOr[Boolean] = js.native
    
    var hostType: js.UndefOr[String] = js.native
    
    var lanType: js.UndefOr[String] = js.native
    
    var minify: js.UndefOr[Boolean] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
    
    var urlRandomness: js.UndefOr[String] = js.native
    
    var urlType: js.UndefOr[String] = js.native
  }
  object Dev {
    
    @scala.inline
    def apply(): Dev = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dev]
    }
    
    @scala.inline
    implicit class DevMutableBuilder[Self <: Dev] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      @scala.inline
      def setHostType(value: String): Self = StObject.set(x, "hostType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostTypeUndefined: Self = StObject.set(x, "hostType", js.undefined)
      
      @scala.inline
      def setLanType(value: String): Self = StObject.set(x, "lanType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanTypeUndefined: Self = StObject.set(x, "lanType", js.undefined)
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setUrlRandomness(value: String): Self = StObject.set(x, "urlRandomness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlRandomnessUndefined: Self = StObject.set(x, "urlRandomness", js.undefined)
      
      @scala.inline
      def setUrlType(value: String): Self = StObject.set(x, "urlType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlTypeUndefined: Self = StObject.set(x, "urlType", js.undefined)
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var color: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[String] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  @js.native
  trait Icon
    extends /* key */ StringDictionary[js.Any] {
    
    var icon: js.UndefOr[String] = js.native
  }
  object Icon {
    
    @scala.inline
    def apply(): Icon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  @js.native
  trait Scheme
    extends /* key */ StringDictionary[js.Any] {
    
    var scheme: js.UndefOr[String] = js.native
  }
  object Scheme {
    
    @scala.inline
    def apply(): Scheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scheme]
    }
    
    @scala.inline
    implicit class SchemeMutableBuilder[Self <: Scheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
  
  @js.native
  trait Tool
    extends /* key */ StringDictionary[js.Any] {
    
    var tool: js.UndefOr[String] = js.native
  }
  object Tool {
    
    @scala.inline
    def apply(): Tool = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tool]
    }
    
    @scala.inline
    implicit class ToolMutableBuilder[Self <: Tool] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTool(value: String): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
    }
  }
}
