package typings.googleCloudPubsub

import typings.googleGax.mod.grpc.Metadata
import typings.grpcGrpcJs.callMod.ServiceError
import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishErrorMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/publish-error", "PublishError")
  @js.native
  class PublishError protected ()
    extends Error
       with StatusObject {
    def this(key: String, err: ServiceError) = this()
    
    var error: ServiceError = js.native
    
    @JSName("metadata")
    var metadata_PublishError: Metadata = js.native
    
    var orderingKey: String = js.native
  }
}
