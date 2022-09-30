package typings.googleCloudSpanner

import typings.googleCloudCommon.mod.ServiceObject
import typings.googleCloudCommon.serviceObjectMod.Metadata
import typings.googleCloudCommon.serviceObjectMod.ResponseCallback
import typings.googleCloudCommon.serviceObjectMod.ServiceObjectConfig
import typings.teenyRequest.mod.RequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceObjectMod {
  
  @JSImport("@google-cloud/spanner/build/src/common-grpc/service-object", "GrpcServiceObject")
  @js.native
  open class GrpcServiceObject protected () extends ServiceObject[Any] {
    /**
      * GrpcServiceObject is a base class, meant to be inherited from by a service
      * object that uses the gRPC protobuf API.
      *
      * @constructor
      * @alias module:common/grpc-service-object
      *
      * @private
      *
      * @param {object} config - Configuration object.
      */
    def this(config: ServiceObjectConfig) = this()
    
    def delete(callback: RequestCallback[Any]): Unit = js.native
    
    /* private */ var getOpts: Any = js.native
    
    @JSName("parent")
    var parent_GrpcServiceObject: GrpcServiceObject = js.native
    
    /**
      * Patch a request to the GrpcService object.
      *
      * @private
      */
    def request(args: js.Object*): Any = js.native
    
    /**
      * Patch a streaming request to the GrpcService object.
      *
      * @private
      */
    def requestStream(args: js.Object*): Any = js.native
    
    /**
      * Patch a writable streaming request to the GrpcService object.
      *
      * @private
      */
    def requestWritableStream(args: js.Object*): Any = js.native
    
    def setMetadata(metadata: Metadata, callback: ResponseCallback): Unit = js.native
  }
}
