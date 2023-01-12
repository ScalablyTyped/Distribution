package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdChannelIdString extends StObject {
  
  /**
    * The resourceId object contains information that identifies the resource that the user subscribed to.
    */
  var resourceId: ChannelIdString
}
object ResourceIdChannelIdString {
  
  inline def apply(resourceId: ChannelIdString): ResourceIdChannelIdString = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdChannelIdString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceIdChannelIdString] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: ChannelIdString): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
