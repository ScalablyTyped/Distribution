package typings.googleMaps.mod

import typings.googleMaps.googleMapsStrings.APP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlternativePlaceId extends StObject {
  
  /**
    * The most likely reason for a place to have an alternative place ID is if your application adds a place and receives
    * an application-scoped place ID, then later receives a Google-scoped place ID after passing the moderation process.
    */
  var place_id: String = js.native
  
  /**
    * The scope of an alternative place ID will always be `APP`,
    * indicating that the alternative place ID is recognised by your application only.
    */
  var scope: APP = js.native
}
object AlternativePlaceId {
  
  @scala.inline
  def apply(place_id: String, scope: APP): AlternativePlaceId = {
    val __obj = js.Dynamic.literal(place_id = place_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternativePlaceId]
  }
  
  @scala.inline
  implicit class AlternativePlaceIdMutableBuilder[Self <: AlternativePlaceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: APP): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
