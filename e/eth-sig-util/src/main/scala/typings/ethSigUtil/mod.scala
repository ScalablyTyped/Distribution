package typings.ethSigUtil

import org.scalablytyped.runtime.StringDictionary
import typings.ethSigUtil.anon.ChainId
import typings.ethSigUtil.anon.Domain
import typings.ethSigUtil.anon.PartialEIP712TypedData
import typings.node.bufferMod.global.Buffer
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eth-sig-util/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object TYPED_MESSAGE_SCHEMA {
    
    @JSImport("eth-sig-util/dist", "TYPED_MESSAGE_SCHEMA")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("eth-sig-util/dist", "TYPED_MESSAGE_SCHEMA.properties")
    @js.native
    def properties: Domain = js.native
    inline def properties_=(x: Domain): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
    
    @JSImport("eth-sig-util/dist", "TYPED_MESSAGE_SCHEMA.required")
    @js.native
    def required: js.Array[String] = js.native
    inline def required_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
    
    @JSImport("eth-sig-util/dist", "TYPED_MESSAGE_SCHEMA.type")
    @js.native
    val `type`: String = js.native
  }
  
  /**
    * A collection of utility functions used for signing typed data
    */
  object TypedDataUtils {
    
    @JSImport("eth-sig-util/dist", "TypedDataUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Encodes an object by encoding and concatenating each of its members
      *
      * @param {string} primaryType - Root type
      * @param {Object} data - Object to encode
      * @param {Object} types - Type definitions
      * @returns {Buffer} - Encoded representation of an object
      */
    inline def encodeData(
      primaryType: String,
      data: Record[String, Any],
      types: Record[String, js.Array[MessageTypeProperty]]
    ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeData")(primaryType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def encodeData(
      primaryType: String,
      data: Record[String, Any],
      types: Record[String, js.Array[MessageTypeProperty]],
      useV4: Boolean
    ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeData")(primaryType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], types.asInstanceOf[js.Any], useV4.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * Encodes the type of an object by encoding a comma delimited list of its members
      *
      * @param {string} primaryType - Root type to encode
      * @param {Object} types - Type definitions
      * @returns {string} - Encoded representation of the type of an object
      */
    inline def encodeType(primaryType: String, types: Record[String, js.Array[MessageTypeProperty]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeType")(primaryType.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Finds all types within a type definition object
      *
      * @param {string} primaryType - Root type
      * @param {Object} types - Type definitions
      * @param {Array} results - current set of accumulated types
      * @returns {Array} - Set of all types found in the type definition
      */
    inline def findTypeDependencies(primaryType: String, types: Record[String, js.Array[MessageTypeProperty]]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTypeDependencies")(primaryType.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def findTypeDependencies(
      primaryType: String,
      types: Record[String, js.Array[MessageTypeProperty]],
      results: js.Array[String]
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTypeDependencies")(primaryType.asInstanceOf[js.Any], types.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Hashes an object
      *
      * @param {string} primaryType - Root type
      * @param {Object} data - Object to hash
      * @param {Object} types - Type definitions
      * @returns {Buffer} - Hash of an object
      */
    inline def hashStruct(primaryType: String, data: Record[String, Any], types: Record[String, Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStruct")(primaryType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def hashStruct(primaryType: String, data: Record[String, Any], types: Record[String, Any], useV4: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStruct")(primaryType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], types.asInstanceOf[js.Any], useV4.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * Hashes the type of an object
      *
      * @param {string} primaryType - Root type to hash
      * @param {Object} types - Type definitions
      * @returns {Buffer} - Hash of an object
      */
    inline def hashType(primaryType: String, types: Record[String, Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hashType")(primaryType.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * Removes properties from a message object that are not defined per EIP-712
      *
      * @param {Object} data - typed message object
      * @returns {Object} - typed message object with only allowed fields
      */
    inline def sanitizeData[T /* <: MessageTypes */](data: String): TypedMessage[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedMessage[T]]
    inline def sanitizeData[T /* <: MessageTypes */](data: js.Array[EIP712TypedData]): TypedMessage[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedMessage[T]]
    inline def sanitizeData[T /* <: MessageTypes */](data: EIP712TypedData): TypedMessage[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedMessage[T]]
    inline def sanitizeData[T /* <: MessageTypes */](data: TypedMessage[T]): TypedMessage[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeData")(data.asInstanceOf[js.Any]).asInstanceOf[TypedMessage[T]]
    
    /**
      * Signs a typed message as per EIP-712 and returns its keccak hash
      *
      * @param {Object} typedData - Types message data to sign
      * @returns {Buffer} - keccak hash of the resulting signed message
      */
    inline def sign[T_1 /* <: MessageTypes */](typedData: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(typedData.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def sign[T_1 /* <: MessageTypes */](typedData: String, useV4: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(typedData.asInstanceOf[js.Any], useV4.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign[T_1 /* <: MessageTypes */](typedData: js.Array[EIP712TypedData]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(typedData.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def sign[T_1 /* <: MessageTypes */](typedData: js.Array[EIP712TypedData], useV4: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(typedData.asInstanceOf[js.Any], useV4.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign[T_1 /* <: MessageTypes */](typedData: PartialEIP712TypedData): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(typedData.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def sign[T_1 /* <: MessageTypes */](typedData: PartialEIP712TypedData, useV4: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(typedData.asInstanceOf[js.Any], useV4.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign[T_1 /* <: MessageTypes */](typedData: Partial[TypedMessage[T_1]]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(typedData.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def sign[T_1 /* <: MessageTypes */](typedData: Partial[TypedMessage[T_1]], useV4: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(typedData.asInstanceOf[js.Any], useV4.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  }
  
  inline def concatSig(v: Buffer, r: Buffer, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("concatSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decrypt(encryptedData: EthEncryptedData, receiverPrivateKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(encryptedData.asInstanceOf[js.Any], receiverPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decryptSafely(encryptedData: EthEncryptedData, receiverPrivateKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSafely")(encryptedData.asInstanceOf[js.Any], receiverPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encrypt[T /* <: MessageTypes */](receiverPublicKey: String, msgParams: MsgParams[TypedData | TypedMessage[T]], version: String): EthEncryptedData = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(receiverPublicKey.asInstanceOf[js.Any], msgParams.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[EthEncryptedData]
  
  inline def encryptSafely[T /* <: MessageTypes */](receiverPublicKey: String, msgParams: MsgParams[TypedData | TypedMessage[T]], version: String): EthEncryptedData = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptSafely")(receiverPublicKey.asInstanceOf[js.Any], msgParams.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[EthEncryptedData]
  
  inline def extractPublicKey[T /* <: MessageTypes */](msgParams: SignedMsgParams[TypedData | TypedMessage[T]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPublicKey")(msgParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getEncryptionPublicKey(privateKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncryptionPublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalize(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def normalize(input: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def personalSign[T /* <: MessageTypes */](privateKey: Buffer, msgParams: MsgParams[TypedData | TypedMessage[T]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("personalSign")(privateKey.asInstanceOf[js.Any], msgParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def recoverPersonalSignature[T /* <: MessageTypes */](msgParams: SignedMsgParams[TypedData | TypedMessage[T]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recoverPersonalSignature")(msgParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def recoverTypedMessage[T /* <: MessageTypes */](msgParams: SignedMsgParams[TypedData | TypedMessage[T]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recoverTypedMessage")(msgParams.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def recoverTypedMessage[T /* <: MessageTypes */](msgParams: SignedMsgParams[TypedData | TypedMessage[T]], version: Version): String = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverTypedMessage")(msgParams.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def recoverTypedSignature[T /* <: MessageTypes */](msgParams: SignedMsgParams[TypedData | TypedMessage[T]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recoverTypedSignature")(msgParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def recoverTypedSignatureLegacy[T /* <: MessageTypes */](msgParams: SignedMsgParams[TypedData | TypedMessage[T]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recoverTypedSignatureLegacy")(msgParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def recoverTypedSignatureV4[T /* <: MessageTypes */](msgParams: SignedMsgParams[TypedData | TypedMessage[T]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recoverTypedSignature_v4")(msgParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def signTypedData[T /* <: MessageTypes */](privateKey: Buffer, msgParams: MsgParams[TypedData | TypedMessage[T]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signTypedData")(privateKey.asInstanceOf[js.Any], msgParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def signTypedDataLegacy[T /* <: MessageTypes */](privateKey: Buffer, msgParams: MsgParams[TypedData | TypedMessage[T]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signTypedDataLegacy")(privateKey.asInstanceOf[js.Any], msgParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def signTypedDataV4[T /* <: MessageTypes */](privateKey: Buffer, msgParams: MsgParams[TypedData | TypedMessage[T]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signTypedData_v4")(privateKey.asInstanceOf[js.Any], msgParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * A generic entry point for all typed data methods to be passed, includes a version parameter.
    */
  inline def signTypedMessage[T /* <: MessageTypes */](privateKey: Buffer, msgParams: MsgParams[TypedData | TypedMessage[T]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signTypedMessage")(privateKey.asInstanceOf[js.Any], msgParams.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def signTypedMessage[T /* <: MessageTypes */](privateKey: Buffer, msgParams: MsgParams[TypedData | TypedMessage[T]], version: Version): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signTypedMessage")(privateKey.asInstanceOf[js.Any], msgParams.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def typedSignatureHash(typedData: js.Array[EIP712TypedData]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("typedSignatureHash")(typedData.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait EIP712TypedData extends StObject {
    
    var name: String
    
    var `type`: String
    
    var value: Any
  }
  object EIP712TypedData {
    
    inline def apply(name: String, `type`: String, value: Any): EIP712TypedData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EIP712TypedData]
    }
    
    extension [Self <: EIP712TypedData](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait EthEncryptedData extends StObject {
    
    var ciphertext: String
    
    var ephemPublicKey: String
    
    var nonce: String
    
    var version: String
  }
  object EthEncryptedData {
    
    inline def apply(ciphertext: String, ephemPublicKey: String, nonce: String, version: String): EthEncryptedData = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ephemPublicKey = ephemPublicKey.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[EthEncryptedData]
    }
    
    extension [Self <: EthEncryptedData](x: Self) {
      
      inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setEphemPublicKey(value: String): Self = StObject.set(x, "ephemPublicKey", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageTypeProperty extends StObject {
    
    var name: String
    
    var `type`: String
  }
  object MessageTypeProperty {
    
    inline def apply(name: String, `type`: String): MessageTypeProperty = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageTypeProperty]
    }
    
    extension [Self <: MessageTypeProperty](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageTypes
    extends StObject
       with /* additionalProperties */ StringDictionary[js.Array[MessageTypeProperty]] {
    
    var EIP712Domain: js.Array[MessageTypeProperty]
  }
  object MessageTypes {
    
    inline def apply(EIP712Domain: js.Array[MessageTypeProperty]): MessageTypes = {
      val __obj = js.Dynamic.literal(EIP712Domain = EIP712Domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageTypes]
    }
    
    extension [Self <: MessageTypes](x: Self) {
      
      inline def setEIP712Domain(value: js.Array[MessageTypeProperty]): Self = StObject.set(x, "EIP712Domain", value.asInstanceOf[js.Any])
      
      inline def setEIP712DomainVarargs(value: MessageTypeProperty*): Self = StObject.set(x, "EIP712Domain", js.Array(value*))
    }
  }
  
  trait MsgParams[D] extends StObject {
    
    var data: D
    
    var sig: js.UndefOr[String] = js.undefined
  }
  object MsgParams {
    
    inline def apply[D](data: D): MsgParams[D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsgParams[D]]
    }
    
    extension [Self <: MsgParams[?], D](x: Self & MsgParams[D]) {
      
      inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
      
      inline def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
    }
  }
  
  /* Inlined std.Required<eth-sig-util.eth-sig-util/dist.MsgParams<D>> */
  trait SignedMsgParams[D] extends StObject {
    
    var data: D
    
    var sig: String
  }
  object SignedMsgParams {
    
    inline def apply[D](data: D, sig: String): SignedMsgParams[D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedMsgParams[D]]
    }
    
    extension [Self <: SignedMsgParams[?], D](x: Self & SignedMsgParams[D]) {
      
      inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    }
  }
  
  type TypedData = String | EIP712TypedData | js.Array[EIP712TypedData]
  
  trait TypedMessage[T /* <: MessageTypes */] extends StObject {
    
    var domain: ChainId
    
    var message: Record[String, Any]
    
    var primaryType: /* keyof T */ String
    
    var types: T
  }
  object TypedMessage {
    
    inline def apply[T /* <: MessageTypes */](domain: ChainId, message: Record[String, Any], primaryType: /* keyof T */ String, types: T): TypedMessage[T] = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], primaryType = primaryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedMessage[T]]
    }
    
    extension [Self <: TypedMessage[?], T /* <: MessageTypes */](x: Self & TypedMessage[T]) {
      
      inline def setDomain(value: ChainId): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Record[String, Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPrimaryType(value: /* keyof T */ String): Self = StObject.set(x, "primaryType", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: T): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethSigUtil.ethSigUtilStrings.V1
    - typings.ethSigUtil.ethSigUtilStrings.V2
    - typings.ethSigUtil.ethSigUtilStrings.V3
    - typings.ethSigUtil.ethSigUtilStrings.V4
  */
  trait Version extends StObject
  object Version {
    
    inline def V1: typings.ethSigUtil.ethSigUtilStrings.V1 = "V1".asInstanceOf[typings.ethSigUtil.ethSigUtilStrings.V1]
    
    inline def V2: typings.ethSigUtil.ethSigUtilStrings.V2 = "V2".asInstanceOf[typings.ethSigUtil.ethSigUtilStrings.V2]
    
    inline def V3: typings.ethSigUtil.ethSigUtilStrings.V3 = "V3".asInstanceOf[typings.ethSigUtil.ethSigUtilStrings.V3]
    
    inline def V4: typings.ethSigUtil.ethSigUtilStrings.V4 = "V4".asInstanceOf[typings.ethSigUtil.ethSigUtilStrings.V4]
  }
}
