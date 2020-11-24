package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerVersionHeader extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var containerId: js.UndefOr[String] = js.native
  
  var containerVersionId: js.UndefOr[String] = js.native
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var numCustomTemplates: js.UndefOr[String] = js.native
  
  var numMacros: js.UndefOr[String] = js.native
  
  var numRules: js.UndefOr[String] = js.native
  
  var numTags: js.UndefOr[String] = js.native
  
  var numTriggers: js.UndefOr[String] = js.native
  
  var numVariables: js.UndefOr[String] = js.native
  
  var numZones: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object ContainerVersionHeader {
  
  @scala.inline
  def apply(): ContainerVersionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerVersionHeader]
  }
  
  @scala.inline
  implicit class ContainerVersionHeaderOps[Self <: ContainerVersionHeader] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setContainerVersionId(value: String): Self = this.set("containerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerVersionId: Self = this.set("containerVersionId", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumCustomTemplates(value: String): Self = this.set("numCustomTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumCustomTemplates: Self = this.set("numCustomTemplates", js.undefined)
    
    @scala.inline
    def setNumMacros(value: String): Self = this.set("numMacros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumMacros: Self = this.set("numMacros", js.undefined)
    
    @scala.inline
    def setNumRules(value: String): Self = this.set("numRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumRules: Self = this.set("numRules", js.undefined)
    
    @scala.inline
    def setNumTags(value: String): Self = this.set("numTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTags: Self = this.set("numTags", js.undefined)
    
    @scala.inline
    def setNumTriggers(value: String): Self = this.set("numTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTriggers: Self = this.set("numTriggers", js.undefined)
    
    @scala.inline
    def setNumVariables(value: String): Self = this.set("numVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumVariables: Self = this.set("numVariables", js.undefined)
    
    @scala.inline
    def setNumZones(value: String): Self = this.set("numZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumZones: Self = this.set("numZones", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
