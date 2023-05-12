package typings.ethers

import typings.ethers.anon.Domain
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHashTypedDataMod {
  
  @JSImport("ethers/types/hash/typed-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/hash/typed-data", "TypedDataEncoder")
  @js.native
  open class TypedDataEncoder protected () extends StObject {
    def this(types: Record[String, js.Array[TypedDataField]]) = this()
    
    def _visit(`type`: String, value: Any, callback: js.Function2[/* type */ String, /* data */ Any, Any]): Any = js.native
    
    def encode(value: Record[String, Any]): String = js.native
    
    def encodeData(`type`: String, value: Any): String = js.native
    
    def encodeType(name: String): String = js.native
    
    def getEncoder(`type`: String): js.Function1[/* value */ Any, String] = js.native
    
    def hash(value: Record[String, Any]): String = js.native
    
    def hashStruct(name: String, value: Record[String, Any]): String = js.native
    
    val primaryType: String = js.native
    
    /* private */ var `private`: Any = js.native
    
    def types: Record[String, js.Array[TypedDataField]] = js.native
    
    def visit(value: Record[String, Any], callback: js.Function2[/* type */ String, /* data */ Any, Any]): Any = js.native
  }
  /* static members */
  object TypedDataEncoder {
    
    @JSImport("ethers/types/hash/typed-data", "TypedDataEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def encode(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def from(types: Record[String, js.Array[TypedDataField]]): TypedDataEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(types.asInstanceOf[js.Any]).asInstanceOf[TypedDataEncoder]
    
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
  
  inline def verifyTypedData(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any],
    signature: SignatureLike
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTypedData")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait TypedDataDomain extends StObject {
    
    var chainId: js.UndefOr[Null | BigNumberish] = js.undefined
    
    var name: js.UndefOr[Null | String] = js.undefined
    
    var salt: js.UndefOr[Null | BytesLike] = js.undefined
    
    var verifyingContract: js.UndefOr[Null | String] = js.undefined
    
    var version: js.UndefOr[Null | String] = js.undefined
  }
  object TypedDataDomain {
    
    inline def apply(): TypedDataDomain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypedDataDomain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypedDataDomain] (val x: Self) extends AnyVal {
      
      inline def setChainId(value: BigNumberish): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdNull: Self = StObject.set(x, "chainId", null)
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSalt(value: BytesLike): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltNull: Self = StObject.set(x, "salt", null)
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setVerifyingContract(value: String): Self = StObject.set(x, "verifyingContract", value.asInstanceOf[js.Any])
      
      inline def setVerifyingContractNull: Self = StObject.set(x, "verifyingContract", null)
      
      inline def setVerifyingContractUndefined: Self = StObject.set(x, "verifyingContract", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait TypedDataField extends StObject {
    
    var name: String
    
    var `type`: String
  }
  object TypedDataField {
    
    inline def apply(name: String, `type`: String): TypedDataField = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedDataField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypedDataField] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
