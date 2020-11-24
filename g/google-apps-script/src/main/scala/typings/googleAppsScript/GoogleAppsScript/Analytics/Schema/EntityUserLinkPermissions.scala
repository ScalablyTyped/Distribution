package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityUserLinkPermissions extends js.Object {
  
  var effective: js.UndefOr[js.Array[String]] = js.native
  
  var local: js.UndefOr[js.Array[String]] = js.native
}
object EntityUserLinkPermissions {
  
  @scala.inline
  def apply(): EntityUserLinkPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityUserLinkPermissions]
  }
  
  @scala.inline
  implicit class EntityUserLinkPermissionsOps[Self <: EntityUserLinkPermissions] (val x: Self) extends AnyVal {
    
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
    def setEffectiveVarargs(value: String*): Self = this.set("effective", js.Array(value :_*))
    
    @scala.inline
    def setEffective(value: js.Array[String]): Self = this.set("effective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffective: Self = this.set("effective", js.undefined)
    
    @scala.inline
    def setLocalVarargs(value: String*): Self = this.set("local", js.Array(value :_*))
    
    @scala.inline
    def setLocal(value: js.Array[String]): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
  }
}
