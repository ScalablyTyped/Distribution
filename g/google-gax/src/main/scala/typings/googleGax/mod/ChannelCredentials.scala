package typings.googleGax.mod

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "ChannelCredentials")
@js.native
/* protected */ abstract class ChannelCredentials ()
  extends typings.grpcGrpcJs.mod.ChannelCredentials {
  /* protected */ def this(callCredentials: CallCredentials) = this()
}
/* static members */
object ChannelCredentials {
  
  @JSImport("google-gax", "ChannelCredentials")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Return a new ChannelCredentials instance with no credentials.
    */
  inline def createInsecure(): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials]
  
  /**
    * Return a new ChannelCredentials instance with a given set of credentials.
    * The resulting instance can be used to construct a Channel that communicates
    * over TLS.
    * @param rootCerts The root certificate data.
    * @param privateKey The client certificate private key, if available.
    * @param certChain The client certificate key chain, if available.
    */
  inline def createSsl(
    rootCerts: js.UndefOr[Buffer | Null],
    privateKey: js.UndefOr[Buffer | Null],
    certChain: js.UndefOr[Buffer | Null],
    verifyOptions: js.UndefOr[VerifyOptions]
  ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials]
}
