package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatComponentTemplatesComponentTemplate extends StObject {
  
  var alias_count: String
  
  var included_in: String
  
  var mapping_count: String
  
  var metadata_count: String
  
  var name: String
  
  var settings_count: String
  
  var version: String
}
object CatComponentTemplatesComponentTemplate {
  
  inline def apply(
    alias_count: String,
    included_in: String,
    mapping_count: String,
    metadata_count: String,
    name: String,
    settings_count: String,
    version: String
  ): CatComponentTemplatesComponentTemplate = {
    val __obj = js.Dynamic.literal(alias_count = alias_count.asInstanceOf[js.Any], included_in = included_in.asInstanceOf[js.Any], mapping_count = mapping_count.asInstanceOf[js.Any], metadata_count = metadata_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings_count = settings_count.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatComponentTemplatesComponentTemplate]
  }
  
  extension [Self <: CatComponentTemplatesComponentTemplate](x: Self) {
    
    inline def setAlias_count(value: String): Self = StObject.set(x, "alias_count", value.asInstanceOf[js.Any])
    
    inline def setIncluded_in(value: String): Self = StObject.set(x, "included_in", value.asInstanceOf[js.Any])
    
    inline def setMapping_count(value: String): Self = StObject.set(x, "mapping_count", value.asInstanceOf[js.Any])
    
    inline def setMetadata_count(value: String): Self = StObject.set(x, "metadata_count", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSettings_count(value: String): Self = StObject.set(x, "settings_count", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
