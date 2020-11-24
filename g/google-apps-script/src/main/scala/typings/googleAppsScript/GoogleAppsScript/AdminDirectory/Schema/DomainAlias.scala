package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainAlias extends js.Object {
  
  var creationTime: js.UndefOr[String] = js.native
  
  var domainAliasName: js.UndefOr[String] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var parentDomainName: js.UndefOr[String] = js.native
  
  var verified: js.UndefOr[Boolean] = js.native
}
object DomainAlias {
  
  @scala.inline
  def apply(): DomainAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainAlias]
  }
  
  @scala.inline
  implicit class DomainAliasOps[Self <: DomainAlias] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDomainAliasName(value: String): Self = this.set("domainAliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainAliasName: Self = this.set("domainAliasName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setParentDomainName(value: String): Self = this.set("parentDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentDomainName: Self = this.set("parentDomainName", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified: Self = this.set("verified", js.undefined)
  }
}
