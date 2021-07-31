package typings.googleGax.mod

import typings.grpcGrpcJs.clientMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "ClientStub")
@js.native
class ClientStub protected ()
  extends typings.googleGax.grpcMod.ClientStub {
  def this(address: String, credentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials) = this()
  def this(
    address: String,
    credentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
    options: ClientOptions
  ) = this()
}
