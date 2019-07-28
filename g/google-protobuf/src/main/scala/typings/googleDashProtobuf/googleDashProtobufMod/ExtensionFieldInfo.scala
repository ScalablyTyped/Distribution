package typings.googleDashProtobuf.googleDashProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashProtobuf.TypeofClassMessageAddToRepeatedField
import typings.googleDashProtobuf.googleDashProtobufMod.MessageNs.StaticToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "ExtensionFieldInfo")
@js.native
class ExtensionFieldInfo[T] protected () extends js.Object {
  def this(
    fieldIndex: Double,
    fieldName: StringDictionary[Double],
    ctor: TypeofClassMessageAddToRepeatedField,
    toObjectFn: StaticToObject,
    isRepeated: Double
  ) = this()
  var ctor: TypeofClassMessageAddToRepeatedField = js.native
  var fieldIndex: Double = js.native
  var fieldName: Double = js.native
  var isRepeated: Double = js.native
  @JSName("toObjectFn")
  var toObjectFn_Original: StaticToObject = js.native
  def isMessageType(): Boolean = js.native
  def toObjectFn(includeInstance: Boolean, msg: Message): js.Object = js.native
}

