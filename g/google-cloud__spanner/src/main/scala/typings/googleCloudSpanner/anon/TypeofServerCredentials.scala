package typings.googleCloudSpanner.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.grpc.ServerCredentials
import typings.grpcGrpcJs.buildSrcServerCredentialsMod.KeyCertPair
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofServerCredentials
  extends StObject
     with Instantiable0[ServerCredentials] {
  
  def createInsecure(): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
  
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
}
