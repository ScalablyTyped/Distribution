package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesEnumeration extends js.Object {
  
  /** Defines the collection of enumeration members
    * @Default {[]}
    */
  var members: js.UndefOr[js.Array[NodesEnumerationMember]] = js.native
  
  /** Sets the name of the Enumeration
    */
  var name: js.UndefOr[String] = js.native
}
object NodesEnumeration {
  
  @scala.inline
  def apply(): NodesEnumeration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesEnumeration]
  }
  
  @scala.inline
  implicit class NodesEnumerationOps[Self <: NodesEnumeration] (val x: Self) extends AnyVal {
    
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
    def setMembersVarargs(value: NodesEnumerationMember*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[NodesEnumerationMember]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
