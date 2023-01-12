package typings.googleCloudStorage

import org.scalablytyped.runtime.Instantiable1
import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidator
import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidatorGenerator
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.ApiError
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.GoogleErrorBody
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.GoogleInnerError
import typings.teenyRequest.mod.CoreOptions
import typings.teenyRequest.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback[T, U] extends StObject {
    
    var callback: U
    
    var options: T
  }
  object Callback {
    
    inline def apply[T, U](callback: U, options: T): Callback[T, U] = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback[T, U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Callback[?, ?], T, U] (val x: Self & (Callback[T, U])) extends AnyVal {
      
      inline def setCallback(value: U): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
  }
  object ContentType {
    
    inline def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    }
  }
  
  trait Max extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
  }
  object Max {
    
    inline def apply(): Max = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait OWNERROLE extends StObject {
    
    var OWNER_ROLE: String
    
    var READER_ROLE: String
    
    var WRITER_ROLE: String
  }
  object OWNERROLE {
    
    inline def apply(OWNER_ROLE: String, READER_ROLE: String, WRITER_ROLE: String): OWNERROLE = {
      val __obj = js.Dynamic.literal(OWNER_ROLE = OWNER_ROLE.asInstanceOf[js.Any], READER_ROLE = READER_ROLE.asInstanceOf[js.Any], WRITER_ROLE = WRITER_ROLE.asInstanceOf[js.Any])
      __obj.asInstanceOf[OWNERROLE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OWNERROLE] (val x: Self) extends AnyVal {
      
      inline def setOWNER_ROLE(value: String): Self = StObject.set(x, "OWNER_ROLE", value.asInstanceOf[js.Any])
      
      inline def setREADER_ROLE(value: String): Self = StObject.set(x, "READER_ROLE", value.asInstanceOf[js.Any])
      
      inline def setWRITER_ROLE(value: String): Self = StObject.set(x, "WRITER_ROLE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnAuthenticated extends StObject {
    
    def onAuthenticated(): Unit = js.native
    def onAuthenticated(err: js.Error): Unit = js.native
    def onAuthenticated(err: js.Error, authenticatedReqOpts: Options): Unit = js.native
    def onAuthenticated(err: Null, authenticatedReqOpts: Options): Unit = js.native
  }
  
  /* Inlined std.Partial<@google-cloud/storage.@google-cloud/storage/build/src/hash-stream-validator.HashStreamValidatorOptions> */
  trait PartialHashStreamValidato extends StObject {
    
    var crc32c: js.UndefOr[Boolean] = js.undefined
    
    var crc32cGenerator: js.UndefOr[CRC32CValidatorGenerator] = js.undefined
    
    var md5: js.UndefOr[Boolean] = js.undefined
  }
  object PartialHashStreamValidato {
    
    inline def apply(): PartialHashStreamValidato = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHashStreamValidato]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialHashStreamValidato] (val x: Self) extends AnyVal {
      
      inline def setCrc32c(value: Boolean): Self = StObject.set(x, "crc32c", value.asInstanceOf[js.Any])
      
      inline def setCrc32cGenerator(value: () => CRC32CValidator): Self = StObject.set(x, "crc32cGenerator", js.Any.fromFunction0(value))
      
      inline def setCrc32cGeneratorUndefined: Self = StObject.set(x, "crc32cGenerator", js.undefined)
      
      inline def setCrc32cUndefined: Self = StObject.set(x, "crc32c", js.undefined)
      
      inline def setMd5(value: Boolean): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    }
  }
  
  trait ReqOpts extends StObject {
    
    var reqOpts: js.UndefOr[CoreOptions] = js.undefined
  }
  object ReqOpts {
    
    inline def apply(): ReqOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReqOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReqOpts] (val x: Self) extends AnyVal {
      
      inline def setReqOpts(value: CoreOptions): Self = StObject.set(x, "reqOpts", value.asInstanceOf[js.Any])
      
      inline def setReqOptsUndefined: Self = StObject.set(x, "reqOpts", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] | GaxiosPromise[T]
  }
  object Request {
    
    inline def apply(request: GaxiosOptions => js.Promise[GaxiosResponse[Any]] | GaxiosPromise[Any]): Request = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: GaxiosOptions => js.Promise[GaxiosResponse[Any]] | GaxiosPromise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
  
  trait Scopes extends StObject {
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Scopes {
    
    inline def apply(): Scopes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scopes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scopes] (val x: Self) extends AnyVal {
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  trait StorageClass extends StObject {
    
    var storageClass: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object StorageClass {
    
    inline def apply(`type`: String): StorageClass = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageClass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageClass] (val x: Self) extends AnyVal {
      
      inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofApiError
    extends StObject
       with Instantiable1[/* errorMessage */ String, ApiError] {
    
    /**
      * Pieces together an error message by combining all unique error messages
      * returned from a single GoogleError
      *
      * @private
      *
      * @param {GoogleErrorBody} err The original error.
      * @param {GoogleInnerError[]} [errors] Inner errors, if any.
      * @returns {string}
      */
    def createMultiErrorMessage(err: GoogleErrorBody): String = js.native
    def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = js.native
  }
  
  trait UserAgent extends StObject {
    
    var `User-Agent`: String
    
    var `x-goog-api-client`: String
  }
  object UserAgent {
    
    inline def apply(`User-Agent`: String, `x-goog-api-client`: String): UserAgent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-goog-api-client")(`x-goog-api-client`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserAgent] (val x: Self) extends AnyVal {
      
      inline def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
      
      inline def `setX-goog-api-client`(value: String): Self = StObject.set(x, "x-goog-api-client", value.asInstanceOf[js.Any])
    }
  }
}
