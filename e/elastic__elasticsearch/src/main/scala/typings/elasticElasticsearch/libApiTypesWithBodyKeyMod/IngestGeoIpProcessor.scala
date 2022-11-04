package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGeoIpProcessor
  extends StObject
     with IngestProcessorBase {
  
  var database_file: js.UndefOr[String] = js.undefined
  
  var field: Field
  
  var first_only: js.UndefOr[Boolean] = js.undefined
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  var target_field: js.UndefOr[Field] = js.undefined
}
object IngestGeoIpProcessor {
  
  inline def apply(field: Field): IngestGeoIpProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGeoIpProcessor]
  }
  
  extension [Self <: IngestGeoIpProcessor](x: Self) {
    
    inline def setDatabase_file(value: String): Self = StObject.set(x, "database_file", value.asInstanceOf[js.Any])
    
    inline def setDatabase_fileUndefined: Self = StObject.set(x, "database_file", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFirst_only(value: Boolean): Self = StObject.set(x, "first_only", value.asInstanceOf[js.Any])
    
    inline def setFirst_onlyUndefined: Self = StObject.set(x, "first_only", js.undefined)
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
  }
}
