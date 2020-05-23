package typings.googleCloudPubsub.mod.protos.google.iam.v1

import typings.protobufjs.mod.RPCImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a IAMPolicy */
@JSImport("@google-cloud/pubsub", "protos.google.iam.v1.IAMPolicy")
@js.native
class IAMPolicy protected ()
  extends typings.googleCloudPubsub.protosMod.google.iam.v1.IAMPolicy {
  /**
    * Constructs a new IAMPolicy service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.iam.v1.IAMPolicy")
@js.native
object IAMPolicy extends js.Object {
  /**
    * Creates new IAMPolicy service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  def create(rpcImpl: RPCImpl): typings.googleCloudPubsub.protosMod.google.iam.v1.IAMPolicy = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleCloudPubsub.protosMod.google.iam.v1.IAMPolicy = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleCloudPubsub.protosMod.google.iam.v1.IAMPolicy = js.native
}

