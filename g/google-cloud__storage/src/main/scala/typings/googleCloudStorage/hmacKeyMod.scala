package typings.googleCloudStorage

import typings.googleCloudCommon.mod.ServiceObject
import typings.googleCloudCommon.serviceObjectMod.Metadata
import typings.googleCloudStorage.googleCloudStorageStrings.ACTIVE
import typings.googleCloudStorage.googleCloudStorageStrings.INACTIVE
import typings.googleCloudStorage.storageMod.Storage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait HmacKeyMetadata extends StObject {
    
    var accessId: String = js.native
    
    var etag: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var projectId: js.UndefOr[String] = js.native
    
    var serviceAccountEmail: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var timeCreated: js.UndefOr[String] = js.native
    
    var updated: js.UndefOr[String] = js.native
  }
  object HmacKeyMetadata {
    
    @scala.inline
    def apply(accessId: String): HmacKeyMetadata = {
      val __obj = js.Dynamic.literal(accessId = accessId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HmacKeyMetadata]
    }
    
    @scala.inline
    implicit class HmacKeyMetadataMutableBuilder[Self <: HmacKeyMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessId(value: String): Self = StObject.set(x, "accessId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      @scala.inline
      def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
      
      @scala.inline
      def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    }
  }
  
  type HmacKeyMetadataCallback = js.Function3[
    /* err */ Error | Null, 
    /* metadata */ js.UndefOr[HmacKeyMetadata], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  type HmacKeyMetadataResponse = js.Tuple2[HmacKeyMetadata, Metadata]
  
  @js.native
  trait HmacKeyOptions extends StObject {
    
    var projectId: js.UndefOr[String] = js.native
  }
  object HmacKeyOptions {
    
    @scala.inline
    def apply(): HmacKeyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HmacKeyOptions]
    }
    
    @scala.inline
    implicit class HmacKeyOptionsMutableBuilder[Self <: HmacKeyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    }
  }
  
  @js.native
  trait SetHmacKeyMetadata extends StObject {
    
    var etag: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[ACTIVE | INACTIVE] = js.native
  }
  object SetHmacKeyMetadata {
    
    @scala.inline
    def apply(): SetHmacKeyMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetHmacKeyMetadata]
    }
    
    @scala.inline
    implicit class SetHmacKeyMetadataMutableBuilder[Self <: SetHmacKeyMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setState(value: ACTIVE | INACTIVE): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait SetHmacKeyMetadataOptions extends StObject {
    
    /**
      * This parameter is currently ignored.
      */
    var userProject: js.UndefOr[String] = js.native
  }
  object SetHmacKeyMetadataOptions {
    
    @scala.inline
    def apply(): SetHmacKeyMetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetHmacKeyMetadataOptions]
    }
    
    @scala.inline
    implicit class SetHmacKeyMetadataOptionsMutableBuilder[Self <: SetHmacKeyMetadataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
}
