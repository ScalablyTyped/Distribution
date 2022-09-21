package typings.googleCloudStorage.bucketMod

import typings.googleCloudStorage.googleCloudStorageStrings.list
import typings.googleCloudStorage.googleCloudStorageStrings.v2
import typings.googleCloudStorage.googleCloudStorageStrings.v4
import typings.googleCloudStorage.signerMod.Query
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketSignedUrlConfig extends StObject {
  
  var action: list
  
  var cname: js.UndefOr[String] = js.undefined
  
  var expires: String | Double | js.Date
  
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  
  var queryParams: js.UndefOr[Query] = js.undefined
  
  var version: js.UndefOr[v2 | v4] = js.undefined
  
  var virtualHostedStyle: js.UndefOr[Boolean] = js.undefined
}
object GetBucketSignedUrlConfig {
  
  inline def apply(expires: String | Double | js.Date): GetBucketSignedUrlConfig = {
    val __obj = js.Dynamic.literal(action = "list", expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketSignedUrlConfig]
  }
  
  extension [Self <: GetBucketSignedUrlConfig](x: Self) {
    
    inline def setAction(value: list): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    inline def setExpires(value: String | Double | js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExtensionHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "extensionHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtensionHeadersUndefined: Self = StObject.set(x, "extensionHeaders", js.undefined)
    
    inline def setQueryParams(value: Query): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setVersion(value: v2 | v4): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVirtualHostedStyle(value: Boolean): Self = StObject.set(x, "virtualHostedStyle", value.asInstanceOf[js.Any])
    
    inline def setVirtualHostedStyleUndefined: Self = StObject.set(x, "virtualHostedStyle", js.undefined)
  }
}
