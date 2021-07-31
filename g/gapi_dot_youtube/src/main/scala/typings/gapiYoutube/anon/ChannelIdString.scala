package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdString extends StObject {
  
  /**
    * The value that YouTube uses to uniquely identify the channel that the user subscribed to.
    */
  var channelId: String
  
  /**
    * The type of the API resource.
    */
  var kind: String
}
object ChannelIdString {
  
  @scala.inline
  def apply(channelId: String, kind: String): ChannelIdString = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdString]
  }
  
  @scala.inline
  implicit class ChannelIdStringMutableBuilder[Self <: ChannelIdString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
