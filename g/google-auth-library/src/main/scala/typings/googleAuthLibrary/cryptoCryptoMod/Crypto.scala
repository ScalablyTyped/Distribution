package typings.googleAuthLibrary.cryptoCryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crypto extends js.Object {
  
  def decodeBase64StringUtf8(base64: String): String = js.native
  
  def encodeBase64StringUtf8(text: String): String = js.native
  
  def randomBytesBase64(n: Double): String = js.native
  
  def sha256DigestBase64(str: String): js.Promise[String] = js.native
  
  def sign(privateKey: String, data: String): js.Promise[String] = js.native
  def sign(privateKey: String, data: Buffer): js.Promise[String] = js.native
  def sign(privateKey: JwkCertificate, data: String): js.Promise[String] = js.native
  def sign(privateKey: JwkCertificate, data: Buffer): js.Promise[String] = js.native
  
  def verify(pubkey: String, data: String, signature: String): js.Promise[Boolean] = js.native
  def verify(pubkey: String, data: Buffer, signature: String): js.Promise[Boolean] = js.native
  def verify(pubkey: JwkCertificate, data: String, signature: String): js.Promise[Boolean] = js.native
  def verify(pubkey: JwkCertificate, data: Buffer, signature: String): js.Promise[Boolean] = js.native
}
