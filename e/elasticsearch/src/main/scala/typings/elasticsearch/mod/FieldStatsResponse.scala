package typings.elasticsearch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldStatsResponse extends StObject {
  
  var _shards: ShardsResponse
  
  var conflicts: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var indices: StringDictionary[FieldStatsResponseIndex]
}
object FieldStatsResponse {
  
  inline def apply(_shards: ShardsResponse, indices: StringDictionary[FieldStatsResponseIndex]): FieldStatsResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setConflicts(value: StringDictionary[String]): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    inline def setIndices(value: StringDictionary[FieldStatsResponseIndex]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardsResponse): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
