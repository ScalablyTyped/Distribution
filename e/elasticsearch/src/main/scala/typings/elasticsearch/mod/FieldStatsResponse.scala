package typings.elasticsearch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldStatsResponse extends js.Object {
  
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
  implicit class FieldStatsResponseOps[Self <: FieldStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_shards(value: ShardsResponse): Self = this.set("_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndices(value: StringDictionary[FieldStatsResponseIndex]): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflicts(value: StringDictionary[String]): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflicts: Self = this.set("conflicts", js.undefined)
  }
}
