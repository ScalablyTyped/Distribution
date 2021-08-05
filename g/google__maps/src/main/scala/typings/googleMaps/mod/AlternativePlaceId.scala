package typings.googleMaps.mod

import typings.googleMaps.googleMapsStrings.APP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternativePlaceId extends StObject {
  
  /**
    * The most likely reason for a place to have an alternative place ID is if your application adds a place and receives
    * an application-scoped place ID, then later receives a Google-scoped place ID after passing the moderation process.
    */
  var place_id: String
  
  /**
    * The scope of an alternative place ID will always be `APP`,
    * indicating that the alternative place ID is recognised by your application only.
    */
  var scope: APP
}
object AlternativePlaceId {
  
  inline def apply(place_id: String): AlternativePlaceId = {
    val __obj = js.Dynamic.literal(place_id = place_id.asInstanceOf[js.Any], scope = "APP")
    __obj.asInstanceOf[AlternativePlaceId]
  }
  
  extension [Self <: AlternativePlaceId](x: Self) {
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setScope(value: APP): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
