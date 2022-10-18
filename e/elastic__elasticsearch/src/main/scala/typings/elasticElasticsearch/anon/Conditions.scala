package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesAlias
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesRolloverRolloverConditions
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTypeMapping
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conditions extends StObject {
  
  var aliases: js.UndefOr[Record[IndexName, IndicesAlias]] = js.undefined
  
  var conditions: js.UndefOr[IndicesRolloverRolloverConditions] = js.undefined
  
  var mappings: js.UndefOr[MappingTypeMapping] = js.undefined
  
  var settings: js.UndefOr[Record[String, Any]] = js.undefined
}
object Conditions {
  
  inline def apply(): Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conditions]
  }
  
  extension [Self <: Conditions](x: Self) {
    
    inline def setAliases(value: Record[IndexName, IndicesAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setConditions(value: IndicesRolloverRolloverConditions): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setSettings(value: Record[String, Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
