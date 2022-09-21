package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimensionCompatibility extends StObject {
  
  /**
    * The compatibility of this dimension. If the compatibility is COMPATIBLE, this dimension can be successfully added to the report.
    */
  var compatibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The dimension metadata contains the API name for this compatibility information. The dimension metadata also contains other helpful information like the UI name and description.
    */
  var dimensionMetadata: js.UndefOr[SchemaDimensionMetadata] = js.undefined
}
object SchemaDimensionCompatibility {
  
  inline def apply(): SchemaDimensionCompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionCompatibility]
  }
  
  extension [Self <: SchemaDimensionCompatibility](x: Self) {
    
    inline def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityNull: Self = StObject.set(x, "compatibility", null)
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setDimensionMetadata(value: SchemaDimensionMetadata): Self = StObject.set(x, "dimensionMetadata", value.asInstanceOf[js.Any])
    
    inline def setDimensionMetadataUndefined: Self = StObject.set(x, "dimensionMetadata", js.undefined)
  }
}
