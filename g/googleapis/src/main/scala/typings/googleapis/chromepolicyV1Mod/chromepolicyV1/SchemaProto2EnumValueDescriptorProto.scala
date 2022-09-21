package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProto2EnumValueDescriptorProto extends StObject {
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var number: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProto2EnumValueDescriptorProto {
  
  inline def apply(): SchemaProto2EnumValueDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProto2EnumValueDescriptorProto]
  }
  
  extension [Self <: SchemaProto2EnumValueDescriptorProto](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
