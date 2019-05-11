package typings
package atGoogleDashCloudPubsubLib.buildSrcMessageDashQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-queues", "BatchError")
@js.native
class BatchError protected ()
  extends grpcLib.grpcMod.ServiceError {
  def this(err: grpcLib.grpcMod.ServiceError, ackIds: js.Array[java.lang.String], rpc: java.lang.String) = this()
  var ackIds: js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

