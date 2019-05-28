package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "ExtensionFieldInfo")
@js.native
class ExtensionFieldInfo[T] protected () extends js.Object {
  def this(fieldIndex: scala.Double, fieldName: org.scalablytyped.runtime.StringDictionary[scala.Double], ctor: googleDashProtobufLib.TypeofClassMessageAddToRepeatedField, toObjectFn: googleDashProtobufLib.googleDashProtobufMod.MessageNs.StaticToObject, isRepeated: scala.Double) = this()
  var ctor: googleDashProtobufLib.TypeofClassMessageAddToRepeatedField = js.native
  var fieldIndex: scala.Double = js.native
  var fieldName: scala.Double = js.native
  var isRepeated: scala.Double = js.native
  @JSName("toObjectFn")
  var toObjectFn_Original: googleDashProtobufLib.googleDashProtobufMod.MessageNs.StaticToObject = js.native
  def isMessageType(): scala.Boolean = js.native
  def toObjectFn(includeInstance: scala.Boolean, msg: Message): js.Object = js.native
}

