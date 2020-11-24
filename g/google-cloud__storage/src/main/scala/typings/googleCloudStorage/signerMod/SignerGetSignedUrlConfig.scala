package typings.googleCloudStorage.signerMod

import typings.googleCloudStorage.googleCloudStorageStrings.DELETE
import typings.googleCloudStorage.googleCloudStorageStrings.GET
import typings.googleCloudStorage.googleCloudStorageStrings.POST
import typings.googleCloudStorage.googleCloudStorageStrings.PUT
import typings.googleCloudStorage.googleCloudStorageStrings.v2
import typings.googleCloudStorage.googleCloudStorageStrings.v4
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerGetSignedUrlConfig extends js.Object {
  
  var accessibleAt: js.UndefOr[String | Double | Date] = js.native
  
  var cname: js.UndefOr[String] = js.native
  
  var contentMd5: js.UndefOr[String] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var expires: String | Double | Date = js.native
  
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var method: GET | PUT | DELETE | POST = js.native
  
  var queryParams: js.UndefOr[Query] = js.native
  
  var version: js.UndefOr[v2 | v4] = js.native
  
  var virtualHostedStyle: js.UndefOr[Boolean] = js.native
}
object SignerGetSignedUrlConfig {
  
  @scala.inline
  def apply(expires: String | Double | Date, method: GET | PUT | DELETE | POST): SignerGetSignedUrlConfig = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerGetSignedUrlConfig]
  }
  
  @scala.inline
  implicit class SignerGetSignedUrlConfigOps[Self <: SignerGetSignedUrlConfig] (val x: Self) extends AnyVal {
    
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
    def setExpires(value: String | Double | Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET | PUT | DELETE | POST): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleAt(value: String | Double | Date): Self = this.set("accessibleAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleAt: Self = this.set("accessibleAt", js.undefined)
    
    @scala.inline
    def setCname(value: String): Self = this.set("cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCname: Self = this.set("cname", js.undefined)
    
    @scala.inline
    def setContentMd5(value: String): Self = this.set("contentMd5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMd5: Self = this.set("contentMd5", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setExtensionHeaders(value: OutgoingHttpHeaders): Self = this.set("extensionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionHeaders: Self = this.set("extensionHeaders", js.undefined)
    
    @scala.inline
    def setQueryParams(value: Query): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    
    @scala.inline
    def setVersion(value: v2 | v4): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVirtualHostedStyle(value: Boolean): Self = this.set("virtualHostedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualHostedStyle: Self = this.set("virtualHostedStyle", js.undefined)
  }
}
