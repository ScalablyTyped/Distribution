package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.line
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.space
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptExtensionVueTypesVueTemplateCompilerMod {
  
  trait SFCBlockV2 extends StObject {
    
    var attrs: Record[String, String]
    
    var content: String
    
    var end: js.UndefOr[Double] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var module: js.UndefOr[String | Boolean] = js.undefined
    
    var scoped: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var `type`: String
  }
  object SFCBlockV2 {
    
    inline def apply(attrs: Record[String, String], content: String, `type`: String): SFCBlockV2 = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCBlockV2]
    }
    
    extension [Self <: SFCBlockV2](x: Self) {
      
      inline def setAttrs(value: Record[String, String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setModule(value: String | Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SFCDescriptorV2 extends StObject {
    
    var customBlocks: js.Array[SFCBlockV2]
    
    var script: js.UndefOr[SFCBlockV2] = js.undefined
    
    var styles: js.Array[SFCBlockV2]
    
    var template: js.UndefOr[SFCBlockV2] = js.undefined
  }
  object SFCDescriptorV2 {
    
    inline def apply(customBlocks: js.Array[SFCBlockV2], styles: js.Array[SFCBlockV2]): SFCDescriptorV2 = {
      val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCDescriptorV2]
    }
    
    extension [Self <: SFCDescriptorV2](x: Self) {
      
      inline def setCustomBlocks(value: js.Array[SFCBlockV2]): Self = StObject.set(x, "customBlocks", value.asInstanceOf[js.Any])
      
      inline def setCustomBlocksVarargs(value: SFCBlockV2*): Self = StObject.set(x, "customBlocks", js.Array(value*))
      
      inline def setScript(value: SFCBlockV2): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setStyles(value: js.Array[SFCBlockV2]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: SFCBlockV2*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setTemplate(value: SFCBlockV2): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait SFCParserOptionsV2 extends StObject {
    
    var pad: js.UndefOr[`true` | line | space] = js.undefined
  }
  object SFCParserOptionsV2 {
    
    inline def apply(): SFCParserOptionsV2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SFCParserOptionsV2]
    }
    
    extension [Self <: SFCParserOptionsV2](x: Self) {
      
      inline def setPad(value: `true` | line | space): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    }
  }
  
  @js.native
  trait VueTemplateCompilerV2 extends StObject {
    
    def parseComponent(file: String): SFCDescriptorV2 = js.native
    def parseComponent(file: String, options: SFCParserOptionsV2): SFCDescriptorV2 = js.native
  }
}
