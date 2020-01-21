package typings.googleCloudPubsub.messageStreamMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-stream", "StatusError")
@js.native
class StatusError protected ()
  extends Error
     with StatusObject {
  def this(status: StatusObject) = this()
  /* CompleteClass */
  override var code: Status = js.native
  /* CompleteClass */
  override var details: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var metadata: Metadata = js.native
  @JSName("metadata")
  var metadata_StatusError: typings.grpcGrpcJs.mod.Metadata = js.native
  /* CompleteClass */
  override var name: String = js.native
}

