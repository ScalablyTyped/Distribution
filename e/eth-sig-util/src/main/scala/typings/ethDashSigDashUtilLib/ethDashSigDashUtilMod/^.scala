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
  def decrypt(
    encryptedData: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EncryptedData,
    receiverPrivateKey: java.lang.String
  ): java.lang.String = js.native
  def decrypt(
    encryptedData: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EncryptedData,
    receiverPrivateKey: nodeLib.Buffer
  ): java.lang.String = js.native
  def decryptSafely(
    encryptedData: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EncryptedData,
    receiverPrivateKey: java.lang.String
  ): js.Any = js.native
  def decryptSafely(
    encryptedData: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EncryptedData,
    receiverPrivateKey: nodeLib.Buffer
  ): js.Any = js.native
  def encrypt(
    receiverPublicKey: java.lang.String,
    data: ethDashSigDashUtilLib.ethDashSigDashUtilMod.MessageData[java.lang.String],
    version: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EncryptionType
  ): ethDashSigDashUtilLib.ethDashSigDashUtilMod.EncryptedData = js.native
  def encryptSafely(
    receiverPublicKey: java.lang.String,
    data: ethDashSigDashUtilLib.ethDashSigDashUtilMod.MessageData[_],
    version: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EncryptionType
  ): ethDashSigDashUtilLib.ethDashSigDashUtilMod.EncryptedData = js.native
  def extractPublicKey(message: ethDashSigDashUtilLib.ethDashSigDashUtilMod.SignedMessageData[_]): java.lang.String = js.native
  def getEncryptionPublicKey(privateKey: java.lang.String): java.lang.String = js.native
  def getEncryptionPublicKey(privateKey: nodeLib.Buffer): java.lang.String = js.native
  def normalize(input: java.lang.String): java.lang.String = js.native
  def normalize(input: scala.Double): java.lang.String = js.native
  def personalSign(privateKey: nodeLib.Buffer, message: ethDashSigDashUtilLib.ethDashSigDashUtilMod.MessageData[_]): java.lang.String = js.native
  def recoverPersonalSignature(message: ethDashSigDashUtilLib.ethDashSigDashUtilMod.SignedMessageData[_]): java.lang.String = js.native
  def recoverTypedSignature(
    msgParams: ethDashSigDashUtilLib.ethDashSigDashUtilMod.SignedMessageData[ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712TypedData]
  ): java.lang.String = js.native
  def recoverTypedSignatureLegacy(
    message: ethDashSigDashUtilLib.ethDashSigDashUtilMod.SignedMessageData[ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712LegacyData]
  ): java.lang.String = js.native
  def signTypedData(
    privateKey: nodeLib.Buffer,
    msgParams: ethDashSigDashUtilLib.ethDashSigDashUtilMod.MessageData[ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712TypedData]
  ): java.lang.String = js.native
  def signTypedDataLegacy(
    privateKey: nodeLib.Buffer,
    message: ethDashSigDashUtilLib.ethDashSigDashUtilMod.MessageData[ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712LegacyData]
  ): java.lang.String = js.native
  def typedSignatureHash(data: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712LegacyData): java.lang.String = js.native
}

