package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoveryLink extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var discoveryLink: js.UndefOr[String] = js.native
  
  var discoveryRestUrl: js.UndefOr[String] = js.native
  
  var documentationLink: js.UndefOr[String] = js.native
  
  var icons: js.UndefOr[X16] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var preferred: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object DiscoveryLink {
  
  @scala.inline
  def apply(): DiscoveryLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryLink]
  }
  
  @scala.inline
  implicit class DiscoveryLinkOps[Self <: DiscoveryLink] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDiscoveryLink(value: String): Self = this.set("discoveryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoveryLink: Self = this.set("discoveryLink", js.undefined)
    
    @scala.inline
    def setDiscoveryRestUrl(value: String): Self = this.set("discoveryRestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoveryRestUrl: Self = this.set("discoveryRestUrl", js.undefined)
    
    @scala.inline
    def setDocumentationLink(value: String): Self = this.set("documentationLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentationLink: Self = this.set("documentationLink", js.undefined)
    
    @scala.inline
    def setIcons(value: X16): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPreferred(value: Boolean): Self = this.set("preferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferred: Self = this.set("preferred", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
