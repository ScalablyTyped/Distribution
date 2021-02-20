package typings.googleProtobuf.typePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.typePbMod.Field.Cardinality
import typings.googleProtobuf.typePbMod.Field.Kind
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "Field")
@js.native
class Field () extends Message {
  
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
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
    def apply(value: Double): js.UndefOr[Cardinality with Double] = js.native
    
    @js.native
    sealed trait CARDINALITY_OPTIONAL extends Cardinality
    /* 1 */ val CARDINALITY_OPTIONAL: typings.googleProtobuf.typePbMod.Field.Cardinality.CARDINALITY_OPTIONAL with Double = js.native
    
    @js.native
    sealed trait CARDINALITY_REPEATED extends Cardinality
    /* 3 */ val CARDINALITY_REPEATED: typings.googleProtobuf.typePbMod.Field.Cardinality.CARDINALITY_REPEATED with Double = js.native
    
    @js.native
    sealed trait CARDINALITY_REQUIRED extends Cardinality
    /* 2 */ val CARDINALITY_REQUIRED: typings.googleProtobuf.typePbMod.Field.Cardinality.CARDINALITY_REQUIRED with Double = js.native
    
    @js.native
    sealed trait CARDINALITY_UNKNOWN extends Cardinality
    /* 0 */ val CARDINALITY_UNKNOWN: typings.googleProtobuf.typePbMod.Field.Cardinality.CARDINALITY_UNKNOWN with Double = js.native
  }
  
  @js.native
  sealed trait Kind extends StObject
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.Kind")
  @js.native
  object Kind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Kind with Double] = js.native
    
    @js.native
    sealed trait TYPE_BOOL extends Kind
    /* 8 */ val TYPE_BOOL: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_BOOL with Double = js.native
    
    @js.native
    sealed trait TYPE_BYTES extends Kind
    /* 12 */ val TYPE_BYTES: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_BYTES with Double = js.native
    
    @js.native
    sealed trait TYPE_DOUBLE extends Kind
    /* 1 */ val TYPE_DOUBLE: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_DOUBLE with Double = js.native
    
    @js.native
    sealed trait TYPE_ENUM extends Kind
    /* 14 */ val TYPE_ENUM: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_ENUM with Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED32 extends Kind
    /* 7 */ val TYPE_FIXED32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_FIXED32 with Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED64 extends Kind
    /* 6 */ val TYPE_FIXED64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_FIXED64 with Double = js.native
    
    @js.native
    sealed trait TYPE_FLOAT extends Kind
    /* 2 */ val TYPE_FLOAT: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_FLOAT with Double = js.native
    
    @js.native
    sealed trait TYPE_GROUP extends Kind
    /* 10 */ val TYPE_GROUP: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_GROUP with Double = js.native
    
    @js.native
    sealed trait TYPE_INT32 extends Kind
    /* 5 */ val TYPE_INT32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_INT32 with Double = js.native
    
    @js.native
    sealed trait TYPE_INT64 extends Kind
    /* 3 */ val TYPE_INT64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_INT64 with Double = js.native
    
    @js.native
    sealed trait TYPE_MESSAGE extends Kind
    /* 11 */ val TYPE_MESSAGE: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_MESSAGE with Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED32 extends Kind
    /* 15 */ val TYPE_SFIXED32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_SFIXED32 with Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED64 extends Kind
    /* 16 */ val TYPE_SFIXED64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_SFIXED64 with Double = js.native
    
    @js.native
    sealed trait TYPE_SINT32 extends Kind
    /* 17 */ val TYPE_SINT32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_SINT32 with Double = js.native
    
    @js.native
    sealed trait TYPE_SINT64 extends Kind
    /* 18 */ val TYPE_SINT64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_SINT64 with Double = js.native
    
    @js.native
    sealed trait TYPE_STRING extends Kind
    /* 9 */ val TYPE_STRING: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_STRING with Double = js.native
    
    @js.native
    sealed trait TYPE_UINT32 extends Kind
    /* 13 */ val TYPE_UINT32: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_UINT32 with Double = js.native
    
    @js.native
    sealed trait TYPE_UINT64 extends Kind
    /* 4 */ val TYPE_UINT64: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_UINT64 with Double = js.native
    
    @js.native
    sealed trait TYPE_UNKNOWN extends Kind
    /* 0 */ val TYPE_UNKNOWN: typings.googleProtobuf.typePbMod.Field.Kind.TYPE_UNKNOWN with Double = js.native
  }
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): Field = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: Field, reader: BinaryReader): Field = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: Field, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Field.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: Field): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var cardinality: Cardinality = js.native
    
    var defaultValue: String = js.native
    
    var jsonName: String = js.native
    
    var kind: Kind = js.native
    
    var name: String = js.native
    
    var number: Double = js.native
    
    var oneofIndex: Double = js.native
    
    var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject] = js.native
    
    var packed: Boolean = js.native
    
    var typeUrl: String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardinality(value: Cardinality): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsList(value: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]): Self = StObject.set(x, "optionsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsListVarargs(value: typings.googleProtobuf.typePbMod.Option.AsObject*): Self = StObject.set(x, "optionsList", js.Array(value :_*))
      
      @scala.inline
      def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    }
  }
}
