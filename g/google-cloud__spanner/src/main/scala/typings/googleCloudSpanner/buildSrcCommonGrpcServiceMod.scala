package typings.googleCloudSpanner

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudCommon.buildSrcServiceMod.ServiceConfig
import typings.googleCloudCommon.buildSrcUtilMod.Abortable
import typings.googleCloudCommon.buildSrcUtilMod.BodyResponseCallback
import typings.googleCloudCommon.buildSrcUtilMod.DecorateRequestOptions
import typings.googleCloudCommon.buildSrcUtilMod.PackageJson
import typings.googleCloudCommon.mod.Service
import typings.googleCloudSpanner.anon.Add
import typings.googleCloudSpanner.anon.BaseUrl
import typings.googleCloudSpanner.anon.Fields
import typings.googleCloudSpanner.anon.Grpcinitialreconnectbackoffms
import typings.googleCloudSpanner.anon.Typeofgrpc
import typings.googleCloudSpanner.anon.`0`
import typings.googleGax.mod.grpc.Metadata
import typings.node.streamMod.Duplex
import typings.std.Map
import typings.std.Set
import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCommonGrpcServiceMod {
  
  @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService")
  @js.native
  open class GrpcService protected () extends Service {
    /**
      * Service is a base class, meant to be inherited from by a "service," like
      * BigQuery or Storage.
      *
      * This handles making authenticated requests by exposing a `makeReq_`
      * function.
      *
      * @constructor
      * @alias module:common/grpc-service
      *
      * @param config - Configuration object.
      * @param {object} options - [Configuration object](#/docs/?method=gcloud).
      */
    def this(config: GrpcServiceConfig, options: Any) = this()
    
    var activeServiceMap_ : Map[Any, Any] = js.native
    
    /**
      * Assign a projectId if one is specified to all request options.
      *
      * @param {object} reqOpts - The request options.
      * @return {object} - The decorated request object.
      */
    def decorateRequest_(reqOpts: Any): Any = js.native
    
    /**
      * To authorize requests through gRPC, we must get the raw google-auth-library
      * auth client object.
      *
      * @private
      *
      * @param {function} callback - The callback function.
      * @param {?error} callback.err - An error getting an auth client.
      */
    /* private */ var getGrpcCredentials_ : Any = js.native
    
    /**
      * Retrieves the service object used to make the grpc requests.
      *
      * @private
      *
      * @param {object} protoOpts - The proto options.
      * @return {object} service - The proto service.
      */
    /* private */ var getService_ : Any = js.native
    
    var grpc: js.UndefOr[Typeofgrpc] = js.native
    
    var grpcCredentials: js.UndefOr[js.Object] = js.native
    
    var grpcMetadata: js.UndefOr[Add] = js.native
    
    var grpcVersion: js.UndefOr[String] = js.native
    
    /**
      * Loads a proto file, useful when handling multiple proto files/services
      * within a single instance of GrpcService.
      *
      * @private
      *
      * @param protoConfig - The proto specific configs for this file.
      * @param config - The base config for the GrpcService.
      * @return protoObject - The loaded proto object.
      */
    /* private */ var loadProtoFile: Any = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    def request(protoOpts: ProtoOpts, reqOpts: DecorateRequestOptions, callback: ServiceRequestCallback): Abortable | Unit = js.native
    def request(reqOpts: DecorateRequestOptions): Unit | js.Promise[Response[Any]] = js.native
    
    def requestStream(protoOpts: ProtoOpts, reqOpts: DecorateRequestOptions): Duplex = js.native
    
    /**
      * Make an authenticated writable streaming request with gRPC.
      *
      * @param {object} protoOpts - The proto options.
      * @param {string} protoOpts.service - The service.
      * @param {string} protoOpts.method - The method name.
      * @param {number=} protoOpts.timeout - After how many milliseconds should the
      *     request cancel.
      * @param {object} reqOpts - The request options.
      */
    def requestWritableStream(protoOpts: Any, reqOpts: Any): Any = js.native
    
    /**
      * Make an authenticated request with gRPC.
      *
      * @param {object} protoOpts - The proto options.
      * @param {string} protoOpts.service - The service name.
      * @param {string} protoOpts.method - The method name.
      * @param {number=} protoOpts.timeout - After how many milliseconds should the
      *     request cancel.
      * @param {object} reqOpts - The request options.
      * @param {function=} callback - The callback function.
      */
    @JSName("request")
    def request_Promise(reqOpts: DecorateRequestOptions): js.Promise[Response[Any]] = js.native
    @JSName("request")
    def request_Unit(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  /* static members */
  object GrpcService {
    
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.GRPC_ERROR_CODE_TO_HTTP")
    @js.native
    val GRPC_ERROR_CODE_TO_HTTP: `0` = js.native
    
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.GRPC_SERVICE_OPTIONS")
    @js.native
    val GRPC_SERVICE_OPTIONS: Grpcinitialreconnectbackoffms = js.native
    
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.ObjectToStructConverter")
    @js.native
    val ObjectToStructConverter: Instantiable1[
        /* options */ js.UndefOr[ObjectToStructConverterConfig], 
        typings.googleCloudSpanner.buildSrcCommonGrpcServiceMod.ObjectToStructConverter
      ] = js.native
    
    /**
      * Creates a deadline.
      *
      * @private
      *
      * @param {number} timeout - Timeout in miliseconds.
      * @return {date} deadline - The deadline in Date object form.
      */
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.createDeadline_")
    @js.native
    def createDeadline_ : Any = js.native
    inline def createDeadline__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createDeadline_")(x.asInstanceOf[js.Any])
    
    /**
      * Decode a protobuf Struct's value.
      *
      * @param {object} value - A Struct's Field message.
      * @return {*} - The decoded value.
      */
    inline def decodeValue_(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeValue_")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Checks for a grpc status code and extends the error object with additional
      * information.
      *
      * @private
      *
      * @param {error|object} err - The grpc error.
      * @return {error|null}
      */
    inline def decorateError_(err: js.Error): js.Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateError_")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error | Null]
    
    /**
      * Checks for a grpc status code and extends the supplied object with
      * additional information.
      *
      * @private
      *
      * @param {object} obj - The object to be extended.
      * @param {object} response - The grpc response.
      * @return {object|null}
      */
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.decorateGrpcResponse_")
    @js.native
    def decorateGrpcResponse_ : Any = js.native
    inline def decorateGrpcResponse__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorateGrpcResponse_")(x.asInstanceOf[js.Any])
    
    /**
      * Checks for grpc status code and extends the status object with additional
      * information
      *
      * @private
      * @param {object} status - The grpc status.
      * @return {object|null}
      */
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.decorateStatus_")
    @js.native
    def decorateStatus_ : Any = js.native
    inline def decorateStatus__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorateStatus_")(x.asInstanceOf[js.Any])
    
    /**
      * Convert a raw value to a type-denoted protobuf message-friendly object.
      *
      *
      * @param {*} value - The input value.
      * @return {*} - The encoded value.
      *
      * @example
      * ObjectToStructConverter.encodeValue('Hi');
      * // {
      * //   stringValue: 'Hello!'
      * // }
      */
    inline def encodeValue_(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeValue_")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Convert an object to a struct.
      *
      * @private
      *
      * @param {object} obj - An object to convert.
      * @param {object=} options - Configuration object.
      * @param {boolean} options.removeCircular - Remove circular references in the
      *     object with a placeholder string.
      * @param {boolean} options.stringify - Stringify un-recognized types.
      * @return {array} - The converted object.
      *
      * @example
      * GrpcService.objToStruct_({
      *   greeting: 'Hello!',
      *   favNumber: 7,
      *   friendIds: [
      *     1004,
      *     1006
      *   ],
      *   userDetails: {
      *     termsSigned: true
      *   }
      * });
      * // {
      * //   fields: {
      * //     greeting: {
      * //       stringValue: 'Hello!'
      * //     },
      * //     favNumber: {
      * //       numberValue: 7
      * //     },
      * //     friendIds: {
      * //       listValue: [
      * //         {
      * //           numberValue: 1004
      * //         },
      * //         {
      * //           numberValue: 1006
      * //         }
      * //       ]
      * //     },
      * //     userDetails: {
      * //       fields: {
      * //         termsSigned: {
      * //           booleanValue: true
      * //         }
      * //       }
      * //     }
      * //   }
      * // }
      */
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.objToStruct_")
    @js.native
    def objToStruct_ : Any = js.native
    inline def objToStruct__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objToStruct_")(x.asInstanceOf[js.Any])
    
    /** A cache for proto objects. */
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.protoObjectCache")
    @js.native
    def protoObjectCache: Any = js.native
    inline def protoObjectCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protoObjectCache")(x.asInstanceOf[js.Any])
    
    /**
      * Function to decide whether or not a request retry could occur.
      *
      * @private
      *
      * @param {object} response - The request response.
      * @return {boolean} shouldRetry
      */
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.shouldRetryRequest_")
    @js.native
    def shouldRetryRequest_ : Any = js.native
    inline def shouldRetryRequest__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldRetryRequest_")(x.asInstanceOf[js.Any])
    
    /**
      * Condense a protobuf Struct into an object of only its values.
      *
      * @private
      *
      * @param {object} struct - A protobuf Struct message.
      * @return {object} - The simplified object.
      *
      * @example
      * GrpcService.structToObj_({
      *   fields: {
      *     name: {
      *       kind: 'stringValue',
      *       stringValue: 'Stephen'
      *     }
      *   }
      * });
      * // {
      * //   name: 'Stephen'
      * // }
      */
    @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "GrpcService.structToObj_")
    @js.native
    def structToObj_ : Any = js.native
    inline def structToObj__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structToObj_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/spanner/build/src/common-grpc/service", "ObjectToStructConverter")
  @js.native
  /**
    * A class that can be used to convert an object to a struct. Optionally this
    * class can be used to erase/throw on circular references during conversion.
    *
    * @private
    *
    * @param {object=} options - Configuration object.
    * @param {boolean} options.removeCircular - Remove circular references in the
    *     object with a placeholder string. (Default: `false`)
    * @param {boolean} options.stringify - Stringify un-recognized types. (Default:
    *     `false`)
    */
  open class ObjectToStructConverter () extends StObject {
    def this(options: ObjectToStructConverterConfig) = this()
    
    /**
      * Begin the conversion process from a JS object to an encoded gRPC Value
      * message.
      *
      * @param {*} value - The input value.
      * @return {object} - The encoded value.
      *
      * @example
      * ObjectToStructConverter.convert({
      *   aString: 'Hi'
      * });
      * // {
      * //   fields: {
      * //     aString: {
      * //       stringValue: 'Hello!'
      * //     }
      * //   }
      * // }
      */
    def convert(obj: js.Object): Fields = js.native
    
    /**
      * Convert a raw value to a type-denoted protobuf message-friendly object.
      *
      * @private
      *
      * @param {*} value - The input value.
      * @return {*} - The encoded value.
      *
      * @example
      * ObjectToStructConverter.encodeValue('Hi');
      * // {
      * //   stringValue: 'Hello!'
      * // }
      */
    def encodeValue_(value: js.Object): Any = js.native
    
    var removeCircular: Boolean = js.native
    
    var seenObjects: Set[js.Object] = js.native
    
    var stringify: js.UndefOr[Boolean] = js.native
  }
  
  trait GrpcServiceConfig
    extends StObject
       with ServiceConfig {
    
    var customEndpoint: Boolean
    
    /** gRPC implementation to use. By default, uses `@grpc/grpc-js`. */
    var grpc: js.UndefOr[Typeofgrpc] = js.undefined
    
    /** Metadata to send with every request. */
    var grpcMetadata: Metadata
    
    /** gRPC version, to send in headers */
    var grpcVersion: js.UndefOr[String] = js.undefined
    
    /**
      * Directly provide the required proto files. This is useful when a single
      * class requires multiple services.
      */
    var protoServices: StringDictionary[BaseUrl]
    
    /** The root directory where proto files live. */
    var protosDir: String
  }
  object GrpcServiceConfig {
    
    inline def apply(
      apiEndpoint: String,
      baseUrl: String,
      customEndpoint: Boolean,
      grpcMetadata: Metadata,
      packageJson: PackageJson,
      protoServices: StringDictionary[BaseUrl],
      protosDir: String,
      scopes: js.Array[String]
    ): GrpcServiceConfig = {
      val __obj = js.Dynamic.literal(apiEndpoint = apiEndpoint.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], customEndpoint = customEndpoint.asInstanceOf[js.Any], grpcMetadata = grpcMetadata.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any], protoServices = protoServices.asInstanceOf[js.Any], protosDir = protosDir.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrpcServiceConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrpcServiceConfig] (val x: Self) extends AnyVal {
      
      inline def setCustomEndpoint(value: Boolean): Self = StObject.set(x, "customEndpoint", value.asInstanceOf[js.Any])
      
      inline def setGrpc(value: Typeofgrpc): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
      
      inline def setGrpcMetadata(value: Metadata): Self = StObject.set(x, "grpcMetadata", value.asInstanceOf[js.Any])
      
      inline def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
      
      inline def setGrpcVersion(value: String): Self = StObject.set(x, "grpcVersion", value.asInstanceOf[js.Any])
      
      inline def setGrpcVersionUndefined: Self = StObject.set(x, "grpcVersion", js.undefined)
      
      inline def setProtoServices(value: StringDictionary[BaseUrl]): Self = StObject.set(x, "protoServices", value.asInstanceOf[js.Any])
      
      inline def setProtosDir(value: String): Self = StObject.set(x, "protosDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectToStructConverterConfig extends StObject {
    
    var removeCircular: js.UndefOr[Boolean] = js.undefined
    
    var stringify: js.UndefOr[Boolean] = js.undefined
  }
  object ObjectToStructConverterConfig {
    
    inline def apply(): ObjectToStructConverterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectToStructConverterConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectToStructConverterConfig] (val x: Self) extends AnyVal {
      
      inline def setRemoveCircular(value: Boolean): Self = StObject.set(x, "removeCircular", value.asInstanceOf[js.Any])
      
      inline def setRemoveCircularUndefined: Self = StObject.set(x, "removeCircular", js.undefined)
      
      inline def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    }
  }
  
  trait ProtoOpts extends StObject {
    
    var method: String
    
    var retryOpts: js.UndefOr[RetryOptions] = js.undefined
    
    var service: String
    
    var stream: js.UndefOr[Duplex] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ProtoOpts {
    
    inline def apply(method: String, service: String): ProtoOpts = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtoOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProtoOpts] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRetryOpts(value: RetryOptions): Self = StObject.set(x, "retryOpts", value.asInstanceOf[js.Any])
      
      inline def setRetryOptsUndefined: Self = StObject.set(x, "retryOpts", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Duplex): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait RetryOptions extends StObject {
    
    var currentRetryAttempt: js.UndefOr[Double] = js.undefined
    
    var noResponseRetries: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var request: js.UndefOr[Any] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var shouldRetryFn: js.UndefOr[js.Function1[/* response */ Response[Any], Boolean]] = js.undefined
  }
  object RetryOptions {
    
    inline def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
      
      inline def setCurrentRetryAttempt(value: Double): Self = StObject.set(x, "currentRetryAttempt", value.asInstanceOf[js.Any])
      
      inline def setCurrentRetryAttemptUndefined: Self = StObject.set(x, "currentRetryAttempt", js.undefined)
      
      inline def setNoResponseRetries(value: Double): Self = StObject.set(x, "noResponseRetries", value.asInstanceOf[js.Any])
      
      inline def setNoResponseRetriesUndefined: Self = StObject.set(x, "noResponseRetries", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setShouldRetryFn(value: /* response */ Response[Any] => Boolean): Self = StObject.set(x, "shouldRetryFn", js.Any.fromFunction1(value))
      
      inline def setShouldRetryFnUndefined: Self = StObject.set(x, "shouldRetryFn", js.undefined)
    }
  }
  
  type ServiceRequestCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.UndefOr[Response[Any]], Unit]
}
