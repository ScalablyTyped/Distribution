package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Aggregation of items by status code as of the specified date.
  */
trait SchemaCustomerIndexStats extends StObject {
  
  /**
    * Date for which statistics were calculated.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Number of items aggregrated by status code.
    */
  var itemCountByStatus: js.UndefOr[js.Array[SchemaItemCountByStatus]] = js.undefined
}
object SchemaCustomerIndexStats {
  
  @scala.inline
  def apply(): SchemaCustomerIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerIndexStats]
  }
  
  @scala.inline
  implicit class SchemaCustomerIndexStatsMutableBuilder[Self <: SchemaCustomerIndexStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setItemCountByStatus(value: js.Array[SchemaItemCountByStatus]): Self = StObject.set(x, "itemCountByStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountByStatusUndefined: Self = StObject.set(x, "itemCountByStatus", js.undefined)
    
    @scala.inline
    def setItemCountByStatusVarargs(value: SchemaItemCountByStatus*): Self = StObject.set(x, "itemCountByStatus", js.Array(value :_*))
  }
}
