package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.codeFrameDTsMod.BabelCodeFrameOptions
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterOptionsMod {
  
  trait BasicFormatterOptions
    extends StObject
       with _FormatterOptions {
    
    var `type`: basic
  }
  object BasicFormatterOptions {
    
    inline def apply(): BasicFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("basic")
      __obj.asInstanceOf[BasicFormatterOptions]
    }
    
    extension [Self <: BasicFormatterOptions](x: Self) {
      
      inline def setType(value: basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeframeFormatterOptions
    extends StObject
       with _FormatterOptions {
    
    var options: js.UndefOr[BabelCodeFrameOptions] = js.undefined
    
    var `type`: codeframe
  }
  object CodeframeFormatterOptions {
    
    inline def apply(): CodeframeFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("codeframe")
      __obj.asInstanceOf[CodeframeFormatterOptions]
    }
    
    extension [Self <: CodeframeFormatterOptions](x: Self) {
      
      inline def setOptions(value: BabelCodeFrameOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: codeframe): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterType
    - typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.BasicFormatterOptions
    - typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.CodeframeFormatterOptions
    - typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
  */
  type FormatterOptions = js.UndefOr[_FormatterOptions | Formatter]
  
  /* Rewritten from type alias, can be one of: 
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
  */
  trait FormatterType
    extends StObject
       with _FormatterOptions
  object FormatterType {
    
    inline def basic: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic = "basic".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic]
    
    inline def codeframe: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe = "codeframe".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe]
  }
  
  trait _FormatterOptions extends StObject
}
