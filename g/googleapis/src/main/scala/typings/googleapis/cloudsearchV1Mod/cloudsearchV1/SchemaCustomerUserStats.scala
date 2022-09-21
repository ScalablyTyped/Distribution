package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerUserStats extends StObject {
  
  /**
    * The date for which session stats were calculated. Stats calculated on the next day close to midnight are returned.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The count of unique active users in the past one day
    */
  var oneDayActiveUsersCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The count of unique active users in the past seven days
    */
  var sevenDaysActiveUsersCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The count of unique active users in the past thirty days
    */
  var thirtyDaysActiveUsersCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomerUserStats {
  
  inline def apply(): SchemaCustomerUserStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerUserStats]
  }
  
  extension [Self <: SchemaCustomerUserStats](x: Self) {
    
    inline def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOneDayActiveUsersCount(value: String): Self = StObject.set(x, "oneDayActiveUsersCount", value.asInstanceOf[js.Any])
    
    inline def setOneDayActiveUsersCountNull: Self = StObject.set(x, "oneDayActiveUsersCount", null)
    
    inline def setOneDayActiveUsersCountUndefined: Self = StObject.set(x, "oneDayActiveUsersCount", js.undefined)
    
    inline def setSevenDaysActiveUsersCount(value: String): Self = StObject.set(x, "sevenDaysActiveUsersCount", value.asInstanceOf[js.Any])
    
    inline def setSevenDaysActiveUsersCountNull: Self = StObject.set(x, "sevenDaysActiveUsersCount", null)
    
    inline def setSevenDaysActiveUsersCountUndefined: Self = StObject.set(x, "sevenDaysActiveUsersCount", js.undefined)
    
    inline def setThirtyDaysActiveUsersCount(value: String): Self = StObject.set(x, "thirtyDaysActiveUsersCount", value.asInstanceOf[js.Any])
    
    inline def setThirtyDaysActiveUsersCountNull: Self = StObject.set(x, "thirtyDaysActiveUsersCount", null)
    
    inline def setThirtyDaysActiveUsersCountUndefined: Self = StObject.set(x, "thirtyDaysActiveUsersCount", js.undefined)
  }
}
