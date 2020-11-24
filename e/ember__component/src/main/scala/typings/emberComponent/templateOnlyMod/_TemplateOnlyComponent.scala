package typings.emberComponent.templateOnlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _TemplateOnlyComponent extends js.Object {
  
  // Type brand to simulate a nominal type.
  var brand: typings.emberComponent.emberComponentStrings.TemplateOnlyComponent = js.native
}
object _TemplateOnlyComponent {
  
  @scala.inline
  def apply(brand: typings.emberComponent.emberComponentStrings.TemplateOnlyComponent): _TemplateOnlyComponent = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TemplateOnlyComponent]
  }
  
  @scala.inline
  implicit class _TemplateOnlyComponentOps[Self <: _TemplateOnlyComponent] (val x: Self) extends AnyVal {
    
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
    def setBrand(value: typings.emberComponent.emberComponentStrings.TemplateOnlyComponent): Self = this.set("brand", value.asInstanceOf[js.Any])
  }
}
