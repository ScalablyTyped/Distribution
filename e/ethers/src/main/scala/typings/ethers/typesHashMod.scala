package typings.ethers

import typings.ethers.anon.Domain
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesHashTypedDataMod.TypedDataDomain
import typings.ethers.typesHashTypedDataMod.TypedDataField
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHashMod {
  
  @JSImport("ethers/types/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/hash", "TypedDataEncoder")
  @js.native
  open class TypedDataEncoder protected ()
    extends typings.ethers.typesHashTypedDataMod.TypedDataEncoder {
    def this(types: Record[String, js.Array[TypedDataField]]) = this()
  }
  /* static members */
  object TypedDataEncoder {
    
    @JSImport("ethers/types/hash", "TypedDataEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def encode(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def from(types: Record[String, js.Array[TypedDataField]]): typings.ethers.typesHashTypedDataMod.TypedDataEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(types.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesHashTypedDataMod.TypedDataEncoder]
    
    inline def getPayload(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getPrimaryType(types: Record[String, js.Array[TypedDataField]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrimaryType")(types.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hash(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def hashDomain(domain: TypedDataDomain): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hashStruct(name: String, types: Record[String, js.Array[TypedDataField]], value: Record[String, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStruct")(name.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def resolveNames(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any],
      resolveName: js.Function1[/* name */ String, js.Promise[String]]
    ): js.Promise[Domain] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNames")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolveName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Domain]]
  }
  
  inline def dnsEncode(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsEncode")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensNormalize(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensNormalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hashMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hashMessage(message: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def id(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidName(name: String): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(name.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def namehash(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("namehash")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def solidityPacked(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityPacked")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def solidityPackedKeccak256(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityPackedKeccak256")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def solidityPackedSha256(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityPackedSha256")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verifyMessage(message: String, sig: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], sig.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def verifyMessage(message: js.typedarray.Uint8Array, sig: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], sig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verifyTypedData(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any],
    signature: SignatureLike
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTypedData")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
}
