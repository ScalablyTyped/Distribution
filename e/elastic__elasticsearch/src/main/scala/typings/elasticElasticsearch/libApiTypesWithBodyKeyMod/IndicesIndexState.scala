package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexState extends StObject {
  
  var aliases: js.UndefOr[Record[IndexName, IndicesAlias]] = js.undefined
  
  var data_stream: js.UndefOr[DataStreamName] = js.undefined
  
  var defaults: js.UndefOr[IndicesIndexSettings] = js.undefined
  
  var mappings: js.UndefOr[MappingTypeMapping] = js.undefined
  
  var settings: js.UndefOr[IndicesIndexSettings] = js.undefined
}
object IndicesIndexState {
  
  inline def apply(): IndicesIndexState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexState]
  }
  
  extension [Self <: IndicesIndexState](x: Self) {
    
    inline def setAliases(value: Record[IndexName, IndicesAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setData_stream(value: DataStreamName): Self = StObject.set(x, "data_stream", value.asInstanceOf[js.Any])
    
    inline def setData_streamUndefined: Self = StObject.set(x, "data_stream", js.undefined)
    
    inline def setDefaults(value: IndicesIndexSettings): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setSettings(value: IndicesIndexSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
