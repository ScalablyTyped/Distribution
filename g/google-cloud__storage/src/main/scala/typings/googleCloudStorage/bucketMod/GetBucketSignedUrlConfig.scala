package typings.googleCloudStorage.bucketMod

import typings.googleCloudStorage.googleCloudStorageStrings.list
import typings.googleCloudStorage.googleCloudStorageStrings.v2
import typings.googleCloudStorage.googleCloudStorageStrings.v4
import typings.googleCloudStorage.signerMod.Query
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketSignedUrlConfig extends js.Object {
  
  var action: list = js.native
  
  var cname: js.UndefOr[String] = js.native
  
  var expires: String | Double | Date = js.native
  
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var queryParams: js.UndefOr[Query] = js.native
  
  var version: js.UndefOr[v2 | v4] = js.native
  
  var virtualHostedStyle: js.UndefOr[Boolean] = js.native
}
object GetBucketSignedUrlConfig {
  
  @scala.inline
  def apply(action: list, expires: String | Double | Date): GetBucketSignedUrlConfig = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketSignedUrlConfig]
  }
  
  @scala.inline
  implicit class GetBucketSignedUrlConfigOps[Self <: GetBucketSignedUrlConfig] (val x: Self) extends AnyVal {
    
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
    def setAction(value: list): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: String | Double | Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCname(value: String): Self = this.set("cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCname: Self = this.set("cname", js.undefined)
    
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
