package typings.atGoogleDashCloudPubsub.buildSrcMessageDashStreamMod

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-stream", "ChannelError")
@js.native
class ChannelError protected ()
  extends Error
     with StatusObject {
  def this(err: Error) = this()
  /* CompleteClass */
  override var code: Status = js.native
  /* CompleteClass */
  override var details: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var metadata: Metadata = js.native
  @JSName("metadata")
  var metadata_ChannelError: typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.Metadata = js.native
  /* CompleteClass */
  override var name: String = js.native
}

