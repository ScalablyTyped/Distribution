package typings.googleGax

import org.scalablytyped.runtime.Instantiable0
import typings.grpcGrpcJs.mod.ServerCredentials
import typings.grpcGrpcJs.serverCredentialsMod.KeyCertPair
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassServerCredentials extends Instantiable0[ServerCredentials] {
  def createInsecure(): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
}

