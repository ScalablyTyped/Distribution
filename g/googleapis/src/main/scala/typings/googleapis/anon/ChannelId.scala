package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelId extends StObject {
  
  var channelId: js.UndefOr[String] = js.native
}
object ChannelId {
  
  @scala.inline
  def apply(): ChannelId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelId]
  }
  
  @scala.inline
  implicit class ChannelIdMutableBuilder[Self <: ChannelId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
  }
}
