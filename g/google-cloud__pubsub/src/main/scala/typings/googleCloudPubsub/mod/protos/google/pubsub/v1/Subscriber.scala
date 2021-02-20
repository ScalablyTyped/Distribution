package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Subscriber */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Subscriber")
@js.native
class Subscriber protected ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber {
  /**
    * Constructs a new Subscriber service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
}
object Subscriber {
  
  /**
    * Creates new Subscriber service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Subscriber.create")
  @js.native
  def create(rpcImpl: RPCImpl): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Subscriber.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Subscriber.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Subscriber.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber = js.native
}
