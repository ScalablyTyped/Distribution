package typings.googleProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.googleProtobuf.anon.TypeofMessageInstantiable
import typings.googleProtobuf.mod.Message.StaticToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "ExtensionFieldInfo")
@js.native
class ExtensionFieldInfo[T] protected () extends StObject {
  def this(
    fieldIndex: Double,
    fieldName: StringDictionary[Double],
    ctor: TypeofMessageInstantiable,
    toObjectFn: StaticToObject,
    isRepeated: Double
  ) = this()
  
  var ctor: TypeofMessageInstantiable = js.native
  
  var fieldIndex: Double = js.native
  
  var fieldName: Double = js.native
  
  def isMessageType(): Boolean = js.native
  
  var isRepeated: Double = js.native
  
  def toObjectFn(includeInstance: Boolean, msg: Message): js.Object = js.native
  @JSName("toObjectFn")
  var toObjectFn_Original: StaticToObject = js.native
}
