package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGetCustomerIndexStatsResponse extends StObject {
  
  /**
    * Summary of indexed item counts, one for each day in the requested range.
    */
  var stats: js.UndefOr[js.Array[SchemaCustomerIndexStats]] = js.native
}
object SchemaGetCustomerIndexStatsResponse {
  
  @scala.inline
  def apply(): SchemaGetCustomerIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetCustomerIndexStatsResponse]
  }
  
  @scala.inline
  implicit class SchemaGetCustomerIndexStatsResponseMutableBuilder[Self <: SchemaGetCustomerIndexStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[SchemaCustomerIndexStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: SchemaCustomerIndexStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
