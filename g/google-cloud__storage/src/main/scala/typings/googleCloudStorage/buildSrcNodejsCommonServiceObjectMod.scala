package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.anon.ReqOpts
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.ApiError
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.BodyResponseCallback
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.DecorateRequestOptions
import typings.node.eventsMod.EventEmitter
import typings.teenyRequest.mod.Options
import typings.teenyRequest.mod.Request
import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNodejsCommonServiceObjectMod {
  
  /**
    * ServiceObject is a base class, meant to be inherited from by a "service
    * object," like a BigQuery dataset or Storage bucket.
    *
    * Most of the time, these objects share common functionality; they can be
    * created or deleted, and you can get or set their metadata.
    *
    * By inheriting from this class, a service object will be extended with these
    * shared behaviors. Note that any method can be overridden when the service
    * object requires specific behavior.
    */
  @JSImport("@google-cloud/storage/build/src/nodejs-common/service-object", "ServiceObject")
  @js.native
  open class ServiceObject[T] protected () extends EventEmitter {
    def this(config: ServiceObjectConfig) = this()
    
    var baseUrl: js.UndefOr[String] = js.native
    
    /**
      * Create the object.
      *
      * @param {object=} options - Configuration object.
      * @param {function} callback - The callback function.
      * @param {?error} callback.err - An error returned while making this request.
      * @param {object} callback.instance - The instance.
      * @param {object} callback.apiResponse - The full API response.
      */
    def create(): js.Promise[CreateResponse[T]] = js.native
    def create(callback: CreateCallback[T]): Unit = js.native
    def create(options: CreateOptions): js.Promise[CreateResponse[T]] = js.native
    def create(options: CreateOptions, callback: CreateCallback[T]): Unit = js.native
    
    /* private */ var createMethod: Any = js.native
    
    /**
      * Delete the object.
      *
      * @param {function=} callback - The callback function.
      * @param {?error} callback.err - An error returned while making this request.
      * @param {object} callback.apiResponse - The full API response.
      */
    def delete(): js.Promise[js.Array[Response[Any]]] = js.native
    def delete(callback: DeleteCallback): Unit = js.native
    def delete(options: DeleteOptions): js.Promise[js.Array[Response[Any]]] = js.native
    def delete(options: DeleteOptions, callback: DeleteCallback): Unit = js.native
    
    /**
      * Check if the object exists.
      *
      * @param {function} callback - The callback function.
      * @param {?error} callback.err - An error returned while making this request.
      * @param {boolean} callback.exists - Whether the object exists or not.
      */
    def exists(): js.Promise[js.Array[Boolean]] = js.native
    def exists(callback: ExistsCallback): Unit = js.native
    def exists(options: ExistsOptions): js.Promise[js.Array[Boolean]] = js.native
    def exists(options: ExistsOptions, callback: ExistsCallback): Unit = js.native
    
    /**
      * Get the object if it exists. Optionally have the object created if an
      * options object is provided with `autoCreate: true`.
      *
      * @param {object=} options - The configuration object that will be used to
      *     create the object if necessary.
      * @param {boolean} options.autoCreate - Create the object if it doesn't already exist.
      * @param {function} callback - The callback function.
      * @param {?error} callback.err - An error returned while making this request.
      * @param {object} callback.instance - The instance.
      * @param {object} callback.apiResponse - The full API response.
      */
    def get(): js.Promise[GetResponse[T]] = js.native
    def get(callback: InstanceResponseCallback[T]): Unit = js.native
    def get(options: GetOrCreateOptions): js.Promise[GetResponse[T]] = js.native
    def get(options: GetOrCreateOptions, callback: InstanceResponseCallback[T]): Unit = js.native
    
    /**
      * Get the metadata of this object.
      *
      * @param {function} callback - The callback function.
      * @param {?error} callback.err - An error returned while making this request.
      * @param {object} callback.metadata - The metadata for this object.
      * @param {object} callback.apiResponse - The full API response.
      */
    def getMetadata(): js.Promise[MetadataResponse] = js.native
    def getMetadata(callback: MetadataCallback): Unit = js.native
    def getMetadata(options: GetMetadataOptions): js.Promise[MetadataResponse] = js.native
    def getMetadata(options: GetMetadataOptions, callback: MetadataCallback): Unit = js.native
    
    /**
      * Return the user's custom request interceptors.
      */
    def getRequestInterceptors(): js.Array[js.Function] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var interceptors: js.Array[Interceptor] = js.native
    
    var metadata: Metadata = js.native
    
    /* protected */ var methods: Methods = js.native
    
    var parent: ServiceObjectParent = js.native
    
    var projectId: js.UndefOr[String] = js.native
    
    /**
      * Make an authenticated API request.
      *
      * @param {object} reqOpts - Request options that are passed to `request`.
      * @param {string} reqOpts.uri - A URI relative to the baseUrl.
      * @param {function} callback - The callback function passed to `request`.
      */
    def request(reqOpts: DecorateRequestOptions): js.Promise[RequestResponse] = js.native
    def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
    
    /**
      * Make an authenticated API request.
      *
      * @param {object} reqOpts - Request options that are passed to `request`.
      * @param {string} reqOpts.uri - A URI relative to the baseUrl.
      */
    def requestStream(reqOpts: DecorateRequestOptions): Request = js.native
    
    /**
      * Make an authenticated API request.
      *
      * @private
      *
      * @param {object} reqOpts - Request options that are passed to `request`.
      * @param {string} reqOpts.uri - A URI relative to the baseUrl.
      * @param {function} callback - The callback function passed to `request`.
      */
    /* private */ var request_ : Any = js.native
    
    /**
      * Set the metadata for this object.
      *
      * @param {object} metadata - The metadata to set on this object.
      * @param {object=} options - Configuration options.
      * @param {function=} callback - The callback function.
      * @param {?error} callback.err - An error returned while making this request.
      * @param {object} callback.apiResponse - The full API response.
      */
    def setMetadata(metadata: Metadata): js.Promise[SetMetadataResponse] = js.native
    def setMetadata(metadata: Metadata, callback: MetadataCallback): Unit = js.native
    def setMetadata(metadata: Metadata, options: SetMetadataOptions): js.Promise[SetMetadataResponse] = js.native
    def setMetadata(metadata: Metadata, options: SetMetadataOptions, callback: MetadataCallback): Unit = js.native
  }
  
  type CreateCallback[T] = js.Function3[
    /* err */ ApiError | Null, 
    /* instance */ js.UndefOr[T | Null], 
    /* repeated */ Any, 
    Unit
  ]
  
  trait CreateOptions extends StObject
  
  type CreateResponse[T] = js.Array[Any]
  
  type DeleteCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.UndefOr[Response[Any]], Unit]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait DeleteOptions extends StObject {
    
    var ifGenerationMatch: js.UndefOr[Double] = js.undefined
    
    var ifGenerationNotMatch: js.UndefOr[Double] = js.undefined
    
    var ifMetagenerationMatch: js.UndefOr[Double] = js.undefined
    
    var ifMetagenerationNotMatch: js.UndefOr[Double] = js.undefined
    
    var ignoreNotFound: js.UndefOr[Boolean] = js.undefined
  }
  object DeleteOptions {
    
    inline def apply(): DeleteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteOptions] (val x: Self) extends AnyVal {
      
      inline def setIfGenerationMatch(value: Double): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
      
      inline def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
      
      inline def setIfGenerationNotMatch(value: Double): Self = StObject.set(x, "ifGenerationNotMatch", value.asInstanceOf[js.Any])
      
      inline def setIfGenerationNotMatchUndefined: Self = StObject.set(x, "ifGenerationNotMatch", js.undefined)
      
      inline def setIfMetagenerationMatch(value: Double): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
      
      inline def setIfMetagenerationNotMatch(value: Double): Self = StObject.set(x, "ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
      
      inline def setIfMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifMetagenerationNotMatch", js.undefined)
      
      inline def setIgnoreNotFound(value: Boolean): Self = StObject.set(x, "ignoreNotFound", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotFoundUndefined: Self = StObject.set(x, "ignoreNotFound", js.undefined)
    }
  }
  
  type ExistsCallback = js.Function2[/* err */ js.Error | Null, /* exists */ js.UndefOr[Boolean], Unit]
  
  type ExistsOptions = js.Object
  
  trait GetConfig extends StObject {
    
    /**
      * Create the object if it doesn't already exist.
      */
    var autoCreate: js.UndefOr[Boolean] = js.undefined
  }
  object GetConfig {
    
    inline def apply(): GetConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetConfig] (val x: Self) extends AnyVal {
      
      inline def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
    }
  }
  
  type GetMetadataOptions = js.Object
  
  trait GetOrCreateOptions
    extends StObject
       with GetConfig
       with CreateOptions
  object GetOrCreateOptions {
    
    inline def apply(): GetOrCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOrCreateOptions]
    }
  }
  
  type GetResponse[T] = js.Tuple2[T, Response[Any]]
  
  type InstanceResponseCallback[T] = js.Function3[
    /* err */ ApiError | Null, 
    /* instance */ js.UndefOr[T | Null], 
    /* apiResponse */ js.UndefOr[Response[Any]], 
    Unit
  ]
  
  trait Interceptor extends StObject {
    
    def request(opts: Options): DecorateRequestOptions
  }
  object Interceptor {
    
    inline def apply(request: Options => DecorateRequestOptions): Interceptor = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[Interceptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Interceptor] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: Options => DecorateRequestOptions): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
  
  type Metadata = Any
  
  type MetadataCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* metadata */ js.UndefOr[Metadata], 
    /* apiResponse */ js.UndefOr[Response[Any]], 
    Unit
  ]
  
  type MetadataResponse = js.Tuple2[Metadata, Response[Any]]
  
  type Methods = StringDictionary[ReqOpts | Boolean]
  
  type RequestResponse = js.Tuple2[Metadata, Response[Any]]
  
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | Null], 
    /* apiResponse */ js.UndefOr[Response[Any]], 
    Unit
  ]
  
  trait ServiceObjectConfig extends StObject {
    
    /**
      * The base URL to make API requests to.
      */
    var baseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The method which creates this object.
      */
    var createMethod: js.UndefOr[js.Function] = js.undefined
    
    /**
      * The identifier of the object. For example, the name of a Storage bucket or
      * Pub/Sub topic.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * A map of each method name that should be inherited.
      */
    var methods: js.UndefOr[Methods] = js.undefined
    
    /**
      * The parent service instance. For example, an instance of Storage if the
      * object is Bucket.
      */
    var parent: ServiceObjectParent
    
    /**
      * Override of projectId, used to allow access to resources in another project.
      * For example, a BigQuery dataset in another project to which the user has been
      * granted permission.
      */
    var projectId: js.UndefOr[String] = js.undefined
  }
  object ServiceObjectConfig {
    
    inline def apply(parent: ServiceObjectParent): ServiceObjectConfig = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceObjectConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceObjectConfig] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCreateMethod(value: js.Function): Self = StObject.set(x, "createMethod", value.asInstanceOf[js.Any])
      
      inline def setCreateMethodUndefined: Self = StObject.set(x, "createMethod", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setParent(value: ServiceObjectParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    }
  }
  
  trait ServiceObjectParent extends StObject {
    
    def getRequestInterceptors(): js.Array[js.Function]
    
    var interceptors: js.Array[Interceptor]
    
    def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit
    
    def requestStream(reqOpts: DecorateRequestOptions): Request
  }
  object ServiceObjectParent {
    
    inline def apply(
      getRequestInterceptors: () => js.Array[js.Function],
      interceptors: js.Array[Interceptor],
      request: (DecorateRequestOptions, BodyResponseCallback) => Unit,
      requestStream: DecorateRequestOptions => Request
    ): ServiceObjectParent = {
      val __obj = js.Dynamic.literal(getRequestInterceptors = js.Any.fromFunction0(getRequestInterceptors), interceptors = interceptors.asInstanceOf[js.Any], request = js.Any.fromFunction2(request), requestStream = js.Any.fromFunction1(requestStream))
      __obj.asInstanceOf[ServiceObjectParent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceObjectParent] (val x: Self) extends AnyVal {
      
      inline def setGetRequestInterceptors(value: () => js.Array[js.Function]): Self = StObject.set(x, "getRequestInterceptors", js.Any.fromFunction0(value))
      
      inline def setInterceptors(value: js.Array[Interceptor]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
      
      inline def setInterceptorsVarargs(value: Interceptor*): Self = StObject.set(x, "interceptors", js.Array(value*))
      
      inline def setRequest(value: (DecorateRequestOptions, BodyResponseCallback) => Unit): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      inline def setRequestStream(value: DecorateRequestOptions => Request): Self = StObject.set(x, "requestStream", js.Any.fromFunction1(value))
    }
  }
  
  type SetMetadataOptions = js.Object
  
  type SetMetadataResponse = js.Array[Metadata]
}
