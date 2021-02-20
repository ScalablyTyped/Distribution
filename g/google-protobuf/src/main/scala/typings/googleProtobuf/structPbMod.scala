package typings.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Map
import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.structPbMod.Value.KindCase
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structPbMod {
  
  @JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
  @js.native
  class ListValue () extends Message {
    
    def addValues(): Value = js.native
    def addValues(value: js.UndefOr[scala.Nothing], index: Double): Value = js.native
    def addValues(value: Value): Value = js.native
    def addValues(value: Value, index: Double): Value = js.native
    
    def clearValuesList(): ListValue = js.native
    
    def getValuesList(): js.Array[Value] = js.native
    
    def setValuesList(value: js.Array[Value]): ListValue = js.native
    
    def toJavaScript(): js.Array[JavaScriptValue] = js.native
  }
  /* static members */
  object ListValue {
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): ListValue = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ListValue, reader: BinaryReader): ListValue = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue.fromJavaScript")
    @js.native
    def fromJavaScript(value: js.Array[JavaScriptValue]): ListValue = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ListValue, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ListValue): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var valuesList: js.Array[typings.googleProtobuf.structPbMod.Value.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(valuesList: js.Array[typings.googleProtobuf.structPbMod.Value.AsObject]): AsObject = {
        val __obj = js.Dynamic.literal(valuesList = valuesList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValuesList(value: js.Array[typings.googleProtobuf.structPbMod.Value.AsObject]): Self = StObject.set(x, "valuesList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesListVarargs(value: typings.googleProtobuf.structPbMod.Value.AsObject*): Self = StObject.set(x, "valuesList", js.Array(value :_*))
      }
    }
  }
  
  @js.native
  sealed trait NullValue extends StObject
  @JSImport("google-protobuf/google/protobuf/struct_pb", "NullValue")
  @js.native
  object NullValue extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NullValue with Double] = js.native
    
    @js.native
    sealed trait NULL_VALUE extends NullValue
    /* 0 */ val NULL_VALUE: typings.googleProtobuf.structPbMod.NullValue.NULL_VALUE with Double = js.native
  }
  
  @JSImport("google-protobuf/google/protobuf/struct_pb", "Struct")
  @js.native
  class Struct () extends Message {
    
    def clearFieldsMap(): Struct = js.native
    
    def getFieldsMap(): Map[String, Value] = js.native
    
    def toJavaScript(): StringDictionary[JavaScriptValue] = js.native
  }
  /* static members */
  object Struct {
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Struct")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Struct.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): Struct = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Struct.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: Struct, reader: BinaryReader): Struct = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Struct.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Struct.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Struct.fromJavaScript")
    @js.native
    def fromJavaScript(value: StringDictionary[JavaScriptValue]): Struct = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Struct.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: Struct, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Struct.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: Struct): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var fieldsMap: js.Array[js.Tuple2[String, typings.googleProtobuf.structPbMod.Value.AsObject]] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(fieldsMap: js.Array[js.Tuple2[String, typings.googleProtobuf.structPbMod.Value.AsObject]]): AsObject = {
        val __obj = js.Dynamic.literal(fieldsMap = fieldsMap.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFieldsMap(value: js.Array[js.Tuple2[String, typings.googleProtobuf.structPbMod.Value.AsObject]]): Self = StObject.set(x, "fieldsMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsMapVarargs(value: (js.Tuple2[String, typings.googleProtobuf.structPbMod.Value.AsObject])*): Self = StObject.set(x, "fieldsMap", js.Array(value :_*))
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
  @js.native
  class Value () extends Message {
    
    def clearBoolValue(): Value = js.native
    
    def clearListValue(): Value = js.native
    
    def clearNullValue(): Value = js.native
    
    def clearNumberValue(): Value = js.native
    
    def clearStringValue(): Value = js.native
    
    def clearStructValue(): Value = js.native
    
    def getBoolValue(): Boolean = js.native
    
    def getKindCase(): KindCase = js.native
    
    def getListValue(): js.UndefOr[ListValue] = js.native
    
    def getNullValue(): NullValue = js.native
    
    def getNumberValue(): Double = js.native
    
    def getStringValue(): String = js.native
    
    def getStructValue(): js.UndefOr[Struct] = js.native
    
    def hasBoolValue(): Boolean = js.native
    
    def hasListValue(): Boolean = js.native
    
    def hasNullValue(): Boolean = js.native
    
    def hasNumberValue(): Boolean = js.native
    
    def hasStringValue(): Boolean = js.native
    
    def hasStructValue(): Boolean = js.native
    
    def setBoolValue(value: Boolean): Value = js.native
    
    def setListValue(): Value = js.native
    def setListValue(value: ListValue): Value = js.native
    
    def setNullValue(value: NullValue): Value = js.native
    
    def setNumberValue(value: Double): Value = js.native
    
    def setStringValue(value: String): Value = js.native
    
    def setStructValue(): Value = js.native
    def setStructValue(value: Struct): Value = js.native
    
    def toJavaScript(): JavaScriptValue = js.native
  }
  /* static members */
  object Value {
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait KindCase extends StObject
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Value.KindCase")
    @js.native
    object KindCase extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[KindCase with Double] = js.native
      
      @js.native
      sealed trait BOOL_VALUE extends KindCase
      /* 4 */ val BOOL_VALUE: typings.googleProtobuf.structPbMod.Value.KindCase.BOOL_VALUE with Double = js.native
      
      @js.native
      sealed trait KIND_NOT_SET extends KindCase
      /* 0 */ val KIND_NOT_SET: typings.googleProtobuf.structPbMod.Value.KindCase.KIND_NOT_SET with Double = js.native
      
      @js.native
      sealed trait LIST_VALUE extends KindCase
      /* 6 */ val LIST_VALUE: typings.googleProtobuf.structPbMod.Value.KindCase.LIST_VALUE with Double = js.native
      
      @js.native
      sealed trait NULL_VALUE extends KindCase
      /* 1 */ val NULL_VALUE: typings.googleProtobuf.structPbMod.Value.KindCase.NULL_VALUE with Double = js.native
      
      @js.native
      sealed trait NUMBER_VALUE extends KindCase
      /* 2 */ val NUMBER_VALUE: typings.googleProtobuf.structPbMod.Value.KindCase.NUMBER_VALUE with Double = js.native
      
      @js.native
      sealed trait STRING_VALUE extends KindCase
      /* 3 */ val STRING_VALUE: typings.googleProtobuf.structPbMod.Value.KindCase.STRING_VALUE with Double = js.native
      
      @js.native
      sealed trait STRUCT_VALUE extends KindCase
      /* 5 */ val STRUCT_VALUE: typings.googleProtobuf.structPbMod.Value.KindCase.STRUCT_VALUE with Double = js.native
    }
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Value.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): Value = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Value.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: Value, reader: BinaryReader): Value = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Value.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Value.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Value.fromJavaScript")
    @js.native
    def fromJavaScript(value: JavaScriptValue): Value = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Value.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: Value, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/struct_pb", "Value.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: Value): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var boolValue: Boolean = js.native
      
      var listValue: js.UndefOr[typings.googleProtobuf.structPbMod.ListValue.AsObject] = js.native
      
      var nullValue: NullValue = js.native
      
      var numberValue: Double = js.native
      
      var stringValue: String = js.native
      
      var structValue: js.UndefOr[typings.googleProtobuf.structPbMod.Struct.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(boolValue: Boolean, nullValue: NullValue, numberValue: Double, stringValue: String): AsObject = {
        val __obj = js.Dynamic.literal(boolValue = boolValue.asInstanceOf[js.Any], nullValue = nullValue.asInstanceOf[js.Any], numberValue = numberValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListValue(value: typings.googleProtobuf.structPbMod.ListValue.AsObject): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListValueUndefined: Self = StObject.set(x, "listValue", js.undefined)
        
        @scala.inline
        def setNullValue(value: NullValue): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStructValue(value: typings.googleProtobuf.structPbMod.Struct.AsObject): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
      }
    }
  }
  
  type JavaScriptValue = Null | Double | String | Boolean | js.Array[js.Any] | js.Object
}
