package typings.ethSigUtil

import org.scalablytyped.runtime.StringDictionary
import typings.ethSigUtil.ethSigUtilStrings.`x25519-xsalsa20-poly1305`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eth-sig-util", "TYPED_MESSAGE_SCHEMA")
  @js.native
  val TYPED_MESSAGE_SCHEMA: js.Any = js.native
  
  object TypedDataUtils {
    
    @JSImport("eth-sig-util", "TypedDataUtils.encodeData")
    @js.native
    def encodeData(primaryType: String, data: EIP712Message, types: EIP712Types): Buffer = js.native
    
    @JSImport("eth-sig-util", "TypedDataUtils.encodeType")
    @js.native
    def encodeType(primaryType: String, types: EIP712Types): String = js.native
    
    @JSImport("eth-sig-util", "TypedDataUtils.findTypeDependencies")
    @js.native
    def findTypeDependencies(primaryType: String, types: EIP712Types): js.Array[String] = js.native
    
    @JSImport("eth-sig-util", "TypedDataUtils.hashStruct")
    @js.native
    def hashStruct(primaryType: String, data: EIP712Message, types: EIP712Types): Buffer = js.native
    
    @JSImport("eth-sig-util", "TypedDataUtils.hashType")
    @js.native
    def hashType(primaryType: String, types: EIP712Types): Buffer = js.native
    
    @JSImport("eth-sig-util", "TypedDataUtils.sanitizeData")
    @js.native
    def sanitizeData(data: EIP712TypedData): EIP712TypedData = js.native
    
    /**
      * @returns hash of the typed data as defined by EIP712 (contrary to the function's name)
      * @see https://github.com/ethereum/EIPs/blob/master/EIPS/eip-712.md#specification
      */
    @JSImport("eth-sig-util", "TypedDataUtils.sign")
    @js.native
    def sign(data: EIP712TypedData): Buffer = js.native
  }
  
  @JSImport("eth-sig-util", "concatSig")
  @js.native
  def concatSig(v: Double, r: Buffer, s: Buffer): String = js.native
  
  @JSImport("eth-sig-util", "decrypt")
  @js.native
  def decrypt(encryptedData: EncryptedData, receiverPrivateKey: String): String = js.native
  @JSImport("eth-sig-util", "decrypt")
  @js.native
  def decrypt(encryptedData: EncryptedData, receiverPrivateKey: Buffer): String = js.native
  
  @JSImport("eth-sig-util", "decryptSafely")
  @js.native
  def decryptSafely(encryptedData: EncryptedData, receiverPrivateKey: String): js.Any = js.native
  @JSImport("eth-sig-util", "decryptSafely")
  @js.native
  def decryptSafely(encryptedData: EncryptedData, receiverPrivateKey: Buffer): js.Any = js.native
  
  @JSImport("eth-sig-util", "encrypt")
  @js.native
  def encrypt(receiverPublicKey: String, data: MessageData[String], version: EncryptionType): EncryptedData = js.native
  
  @JSImport("eth-sig-util", "encryptSafely")
  @js.native
  def encryptSafely(receiverPublicKey: String, data: MessageData[_], version: EncryptionType): EncryptedData = js.native
  
  @JSImport("eth-sig-util", "extractPublicKey")
  @js.native
  def extractPublicKey(message: SignedMessageData[_]): String = js.native
  
  @JSImport("eth-sig-util", "getEncryptionPublicKey")
  @js.native
  def getEncryptionPublicKey(privateKey: String): String = js.native
  @JSImport("eth-sig-util", "getEncryptionPublicKey")
  @js.native
  def getEncryptionPublicKey(privateKey: Buffer): String = js.native
  
  @JSImport("eth-sig-util", "normalize")
  @js.native
  def normalize(input: String): String = js.native
  @JSImport("eth-sig-util", "normalize")
  @js.native
  def normalize(input: Double): String = js.native
  
  @JSImport("eth-sig-util", "personalSign")
  @js.native
  def personalSign(privateKey: Buffer, message: MessageData[_]): String = js.native
  
  @JSImport("eth-sig-util", "recoverPersonalSignature")
  @js.native
  def recoverPersonalSignature(message: SignedMessageData[_]): String = js.native
  
  @JSImport("eth-sig-util", "recoverTypedSignature")
  @js.native
  def recoverTypedSignature(msgParams: SignedMessageData[EIP712TypedData]): String = js.native
  
  @JSImport("eth-sig-util", "recoverTypedSignatureLegacy")
  @js.native
  def recoverTypedSignatureLegacy(message: SignedMessageData[EIP712LegacyData]): String = js.native
  
  @JSImport("eth-sig-util", "signTypedData")
  @js.native
  def signTypedData(privateKey: Buffer, msgParams: MessageData[EIP712TypedData]): String = js.native
  
  @JSImport("eth-sig-util", "signTypedDataLegacy")
  @js.native
  def signTypedDataLegacy(privateKey: Buffer, message: MessageData[EIP712LegacyData]): String = js.native
  
  @JSImport("eth-sig-util", "typedSignatureHash")
  @js.native
  def typedSignatureHash(data: EIP712LegacyData): String = js.native
  
  @js.native
  trait EIP712Domain extends StObject {
    
    var chainId: js.UndefOr[String | Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var salt: js.UndefOr[String] = js.native
    
    var verifyingContract: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object EIP712Domain {
    
    @scala.inline
    def apply(): EIP712Domain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EIP712Domain]
    }
    
    @scala.inline
    implicit class EIP712DomainMutableBuilder[Self <: EIP712Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainId(value: String | Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setVerifyingContract(value: String): Self = StObject.set(x, "verifyingContract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyingContractUndefined: Self = StObject.set(x, "verifyingContract", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type EIP712LegacyData = js.Array[EIP712LegacyField]
  
  @js.native
  trait EIP712LegacyField extends StObject {
    
    var name: String = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  object EIP712LegacyField {
    
    @scala.inline
    def apply(name: String, `type`: String, value: js.Any): EIP712LegacyField = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EIP712LegacyField]
    }
    
    @scala.inline
    implicit class EIP712LegacyFieldMutableBuilder[Self <: EIP712LegacyField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type EIP712Message = StringDictionary[js.Any]
  
  @js.native
  trait EIP712TypeProperty extends StObject {
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object EIP712TypeProperty {
    
    @scala.inline
    def apply(name: String, `type`: String): EIP712TypeProperty = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EIP712TypeProperty]
    }
    
    @scala.inline
    implicit class EIP712TypePropertyMutableBuilder[Self <: EIP712TypeProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EIP712TypedData extends StObject {
    
    var domain: EIP712Domain = js.native
    
    var message: EIP712Message = js.native
    
    var primaryType: String = js.native
    
    var types: EIP712Types = js.native
  }
  object EIP712TypedData {
    
    @scala.inline
    def apply(domain: EIP712Domain, message: EIP712Message, primaryType: String, types: EIP712Types): EIP712TypedData = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], primaryType = primaryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[EIP712TypedData]
    }
    
    @scala.inline
    implicit class EIP712TypedDataMutableBuilder[Self <: EIP712TypedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: EIP712Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: EIP712Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryType(value: String): Self = StObject.set(x, "primaryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: EIP712Types): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  type EIP712Types = StringDictionary[js.Array[EIP712TypeProperty]]
  
  @js.native
  trait EncryptedData extends StObject {
    
    var ciphertext: String = js.native
    
    var ephemPublicKey: String = js.native
    
    var nonce: String = js.native
    
    var version: EncryptionType = js.native
  }
  object EncryptedData {
    
    @scala.inline
    def apply(ciphertext: String, ephemPublicKey: String, nonce: String, version: EncryptionType): EncryptedData = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ephemPublicKey = ephemPublicKey.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptedData]
    }
    
    @scala.inline
    implicit class EncryptedDataMutableBuilder[Self <: EncryptedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemPublicKey(value: String): Self = StObject.set(x, "ephemPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: EncryptionType): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type EncryptionType = `x25519-xsalsa20-poly1305`
  
  @js.native
  trait MessageData[T] extends StObject {
    
    var data: T = js.native
  }
  object MessageData {
    
    @scala.inline
    def apply[T](data: T): MessageData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageData[T]]
    }
    
    @scala.inline
    implicit class MessageDataMutableBuilder[Self <: MessageData[_], T] (val x: Self with MessageData[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignedMessageData[T] extends MessageData[T] {
    
    var sig: String = js.native
  }
  object SignedMessageData {
    
    @scala.inline
    def apply[T](data: T, sig: String): SignedMessageData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedMessageData[T]]
    }
    
    @scala.inline
    implicit class SignedMessageDataMutableBuilder[Self <: SignedMessageData[_], T] (val x: Self with SignedMessageData[T]) extends AnyVal {
      
      @scala.inline
      def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    }
  }
}
