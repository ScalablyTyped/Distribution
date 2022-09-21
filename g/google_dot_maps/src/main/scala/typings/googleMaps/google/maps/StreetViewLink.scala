package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of references to adjacent Street View panos.
  */
trait StreetViewLink extends StObject {
  
  /**
    * A localized string describing the link.
    */
  var description: String | Null
  
  /**
    * The heading of the link.
    */
  var heading: Double | Null
  
  /**
    * A unique identifier for the panorama. This id is stable within a session
    * but unstable across sessions.
    */
  var pano: String | Null
}
object StreetViewLink {
  
  inline def apply(): StreetViewLink = {
    val __obj = js.Dynamic.literal(description = null, heading = null, pano = null)
    __obj.asInstanceOf[StreetViewLink]
  }
  
  extension [Self <: StreetViewLink](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingNull: Self = StObject.set(x, "heading", null)
    
    inline def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    inline def setPanoNull: Self = StObject.set(x, "pano", null)
  }
}
