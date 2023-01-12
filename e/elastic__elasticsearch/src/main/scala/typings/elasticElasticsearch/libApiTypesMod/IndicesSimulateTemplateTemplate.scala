package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSimulateTemplateTemplate extends StObject {
  
  var aliases: Record[IndexName, IndicesAlias]
  
  var mappings: MappingTypeMapping
  
  var settings: IndicesIndexSettings
}
object IndicesSimulateTemplateTemplate {
  
  inline def apply(
    aliases: Record[IndexName, IndicesAlias],
    mappings: MappingTypeMapping,
    settings: IndicesIndexSettings
  ): IndicesSimulateTemplateTemplate = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSimulateTemplateTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSimulateTemplateTemplate] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: Record[IndexName, IndicesAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: IndicesIndexSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
