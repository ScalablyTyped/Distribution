package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.googleCloudStorageStrings.DELETE
import typings.googleCloudStorage.googleCloudStorageStrings.GET
import typings.googleCloudStorage.googleCloudStorageStrings.POST
import typings.googleCloudStorage.googleCloudStorageStrings.PUT
import typings.googleCloudStorage.googleCloudStorageStrings.v2
import typings.googleCloudStorage.googleCloudStorageStrings.v4
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signerMod {
  
  @JSImport("@google-cloud/storage/build/src/signer", "PATH_STYLED_HOST")
  @js.native
  val PATH_STYLED_HOST: /* "https://storage.googleapis.com" */ String = js.native
  
  @JSImport("@google-cloud/storage/build/src/signer", "SigningError")
  @js.native
  class SigningError () extends Error
  
  @JSImport("@google-cloud/storage/build/src/signer", "URLSigner")
  @js.native
  class URLSigner protected () extends StObject {
    def this(authClient: AuthClient, bucket: BucketI) = this()
    def this(authClient: AuthClient, bucket: BucketI, file: FileI) = this()
    
    var authClient: js.Any = js.native
    
    var bucket: js.Any = js.native
    
    var file: js.Any = js.native
    
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
    
    var getSignedUrlV2: js.Any = js.native
    
    var getSignedUrlV4: js.Any = js.native
    
    def parseAccessibleAt(): Double = js.native
    def parseAccessibleAt(accessibleAt: String): Double = js.native
    def parseAccessibleAt(accessibleAt: Double): Double = js.native
    def parseAccessibleAt(accessibleAt: Date): Double = js.native
    
    def parseExpires(expires: String): Double = js.native
    def parseExpires(expires: String, current: Date): Double = js.native
    def parseExpires(expires: Double): Double = js.native
    def parseExpires(expires: Double, current: Date): Double = js.native
    def parseExpires(expires: Date): Double = js.native
    def parseExpires(expires: Date, current: Date): Double = js.native
  }
  
  @js.native
  trait AuthClient extends StObject {
    
    def getCredentials(): js.Promise[GetCredentialsResponse] = js.native
    
    def sign(blobToSign: String): js.Promise[String] = js.native
  }
  object AuthClient {
    
    @scala.inline
    def apply(getCredentials: () => js.Promise[GetCredentialsResponse], sign: String => js.Promise[String]): AuthClient = {
      val __obj = js.Dynamic.literal(getCredentials = js.Any.fromFunction0(getCredentials), sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[AuthClient]
    }
    
    @scala.inline
    implicit class AuthClientMutableBuilder[Self <: AuthClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCredentials(value: () => js.Promise[GetCredentialsResponse]): Self = StObject.set(x, "getCredentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSign(value: String => js.Promise[String]): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait BucketI extends StObject {
    
    var name: String = js.native
  }
  object BucketI {
    
    @scala.inline
    def apply(name: String): BucketI = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketI]
    }
    
    @scala.inline
    implicit class BucketIMutableBuilder[Self <: BucketI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileI extends StObject {
    
    var name: String = js.native
  }
  object FileI {
    
    @scala.inline
    def apply(name: String): FileI = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileI]
    }
    
    @scala.inline
    implicit class FileIMutableBuilder[Self <: FileI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetCredentialsResponse extends StObject {
    
    var client_email: js.UndefOr[String] = js.native
  }
  object GetCredentialsResponse {
    
    @scala.inline
    def apply(): GetCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCredentialsResponse]
    }
    
    @scala.inline
    implicit class GetCredentialsResponseMutableBuilder[Self <: GetCredentialsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_emailUndefined: Self = StObject.set(x, "client_email", js.undefined)
    }
  }
  
  type GetSignedUrlCallback = js.Function2[/* err */ Error | Null, /* url */ js.UndefOr[String], Unit]
  
  @js.native
  trait GetSignedUrlConfigInternal extends StObject {
    
    var accessibleAt: js.UndefOr[Date] = js.native
    
    var bucket: String = js.native
    
    var cname: js.UndefOr[String] = js.native
    
    var contentMd5: js.UndefOr[String] = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    var expiration: Double = js.native
    
    var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var method: String = js.native
    
    var queryParams: js.UndefOr[Query] = js.native
  }
  object GetSignedUrlConfigInternal {
    
    @scala.inline
    def apply(bucket: String, expiration: Double, method: String): GetSignedUrlConfigInternal = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSignedUrlConfigInternal]
    }
    
    @scala.inline
    implicit class GetSignedUrlConfigInternalMutableBuilder[Self <: GetSignedUrlConfigInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibleAt(value: Date): Self = StObject.set(x, "accessibleAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleAtUndefined: Self = StObject.set(x, "accessibleAt", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
      
      @scala.inline
      def setContentMd5(value: String): Self = StObject.set(x, "contentMd5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentMd5Undefined: Self = StObject.set(x, "contentMd5", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "extensionHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionHeadersUndefined: Self = StObject.set(x, "extensionHeaders", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParams(value: Query): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    }
  }
  
  type GetSignedUrlResponse = js.Array[SignerGetSignedUrlResponse]
  
  type Query = StringDictionary[String]
  
  @js.native
  trait SignerGetSignedUrlConfig extends StObject {
    
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
    implicit class SignerGetSignedUrlConfigMutableBuilder[Self <: SignerGetSignedUrlConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibleAt(value: String | Double | Date): Self = StObject.set(x, "accessibleAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleAtUndefined: Self = StObject.set(x, "accessibleAt", js.undefined)
      
      @scala.inline
      def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
      
      @scala.inline
      def setContentMd5(value: String): Self = StObject.set(x, "contentMd5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentMd5Undefined: Self = StObject.set(x, "contentMd5", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setExpires(value: String | Double | Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "extensionHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionHeadersUndefined: Self = StObject.set(x, "extensionHeaders", js.undefined)
      
      @scala.inline
      def setMethod(value: GET | PUT | DELETE | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParams(value: Query): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setVersion(value: v2 | v4): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVirtualHostedStyle(value: Boolean): Self = StObject.set(x, "virtualHostedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualHostedStyleUndefined: Self = StObject.set(x, "virtualHostedStyle", js.undefined)
    }
  }
  
  type SignerGetSignedUrlResponse = String
}
