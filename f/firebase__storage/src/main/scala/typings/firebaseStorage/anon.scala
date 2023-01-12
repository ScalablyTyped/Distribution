package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.StorageReference
import typings.firebaseUtil.mod.EmulatorMockTokenOptions
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: String
  }
  object AccessToken {
    
    inline def apply(accessToken: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(url: RequestInfo): js.Promise[Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  trait MockUserToken extends StObject {
    
    var mockUserToken: js.UndefOr[EmulatorMockTokenOptions | String] = js.undefined
  }
  object MockUserToken {
    
    inline def apply(): MockUserToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockUserToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockUserToken] (val x: Self) extends AnyVal {
      
      inline def setMockUserToken(value: EmulatorMockTokenOptions | String): Self = StObject.set(x, "mockUserToken", value.asInstanceOf[js.Any])
      
      inline def setMockUserTokenUndefined: Self = StObject.set(x, "mockUserToken", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@firebase/storage.@firebase/storage/dist/node-esm/src/metadata.Metadata> */
  trait PartialMetadata extends StObject {
    
    var bucket: js.UndefOr[String] = js.undefined
    
    var cacheControl: js.UndefOr[String] = js.undefined
    
    var contentDisposition: js.UndefOr[String] = js.undefined
    
    var contentEncoding: js.UndefOr[String] = js.undefined
    
    var contentLanguage: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var customMetadata: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var downloadTokens: js.UndefOr[js.Array[String]] = js.undefined
    
    var fullPath: js.UndefOr[String] = js.undefined
    
    var generation: js.UndefOr[String] = js.undefined
    
    var md5Hash: js.UndefOr[String] = js.undefined
    
    var metageneration: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[StorageReference] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var timeCreated: js.UndefOr[String] = js.undefined
    
    var updated: js.UndefOr[String] = js.undefined
  }
  object PartialMetadata {
    
    inline def apply(): PartialMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMetadata] (val x: Self) extends AnyVal {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
      
      inline def setDownloadTokens(value: js.Array[String]): Self = StObject.set(x, "downloadTokens", value.asInstanceOf[js.Any])
      
      inline def setDownloadTokensUndefined: Self = StObject.set(x, "downloadTokens", js.undefined)
      
      inline def setDownloadTokensVarargs(value: String*): Self = StObject.set(x, "downloadTokens", js.Array(value*))
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setFullPathUndefined: Self = StObject.set(x, "fullPath", js.undefined)
      
      inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
      
      inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
      
      inline def setMetagenerationUndefined: Self = StObject.set(x, "metageneration", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRef(value: StorageReference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@firebase/storage.@firebase/storage/dist/src/metadata.Metadata> */
  trait PartialMetadataBucket extends StObject {
    
    var bucket: js.UndefOr[String] = js.undefined
    
    var cacheControl: js.UndefOr[String] = js.undefined
    
    var contentDisposition: js.UndefOr[String] = js.undefined
    
    var contentEncoding: js.UndefOr[String] = js.undefined
    
    var contentLanguage: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var customMetadata: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var downloadTokens: js.UndefOr[js.Array[String]] = js.undefined
    
    var fullPath: js.UndefOr[String] = js.undefined
    
    var generation: js.UndefOr[String] = js.undefined
    
    var md5Hash: js.UndefOr[String] = js.undefined
    
    var metageneration: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[typings.firebaseStorage.distSrcPublicTypesMod.StorageReference] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var timeCreated: js.UndefOr[String] = js.undefined
    
    var updated: js.UndefOr[String] = js.undefined
  }
  object PartialMetadataBucket {
    
    inline def apply(): PartialMetadataBucket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMetadataBucket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMetadataBucket] (val x: Self) extends AnyVal {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
      
      inline def setDownloadTokens(value: js.Array[String]): Self = StObject.set(x, "downloadTokens", value.asInstanceOf[js.Any])
      
      inline def setDownloadTokensUndefined: Self = StObject.set(x, "downloadTokens", js.undefined)
      
      inline def setDownloadTokensVarargs(value: String*): Self = StObject.set(x, "downloadTokens", js.Array(value*))
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setFullPathUndefined: Self = StObject.set(x, "fullPath", js.undefined)
      
      inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
      
      inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
      
      inline def setMetagenerationUndefined: Self = StObject.set(x, "metageneration", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRef(value: typings.firebaseStorage.distSrcPublicTypesMod.StorageReference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    }
  }
  
  trait ServerResponse extends StObject {
    
    var serverResponse: String | Null
  }
  object ServerResponse {
    
    inline def apply(): ServerResponse = {
      val __obj = js.Dynamic.literal(serverResponse = null)
      __obj.asInstanceOf[ServerResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerResponse] (val x: Self) extends AnyVal {
      
      inline def setServerResponse(value: String): Self = StObject.set(x, "serverResponse", value.asInstanceOf[js.Any])
      
      inline def setServerResponseNull: Self = StObject.set(x, "serverResponse", null)
    }
  }
  
  trait Token extends StObject {
    
    var token: String
  }
  object Token {
    
    inline def apply(token: String): Token = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
