package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceId extends StObject {
  
  /**
    * The resourceId object contains information that identifies the resource that was marked as a favorite.
    */
  var resourceId: Kind
}
object ResourceId {
  
  inline def apply(resourceId: Kind): ResourceId = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceId]
  }
  
  extension [Self <: ResourceId](x: Self) {
    
    inline def setResourceId(value: Kind): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
