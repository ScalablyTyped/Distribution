package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProto2OneofDescriptorProto extends StObject {
  
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaProto2OneofDescriptorProto {
  
  inline def apply(): SchemaProto2OneofDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProto2OneofDescriptorProto]
  }
  
  extension [Self <: SchemaProto2OneofDescriptorProto](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
