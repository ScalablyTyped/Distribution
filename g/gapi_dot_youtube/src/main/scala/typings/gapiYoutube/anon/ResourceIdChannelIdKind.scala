package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdChannelIdKind extends StObject {
  
  /**
    * The resourceId object contains information that identifies the resource associated with the comment.
    */
  var resourceId: ChannelIdKind
}
object ResourceIdChannelIdKind {
  
  inline def apply(resourceId: ChannelIdKind): ResourceIdChannelIdKind = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdChannelIdKind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceIdChannelIdKind] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: ChannelIdKind): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
