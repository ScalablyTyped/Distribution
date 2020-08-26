package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.native
  /** The Container ID uniquely identifies the GTM Container. */
  var containerId: js.UndefOr[String] = js.native
  /** List of domain names associated with the Container. */
  var domainName: js.UndefOr[js.Array[String]] = js.native
  /** The fingerprint of the GTM Container as computed at storage time. This value is recomputed whenever the account is modified. */
  var fingerprint: js.UndefOr[String] = js.native
  /** Container display name. */
  var name: js.UndefOr[String] = js.native
  /** Container Notes. */
  var notes: js.UndefOr[String] = js.native
  /** GTM Container's API relative path. */
  var path: js.UndefOr[String] = js.native
  /** Container Public ID. */
  var publicId: js.UndefOr[String] = js.native
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.native
  /** List of Usage Contexts for the Container. Valid values include: web, android, or ios. */
  var usageContext: js.UndefOr[js.Array[String]] = js.native
}

object Container {
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
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
    def setDomainNameVarargs(value: String*): Self = this.set("domainName", js.Array(value :_*))
    @scala.inline
    def setDomainName(value: js.Array[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPublicId(value: String): Self = this.set("publicId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicId: Self = this.set("publicId", js.undefined)
    @scala.inline
    def setTagManagerUrl(value: String): Self = this.set("tagManagerUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagManagerUrl: Self = this.set("tagManagerUrl", js.undefined)
    @scala.inline
    def setUsageContextVarargs(value: String*): Self = this.set("usageContext", js.Array(value :_*))
    @scala.inline
    def setUsageContext(value: js.Array[String]): Self = this.set("usageContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageContext: Self = this.set("usageContext", js.undefined)
  }
  
}

