package typings.ethereumjsUtil

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util/dist/account", JSImport.Namespace)
@js.native
object accountMod extends js.Object {
  def generateAddress(from: Buffer, nonce: Buffer): Buffer = js.native
  def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = js.native
  def importPublic(publicKey: Buffer): Buffer = js.native
  def isValidAddress(hexAddress: String): Boolean = js.native
  def isValidChecksumAddress(hexAddress: String): Boolean = js.native
  def isValidChecksumAddress(hexAddress: String, eip1191ChainId: Double): Boolean = js.native
  def isValidPrivate(privateKey: Buffer): Boolean = js.native
  def isValidPublic(publicKey: Buffer): Boolean = js.native
  def isValidPublic(publicKey: Buffer, sanitize: Boolean): Boolean = js.native
  def isZeroAddress(hexAddress: String): Boolean = js.native
  def privateToAddress(privateKey: Buffer): Buffer = js.native
  def privateToPublic(privateKey: Buffer): Buffer = js.native
  def pubToAddress(pubKey: Buffer): Buffer = js.native
  def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  def publicToAddress(pubKey: Buffer): Buffer = js.native
  def publicToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  def toChecksumAddress(hexAddress: String): String = js.native
  def toChecksumAddress(hexAddress: String, eip1191ChainId: Double): String = js.native
  def zeroAddress(): String = js.native
}

