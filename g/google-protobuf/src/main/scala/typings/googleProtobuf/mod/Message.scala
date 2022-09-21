package typings.googleProtobuf.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.anon.Instantiable
import typings.googleProtobuf.anon.TypeofMessage
import typings.googleProtobuf.mod.Message.MessageArray
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
    setExtensionFn: js.Function2[/* fieldInfo */ ExtensionFieldInfo[Any], /* val */ Any, Unit]
  ): Unit = js.native
  
  def serializeBinary(): js.typedarray.Uint8Array = js.native
  
  def serializeBinaryExtensions(
    proto: Message,
    writer: BinaryWriter,
    extensions: NumberDictionary[ExtensionFieldBinaryInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[Any], Any]
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
  
  inline def addToRepeatedField(msg: Message, fieldNumber: Double, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addToRepeatedField(msg: Message, fieldNumber: Double, value: Any, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T, ctor: Instantiable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T, ctor: Instantiable[T], index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: Unit, ctor: Instantiable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: Unit, ctor: Instantiable[T], index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def bytesAsB64(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesAsB64")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bytesAsU8(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesAsU8")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def bytesListAsB64(bytesList: js.Array[js.typedarray.Uint8Array]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesListAsB64")(bytesList.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def bytesListAsU8(strList: js.Array[String]): js.Array[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesListAsU8")(strList.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.typedarray.Uint8Array]]
  
  inline def clone[T /* <: Message */](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def cloneMessage[T /* <: Message */](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def compareExtensions(extension1: js.Object, extension2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareExtensions")(extension1.asInstanceOf[js.Any], extension2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareFields(field1: Any, field2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareFields")(field1.asInstanceOf[js.Any], field2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def computeOneofCase(msg: Message, oneof: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOneofCase")(msg.asInstanceOf[js.Any], oneof.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def copyInto(fromMessage: Message, toMessage: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyInto")(fromMessage.asInstanceOf[js.Any], toMessage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // These are `abstract static`, but that isn't allowed. Subclasses of Message will have these methods and properties
  // and not having them on Message makes using this class for its intended purpose quite difficult.
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  inline def deserializeBinaryFromReader(message: Message, reader: BinaryReader): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  inline def difference[T /* <: Message */](m1: T, m2: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def equals(m1: Message, m2: Message): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("google-protobuf", "Message.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf", "Message.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def getField(msg: Message, fieldNumber: Double): FieldValue | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[FieldValue | Null]
  
  inline def getFieldWithDefault[T](msg: Message, fieldNumber: Double, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldWithDefault")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getMapField(msg: Message, fieldNumber: Double, noLazyCreate: Boolean): Map[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMapField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], noLazyCreate.asInstanceOf[js.Any])).asInstanceOf[Map[Any, Any]]
  inline def getMapField(msg: Message, fieldNumber: Double, noLazyCreate: Boolean, valueCtor: TypeofMessage): Map[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMapField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], noLazyCreate.asInstanceOf[js.Any], valueCtor.asInstanceOf[js.Any])).asInstanceOf[Map[Any, Any]]
  
  inline def getOptionalFloatingPointField(msg: Message, fieldNumber: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptionalFloatingPointField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getRepeatedFloatingPointField(msg: Message, fieldNumber: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepeatedFloatingPointField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getRepeatedWrapperField[T /* <: Message */](msg: Message, ctor: Instantiable[T], fieldNumber: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepeatedWrapperField")(msg.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getWrapperField[T /* <: Message */](msg: Message, ctor: Instantiable[T], fieldNumber: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getWrapperField")(msg.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getWrapperField[T /* <: Message */](msg: Message, ctor: Instantiable[T], fieldNumber: Double, required: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getWrapperField")(msg.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def initialize(msg: Message, data: MessageArray, messageId: String, suggestedPivot: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: Null,
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: Unit,
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(msg: Message, data: MessageArray, messageId: Double, suggestedPivot: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: Null,
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: Unit,
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(msg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any], suggestedPivot.asInstanceOf[js.Any], repeatedFields.asInstanceOf[js.Any], oneofFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerMessageType(id: Double, constructor: TypeofMessage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMessageType")(id.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def serializeBinaryToWriter(message: Message, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setField(msg: Message, fieldNumber: Double, value: FieldValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOneofField(msg: Message, fieldNumber: Double, oneof: js.Array[Double], value: FieldValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOneofField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], oneof.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOneofWrapperField(msg: Message, fieldNumber: Double, oneof: js.Array[Double], value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOneofWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], oneof.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: js.Array[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRepeatedWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: Map[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWrapperField")(msg.asInstanceOf[js.Any], fieldNumber.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toMap(field: js.Array[Any], mapKeyGetterFn: js.Function1[/* field */ Any, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(field.asInstanceOf[js.Any], mapKeyGetterFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toMap(
    field: js.Array[Any],
    mapKeyGetterFn: js.Function1[/* field */ Any, String],
    toObjectFn: Unit,
    includeInstance: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(field.asInstanceOf[js.Any], mapKeyGetterFn.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any], includeInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toMap(
    field: js.Array[Any],
    mapKeyGetterFn: js.Function1[/* field */ Any, String],
    toObjectFn: StaticToObject
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(field.asInstanceOf[js.Any], mapKeyGetterFn.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toMap(
    field: js.Array[Any],
    mapKeyGetterFn: js.Function1[/* field */ Any, String],
    toObjectFn: StaticToObject,
    includeInstance: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(field.asInstanceOf[js.Any], mapKeyGetterFn.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any], includeInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: Message): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def toObjectExtension(
    msg: Message,
    obj: js.Object,
    extensions: NumberDictionary[ExtensionFieldInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[this.type], this.type]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toObjectExtension")(msg.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], getExtensionFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toObjectExtension(
    msg: Message,
    obj: js.Object,
    extensions: NumberDictionary[ExtensionFieldInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[this.type], this.type],
    includeInstance: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toObjectExtension")(msg.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], getExtensionFn.asInstanceOf[js.Any], includeInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObjectList[T /* <: Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ Boolean, /* data */ T, js.Object]
  ): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObjectList")(field.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def toObjectList[T /* <: Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ Boolean, /* data */ T, js.Object],
    includeInstance: Boolean
  ): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObjectList")(field.asInstanceOf[js.Any], toObjectFn.asInstanceOf[js.Any], includeInstance.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
  type MessageArray = js.Array[Any]
  
  // This type needs to reference itself
  type StaticToObject = js.Function2[/* includeInstance */ Boolean, /* msg */ Message, js.Object]
}
