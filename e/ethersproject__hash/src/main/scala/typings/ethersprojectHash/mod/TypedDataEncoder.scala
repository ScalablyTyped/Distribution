package typings.ethersprojectHash.mod

import typings.ethersprojectAbstractSigner.mod.TypedDataDomain
import typings.ethersprojectAbstractSigner.mod.TypedDataField
import typings.ethersprojectHash.anon.Domain
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/hash", "_TypedDataEncoder")
@js.native
class TypedDataEncoder protected ()
  extends typings.ethersprojectHash.typedDataMod.TypedDataEncoder {
  def this(types: Record[String, js.Array[TypedDataField]]) = this()
}
/* static members */
@JSImport("@ethersproject/hash", "_TypedDataEncoder")
@js.native
object TypedDataEncoder extends js.Object {
  
  def encode(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
  
  def from(types: Record[String, js.Array[TypedDataField]]): typings.ethersprojectHash.typedDataMod.TypedDataEncoder = js.native
  
  def getPayload(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): js.Any = js.native
  
  def getPrimaryType(types: Record[String, js.Array[TypedDataField]]): String = js.native
  
  def hash(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
  
  def hashDomain(domain: TypedDataDomain): String = js.native
  
  def hashStruct(name: String, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
  
  def resolveNames(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, _],
    resolveName: js.Function1[/* name */ String, js.Promise[String]]
  ): js.Promise[Domain] = js.native
}
