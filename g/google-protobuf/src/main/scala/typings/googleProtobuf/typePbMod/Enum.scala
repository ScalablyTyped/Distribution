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

@JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
@js.native
class Enum () extends Message {
  
  def addEnumvalue(): EnumValue = js.native
  def addEnumvalue(value: Unit, index: Double): EnumValue = js.native
  def addEnumvalue(value: EnumValue): EnumValue = js.native
  def addEnumvalue(value: EnumValue, index: Double): EnumValue = js.native
  
  def addOptions(): Option = js.native
  def addOptions(value: Unit, index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearEnumvalueList(): Enum = js.native
  
  def clearOptionsList(): Enum = js.native
  
  def clearSourceContext(): Enum = js.native
  
  def getEnumvalueList(): js.Array[EnumValue] = js.native
  
  def getName(): String = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  
  def getSyntax(): Syntax = js.native
  
  def hasSourceContext(): Boolean = js.native
  
  def setEnumvalueList(value: js.Array[EnumValue]): Enum = js.native
  
  def setName(value: String): Enum = js.native
  
  def setOptionsList(value: js.Array[Option]): Enum = js.native
  
  def setSourceContext(): Enum = js.native
  def setSourceContext(value: SourceContext): Enum = js.native
  
  def setSyntax(value: Syntax): Enum = js.native
}
/* static members */
object Enum {
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: Uint8Array): Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Enum]
  
  inline def deserializeBinaryFromReader(message: Enum, reader: BinaryReader): Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Enum]
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: Enum, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: Enum): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var enumvalueList: js.Array[typings.googleProtobuf.typePbMod.EnumValue.AsObject]
    
    var name: String
    
    var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]
    
    var sourceContext: js.UndefOr[typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.undefined
    
    var syntax: Syntax
  }
  object AsObject {
    
    inline def apply(
      enumvalueList: js.Array[typings.googleProtobuf.typePbMod.EnumValue.AsObject],
      name: String,
      optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject],
      syntax: Syntax
    ): AsObject = {
      val __obj = js.Dynamic.literal(enumvalueList = enumvalueList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setEnumvalueList(value: js.Array[typings.googleProtobuf.typePbMod.EnumValue.AsObject]): Self = StObject.set(x, "enumvalueList", value.asInstanceOf[js.Any])
      
      inline def setEnumvalueListVarargs(value: typings.googleProtobuf.typePbMod.EnumValue.AsObject*): Self = StObject.set(x, "enumvalueList", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptionsList(value: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]): Self = StObject.set(x, "optionsList", value.asInstanceOf[js.Any])
      
      inline def setOptionsListVarargs(value: typings.googleProtobuf.typePbMod.Option.AsObject*): Self = StObject.set(x, "optionsList", js.Array(value :_*))
      
      inline def setSourceContext(value: typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
      
      inline def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
      
      inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
}
