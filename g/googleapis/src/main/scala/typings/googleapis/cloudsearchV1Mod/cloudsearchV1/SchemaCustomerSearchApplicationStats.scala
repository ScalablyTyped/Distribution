package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerSearchApplicationStats extends StObject {
  
  /**
    * The count of search applications for the date.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date for which search application stats were calculated.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
}
object SchemaCustomerSearchApplicationStats {
  
  inline def apply(): SchemaCustomerSearchApplicationStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerSearchApplicationStats]
  }
  
  extension [Self <: SchemaCustomerSearchApplicationStats](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}
