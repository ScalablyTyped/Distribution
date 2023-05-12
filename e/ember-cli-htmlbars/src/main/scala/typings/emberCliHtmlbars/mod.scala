package typings.emberCliHtmlbars

import typings.emberCliHtmlbars.anon.SrcName
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ember-cli-htmlbars", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hbs(tagged: TemplateStringsArray): TemplateFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("hbs")(tagged.asInstanceOf[js.Any]).asInstanceOf[TemplateFactory]
  inline def hbs(template: String): TemplateFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("hbs")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateFactory]
  inline def hbs(template: String, options: PrecompileOptions): TemplateFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("hbs")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TemplateFactory]
  
  trait PrecompileOptions extends StObject {
    
    var moduleName: js.UndefOr[String] = js.undefined
    
    var parseOptions: js.UndefOr[SrcName] = js.undefined
  }
  object PrecompileOptions {
    
    inline def apply(): PrecompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrecompileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrecompileOptions] (val x: Self) extends AnyVal {
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
      
      inline def setParseOptions(value: SrcName): Self = StObject.set(x, "parseOptions", value.asInstanceOf[js.Any])
      
      inline def setParseOptionsUndefined: Self = StObject.set(x, "parseOptions", js.undefined)
    }
  }
  
  trait TemplateFactory extends StObject {
    
    var __htmlbars_inline_precompile_template_factory: Any
  }
  object TemplateFactory {
    
    inline def apply(__htmlbars_inline_precompile_template_factory: Any): TemplateFactory = {
      val __obj = js.Dynamic.literal(__htmlbars_inline_precompile_template_factory = __htmlbars_inline_precompile_template_factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateFactory] (val x: Self) extends AnyVal {
      
      inline def set__htmlbars_inline_precompile_template_factory(value: Any): Self = StObject.set(x, "__htmlbars_inline_precompile_template_factory", value.asInstanceOf[js.Any])
    }
  }
}
