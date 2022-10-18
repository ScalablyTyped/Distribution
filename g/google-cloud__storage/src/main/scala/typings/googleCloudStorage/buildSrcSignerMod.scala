package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.googleCloudStorageStrings.DELETE
import typings.googleCloudStorage.googleCloudStorageStrings.GET
import typings.googleCloudStorage.googleCloudStorageStrings.POST
import typings.googleCloudStorage.googleCloudStorageStrings.PUT
import typings.googleCloudStorage.googleCloudStorageStrings.v2
import typings.googleCloudStorage.googleCloudStorageStrings.v4
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSignerMod {
  
  @JSImport("@google-cloud/storage/build/src/signer", "PATH_STYLED_HOST")
  @js.native
  val PATH_STYLED_HOST: /* "https://storage.googleapis.com" */ String = js.native
  
  @js.native
  sealed trait SignerExceptionMessages extends StObject
  @JSImport("@google-cloud/storage/build/src/signer", "SignerExceptionMessages")
  @js.native
  object SignerExceptionMessages extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SignerExceptionMessages & String] = js.native
    
    @js.native
    sealed trait ACCESSIBLE_DATE_INVALID
      extends StObject
         with SignerExceptionMessages
    /* "The accessible at date provided was invalid." */ val ACCESSIBLE_DATE_INVALID: typings.googleCloudStorage.buildSrcSignerMod.SignerExceptionMessages.ACCESSIBLE_DATE_INVALID & String = js.native
    
    @js.native
    sealed trait EXPIRATION_BEFORE_ACCESSIBLE_DATE
      extends StObject
         with SignerExceptionMessages
    /* "An expiration date cannot be before accessible date." */ val EXPIRATION_BEFORE_ACCESSIBLE_DATE: typings.googleCloudStorage.buildSrcSignerMod.SignerExceptionMessages.EXPIRATION_BEFORE_ACCESSIBLE_DATE & String = js.native
    
    @js.native
    sealed trait X_GOOG_CONTENT_SHA256
      extends StObject
         with SignerExceptionMessages
    /* "The header X-Goog-Content-SHA256 must be a hexadecimal string." */ val X_GOOG_CONTENT_SHA256: typings.googleCloudStorage.buildSrcSignerMod.SignerExceptionMessages.X_GOOG_CONTENT_SHA256 & String = js.native
  }
  
  @JSImport("@google-cloud/storage/build/src/signer", "SigningError")
  @js.native
  open class SigningError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@google-cloud/storage/build/src/signer", "URLSigner")
  @js.native
  open class URLSigner protected () extends StObject {
    def this(authClient: AuthClient, bucket: BucketI) = this()
    def this(authClient: AuthClient, bucket: BucketI, file: FileI) = this()
    
    /* private */ var authClient: Any = js.native
    
    /* private */ var bucket: Any = js.native
    
    /* private */ var file: Any = js.native
    
    /**
      * Create canonical headers for signing v4 url.
      *
      * The canonical headers for v4-signing a request demands header names are
      * first lowercased, followed by sorting the header names.
      * Then, construct the canonical headers part of the request:
      *  <lowercasedHeaderName> + ":" + Trim(<value>) + "\n"
      *  ..
      *  <lowercasedHeaderName> + ":" + Trim(<value>) + "\n"
      *
      * @param headers
      * @private
      */
    def getCanonicalHeaders(headers: OutgoingHttpHeaders): String = js.native
    
    def getCanonicalQueryParams(query: Query): String = js.native
    
    def getCanonicalRequest(method: String, path: String, query: String, headers: String, signedHeaders: String): String = js.native
    def getCanonicalRequest(
      method: String,
      path: String,
      query: String,
      headers: String,
      signedHeaders: String,
      contentSha256: String
    ): String = js.native
    
    def getResourcePath(cname: Boolean, bucket: String): String = js.native
    def getResourcePath(cname: Boolean, bucket: String, file: String): String = js.native
    
    def getSignedUrl(cfg: SignerGetSignedUrlConfig): js.Promise[SignerGetSignedUrlResponse] = js.native
    
    /* private */ var getSignedUrlV2: Any = js.native
    
    /* private */ var getSignedUrlV4: Any = js.native
    
    def parseAccessibleAt(): Double = js.native
    def parseAccessibleAt(accessibleAt: String): Double = js.native
    def parseAccessibleAt(accessibleAt: js.Date): Double = js.native
    def parseAccessibleAt(accessibleAt: Double): Double = js.native
    
    def parseExpires(expires: String): Double = js.native
    def parseExpires(expires: String, current: js.Date): Double = js.native
    def parseExpires(expires: js.Date): Double = js.native
    def parseExpires(expires: js.Date, current: js.Date): Double = js.native
    def parseExpires(expires: Double): Double = js.native
    def parseExpires(expires: Double, current: js.Date): Double = js.native
  }
  
  trait AuthClient extends StObject {
    
    def getCredentials(): js.Promise[GetCredentialsResponse]
    
    def sign(blobToSign: String): js.Promise[String]
  }
  object AuthClient {
    
    inline def apply(getCredentials: () => js.Promise[GetCredentialsResponse], sign: String => js.Promise[String]): AuthClient = {
      val __obj = js.Dynamic.literal(getCredentials = js.Any.fromFunction0(getCredentials), sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[AuthClient]
    }
    
    extension [Self <: AuthClient](x: Self) {
      
      inline def setGetCredentials(value: () => js.Promise[GetCredentialsResponse]): Self = StObject.set(x, "getCredentials", js.Any.fromFunction0(value))
      
      inline def setSign(value: String => js.Promise[String]): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
  
  trait BucketI extends StObject {
    
    var name: String
  }
  object BucketI {
    
    inline def apply(name: String): BucketI = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketI]
    }
    
    extension [Self <: BucketI](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileI extends StObject {
    
    var name: String
  }
  object FileI {
    
    inline def apply(name: String): FileI = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileI]
    }
    
    extension [Self <: FileI](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCredentialsResponse extends StObject {
    
    var client_email: js.UndefOr[String] = js.undefined
  }
  object GetCredentialsResponse {
    
    inline def apply(): GetCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCredentialsResponse]
    }
    
    extension [Self <: GetCredentialsResponse](x: Self) {
      
      inline def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      inline def setClient_emailUndefined: Self = StObject.set(x, "client_email", js.undefined)
    }
  }
  
  type GetSignedUrlCallback = js.Function2[/* err */ js.Error | Null, /* url */ js.UndefOr[String], Unit]
  
  trait GetSignedUrlConfigInternal extends StObject {
    
    var accessibleAt: js.UndefOr[js.Date] = js.undefined
    
    var bucket: String
    
    var cname: js.UndefOr[String] = js.undefined
    
    var contentMd5: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var expiration: Double
    
    var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var method: String
    
    var queryParams: js.UndefOr[Query] = js.undefined
  }
  object GetSignedUrlConfigInternal {
    
    inline def apply(bucket: String, expiration: Double, method: String): GetSignedUrlConfigInternal = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSignedUrlConfigInternal]
    }
    
    extension [Self <: GetSignedUrlConfigInternal](x: Self) {
      
      inline def setAccessibleAt(value: js.Date): Self = StObject.set(x, "accessibleAt", value.asInstanceOf[js.Any])
      
      inline def setAccessibleAtUndefined: Self = StObject.set(x, "accessibleAt", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
      
      inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
      
      inline def setContentMd5(value: String): Self = StObject.set(x, "contentMd5", value.asInstanceOf[js.Any])
      
      inline def setContentMd5Undefined: Self = StObject.set(x, "contentMd5", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExtensionHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "extensionHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtensionHeadersUndefined: Self = StObject.set(x, "extensionHeaders", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: Query): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    }
  }
  
  type GetSignedUrlResponse = js.Array[SignerGetSignedUrlResponse]
  
  type Query = StringDictionary[String]
  
  trait SignerGetSignedUrlConfig extends StObject {
    
    var accessibleAt: js.UndefOr[String | Double | js.Date] = js.undefined
    
    var cname: js.UndefOr[String] = js.undefined
    
    var contentMd5: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var expires: String | Double | js.Date
    
    var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var method: GET | PUT | DELETE | POST
    
    var queryParams: js.UndefOr[Query] = js.undefined
    
    var version: js.UndefOr[v2 | v4] = js.undefined
    
    var virtualHostedStyle: js.UndefOr[Boolean] = js.undefined
  }
  object SignerGetSignedUrlConfig {
    
    inline def apply(expires: String | Double | js.Date, method: GET | PUT | DELETE | POST): SignerGetSignedUrlConfig = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignerGetSignedUrlConfig]
    }
    
    extension [Self <: SignerGetSignedUrlConfig](x: Self) {
      
      inline def setAccessibleAt(value: String | Double | js.Date): Self = StObject.set(x, "accessibleAt", value.asInstanceOf[js.Any])
      
      inline def setAccessibleAtUndefined: Self = StObject.set(x, "accessibleAt", js.undefined)
      
      inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
      
      inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
      
      inline def setContentMd5(value: String): Self = StObject.set(x, "contentMd5", value.asInstanceOf[js.Any])
      
      inline def setContentMd5Undefined: Self = StObject.set(x, "contentMd5", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setExpires(value: String | Double | js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExtensionHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "extensionHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtensionHeadersUndefined: Self = StObject.set(x, "extensionHeaders", js.undefined)
      
      inline def setMethod(value: GET | PUT | DELETE | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: Query): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setVersion(value: v2 | v4): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVirtualHostedStyle(value: Boolean): Self = StObject.set(x, "virtualHostedStyle", value.asInstanceOf[js.Any])
      
      inline def setVirtualHostedStyleUndefined: Self = StObject.set(x, "virtualHostedStyle", js.undefined)
    }
  }
  
  type SignerGetSignedUrlResponse = String
}
