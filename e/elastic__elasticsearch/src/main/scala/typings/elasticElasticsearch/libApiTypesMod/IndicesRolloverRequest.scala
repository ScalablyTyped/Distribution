package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRolloverRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var alias: IndexAlias
  
  var aliases: js.UndefOr[Record[IndexName, IndicesAlias]] = js.undefined
  
  var conditions: js.UndefOr[IndicesRolloverRolloverConditions] = js.undefined
  
  var dry_run: js.UndefOr[Boolean] = js.undefined
  
  var mappings: js.UndefOr[MappingTypeMapping] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var new_index: js.UndefOr[IndexName] = js.undefined
  
  var settings: js.UndefOr[Record[String, Any]] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[WaitForActiveShards] = js.undefined
}
object IndicesRolloverRequest {
  
  inline def apply(alias: IndexAlias): IndicesRolloverRequest = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRolloverRequest]
  }
  
  extension [Self <: IndicesRolloverRequest](x: Self) {
    
    inline def setAlias(value: IndexAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliases(value: Record[IndexName, IndicesAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setConditions(value: IndicesRolloverRolloverConditions): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    inline def setDry_runUndefined: Self = StObject.set(x, "dry_run", js.undefined)
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNew_index(value: IndexName): Self = StObject.set(x, "new_index", value.asInstanceOf[js.Any])
    
    inline def setNew_indexUndefined: Self = StObject.set(x, "new_index", js.undefined)
    
    inline def setSettings(value: Record[String, Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_active_shards(value: WaitForActiveShards): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
  }
}
