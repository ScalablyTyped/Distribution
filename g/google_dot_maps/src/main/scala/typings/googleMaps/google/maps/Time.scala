package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of time as a Date object, a localized string, and a time
  * zone.
  */
trait Time extends StObject {
  
  /**
    * A string representing the time&#39;s value. The time is displayed in the
    * time zone of the transit stop.
    */
  var text: String
  
  /**
    * The time zone in which this stop lies. The value is the name of the time
    * zone as defined in the IANA Time Zone Database, e.g.
    * &quot;America/New_York&quot;.
    */
  var time_zone: String
  
  /**
    * The time of this departure or arrival, specified as a JavaScript Date
    * object.
    */
  var value: js.Date
}
object Time {
  
  inline def apply(text: String, time_zone: String, value: js.Date): Time = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], time_zone = time_zone.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  extension [Self <: Time](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
