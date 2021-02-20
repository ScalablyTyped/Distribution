package typings.emberCliBabelPluginHelpers

import typings.emberCliBabelPluginHelpers.mod.BabelPluginConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Babel extends StObject {
    
    var babel: js.UndefOr[Plugins] = js.native
  }
  object Babel {
    
    @scala.inline
    def apply(): Babel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Babel]
    }
    
    @scala.inline
    implicit class BabelMutableBuilder[Self <: Babel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabel(value: Plugins): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabelUndefined: Self = StObject.set(x, "babel", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait Plugins extends StObject {
    
    var plugins: js.UndefOr[js.Array[BabelPluginConfig]] = js.native
  }
  object Plugins {
    
    @scala.inline
    def apply(): Plugins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins]
    }
    
    @scala.inline
    implicit class PluginsMutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[BabelPluginConfig]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: BabelPluginConfig*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
