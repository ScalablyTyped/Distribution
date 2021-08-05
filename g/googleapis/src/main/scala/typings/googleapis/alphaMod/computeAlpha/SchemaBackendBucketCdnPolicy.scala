package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message containing Cloud CDN configuration for a backend bucket.
  */
trait SchemaBackendBucketCdnPolicy extends StObject {
  
  /**
    * Maximum number of seconds the response to a signed URL request will be
    * considered fresh. After this time period, the response will be
    * revalidated before being served. Defaults to 1hr (3600s). When serving
    * responses to signed URL requests, Cloud CDN will internally behave as
    * though all responses from this backend had a &quot;Cache-Control: public,
    * max-age=[TTL]&quot; header, regardless of any existing Cache-Control
    * header. The actual headers served in responses will not be altered.
    */
  var signedUrlCacheMaxAgeSec: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Names of the keys for signing request URLs.
    */
  var signedUrlKeyNames: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaBackendBucketCdnPolicy {
  
  inline def apply(): SchemaBackendBucketCdnPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendBucketCdnPolicy]
  }
  
  extension [Self <: SchemaBackendBucketCdnPolicy](x: Self) {
    
    inline def setSignedUrlCacheMaxAgeSec(value: String): Self = StObject.set(x, "signedUrlCacheMaxAgeSec", value.asInstanceOf[js.Any])
    
    inline def setSignedUrlCacheMaxAgeSecUndefined: Self = StObject.set(x, "signedUrlCacheMaxAgeSec", js.undefined)
    
    inline def setSignedUrlKeyNames(value: js.Array[String]): Self = StObject.set(x, "signedUrlKeyNames", value.asInstanceOf[js.Any])
    
    inline def setSignedUrlKeyNamesUndefined: Self = StObject.set(x, "signedUrlKeyNames", js.undefined)
    
    inline def setSignedUrlKeyNamesVarargs(value: String*): Self = StObject.set(x, "signedUrlKeyNames", js.Array(value :_*))
  }
}
