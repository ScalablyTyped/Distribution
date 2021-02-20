package typings.ethersprojectHash

import typings.ethersprojectAbstractSigner.mod.TypedDataDomain
import typings.ethersprojectAbstractSigner.mod.TypedDataField
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectHash.anon.Domain
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/hash", "_TypedDataEncoder")
  @js.native
  class TypedDataEncoder protected ()
    extends typings.ethersprojectHash.typedDataMod.TypedDataEncoder {
    def this(types: Record[String, js.Array[TypedDataField]]) = this()
  }
  /* static members */
  object TypedDataEncoder {
    
    @JSImport("@ethersproject/hash", "_TypedDataEncoder.encode")
    @js.native
    def encode(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
    
    @JSImport("@ethersproject/hash", "_TypedDataEncoder.from")
    @js.native
    def from(types: Record[String, js.Array[TypedDataField]]): typings.ethersprojectHash.typedDataMod.TypedDataEncoder = js.native
    
    @JSImport("@ethersproject/hash", "_TypedDataEncoder.getPayload")
    @js.native
    def getPayload(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): js.Any = js.native
    
    @JSImport("@ethersproject/hash", "_TypedDataEncoder.getPrimaryType")
    @js.native
    def getPrimaryType(types: Record[String, js.Array[TypedDataField]]): String = js.native
    
    @JSImport("@ethersproject/hash", "_TypedDataEncoder.hash")
    @js.native
    def hash(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
    
    @JSImport("@ethersproject/hash", "_TypedDataEncoder.hashDomain")
    @js.native
    def hashDomain(domain: TypedDataDomain): String = js.native
    
    @JSImport("@ethersproject/hash", "_TypedDataEncoder.hashStruct")
    @js.native
    def hashStruct(name: String, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
    
    @JSImport("@ethersproject/hash", "_TypedDataEncoder.resolveNames")
    @js.native
    def resolveNames(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, _],
      resolveName: js.Function1[/* name */ String, js.Promise[String]]
    ): js.Promise[Domain] = js.native
  }
  
  @JSImport("@ethersproject/hash", "hashMessage")
  @js.native
  def hashMessage(message: String): String = js.native
  @JSImport("@ethersproject/hash", "hashMessage")
  @js.native
  def hashMessage(message: Bytes): String = js.native
  
  @JSImport("@ethersproject/hash", "id")
  @js.native
  def id(text: String): String = js.native
  
  @JSImport("@ethersproject/hash", "isValidName")
  @js.native
  def isValidName(name: String): Boolean = js.native
  
  @JSImport("@ethersproject/hash", "messagePrefix")
  @js.native
  val messagePrefix: /* "\\u0019Ethereum Signed Message:\n" */ String = js.native
  
  @JSImport("@ethersproject/hash", "namehash")
  @js.native
  def namehash(name: String): String = js.native
}
