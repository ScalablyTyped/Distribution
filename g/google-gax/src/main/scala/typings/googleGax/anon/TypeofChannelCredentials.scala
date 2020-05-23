package typings.googleGax.anon

import org.scalablytyped.runtime.Instantiable0
import typings.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typings.grpcGrpcJs.mod.ChannelCredentials
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofChannelCredentials extends Instantiable0[ChannelCredentials] {
  /**
    * Return a new ChannelCredentials instance with no credentials.
    */
  def createInsecure(): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  /**
    * Return a new ChannelCredentials instance with a given set of credentials.
    * The resulting instance can be used to construct a Channel that communicates
    * over TLS.
    * @param rootCerts The root certificate data.
    * @param privateKey The client certificate private key, if available.
    * @param certChain The client certificate key chain, if available.
    */
  def createSsl(): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Null, verifyOptions: VerifyOptions): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Buffer): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Buffer, verifyOptions: VerifyOptions): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Null, verifyOptions: VerifyOptions): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Buffer): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Null, verifyOptions: VerifyOptions): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Buffer): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Buffer, verifyOptions: VerifyOptions): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Null, verifyOptions: VerifyOptions): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
}

