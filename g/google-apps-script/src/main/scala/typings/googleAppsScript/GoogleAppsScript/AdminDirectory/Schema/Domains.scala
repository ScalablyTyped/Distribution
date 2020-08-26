package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domains extends js.Object {
  var creationTime: js.UndefOr[String] = js.native
  var domainAliases: js.UndefOr[js.Array[DomainAlias]] = js.native
  var domainName: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var isPrimary: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var verified: js.UndefOr[Boolean] = js.native
}

object Domains {
  @scala.inline
  def apply(): Domains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domains]
  }
  @scala.inline
  implicit class DomainsOps[Self <: Domains] (val x: Self) extends AnyVal {
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
    def setDomainAliasesVarargs(value: DomainAlias*): Self = this.set("domainAliases", js.Array(value :_*))
    @scala.inline
    def setDomainAliases(value: js.Array[DomainAlias]): Self = this.set("domainAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainAliases: Self = this.set("domainAliases", js.undefined)
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrimary: Self = this.set("isPrimary", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerified: Self = this.set("verified", js.undefined)
  }
  
}

