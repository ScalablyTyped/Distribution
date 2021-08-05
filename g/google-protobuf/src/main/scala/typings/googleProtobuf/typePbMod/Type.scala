package typings.googleProtobuf.typePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.sourceContextPbMod.SourceContext
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "Type")
@js.native
class Type () extends Message {
  
  def addFields(): Field = js.native
  def addFields(value: Unit, index: Double): Field = js.native
  def addFields(value: Field): Field = js.native
  def addFields(value: Field, index: Double): Field = js.native
  
  def addOneofs(value: String): String = js.native
  def addOneofs(value: String, index: Double): String = js.native
  
  def addOptions(): Option = js.native
  def addOptions(value: Unit, index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearFieldsList(): Type = js.native
  
  def clearOneofsList(): Type = js.native
  
  def clearOptionsList(): Type = js.native
  
  def clearSourceContext(): Type = js.native
  
  def getFieldsList(): js.Array[Field] = js.native
  
  def getName(): String = js.native
  
  def getOneofsList(): js.Array[String] = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  
  def getSyntax(): Syntax = js.native
  
  def hasSourceContext(): Boolean = js.native
  
  def setFieldsList(value: js.Array[Field]): Type = js.native
  
  def setName(value: String): Type = js.native
  
  def setOneofsList(value: js.Array[String]): Type = js.native
  
  def setOptionsList(value: js.Array[Option]): Type = js.native
  
  def setSourceContext(): Type = js.native
  def setSourceContext(value: SourceContext): Type = js.native
  
  def setSyntax(value: Syntax): Type = js.native
}
/* static members */
object Type {
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: Uint8Array): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def deserializeBinaryFromReader(message: Type, reader: BinaryReader): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: Type, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: Type): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var fieldsList: js.Array[typings.googleProtobuf.typePbMod.Field.AsObject]
    
    var name: String
    
    var oneofsList: js.Array[String]
    
    var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]
    
    var sourceContext: js.UndefOr[typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.undefined
    
    var syntax: Syntax
  }
  object AsObject {
    
    inline def apply(
      fieldsList: js.Array[typings.googleProtobuf.typePbMod.Field.AsObject],
      name: String,
      oneofsList: js.Array[String],
      optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject],
      syntax: Syntax
    ): AsObject = {
      val __obj = js.Dynamic.literal(fieldsList = fieldsList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oneofsList = oneofsList.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setFieldsList(value: js.Array[typings.googleProtobuf.typePbMod.Field.AsObject]): Self = StObject.set(x, "fieldsList", value.asInstanceOf[js.Any])
      
      inline def setFieldsListVarargs(value: typings.googleProtobuf.typePbMod.Field.AsObject*): Self = StObject.set(x, "fieldsList", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOneofsList(value: js.Array[String]): Self = StObject.set(x, "oneofsList", value.asInstanceOf[js.Any])
      
      inline def setOneofsListVarargs(value: String*): Self = StObject.set(x, "oneofsList", js.Array(value :_*))
      
      inline def setOptionsList(value: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]): Self = StObject.set(x, "optionsList", value.asInstanceOf[js.Any])
      
      inline def setOptionsListVarargs(value: typings.googleProtobuf.typePbMod.Option.AsObject*): Self = StObject.set(x, "optionsList", js.Array(value :_*))
      
      inline def setSourceContext(value: typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
      
      inline def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
      
      inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
}
