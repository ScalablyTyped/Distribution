package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesTemplateMapping extends StObject {
  
  var aliases: Record[IndexName, IndicesAlias]
  
  var index_patterns: js.Array[Name]
  
  var mappings: MappingTypeMapping
  
  var order: integer
  
  var settings: Record[String, Any]
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object IndicesTemplateMapping {
  
  inline def apply(
    aliases: Record[IndexName, IndicesAlias],
    index_patterns: js.Array[Name],
    mappings: MappingTypeMapping,
    order: integer,
    settings: Record[String, Any]
  ): IndicesTemplateMapping = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], index_patterns = index_patterns.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesTemplateMapping]
  }
  
  extension [Self <: IndicesTemplateMapping](x: Self) {
    
    inline def setAliases(value: Record[IndexName, IndicesAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setIndex_patterns(value: js.Array[Name]): Self = StObject.set(x, "index_patterns", value.asInstanceOf[js.Any])
    
    inline def setIndex_patternsVarargs(value: Name*): Self = StObject.set(x, "index_patterns", js.Array(value*))
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: integer): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Record[String, Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
