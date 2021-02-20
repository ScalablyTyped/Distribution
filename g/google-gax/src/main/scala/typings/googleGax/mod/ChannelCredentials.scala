package typings.googleGax.mod

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "ChannelCredentials")
@js.native
abstract class ChannelCredentials protected ()
  extends typings.grpcGrpcJs.mod.ChannelCredentials {
  protected def this(callCredentials: CallCredentials) = this()
}
/* static members */
object ChannelCredentials {
  
  /**
    * Return a new ChannelCredentials instance with no credentials.
    */
  @JSImport("google-gax", "ChannelCredentials.createInsecure")
  @js.native
  def createInsecure(): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  
  /**
    * Return a new ChannelCredentials instance with a given set of credentials.
    * The resulting instance can be used to construct a Channel that communicates
    * over TLS.
    * @param rootCerts The root certificate data.
    * @param privateKey The client certificate private key, if available.
    * @param certChain The client certificate key chain, if available.
    */
  @JSImport("google-gax", "ChannelCredentials.createSsl")
  @js.native
  def createSsl(
    rootCerts: js.UndefOr[Buffer | Null],
    privateKey: js.UndefOr[Buffer | Null],
    certChain: js.UndefOr[Buffer | Null],
    verifyOptions: js.UndefOr[VerifyOptions]
  ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
}
