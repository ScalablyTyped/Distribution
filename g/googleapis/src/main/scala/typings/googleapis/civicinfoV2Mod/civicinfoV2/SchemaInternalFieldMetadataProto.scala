package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInternalFieldMetadataProto extends StObject {
  
  var isAuto: js.UndefOr[Boolean] = js.undefined
  
  var sourceSummary: js.UndefOr[SchemaInternalSourceSummaryProto] = js.undefined
}
object SchemaInternalFieldMetadataProto {
  
  inline def apply(): SchemaInternalFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalFieldMetadataProto]
  }
  
  extension [Self <: SchemaInternalFieldMetadataProto](x: Self) {
    
    inline def setIsAuto(value: Boolean): Self = StObject.set(x, "isAuto", value.asInstanceOf[js.Any])
    
    inline def setIsAutoUndefined: Self = StObject.set(x, "isAuto", js.undefined)
    
    inline def setSourceSummary(value: SchemaInternalSourceSummaryProto): Self = StObject.set(x, "sourceSummary", value.asInstanceOf[js.Any])
    
    inline def setSourceSummaryUndefined: Self = StObject.set(x, "sourceSummary", js.undefined)
  }
}
