package typings.googleGax.mod

import typings.grpcGrpcJs.buildSrcClientMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "ClientStub")
@js.native
open class ClientStub protected ()
  extends typings.googleGax.buildSrcGrpcMod.ClientStub {
  def this(address: String, credentials: typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials) = this()
  def this(
    address: String,
    credentials: typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials,
    options: ClientOptions
  ) = this()
}
