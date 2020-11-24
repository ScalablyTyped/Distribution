package typings.gestalt.anon

import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.info
import typings.gestalt.mod.Icons
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var icon: js.UndefOr[Icons] = js.native
  
  var iconAccessibilityLabel: js.UndefOr[String] = js.native
  
  var summary: js.UndefOr[js.Array[String]] = js.native
  
  var title: String = js.native
  
  var `type`: js.UndefOr[info | error] = js.native
}
object Children {
  
  @scala.inline
  def apply(title: String): Children = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setIcon(value: Icons): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconAccessibilityLabel(value: String): Self = this.set("iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconAccessibilityLabel: Self = this.set("iconAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setSummaryVarargs(value: String*): Self = this.set("summary", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: js.Array[String]): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setType(value: info | error): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
