package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdKindPlaylistId extends StObject {
  
  /**
    * The resourceId object contains information that identifies the resource associated with a bulletin post.
    */
  var resourceId: KindPlaylistId
}
object ResourceIdKindPlaylistId {
  
  inline def apply(resourceId: KindPlaylistId): ResourceIdKindPlaylistId = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdKindPlaylistId]
  }
  
  extension [Self <: ResourceIdKindPlaylistId](x: Self) {
    
    inline def setResourceId(value: KindPlaylistId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
