package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason extends StObject {
  
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: String
  
  /**
    * The resourceId object contains information that identifies the recommended resource.
    */
  var resourceId: ChannelIdKind
  
  /**
    * The seedResourceId object contains information about the resource that caused the recommendation.
    */
  var seedResourceId: KindPlaylistId
}
object Reason {
  
  inline def apply(reason: String, resourceId: ChannelIdKind, seedResourceId: KindPlaylistId): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], seedResourceId = seedResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ChannelIdKind): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setSeedResourceId(value: KindPlaylistId): Self = StObject.set(x, "seedResourceId", value.asInstanceOf[js.Any])
  }
}
