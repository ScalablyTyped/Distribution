package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the transit line that operates this transit step.
  */
trait TransitLine extends StObject {
  
  /**
    * The transit agency that operates this transit line.
    */
  var agencies: (js.Array[TransitAgency | Null]) | Null
  
  /**
    * The color commonly used in signage for this transit line, represented as
    * a hex string.
    */
  var color: String
  
  /**
    * The URL for an icon associated with this line.
    */
  var icon: String
  
  /**
    * The full name of this transit line, e.g. &quot;8 Avenue Local&quot;.
    */
  var name: String
  
  /**
    * The short name of this transit line, e.g. &quot;E&quot;.
    */
  var short_name: String
  
  /**
    * The text color commonly used in signage for this transit line,
    * represented as a hex string.
    */
  var text_color: String
  
  /**
    * The agency&#39;s URL which is specific to this transit line.
    */
  var url: String
  
  /**
    * The type of vehicle used, e.g. train or bus.
    */
  var vehicle: TransitVehicle
}
object TransitLine {
  
  inline def apply(
    color: String,
    icon: String,
    name: String,
    short_name: String,
    text_color: String,
    url: String,
    vehicle: TransitVehicle
  ): TransitLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any], agencies = null)
    __obj.asInstanceOf[TransitLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitLine] (val x: Self) extends AnyVal {
    
    inline def setAgencies(value: js.Array[TransitAgency | Null]): Self = StObject.set(x, "agencies", value.asInstanceOf[js.Any])
    
    inline def setAgenciesNull: Self = StObject.set(x, "agencies", null)
    
    inline def setAgenciesVarargs(value: (TransitAgency | Null)*): Self = StObject.set(x, "agencies", js.Array(value*))
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    inline def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVehicle(value: TransitVehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
  }
}
