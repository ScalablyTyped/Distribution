package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesAlias
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesIndexSettings
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTypeMapping
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mappings extends StObject {
  
  var aliases: js.UndefOr[
    Record[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name, IndicesAlias]
  ] = js.undefined
  
  var mappings: js.UndefOr[MappingTypeMapping] = js.undefined
  
  var settings: js.UndefOr[IndicesIndexSettings] = js.undefined
}
object Mappings {
  
  inline def apply(): Mappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mappings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mappings] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: Record[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name, IndicesAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setSettings(value: IndicesIndexSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
