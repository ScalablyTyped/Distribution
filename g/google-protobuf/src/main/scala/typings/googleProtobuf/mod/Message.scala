package typings.googleProtobuf.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.anon.Instantiable
import typings.googleProtobuf.anon.TypeofMessage
import typings.googleProtobuf.mod.Message.MessageArray
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "Message")
@js.native
abstract class Message () extends StObject {
  
  def cloneMessage(): this.type = js.native
  
  def getExtension[T](fieldInfo: ExtensionFieldInfo[T]): T = js.native
  
  def getJsPbMessageId(): js.UndefOr[String] = js.native
  
  def readBinaryExtension(
    proto: Message,
    reader: BinaryReader,
    extensions: NumberDictionary[ExtensionFieldBinaryInfo[Message]],
    setExtensionFn: js.Function2[/* fieldInfo */ ExtensionFieldInfo[js.Any], /* val */ js.Any, Unit]
  ): Unit = js.native
  
  def serializeBinary(): Uint8Array = js.native
  
  def serializeBinaryExtensions(
    proto: Message,
    writer: BinaryWriter,
    extensions: NumberDictionary[ExtensionFieldBinaryInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[js.Any], js.Any]
  ): Unit = js.native
  
  def setExtension[T](fieldInfo: ExtensionFieldInfo[T], value: T): Unit = js.native
  
  def toArray(): MessageArray = js.native
  
  def toObject(): js.Object = js.native
  def toObject(includeInstance: Boolean): js.Object = js.native
}
/* static members */
object Message {
  
  @JSImport("google-protobuf", "Message")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addToRepeatedField(msg: Message, fieldNumber: Double, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addToRepeatedField(msg: Message, fieldNumber: Double, value: js.Any, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T, ctor: Instantiable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T, ctor: Instantiable[T], index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: Unit, ctor: Instantiable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: Unit, ctor: Instantiable[T], index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def bytesAsB64(bytes: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesAsB64")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def bytesAsU8(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesAsU8")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def bytesListAsB64(bytesList: js.Array[Uint8Array]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesListAsB64")(bytesList.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def bytesListAsU8(strList: js.Array[String]): js.Array[Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesListAsU8")(strList.asInstanceOf[js.Any]).asInstanceOf[js.Array[Uint8Array]]
  
  @scala.inline
  def clone[T /* <: Message */](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def cloneMessage[T /* <: Message */](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def compareExtensions(extension1: js.Object, extension2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareExtensions")(extension1.asInstanceOf[js.Any], extension2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def compareFields(field1: js.Any, field2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareFields")(field1.asInstanceOf[js.Any], field2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def computeOneofCase(msg: Message, oneof: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOneofCase")(msg.asInstanceOf[js.Any], oneof.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def copyInto(fromMessage: Message, toMessage: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyInto")(fromMessage.asInstanceOf[js.Any], toMessage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // These are `abstract static`, but that isn't allowed. Subclasses of Message will have these methods and properties
  // and not having them on Message makes using this class for its intended purpose quite difficult.
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  @scala.inline
  def deserializeBinaryFromReader(message: Message, reader: BinaryReader): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def difference[T /* <: Message */](m1: T, m2: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def equals(m1: Message, m2: Message): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("google-protobuf", "Message.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf", "Message.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getField(msg: Message, fieldNumber: Double): FieldValue | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[FieldValue | Null]
  
  @scala.inline
  def getFieldWithDefault[T](msg: Message, fieldNumber: Double, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldWithDefault")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def getMapField(msg: Message, fieldNumber: Double, noLazyCreate: Boolean, valueCtor: TypeofMessage): Map[js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMapField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], noLazyCreate.asInstanceOf[js.Any], valueCtor.asInstanceOf[js.Any])).asInstanceOf[Map[js.Any, js.Any]]
  
  @scala.inline
  def getOptionalFloatingPointField(msg: Message, fieldNumber: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptionalFloatingPointField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def getRepeatedFloatingPointField(msg: Message, fieldNumber: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepeatedFloatingPointField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getRepeatedWrapperField[T /* <: Message */](msg: Message, ctor: Instantiable[T], fieldNumber: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepeatedWrapperField")(msg.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def getWrapperField[T /* <: Message */](msg: Message, ctor: Instantiable[T], fieldNumber: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getWrapperField")(msg.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def getWrapperField[T /* <: Message */](msg: Message, ctor: Instantiable[T], fieldNumber: Double, required: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getWrapperField")(msg.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def initialize(msg: Message, data: MessageArray, messageId: String, suggestedPivot: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: Unit,
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def initialize(msg: Message, data: MessageArray, messageId: Double, suggestedPivot: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: Unit,
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerMessageType(id: Double, constructor: TypeofMessage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMessageType")(id.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def serializeBinaryToWriter(message: Message, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setField(msg: Message, fieldNumber: Double, value: FieldValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setOneofField(msg: Message, fieldNumber: Double, oneof: js.Array[Double], value: FieldValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOneofField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], oneof.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setOneofWrapperField(msg: Message, fieldNumber: Double, oneof: js.Array[Double], value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOneofWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], oneof.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: js.Array[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: Map[js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toMap(field: js.Array[js.Any], mapKeyGetterFn: js.Function1[/* field */ js.Any, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(field.asInstanceOf[js.Any], mapKeyGetterFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def toMap(
    field: js.Array[js.Any],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, String],
    toObjectFn: Unit,
    includeInstance: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(field.asInstanceOf[js.Any], mapKeyGetterFn.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any], includeInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def toMap(
    field: js.Array[js.Any],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, String],
    toObjectFn: StaticToObject
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(field.asInstanceOf[js.Any], mapKeyGetterFn.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def toMap(
    field: js.Array[js.Any],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, String],
    toObjectFn: StaticToObject,
    includeInstance: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(field.asInstanceOf[js.Any], mapKeyGetterFn.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any], includeInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: Message): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def toObjectExtension(
    msg: Message,
    obj: js.Object,
    extensions: NumberDictionary[ExtensionFieldInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[this.type], this.type]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toObjectExtension")(msg.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], getExtensionFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def toObjectExtension(
    msg: Message,
    obj: js.Object,
    extensions: NumberDictionary[ExtensionFieldInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[this.type], this.type],
    includeInstance: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toObjectExtension")(msg.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], getExtensionFn.asInstanceOf[js.Any], includeInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObjectList[T /* <: Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ Boolean, /* data */ T, js.Object]
  ): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObjectList")(field.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def toObjectList[T /* <: Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ Boolean, /* data */ T, js.Object],
    includeInstance: Boolean
  ): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObjectList")(field.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any], includeInstance.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
  type MessageArray = js.Array[js.Any]
  
  // This type needs to reference itself
  type StaticToObject = js.Function2[/* includeInstance */ Boolean, /* msg */ Message, js.Object]
}
