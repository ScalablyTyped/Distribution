package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Collection.GroupsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminGroupsSettings_ extends js.Object {
  
  var Groups: js.UndefOr[GroupsCollection] = js.native
  
  // Create a new instance of Groups
  def newGroups(): typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups = js.native
}
object AdminGroupsSettings_ {
  
  @scala.inline
  def apply(newGroups: () => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups): AdminGroupsSettings_ = {
    val __obj = js.Dynamic.literal(newGroups = js.Any.fromFunction0(newGroups))
    __obj.asInstanceOf[AdminGroupsSettings_]
  }
  
  @scala.inline
  implicit class AdminGroupsSettings_Ops[Self <: AdminGroupsSettings_] (val x: Self) extends AnyVal {
    
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
    def setNewGroups(value: () => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups): Self = this.set("newGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroups(value: GroupsCollection): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
  }
}
