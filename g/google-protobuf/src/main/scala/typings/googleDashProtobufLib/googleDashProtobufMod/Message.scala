package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "Message")
@js.native
abstract class Message () extends js.Object {
  def cloneMessage(): Message = js.native
  def getExtension[T](fieldInfo: ExtensionFieldInfo[T]): T = js.native
  def getJsPbMessageId(): js.UndefOr[java.lang.String] = js.native
  def readBinaryExtension(
    proto: Message,
    reader: BinaryReader,
    extensions: org.scalablytyped.runtime.NumberDictionary[ExtensionFieldBinaryInfo[Message]],
    setExtensionFn: js.Function2[/* fieldInfo */ ExtensionFieldInfo[_], /* val */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def serializeBinary(): stdLib.Uint8Array = js.native
  def serializeBinaryExtensions(
    proto: Message,
    writer: BinaryWriter,
    extensions: org.scalablytyped.runtime.NumberDictionary[ExtensionFieldBinaryInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[_], _]
  ): scala.Unit = js.native
  def setExtension[T](fieldInfo: ExtensionFieldInfo[T], value: T): scala.Unit = js.native
  def toArray(): googleDashProtobufLib.googleDashProtobufMod.MessageNs.MessageArray = js.native
  def toObject(): js.Object = js.native
  def toObject(includeInstance: scala.Boolean): js.Object = js.native
}

/* static members */
@JSImport("google-protobuf", "Message")
@js.native
object Message extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def addToRepeatedField(msg: googleDashProtobufLib.googleDashProtobufMod.Message, fieldNumber: scala.Double, value: js.Any): scala.Unit = js.native
  def addToRepeatedField(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    value: js.Any,
    index: scala.Double
  ): scala.Unit = js.native
  def addToRepeatedWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    value: T,
    ctor: googleDashProtobufLib.Anon_T[T]
  ): T = js.native
  def addToRepeatedWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    value: T,
    ctor: googleDashProtobufLib.Anon_T[T],
    index: scala.Double
  ): T = js.native
  def addToRepeatedWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    value: js.UndefOr[scala.Nothing],
    ctor: googleDashProtobufLib.Anon_T[T]
  ): T = js.native
  def addToRepeatedWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    value: js.UndefOr[scala.Nothing],
    ctor: googleDashProtobufLib.Anon_T[T],
    index: scala.Double
  ): T = js.native
  def bytesAsB64(bytes: stdLib.Uint8Array): java.lang.String = js.native
  def bytesAsU8(str: java.lang.String): stdLib.Uint8Array = js.native
  def bytesListAsB64(bytesList: js.Array[stdLib.Uint8Array]): js.Array[java.lang.String] = js.native
  def bytesListAsU8(strList: js.Array[java.lang.String]): js.Array[stdLib.Uint8Array] = js.native
  def clone[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](msg: T): T = js.native
  def cloneMessage[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](msg: T): T = js.native
  def compareExtensions(extension1: js.Object, extension2: js.Object): scala.Boolean = js.native
  def compareFields(field1: js.Any, field2: js.Any): scala.Boolean = js.native
  def computeOneofCase(msg: googleDashProtobufLib.googleDashProtobufMod.Message, oneof: js.Array[scala.Double]): scala.Double = js.native
  def copyInto(
    fromMessage: googleDashProtobufLib.googleDashProtobufMod.Message,
    toMessage: googleDashProtobufLib.googleDashProtobufMod.Message
  ): scala.Unit = js.native
  // These are `abstract static`, but that isn't allowed. Subclasses of Message will have these methods and properties
  // and not having them on Message makes using this class for its intended purpose quite difficult.
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleDashProtobufMod.Message = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleDashProtobufMod.Message,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleDashProtobufMod.Message = js.native
  def difference[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](m1: T, m2: T): T = js.native
  def equals(
    m1: googleDashProtobufLib.googleDashProtobufMod.Message,
    m2: googleDashProtobufLib.googleDashProtobufMod.Message
  ): scala.Boolean = js.native
  def getField(msg: googleDashProtobufLib.googleDashProtobufMod.Message, fieldNumber: scala.Double): googleDashProtobufLib.googleDashProtobufMod.FieldValue | scala.Null = js.native
  def getFieldWithDefault[T](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    defaultValue: T
  ): T = js.native
  def getMapField(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    noLazyCreate: scala.Boolean,
    valueCtor: googleDashProtobufLib.Anon_AddToRepeatedField
  ): googleDashProtobufLib.googleDashProtobufMod.Map[_, _] = js.native
  def getOptionalFloatingPointField(msg: googleDashProtobufLib.googleDashProtobufMod.Message, fieldNumber: scala.Double): js.UndefOr[scala.Double] = js.native
  def getRepeatedFloatingPointField(msg: googleDashProtobufLib.googleDashProtobufMod.Message, fieldNumber: scala.Double): js.Array[scala.Double] = js.native
  def getRepeatedWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    ctor: googleDashProtobufLib.Anon_T[T],
    fieldNumber: scala.Double
  ): js.Array[T] = js.native
  def getWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    ctor: googleDashProtobufLib.Anon_T[T],
    fieldNumber: scala.Double
  ): T = js.native
  def getWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    ctor: googleDashProtobufLib.Anon_T[T],
    fieldNumber: scala.Double,
    required: scala.Double
  ): T = js.native
  def initialize(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    data: googleDashProtobufLib.googleDashProtobufMod.MessageNs.MessageArray,
    messageId: java.lang.String,
    suggestedPivot: scala.Double
  ): scala.Unit = js.native
  def initialize(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    data: googleDashProtobufLib.googleDashProtobufMod.MessageNs.MessageArray,
    messageId: java.lang.String,
    suggestedPivot: scala.Double,
    repeatedFields: js.Array[scala.Double]
  ): scala.Unit = js.native
  def initialize(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    data: googleDashProtobufLib.googleDashProtobufMod.MessageNs.MessageArray,
    messageId: java.lang.String,
    suggestedPivot: scala.Double,
    repeatedFields: js.Array[scala.Double],
    oneofFields: js.Array[js.Array[scala.Double]]
  ): scala.Unit = js.native
  def initialize(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    data: googleDashProtobufLib.googleDashProtobufMod.MessageNs.MessageArray,
    messageId: scala.Double,
    suggestedPivot: scala.Double
  ): scala.Unit = js.native
  def initialize(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    data: googleDashProtobufLib.googleDashProtobufMod.MessageNs.MessageArray,
    messageId: scala.Double,
    suggestedPivot: scala.Double,
    repeatedFields: js.Array[scala.Double]
  ): scala.Unit = js.native
  def initialize(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    data: googleDashProtobufLib.googleDashProtobufMod.MessageNs.MessageArray,
    messageId: scala.Double,
    suggestedPivot: scala.Double,
    repeatedFields: js.Array[scala.Double],
    oneofFields: js.Array[js.Array[scala.Double]]
  ): scala.Unit = js.native
  def registerMessageType(id: scala.Double, constructor: googleDashProtobufLib.Anon_AddToRepeatedField): scala.Unit = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleDashProtobufMod.Message,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def setField(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    value: googleDashProtobufLib.googleDashProtobufMod.FieldValue
  ): scala.Unit = js.native
  def setOneofField(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    oneof: js.Array[scala.Double],
    value: googleDashProtobufLib.googleDashProtobufMod.FieldValue
  ): scala.Unit = js.native
  def setOneofWrapperField(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    oneof: js.Array[scala.Double],
    value: js.Any
  ): scala.Unit = js.native
  def setRepeatedWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](msg: googleDashProtobufLib.googleDashProtobufMod.Message, fieldNumber: scala.Double): scala.Unit = js.native
  def setRepeatedWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    value: js.Array[T]
  ): scala.Unit = js.native
  def setWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](msg: googleDashProtobufLib.googleDashProtobufMod.Message, fieldNumber: scala.Double): scala.Unit = js.native
  def setWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](msg: googleDashProtobufLib.googleDashProtobufMod.Message, fieldNumber: scala.Double, value: T): scala.Unit = js.native
  def setWrapperField[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    fieldNumber: scala.Double,
    value: googleDashProtobufLib.googleDashProtobufMod.Map[_, _]
  ): scala.Unit = js.native
  def toMap(field: js.Array[_], mapKeyGetterFn: js.Function1[/* field */ js.Any, java.lang.String]): scala.Unit = js.native
  def toMap(
    field: js.Array[_],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, java.lang.String],
    toObjectFn: googleDashProtobufLib.googleDashProtobufMod.MessageNs.StaticToObject
  ): scala.Unit = js.native
  def toMap(
    field: js.Array[_],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, java.lang.String],
    toObjectFn: googleDashProtobufLib.googleDashProtobufMod.MessageNs.StaticToObject,
    includeInstance: scala.Boolean
  ): scala.Unit = js.native
  def toObject(includeInstance: scala.Boolean, msg: googleDashProtobufLib.googleDashProtobufMod.Message): js.Object = js.native
  def toObjectExtension(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    obj: js.Object,
    extensions: org.scalablytyped.runtime.NumberDictionary[
      googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
    ],
    getExtensionFn: js.Function1[
      /* fieldInfo */ googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[this.type], 
      this.type
    ]
  ): scala.Unit = js.native
  def toObjectExtension(
    msg: googleDashProtobufLib.googleDashProtobufMod.Message,
    obj: js.Object,
    extensions: org.scalablytyped.runtime.NumberDictionary[
      googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
    ],
    getExtensionFn: js.Function1[
      /* fieldInfo */ googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[this.type], 
      this.type
    ],
    includeInstance: scala.Boolean
  ): scala.Unit = js.native
  def toObjectList[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ scala.Boolean, /* data */ T, js.Object]
  ): js.Array[js.Object] = js.native
  def toObjectList[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ scala.Boolean, /* data */ T, js.Object],
    includeInstance: scala.Boolean
  ): js.Array[js.Object] = js.native
}

