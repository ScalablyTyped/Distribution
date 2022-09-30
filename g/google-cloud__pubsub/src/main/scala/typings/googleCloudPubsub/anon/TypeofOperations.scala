package typings.googleCloudPubsub.anon

import typings.googleGax.operationsMod.google.longrunning.Operations
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOperations extends StObject {
  
  /**
    * Creates new Operations service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  def create(rpcImpl: RPCImpl): Operations = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Operations = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Operations = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Operations = js.native
}
