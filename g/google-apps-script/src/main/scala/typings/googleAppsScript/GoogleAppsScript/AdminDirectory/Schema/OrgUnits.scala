package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgUnits extends js.Object {
  
  var etag: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var organizationUnits: js.UndefOr[js.Array[OrgUnit]] = js.native
}
object OrgUnits {
  
  @scala.inline
  def apply(): OrgUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgUnits]
  }
  
  @scala.inline
  implicit class OrgUnitsOps[Self <: OrgUnits] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOrganizationUnitsVarargs(value: OrgUnit*): Self = this.set("organizationUnits", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationUnits(value: js.Array[OrgUnit]): Self = this.set("organizationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationUnits: Self = this.set("organizationUnits", js.undefined)
  }
}
