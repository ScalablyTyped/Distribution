package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPollingLocation extends StObject {
  
  /**
    * The address of the location.
    */
  var address: js.UndefOr[SchemaSimpleAddressType] = js.undefined
  
  /**
    * The last date that this early vote site or drop off location may be used. This field is not populated for polling locations.
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Latitude of the location, in degrees north of the equator. Note this field may not be available for some locations.
    */
  var latitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Longitude of the location, in degrees east of the Prime Meridian. Note this field may not be available for some locations.
    */
  var longitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the early vote site or drop off location. This field is not populated for polling locations.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notes about this location (e.g. accessibility ramp or entrance to use).
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of when this location is open.
    */
  var pollingHours: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of sources for this location. If multiple sources are listed the data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.undefined
  
  /**
    * The first date that this early vote site or drop off location may be used. This field is not populated for polling locations.
    */
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The services provided by this early vote site or drop off location. This field is not populated for polling locations.
    */
  var voterServices: js.UndefOr[String | Null] = js.undefined
}
object SchemaPollingLocation {
  
  inline def apply(): SchemaPollingLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollingLocation]
  }
  
  extension [Self <: SchemaPollingLocation](x: Self) {
    
    inline def setAddress(value: SchemaSimpleAddressType): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPollingHours(value: String): Self = StObject.set(x, "pollingHours", value.asInstanceOf[js.Any])
    
    inline def setPollingHoursNull: Self = StObject.set(x, "pollingHours", null)
    
    inline def setPollingHoursUndefined: Self = StObject.set(x, "pollingHours", js.undefined)
    
    inline def setSources(value: js.Array[SchemaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SchemaSource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setVoterServices(value: String): Self = StObject.set(x, "voterServices", value.asInstanceOf[js.Any])
    
    inline def setVoterServicesNull: Self = StObject.set(x, "voterServices", null)
    
    inline def setVoterServicesUndefined: Self = StObject.set(x, "voterServices", js.undefined)
  }
}
