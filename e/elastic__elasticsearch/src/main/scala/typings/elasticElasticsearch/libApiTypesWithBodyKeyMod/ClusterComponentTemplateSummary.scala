package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterComponentTemplateSummary extends StObject {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var aliases: js.UndefOr[Record[String, IndicesAliasDefinition]] = js.undefined
  
  var mappings: js.UndefOr[MappingTypeMapping] = js.undefined
  
  var settings: js.UndefOr[Record[IndexName, IndicesIndexSettings]] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object ClusterComponentTemplateSummary {
  
  inline def apply(): ClusterComponentTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterComponentTemplateSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterComponentTemplateSummary] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: Record[String, IndicesAliasDefinition]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setSettings(value: Record[IndexName, IndicesIndexSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
