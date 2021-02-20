package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGetDataSourceIndexStatsResponse extends StObject {
  
  /**
    * Summary of indexed item counts, one for each day in the requested range.
    */
  var stats: js.UndefOr[js.Array[SchemaDataSourceIndexStats]] = js.native
}
object SchemaGetDataSourceIndexStatsResponse {
  
  @scala.inline
  def apply(): SchemaGetDataSourceIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetDataSourceIndexStatsResponse]
  }
  
  @scala.inline
  implicit class SchemaGetDataSourceIndexStatsResponseMutableBuilder[Self <: SchemaGetDataSourceIndexStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[SchemaDataSourceIndexStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: SchemaDataSourceIndexStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
