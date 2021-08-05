package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInternalSourceSummaryProto extends StObject {
  
  var dataset: js.UndefOr[String] = js.undefined
  
  var provider: js.UndefOr[String] = js.undefined
}
object SchemaInternalSourceSummaryProto {
  
  inline def apply(): SchemaInternalSourceSummaryProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalSourceSummaryProto]
  }
  
  extension [Self <: SchemaInternalSourceSummaryProto](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
