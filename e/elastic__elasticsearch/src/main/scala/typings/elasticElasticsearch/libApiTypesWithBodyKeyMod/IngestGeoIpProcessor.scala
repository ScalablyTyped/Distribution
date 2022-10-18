package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGeoIpProcessor
  extends StObject
     with IngestProcessorBase {
  
  var database_file: String
  
  var field: Field
  
  var first_only: Boolean
  
  var ignore_missing: Boolean
  
  var properties: js.Array[String]
  
  var target_field: Field
}
object IngestGeoIpProcessor {
  
  inline def apply(
    database_file: String,
    field: Field,
    first_only: Boolean,
    ignore_missing: Boolean,
    properties: js.Array[String],
    target_field: Field
  ): IngestGeoIpProcessor = {
    val __obj = js.Dynamic.literal(database_file = database_file.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], first_only = first_only.asInstanceOf[js.Any], ignore_missing = ignore_missing.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], target_field = target_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGeoIpProcessor]
  }
  
  extension [Self <: IngestGeoIpProcessor](x: Self) {
    
    inline def setDatabase_file(value: String): Self = StObject.set(x, "database_file", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFirst_only(value: Boolean): Self = StObject.set(x, "first_only", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
  }
}
