package typings.atGoogleDashCloudPubsub

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcCallMod.ServiceError
import typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/publisher/publish-error", JSImport.Namespace)
@js.native
object buildSrcPublisherPublishDashErrorMod extends js.Object {
  @js.native
  class PublishError protected ()
    extends StatusObject
       with Error {
    def this(key: String, err: ServiceError) = this()
    /* CompleteClass */
    override var code: Status = js.native
    /* CompleteClass */
    override var details: String = js.native
    var error: ServiceError = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var metadata: Metadata = js.native
    @JSName("metadata")
    var metadata_PublishError: typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.Metadata = js.native
    /* CompleteClass */
    override var name: String = js.native
    var orderingKey: String = js.native
  }
  
}

