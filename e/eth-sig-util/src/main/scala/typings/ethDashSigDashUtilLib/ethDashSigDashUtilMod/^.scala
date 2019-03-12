package typings
package ethDashSigDashUtilLib.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TYPED_MESSAGE_SCHEMA: js.Any = js.native
  def concatSig(v: scala.Double, r: nodeLib.Buffer, s: nodeLib.Buffer): java.lang.String = js.native
  def decrypt(encryptedData: EncryptedData, receiverPrivateKey: java.lang.String): java.lang.String = js.native
  def decrypt(encryptedData: EncryptedData, receiverPrivateKey: nodeLib.Buffer): java.lang.String = js.native
  def decryptSafely(encryptedData: EncryptedData, receiverPrivateKey: java.lang.String): js.Any = js.native
  def decryptSafely(encryptedData: EncryptedData, receiverPrivateKey: nodeLib.Buffer): js.Any = js.native
  def encrypt(receiverPublicKey: java.lang.String, data: MessageData[java.lang.String], version: EncryptionType): EncryptedData = js.native
  def encryptSafely(receiverPublicKey: java.lang.String, data: MessageData[_], version: EncryptionType): EncryptedData = js.native
  def extractPublicKey(message: SignedMessageData[_]): java.lang.String = js.native
  def getEncryptionPublicKey(privateKey: java.lang.String): java.lang.String = js.native
  def getEncryptionPublicKey(privateKey: nodeLib.Buffer): java.lang.String = js.native
  def normalize(input: java.lang.String): java.lang.String = js.native
  def normalize(input: scala.Double): java.lang.String = js.native
  def personalSign(privateKey: nodeLib.Buffer, message: MessageData[_]): java.lang.String = js.native
  def recoverPersonalSignature(message: SignedMessageData[_]): java.lang.String = js.native
  def recoverTypedSignature(msgParams: SignedMessageData[EIP712TypedData]): java.lang.String = js.native
  def recoverTypedSignatureLegacy(message: SignedMessageData[EIP712LegacyData]): java.lang.String = js.native
  def signTypedData(privateKey: nodeLib.Buffer, msgParams: MessageData[EIP712TypedData]): java.lang.String = js.native
  def signTypedDataLegacy(privateKey: nodeLib.Buffer, message: MessageData[EIP712LegacyData]): java.lang.String = js.native
  def typedSignatureHash(data: EIP712LegacyData): java.lang.String = js.native
}

