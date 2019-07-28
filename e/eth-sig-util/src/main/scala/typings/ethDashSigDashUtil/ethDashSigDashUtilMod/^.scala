package typings.ethDashSigDashUtil.ethDashSigDashUtilMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TYPED_MESSAGE_SCHEMA: js.Any = js.native
  def concatSig(v: Double, r: Buffer, s: Buffer): String = js.native
  def decrypt(encryptedData: EncryptedData, receiverPrivateKey: String): String = js.native
  def decrypt(encryptedData: EncryptedData, receiverPrivateKey: Buffer): String = js.native
  def decryptSafely(encryptedData: EncryptedData, receiverPrivateKey: String): js.Any = js.native
  def decryptSafely(encryptedData: EncryptedData, receiverPrivateKey: Buffer): js.Any = js.native
  def encrypt(receiverPublicKey: String, data: MessageData[String], version: EncryptionType): EncryptedData = js.native
  def encryptSafely(receiverPublicKey: String, data: MessageData[_], version: EncryptionType): EncryptedData = js.native
  def extractPublicKey(message: SignedMessageData[_]): String = js.native
  def getEncryptionPublicKey(privateKey: String): String = js.native
  def getEncryptionPublicKey(privateKey: Buffer): String = js.native
  def normalize(input: String): String = js.native
  def normalize(input: Double): String = js.native
  def personalSign(privateKey: Buffer, message: MessageData[_]): String = js.native
  def recoverPersonalSignature(message: SignedMessageData[_]): String = js.native
  def recoverTypedSignature(msgParams: SignedMessageData[EIP712TypedData]): String = js.native
  def recoverTypedSignatureLegacy(message: SignedMessageData[EIP712LegacyData]): String = js.native
  def signTypedData(privateKey: Buffer, msgParams: MessageData[EIP712TypedData]): String = js.native
  def signTypedDataLegacy(privateKey: Buffer, message: MessageData[EIP712LegacyData]): String = js.native
  def typedSignatureHash(data: EIP712LegacyData): String = js.native
}

