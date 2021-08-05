package typings.googleCloudStorage

import typings.googleCloudCommon.mod.ServiceObject
import typings.googleCloudCommon.serviceObjectMod.Metadata
import typings.googleCloudStorage.googleCloudStorageStrings.ACTIVE
import typings.googleCloudStorage.googleCloudStorageStrings.INACTIVE
import typings.googleCloudStorage.storageMod.Storage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmacKeyMod {
  
  @JSImport("@google-cloud/storage/build/src/hmacKey", "HmacKey")
  @js.native
  class HmacKey protected ()
    extends ServiceObject[js.UndefOr[HmacKeyMetadata]] {
    /**
      * @typedef {object} HmacKeyOptions
      * @property {string} [projectId] The project ID of the project that owns
      *     the service account of the requested HMAC key. If not provided,
      *     the project ID used to instantiate the Storage client will be used.
      */
    /**
      * Constructs an HmacKey object.
      *
      * Note: this only create a local reference to an HMAC key, to create
      * an HMAC key, use {@link Storage#createHmacKey}.
      *
      * @param {Storage} storage The Storage instance this HMAC key is
      *     attached to.
      * @param {string} accessId The unique accessId for this HMAC key.
      * @param {HmacKeyOptions} options Constructor configurations.
      * @example
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const hmacKey = storage.hmacKey('access-id');
      */
    def this(storage: Storage, accessId: String) = this()
    def this(storage: Storage, accessId: String, options: HmacKeyOptions) = this()
    
    @JSName("metadata")
    var metadata_HmacKey: js.UndefOr[HmacKeyMetadata] = js.native
  }
  
  trait HmacKeyMetadata extends StObject {
    
    var accessId: String
    
    var etag: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
    
    var serviceAccountEmail: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var timeCreated: js.UndefOr[String] = js.undefined
    
    var updated: js.UndefOr[String] = js.undefined
  }
  object HmacKeyMetadata {
    
    inline def apply(accessId: String): HmacKeyMetadata = {
      val __obj = js.Dynamic.literal(accessId = accessId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HmacKeyMetadata]
    }
    
    extension [Self <: HmacKeyMetadata](x: Self) {
      
      inline def setAccessId(value: String): Self = StObject.set(x, "accessId", value.asInstanceOf[js.Any])
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
      
      inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    }
  }
  
  type HmacKeyMetadataCallback = js.Function3[
    /* err */ Error | Null, 
    /* metadata */ js.UndefOr[HmacKeyMetadata], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  type HmacKeyMetadataResponse = js.Tuple2[HmacKeyMetadata, Metadata]
  
  trait HmacKeyOptions extends StObject {
    
    var projectId: js.UndefOr[String] = js.undefined
  }
  object HmacKeyOptions {
    
    inline def apply(): HmacKeyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HmacKeyOptions]
    }
    
    extension [Self <: HmacKeyOptions](x: Self) {
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    }
  }
  
  trait SetHmacKeyMetadata extends StObject {
    
    var etag: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[ACTIVE | INACTIVE] = js.undefined
  }
  object SetHmacKeyMetadata {
    
    inline def apply(): SetHmacKeyMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetHmacKeyMetadata]
    }
    
    extension [Self <: SetHmacKeyMetadata](x: Self) {
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setState(value: ACTIVE | INACTIVE): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait SetHmacKeyMetadataOptions extends StObject {
    
    /**
      * This parameter is currently ignored.
      */
    var userProject: js.UndefOr[String] = js.undefined
  }
  object SetHmacKeyMetadataOptions {
    
    inline def apply(): SetHmacKeyMetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetHmacKeyMetadataOptions]
    }
    
    extension [Self <: SetHmacKeyMetadataOptions](x: Self) {
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
}
