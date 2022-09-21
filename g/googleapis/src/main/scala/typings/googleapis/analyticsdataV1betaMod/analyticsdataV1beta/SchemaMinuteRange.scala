package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMinuteRange extends StObject {
  
  /**
    * The inclusive end minute for the query as a number of minutes before now. Cannot be before `startMinutesAgo`. For example, `"endMinutesAgo": 15` specifies the report should include event data from prior to 15 minutes ago. If unspecified, `endMinutesAgo` is defaulted to 0. Standard Analytics properties can request any minute in the last 30 minutes of event data (`endMinutesAgo <= 29`), and 360 Analytics properties can request any minute in the last 60 minutes of event data (`endMinutesAgo <= 59`).
    */
  var endMinutesAgo: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Assigns a name to this minute range. The dimension `dateRange` is valued to this name in a report response. If set, cannot begin with `date_range_` or `RESERVED_`. If not set, minute ranges are named by their zero based index in the request: `date_range_0`, `date_range_1`, etc.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The inclusive start minute for the query as a number of minutes before now. For example, `"startMinutesAgo": 29` specifies the report should include event data from 29 minutes ago and after. Cannot be after `endMinutesAgo`. If unspecified, `startMinutesAgo` is defaulted to 29. Standard Analytics properties can request up to the last 30 minutes of event data (`startMinutesAgo <= 29`), and 360 Analytics properties can request up to the last 60 minutes of event data (`startMinutesAgo <= 59`).
    */
  var startMinutesAgo: js.UndefOr[Double | Null] = js.undefined
}
object SchemaMinuteRange {
  
  inline def apply(): SchemaMinuteRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMinuteRange]
  }
  
  extension [Self <: SchemaMinuteRange](x: Self) {
    
    inline def setEndMinutesAgo(value: Double): Self = StObject.set(x, "endMinutesAgo", value.asInstanceOf[js.Any])
    
    inline def setEndMinutesAgoNull: Self = StObject.set(x, "endMinutesAgo", null)
    
    inline def setEndMinutesAgoUndefined: Self = StObject.set(x, "endMinutesAgo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartMinutesAgo(value: Double): Self = StObject.set(x, "startMinutesAgo", value.asInstanceOf[js.Any])
    
    inline def setStartMinutesAgoNull: Self = StObject.set(x, "startMinutesAgo", null)
    
    inline def setStartMinutesAgoUndefined: Self = StObject.set(x, "startMinutesAgo", js.undefined)
  }
}
