package typings.devextreme.anon

import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.smallValueThreshold
import typings.devextreme.devextremeStrings.topN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupName extends js.Object {
  
  var groupName: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[none | smallValueThreshold | topN] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
  
  var topCount: js.UndefOr[Double] = js.native
}
object GroupName {
  
  @scala.inline
  def apply(): GroupName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupName]
  }
  
  @scala.inline
  implicit class GroupNameOps[Self <: GroupName] (val x: Self) extends AnyVal {
    
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
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setMode(value: none | smallValueThreshold | topN): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setTopCount(value: Double): Self = this.set("topCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopCount: Self = this.set("topCount", js.undefined)
  }
}
