package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.grpc.ChannelCredentials
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.VerifyOptions
import typings.node.bufferMod.global.Buffer
import typings.node.tlsMod.SecureContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofChannelCredentials
  extends StObject
     with Instantiable0[ChannelCredentials] {
  
  /**
    * Return a new ChannelCredentials instance with credentials created using
    * the provided secureContext. The resulting instances can be used to
    * construct a Channel that communicates over TLS. gRPC will not override
    * anything in the provided secureContext, so the environment variables
    * GRPC_SSL_CIPHER_SUITES and GRPC_DEFAULT_SSL_ROOTS_FILE_PATH will
    * not be applied.
    * @param secureContext The return value of tls.createSecureContext()
    * @param verifyOptions Additional options to modify certificate verification
    */
  def createFromSecureContext(secureContext: SecureContext): typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = js.native
  def createFromSecureContext(secureContext: SecureContext, verifyOptions: VerifyOptions): typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = js.native
  
  /**
    * Return a new ChannelCredentials instance with no credentials.
    */
  def createInsecure(): typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = js.native
  
  /**
    * Return a new ChannelCredentials instance with a given set of credentials.
    * The resulting instance can be used to construct a Channel that communicates
    * over TLS.
    * @param rootCerts The root certificate data.
    * @param privateKey The client certificate private key, if available.
    * @param certChain The client certificate key chain, if available.
    * @param verifyOptions Additional options to modify certificate verification
    */
  def createSsl(
    rootCerts: js.UndefOr[Buffer | Null],
    privateKey: js.UndefOr[Buffer | Null],
    certChain: js.UndefOr[Buffer | Null],
    verifyOptions: js.UndefOr[VerifyOptions]
  ): typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = js.native
}
