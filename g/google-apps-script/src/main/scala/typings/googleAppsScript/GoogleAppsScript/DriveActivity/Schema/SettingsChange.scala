package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsChange extends js.Object {
  
  var restrictionChanges: js.UndefOr[js.Array[RestrictionChange]] = js.native
}
object SettingsChange {
  
  @scala.inline
  def apply(): SettingsChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsChange]
  }
  
  @scala.inline
  implicit class SettingsChangeOps[Self <: SettingsChange] (val x: Self) extends AnyVal {
    
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
    def setRestrictionChangesVarargs(value: RestrictionChange*): Self = this.set("restrictionChanges", js.Array(value :_*))
    
    @scala.inline
    def setRestrictionChanges(value: js.Array[RestrictionChange]): Self = this.set("restrictionChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictionChanges: Self = this.set("restrictionChanges", js.undefined)
  }
}
