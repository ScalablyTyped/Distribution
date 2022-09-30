package typings.googleCloudTextToSpeech.anon

import typings.googleGax.iamServiceMod.google.iam.v1.IAMPolicy
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIAMPolicy extends StObject {
  
  /**
    * Creates new IAMPolicy service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  def create(rpcImpl: RPCImpl): IAMPolicy = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): IAMPolicy = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): IAMPolicy = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): IAMPolicy = js.native
}
