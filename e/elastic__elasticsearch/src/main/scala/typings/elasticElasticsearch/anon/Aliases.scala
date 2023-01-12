package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesAliasDefinition
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesIndexSettings
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesIndexState
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTypeMapping
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.VersionNumber
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aliases extends StObject {
  
  var _meta: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var aliases: js.UndefOr[Record[String, IndicesAliasDefinition]] = js.undefined
  
  var mappings: js.UndefOr[MappingTypeMapping] = js.undefined
  
  var settings: js.UndefOr[IndicesIndexSettings] = js.undefined
  
  var template: IndicesIndexState
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object Aliases {
  
  inline def apply(template: IndicesIndexState): Aliases = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aliases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aliases] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: Record[String, IndicesAliasDefinition]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setSettings(value: IndicesIndexSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setTemplate(value: IndicesIndexState): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_meta(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
