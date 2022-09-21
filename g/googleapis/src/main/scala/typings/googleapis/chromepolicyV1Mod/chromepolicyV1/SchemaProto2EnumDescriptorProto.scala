package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProto2EnumDescriptorProto extends StObject {
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var value: js.UndefOr[js.Array[SchemaProto2EnumValueDescriptorProto]] = js.undefined
}
object SchemaProto2EnumDescriptorProto {
  
  inline def apply(): SchemaProto2EnumDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProto2EnumDescriptorProto]
  }
  
  extension [Self <: SchemaProto2EnumDescriptorProto](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: js.Array[SchemaProto2EnumValueDescriptorProto]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: SchemaProto2EnumValueDescriptorProto*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
