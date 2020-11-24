package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwimlaneSettingsUnassignedGroup extends js.Object {
  
  /** To enable or disable unassigned category change with swim lane key values.
    * @Default {true}
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /** To set the user defined values which are need to categorized as unassigned category swim lane groups.
    * @Default {[null,undefined,]}
    */
  var keys: js.UndefOr[js.Array[_]] = js.native
}
object SwimlaneSettingsUnassignedGroup {
  
  @scala.inline
  def apply(): SwimlaneSettingsUnassignedGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwimlaneSettingsUnassignedGroup]
  }
  
  @scala.inline
  implicit class SwimlaneSettingsUnassignedGroupOps[Self <: SwimlaneSettingsUnassignedGroup] (val x: Self) extends AnyVal {
    
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[_]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
}
