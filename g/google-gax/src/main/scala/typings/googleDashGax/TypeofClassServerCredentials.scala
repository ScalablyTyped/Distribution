package typings.googleDashGax

import org.scalablytyped.runtime.Instantiable0
import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.ServerCredentials
import typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.KeyCertPair
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassServerCredentials extends Instantiable0[ServerCredentials] {
  def createInsecure(): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
}

