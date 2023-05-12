package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.Formatter
import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.FormatterPathType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterFormatterOptionsMod {
  
  trait BasicFormatterOptions
    extends StObject
       with _FormatterOptions {
    
    var pathType: js.UndefOr[FormatterPathType] = js.undefined
    
    var `type`: basic
  }
  object BasicFormatterOptions {
    
    inline def apply(): BasicFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("basic")
      __obj.asInstanceOf[BasicFormatterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BasicFormatterOptions] (val x: Self) extends AnyVal {
      
      inline def setPathType(value: FormatterPathType): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
      
      inline def setPathTypeUndefined: Self = StObject.set(x, "pathType", js.undefined)
      
      inline def setType(value: basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeframeFormatterOptions
    extends StObject
       with _FormatterOptions {
    
    var options: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelCodeFrameOptions */ Any
      ] = js.undefined
    
    var pathType: js.UndefOr[FormatterPathType] = js.undefined
    
    var `type`: codeframe
  }
  object CodeframeFormatterOptions {
    
    inline def apply(): CodeframeFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("codeframe")
      __obj.asInstanceOf[CodeframeFormatterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeframeFormatterOptions] (val x: Self) extends AnyVal {
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelCodeFrameOptions */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPathType(value: FormatterPathType): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
      
      inline def setPathTypeUndefined: Self = StObject.set(x, "pathType", js.undefined)
      
      inline def setType(value: codeframe): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.forkTsCheckerWebpackPlugin.libFormatterFormatterOptionsMod.FormatterType
    - typings.forkTsCheckerWebpackPlugin.libFormatterFormatterOptionsMod.BasicFormatterOptions
    - typings.forkTsCheckerWebpackPlugin.libFormatterFormatterOptionsMod.CodeframeFormatterOptions
    - typings.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.Formatter
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
