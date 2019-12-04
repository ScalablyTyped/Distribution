package typings.atFirebaseFirestore.distSrcRemoteConnectionMod

import typings.atFirebaseFirestore.distSrcApiCredentialsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  def invokeRPC[Req, Resp](rpcName: String, request: Req): js.Promise[Resp] = js.native
  /**
    * Invokes an RPC by name, given a request message as a JavaScript object
    * representing the JSON to send.
    *
    * @param rpcName the name of the RPC to invoke
    * @param request the Raw JSON object encoding of the request message
    * @param token the Token to use for the RPC.
    * @return a Promise containing the JSON object encoding of the response
    */
  def invokeRPC[Req, Resp](rpcName: String, request: Req, token: Token): js.Promise[Resp] = js.native
  def invokeStreamingRPC[Req, Resp](rpcName: String, request: Req): js.Promise[js.Array[Resp]] = js.native
  /**
    * Invokes a streaming RPC by name, given a request message as a JavaScript
    * object representing the JSON to send. The responses will be consumed to
    * completion and then returned as an array.
    *
    * @param rpcName the name of the RPC to invoke
    * @param request the Raw JSON object encoding of the request message
    * @param token the Token to use for the RPC.
    * @return a Promise containing an array with the JSON object encodings of the
    * responses
    */
  def invokeStreamingRPC[Req, Resp](rpcName: String, request: Req, token: Token): js.Promise[js.Array[Resp]] = js.native
  def openStream[Req, Resp](rpcName: String): Stream[Req, Resp] = js.native
  /**
    * Opens a stream to the given stream RPC endpoint. Returns a stream which
    * will try to open itself.
    * @param rpcName the name of the RPC to open the stream on
    * @param token the Token to use for the RPC.
    */
  def openStream[Req, Resp](rpcName: String, token: Token): Stream[Req, Resp] = js.native
}

