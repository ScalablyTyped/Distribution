package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupColorMapping extends js.Object {
  
  /** Specifies the groupID for GroupColorMapping.
    * @Default {null}
    */
  var groupID: js.UndefOr[String] = js.native
}
object GroupColorMapping {
  
  @scala.inline
  def apply(): GroupColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupColorMapping]
  }
  
  @scala.inline
  implicit class GroupColorMappingOps[Self <: GroupColorMapping] (val x: Self) extends AnyVal {
    
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
    def setGroupID(value: String): Self = this.set("groupID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupID: Self = this.set("groupID", js.undefined)
  }
}
