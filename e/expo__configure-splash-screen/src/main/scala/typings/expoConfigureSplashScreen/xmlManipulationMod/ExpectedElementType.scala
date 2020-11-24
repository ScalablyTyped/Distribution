package typings.expoConfigureSplashScreen.xmlManipulationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpectedElementType extends ExpectedElement {
  
  var attributes: js.UndefOr[ExpectedElementAttributes] = js.native
  
  var elements: js.UndefOr[ExpectedElements] = js.native
  
  var name: String = js.native
}
object ExpectedElementType {
  
  @scala.inline
  def apply(name: String): ExpectedElementType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedElementType]
  }
  
  @scala.inline
  implicit class ExpectedElementTypeOps[Self <: ExpectedElementType] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: ExpectedElementAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: WithExplicitIndex[WithDeletionFlag[ExpectedElement]]*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: ExpectedElements): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
  }
}
