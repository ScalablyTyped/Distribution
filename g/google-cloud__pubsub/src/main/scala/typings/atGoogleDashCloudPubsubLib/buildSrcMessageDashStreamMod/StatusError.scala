package typings
package atGoogleDashCloudPubsubLib.buildSrcMessageDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-stream", "StatusError")
@js.native
class StatusError protected ()
  extends grpcLib.grpcMod.ServiceError {
  def this(status: grpcLib.grpcMod.StatusObject) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

