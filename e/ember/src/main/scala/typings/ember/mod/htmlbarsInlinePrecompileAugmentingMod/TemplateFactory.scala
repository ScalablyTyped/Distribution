package typings.ember.mod.htmlbarsInlinePrecompileAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateFactory extends js.Object {
  
  var __htmlbars_inline_precompile_template_factory: js.Any = js.native
}
object TemplateFactory {
  
  @scala.inline
  def apply(__htmlbars_inline_precompile_template_factory: js.Any): TemplateFactory = {
    val __obj = js.Dynamic.literal(__htmlbars_inline_precompile_template_factory = __htmlbars_inline_precompile_template_factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateFactory]
  }
  
  @scala.inline
  implicit class TemplateFactoryOps[Self <: TemplateFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__htmlbars_inline_precompile_template_factory(value: js.Any): Self = this.set("__htmlbars_inline_precompile_template_factory", value.asInstanceOf[js.Any])
  }
}
