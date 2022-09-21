package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProto2FileDescriptorProto extends StObject {
  
  /**
    * e.g. "foo", "foo.bar", etc.
    */
  @JSName("package")
  var _package: js.UndefOr[String | Null] = js.undefined
  
  var enumType: js.UndefOr[js.Array[SchemaProto2EnumDescriptorProto]] = js.undefined
  
  /**
    * All top-level definitions in this file.
    */
  var messageType: js.UndefOr[js.Array[SchemaProto2DescriptorProto]] = js.undefined
  
  /**
    * file name, relative to root of source tree
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The syntax of the proto file. The supported values are "proto2", "proto3", and "editions". If `edition` is present, this value must be "editions".
    */
  var syntax: js.UndefOr[String | Null] = js.undefined
}
object SchemaProto2FileDescriptorProto {
  
  inline def apply(): SchemaProto2FileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProto2FileDescriptorProto]
  }
  
  extension [Self <: SchemaProto2FileDescriptorProto](x: Self) {
    
    inline def setEnumType(value: js.Array[SchemaProto2EnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setEnumTypeVarargs(value: SchemaProto2EnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setMessageType(value: js.Array[SchemaProto2DescriptorProto]): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setMessageTypeVarargs(value: SchemaProto2DescriptorProto*): Self = StObject.set(x, "messageType", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxNull: Self = StObject.set(x, "syntax", null)
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageNull: Self = StObject.set(x, "package", null)
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
