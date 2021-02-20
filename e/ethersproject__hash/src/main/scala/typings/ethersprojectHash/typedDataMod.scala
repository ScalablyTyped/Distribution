package typings.ethersprojectHash

import typings.ethersprojectAbstractSigner.mod.TypedDataDomain
import typings.ethersprojectAbstractSigner.mod.TypedDataField
import typings.ethersprojectHash.anon.Domain
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedDataMod {
  
  @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder")
  @js.native
  class TypedDataEncoder protected () extends StObject {
    def this(types: Record[String, js.Array[TypedDataField]]) = this()
    
    val _encoderCache: Record[String, js.Function1[/* value */ _, String]] = js.native
    
    def _getEncoder(`type`: String): js.Function1[/* value */ js.Any, String] = js.native
    
    val _types: Record[String, String] = js.native
    
    def _visit(`type`: String, value: js.Any, callback: js.Function2[/* type */ String, /* data */ js.Any, _]): js.Any = js.native
    
    def encode(value: Record[String, _]): String = js.native
    
    def encodeData(`type`: String, value: js.Any): String = js.native
    
    def encodeType(name: String): String = js.native
    
    def getEncoder(`type`: String): js.Function1[/* value */ js.Any, String] = js.native
    
    def hash(value: Record[String, _]): String = js.native
    
    def hashStruct(name: String, value: Record[String, _]): String = js.native
    
    val primaryType: String = js.native
    
    val types: Record[String, js.Array[TypedDataField]] = js.native
    
    def visit(value: Record[String, _], callback: js.Function2[/* type */ String, /* data */ js.Any, _]): js.Any = js.native
  }
  /* static members */
  object TypedDataEncoder {
    
    @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder.encode")
    @js.native
    def encode(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
    
    @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder.from")
    @js.native
    def from(types: Record[String, js.Array[TypedDataField]]): TypedDataEncoder = js.native
    
    @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder.getPayload")
    @js.native
    def getPayload(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): js.Any = js.native
    
    @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder.getPrimaryType")
    @js.native
    def getPrimaryType(types: Record[String, js.Array[TypedDataField]]): String = js.native
    
    @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder.hash")
    @js.native
    def hash(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
    
    @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder.hashDomain")
    @js.native
    def hashDomain(domain: TypedDataDomain): String = js.native
    
    @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder.hashStruct")
    @js.native
    def hashStruct(name: String, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
    
    @JSImport("@ethersproject/hash/lib/typed-data", "TypedDataEncoder.resolveNames")
    @js.native
    def resolveNames(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, _],
      resolveName: js.Function1[/* name */ String, js.Promise[String]]
    ): js.Promise[Domain] = js.native
  }
}
