package typings.googleCloudPubsub

import typings.grpcGrpcJs.callMod.ServiceError
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishErrorMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/publish-error", "PublishError")
  @js.native
  class PublishError protected ()
    extends StObject
       with ServiceError {
    def this(key: String, err: ServiceError) = this()
    
    /* CompleteClass */
    var code: Status = js.native
    
    /* CompleteClass */
    var details: String = js.native
    
    var error: ServiceError = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var metadata: Metadata = js.native
    @JSName("metadata")
    var metadata_PublishError: typings.googleGax.mod.grpc.Metadata = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var orderingKey: String = js.native
  }
}
