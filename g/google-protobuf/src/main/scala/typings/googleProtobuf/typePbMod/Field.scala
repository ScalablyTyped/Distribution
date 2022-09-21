package typings.googleProtobuf.typePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.typePbMod.Field.Cardinality
import typings.googleProtobuf.typePbMod.Field.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "Field")
@js.native
open class Field () extends Message {
  
  def addOptions(): Option = js.native
  def addOptions(value: Unit, index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearOptionsList(): Field = js.native
  
  def getCardinality(): Cardinality = js.native
  
  def getDefaultValue(): String = js.native
  
  def getJsonName(): String = js.native
  
  def getKind(): Kind = js.native
  
  def getName(): String = js.native
  
  def getNumber(): Double = js.native
  
  def getOneofIndex(): Double = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getPacked(): Boolean = js.native
  
  def getTypeUrl(): String = js.native
  
  def setCardinality(value: Cardinality): Field = js.native
  
  def setDefaultValue(value: String): Field = js.native
  
  def setJsonName(value: String): Field = js.native
  
  def setKind(value: Kind): Field = js.native
  
  def setName(value: String): Field = js.native
  
  def setNumber(value: Double): Field = js.native
  
  def setOneofIndex(value: Double): Field = js.native
  
  def setOptionsList(value: js.Array[Option]): Field = js.native
  
  def setPacked(value: Boolean): Field = js.native
  
  def setTypeUrl(value: String): Field = js.native
}
/* static members */
object Field {
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Cardinality extends StObject
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.Cardinality")
  @js.native
  object Cardinality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Cardinality & Double] = js.native
    
    @js.native
    sealed trait CARDINALITY_OPTIONAL
      extends StObject
         with Cardinality
    /* 1 */ val CARDINALITY_OPTIONAL: typings.googleProtobuf.typePbMod.Field.Cardinality.CARDINALITY_OPTIONAL & Double = js.native
    
    @js.native
    sealed trait CARDINALITY_REPEATED
      extends StObject
         with Cardinality
    /* 3 */ val CARDINALITY_REPEATED: typings.googleProtobuf.typePbMod.Field.Cardinality.CARDINALITY_REPEATED & Double = js.native
    
    @js.native
    sealed trait CARDINALITY_REQUIRED
      extends StObject
         with Cardinality
    /* 2 */ val CARDINALITY_REQUIRED: typings.googleProtobuf.typePbMod.Field.Cardinality.CARDINALITY_REQUIRED & Double = js.native
    
    @js.native
    sealed trait CARDINALITY_UNKNOWN
      extends StObject
         with Cardinality
    /* 0 */ val CARDINALITY_UNKNOWN: typings.googleProtobuf.typePbMod.Field.Cardinality.CARDINALITY_UNKNOWN & Double = js.native
  }
  
  @js.native
  sealed trait Kind extends StObject
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.Kind")
  @js.native
  object Kind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Kind & Double] = js.native
    
    @js.native
    sealed trait TYPE_BOOL
      extends StObject
         with Kind
    /* 8 */ val TYPE_BOOL: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_BOOL & Double = js.native
    
    @js.native
    sealed trait TYPE_BYTES
      extends StObject
         with Kind
    /* 12 */ val TYPE_BYTES: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_BYTES & Double = js.native
    
    @js.native
    sealed trait TYPE_DOUBLE
      extends StObject
         with Kind
    /* 1 */ val TYPE_DOUBLE: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_DOUBLE & Double = js.native
    
    @js.native
    sealed trait TYPE_ENUM
      extends StObject
         with Kind
    /* 14 */ val TYPE_ENUM: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_ENUM & Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED32
      extends StObject
         with Kind
    /* 7 */ val TYPE_FIXED32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_FIXED32 & Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED64
      extends StObject
         with Kind
    /* 6 */ val TYPE_FIXED64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_FIXED64 & Double = js.native
    
    @js.native
    sealed trait TYPE_FLOAT
      extends StObject
         with Kind
    /* 2 */ val TYPE_FLOAT: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_FLOAT & Double = js.native
    
    @js.native
    sealed trait TYPE_GROUP
      extends StObject
         with Kind
    /* 10 */ val TYPE_GROUP: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_GROUP & Double = js.native
    
    @js.native
    sealed trait TYPE_INT32
      extends StObject
         with Kind
    /* 5 */ val TYPE_INT32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_INT32 & Double = js.native
    
    @js.native
    sealed trait TYPE_INT64
      extends StObject
         with Kind
    /* 3 */ val TYPE_INT64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_INT64 & Double = js.native
    
    @js.native
    sealed trait TYPE_MESSAGE
      extends StObject
         with Kind
    /* 11 */ val TYPE_MESSAGE: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_MESSAGE & Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED32
      extends StObject
         with Kind
    /* 15 */ val TYPE_SFIXED32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_SFIXED32 & Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED64
      extends StObject
         with Kind
    /* 16 */ val TYPE_SFIXED64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_SFIXED64 & Double = js.native
    
    @js.native
    sealed trait TYPE_SINT32
      extends StObject
         with Kind
    /* 17 */ val TYPE_SINT32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_SINT32 & Double = js.native
    
    @js.native
    sealed trait TYPE_SINT64
      extends StObject
         with Kind
    /* 18 */ val TYPE_SINT64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_SINT64 & Double = js.native
    
    @js.native
    sealed trait TYPE_STRING
      extends StObject
         with Kind
    /* 9 */ val TYPE_STRING: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_STRING & Double = js.native
    
    @js.native
    sealed trait TYPE_UINT32
      extends StObject
         with Kind
    /* 13 */ val TYPE_UINT32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_UINT32 & Double = js.native
    
    @js.native
    sealed trait TYPE_UINT64
      extends StObject
         with Kind
    /* 4 */ val TYPE_UINT64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_UINT64 & Double = js.native
    
    @js.native
    sealed trait TYPE_UNKNOWN
      extends StObject
         with Kind
    /* 0 */ val TYPE_UNKNOWN: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_UNKNOWN & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Field]
  
  inline def deserializeBinaryFromReader(message: Field, reader: BinaryReader): Field = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Field]
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: Field, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: Field): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var cardinality: Cardinality
    
    var defaultValue: String
    
    var jsonName: String
    
    var kind: Kind
    
    var name: String
    
    var number: Double
    
    var oneofIndex: Double
    
    var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]
    
    var packed: Boolean
    
    var typeUrl: String
  }
  object AsObject {
    
    inline def apply(
      cardinality: Cardinality,
      defaultValue: String,
      jsonName: String,
      kind: Kind,
      name: String,
      number: Double,
      oneofIndex: Double,
      optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject],
      packed: Boolean,
      typeUrl: String
    ): AsObject = {
      val __obj = js.Dynamic.literal(cardinality = cardinality.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], jsonName = jsonName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], oneofIndex = oneofIndex.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], typeUrl = typeUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setCardinality(value: Cardinality): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
      
      inline def setOptionsList(value: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]): Self = StObject.set(x, "optionsList", value.asInstanceOf[js.Any])
      
      inline def setOptionsListVarargs(value: typings.googleProtobuf.typePbMod.Option.AsObject*): Self = StObject.set(x, "optionsList", js.Array(value*))
      
      inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    }
  }
}
