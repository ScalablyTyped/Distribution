package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermvectorsParams
  extends StObject
     with GenericParams {
  
  var fieldStatistics: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[NameList] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var index: String
  
  var offsets: js.UndefOr[Boolean] = js.undefined
  
  var parent: js.UndefOr[String] = js.undefined
  
  var payloads: js.UndefOr[Boolean] = js.undefined
  
  var positions: js.UndefOr[Boolean] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var realtime: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
  
  var termStatistics: js.UndefOr[Boolean] = js.undefined
  
  var `type`: String
  
  var version: js.UndefOr[Double] = js.undefined
  
  var versionType: js.UndefOr[VersionType] = js.undefined
}
object TermvectorsParams {
  
  inline def apply(index: String, `type`: String): TermvectorsParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermvectorsParams]
  }
  
  extension [Self <: TermvectorsParams](x: Self) {
    
    inline def setFieldStatistics(value: Boolean): Self = StObject.set(x, "fieldStatistics", value.asInstanceOf[js.Any])
    
    inline def setFieldStatisticsUndefined: Self = StObject.set(x, "fieldStatistics", js.undefined)
    
    inline def setFields(value: NameList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOffsets(value: Boolean): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPayloads(value: Boolean): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
    
    inline def setPayloadsUndefined: Self = StObject.set(x, "payloads", js.undefined)
    
    inline def setPositions(value: Boolean): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
    
    inline def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
    
    inline def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setTermStatistics(value: Boolean): Self = StObject.set(x, "termStatistics", value.asInstanceOf[js.Any])
    
    inline def setTermStatisticsUndefined: Self = StObject.set(x, "termStatistics", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionType(value: VersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
    
    inline def setVersionTypeUndefined: Self = StObject.set(x, "versionType", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
