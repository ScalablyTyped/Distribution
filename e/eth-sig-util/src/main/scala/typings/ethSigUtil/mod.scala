package typings.ethSigUtil

import org.scalablytyped.runtime.StringDictionary
import typings.ethSigUtil.ethSigUtilStrings.`x25519-xsalsa20-poly1305`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eth-sig-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("eth-sig-util", "TYPED_MESSAGE_SCHEMA")
  @js.native
  val TYPED_MESSAGE_SCHEMA: js.Any = js.native
  
  object TypedDataUtils {
    
    @JSImport("eth-sig-util", "TypedDataUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def encodeData(primaryType: String, data: EIP712Message, types: EIP712Types): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeData")(primaryType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def encodeType(primaryType: String, types: EIP712Types): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeType")(primaryType.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def findTypeDependencies(primaryType: String, types: EIP712Types): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTypeDependencies")(primaryType.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def hashStruct(primaryType: String, data: EIP712Message, types: EIP712Types): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStruct")(primaryType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def hashType(primaryType: String, types: EIP712Types): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hashType")(primaryType.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def sanitizeData(data: EIP712TypedData): EIP712TypedData = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeData")(data.asInstanceOf[js.Any]).asInstanceOf[EIP712TypedData]
    
    /**
      * @returns hash of the typed data as defined by EIP712 (contrary to the function's name)
      * @see https://github.com/ethereum/EIPs/blob/master/EIPS/eip-712.md#specification
      */
    inline def sign(data: EIP712TypedData): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  inline def concatSig(v: Double, r: Buffer, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("concatSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decrypt(encryptedData: EncryptedData, receiverPrivateKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(encryptedData.asInstanceOf[js.Any], receiverPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decrypt(encryptedData: EncryptedData, receiverPrivateKey: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(encryptedData.asInstanceOf[js.Any], receiverPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decryptSafely(encryptedData: EncryptedData, receiverPrivateKey: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSafely")(encryptedData.asInstanceOf[js.Any], receiverPrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decryptSafely(encryptedData: EncryptedData, receiverPrivateKey: Buffer): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSafely")(encryptedData.asInstanceOf[js.Any], receiverPrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def encrypt(receiverPublicKey: String, data: MessageData[String], version: EncryptionType): EncryptedData = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(receiverPublicKey.asInstanceOf[js.Any], data.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[EncryptedData]
  
  inline def encryptSafely(receiverPublicKey: String, data: MessageData[js.Any], version: EncryptionType): EncryptedData = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptSafely")(receiverPublicKey.asInstanceOf[js.Any], data.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[EncryptedData]
  
  inline def extractPublicKey(message: SignedMessageData[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPublicKey")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getEncryptionPublicKey(privateKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncryptionPublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getEncryptionPublicKey(privateKey: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncryptionPublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalize(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def normalize(input: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def personalSign(privateKey: Buffer, message: MessageData[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("personalSign")(privateKey.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def recoverPersonalSignature(message: SignedMessageData[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recoverPersonalSignature")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def recoverTypedSignature(msgParams: SignedMessageData[EIP712TypedData]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recoverTypedSignature")(msgParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def recoverTypedSignatureLegacy(message: SignedMessageData[EIP712LegacyData]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recoverTypedSignatureLegacy")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def signTypedData(privateKey: Buffer, msgParams: MessageData[EIP712TypedData]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signTypedData")(privateKey.asInstanceOf[js.Any], msgParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def signTypedDataLegacy(privateKey: Buffer, message: MessageData[EIP712LegacyData]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signTypedDataLegacy")(privateKey.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def typedSignatureHash(data: EIP712LegacyData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("typedSignatureHash")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait EIP712Domain extends StObject {
    
    var chainId: js.UndefOr[String | Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var salt: js.UndefOr[String] = js.undefined
    
    var verifyingContract: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object EIP712Domain {
    
    inline def apply(): EIP712Domain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EIP712Domain]
    }
    
    extension [Self <: EIP712Domain](x: Self) {
      
      inline def setChainId(value: String | Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setVerifyingContract(value: String): Self = StObject.set(x, "verifyingContract", value.asInstanceOf[js.Any])
      
      inline def setVerifyingContractUndefined: Self = StObject.set(x, "verifyingContract", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type EIP712LegacyData = js.Array[EIP712LegacyField]
  
  trait EIP712LegacyField extends StObject {
    
    var name: String
    
    var `type`: String
    
    var value: js.Any
  }
  object EIP712LegacyField {
    
    inline def apply(name: String, `type`: String, value: js.Any): EIP712LegacyField = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EIP712LegacyField]
    }
    
    extension [Self <: EIP712LegacyField](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type EIP712Message = StringDictionary[js.Any]
  
  trait EIP712TypeProperty extends StObject {
    
    var name: String
    
    var `type`: String
  }
  object EIP712TypeProperty {
    
    inline def apply(name: String, `type`: String): EIP712TypeProperty = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EIP712TypeProperty]
    }
    
    extension [Self <: EIP712TypeProperty](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EIP712TypedData extends StObject {
    
    var domain: EIP712Domain
    
    var message: EIP712Message
    
    var primaryType: String
    
    var types: EIP712Types
  }
  object EIP712TypedData {
    
    inline def apply(domain: EIP712Domain, message: EIP712Message, primaryType: String, types: EIP712Types): EIP712TypedData = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], primaryType = primaryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[EIP712TypedData]
    }
    
    extension [Self <: EIP712TypedData](x: Self) {
      
      inline def setDomain(value: EIP712Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: EIP712Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPrimaryType(value: String): Self = StObject.set(x, "primaryType", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: EIP712Types): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  type EIP712Types = StringDictionary[js.Array[EIP712TypeProperty]]
  
  trait EncryptedData extends StObject {
    
    var ciphertext: String
    
    var ephemPublicKey: String
    
    var nonce: String
    
    var version: EncryptionType
  }
  object EncryptedData {
    
    inline def apply(ciphertext: String, ephemPublicKey: String, nonce: String, version: EncryptionType): EncryptedData = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ephemPublicKey = ephemPublicKey.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptedData]
    }
    
    extension [Self <: EncryptedData](x: Self) {
      
      inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setEphemPublicKey(value: String): Self = StObject.set(x, "ephemPublicKey", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: EncryptionType): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type EncryptionType = `x25519-xsalsa20-poly1305`
  
  trait MessageData[T] extends StObject {
    
    var data: T
  }
  object MessageData {
    
    inline def apply[T](data: T): MessageData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageData[T]]
    }
    
    extension [Self <: MessageData[?], T](x: Self & MessageData[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignedMessageData[T]
    extends StObject
       with MessageData[T] {
    
    var sig: String
  }
  object SignedMessageData {
    
    inline def apply[T](data: T, sig: String): SignedMessageData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedMessageData[T]]
    }
    
    extension [Self <: SignedMessageData[?], T](x: Self & SignedMessageData[T]) {
      
      inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    }
  }
}
