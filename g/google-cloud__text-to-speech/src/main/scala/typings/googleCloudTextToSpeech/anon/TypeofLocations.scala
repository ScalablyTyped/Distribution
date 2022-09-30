package typings.googleCloudTextToSpeech.anon

import typings.googleGax.locationsMod.google.cloud.location.Locations
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLocations extends StObject {
  
  /**
    * Creates new Locations service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  def create(rpcImpl: RPCImpl): Locations = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Locations = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Locations = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Locations = js.native
}
