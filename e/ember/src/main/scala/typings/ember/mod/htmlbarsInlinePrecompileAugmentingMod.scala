package typings.ember.mod

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object htmlbarsInlinePrecompileAugmentingMod {
  
  @JSImport("htmlbars-inline-precompile", JSImport.Default)
  @js.native
  def default(tagged: TemplateStringsArray): TemplateFactory = js.native
  
  @js.native
  trait TemplateFactory extends StObject {
    
    var __htmlbars_inline_precompile_template_factory: js.Any = js.native
  }
  object TemplateFactory {
    
    @scala.inline
    def apply(__htmlbars_inline_precompile_template_factory: js.Any): TemplateFactory = {
      val __obj = js.Dynamic.literal(__htmlbars_inline_precompile_template_factory = __htmlbars_inline_precompile_template_factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateFactory]
    }
    
    @scala.inline
    implicit class TemplateFactoryMutableBuilder[Self <: TemplateFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__htmlbars_inline_precompile_template_factory(value: js.Any): Self = StObject.set(x, "__htmlbars_inline_precompile_template_factory", value.asInstanceOf[js.Any])
    }
  }
}
