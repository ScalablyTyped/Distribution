package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFieldMetadataProto extends StObject {
  
  var internal: js.UndefOr[SchemaInternalFieldMetadataProto] = js.undefined
}
object SchemaFieldMetadataProto {
  
  inline def apply(): SchemaFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMetadataProto]
  }
  
  extension [Self <: SchemaFieldMetadataProto](x: Self) {
    
    inline def setInternal(value: SchemaInternalFieldMetadataProto): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
  }
}
