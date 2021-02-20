package typings.elasticsearch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldStatsResponse extends StObject {
  
  var _shards: ShardsResponse = js.native
  
  var conflicts: js.UndefOr[StringDictionary[String]] = js.native
  
  var indices: StringDictionary[FieldStatsResponseIndex] = js.native
}
object FieldStatsResponse {
  
  @scala.inline
  def apply(_shards: ShardsResponse, indices: StringDictionary[FieldStatsResponseIndex]): FieldStatsResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldStatsResponse]
  }
  
  @scala.inline
  implicit class FieldStatsResponseMutableBuilder[Self <: FieldStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflicts(value: StringDictionary[String]): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    @scala.inline
    def setIndices(value: StringDictionary[FieldStatsResponseIndex]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_shards(value: ShardsResponse): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
