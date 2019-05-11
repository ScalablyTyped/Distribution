package typings
package atGoogleDashCloudPubsubLib.buildSrcMessageDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-stream", "ChannelError")
@js.native
class ChannelError protected ()
  extends grpcLib.grpcMod.ServiceError {
  def this(err: stdLib.Error) = this()
  @JSName("code")
  var code_ChannelError: grpcLib.grpcMod.status = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

