package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base for elements defined inside a resource
  */
@js.native
trait BackboneElement extends Element {
  
  /**
    * Extensions that cannot be ignored
    */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.native
}
object BackboneElement {
  
  @scala.inline
  def apply(): BackboneElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackboneElement]
  }
  
  @scala.inline
  implicit class BackboneElementOps[Self <: BackboneElement] (val x: Self) extends AnyVal {
    
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
    def setModifierExtensionVarargs(value: Extension*): Self = this.set("modifierExtension", js.Array(value :_*))
    
    @scala.inline
    def setModifierExtension(value: js.Array[Extension]): Self = this.set("modifierExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifierExtension: Self = this.set("modifierExtension", js.undefined)
  }
}
