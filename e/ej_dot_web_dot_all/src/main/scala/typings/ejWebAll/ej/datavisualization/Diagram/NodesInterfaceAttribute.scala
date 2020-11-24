package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesInterfaceAttribute extends js.Object {
  
  /** Sets the name of the attribute
    */
  var name: js.UndefOr[String] = js.native
  
  /** Sets the visibility of the attribute
    */
  var scope: js.UndefOr[String] = js.native
  
  /** Sets the type of the attribute
    */
  var `type`: js.UndefOr[String] = js.native
}
object NodesInterfaceAttribute {
  
  @scala.inline
  def apply(): NodesInterfaceAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesInterfaceAttribute]
  }
  
  @scala.inline
  implicit class NodesInterfaceAttributeOps[Self <: NodesInterfaceAttribute] (val x: Self) extends AnyVal {
    
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
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
