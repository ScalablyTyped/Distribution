package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Aggregation of items by status code as of the specified date.
  */
trait SchemaDataSourceIndexStats extends StObject {
  
  /**
    * Date for which index stats were calculated. If the date of request is not
    * the current date then stats calculated on the next day are returned.
    * Stats are calculated close to mid night in this case. If date of request
    * is current date, then real time stats are returned.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Number of items aggregrated by status code.
    */
  var itemCountByStatus: js.UndefOr[js.Array[SchemaItemCountByStatus]] = js.undefined
}
object SchemaDataSourceIndexStats {
  
  inline def apply(): SchemaDataSourceIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceIndexStats]
  }
  
  extension [Self <: SchemaDataSourceIndexStats](x: Self) {
    
    inline def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setItemCountByStatus(value: js.Array[SchemaItemCountByStatus]): Self = StObject.set(x, "itemCountByStatus", value.asInstanceOf[js.Any])
    
    inline def setItemCountByStatusUndefined: Self = StObject.set(x, "itemCountByStatus", js.undefined)
    
    inline def setItemCountByStatusVarargs(value: SchemaItemCountByStatus*): Self = StObject.set(x, "itemCountByStatus", js.Array(value :_*))
  }
}
