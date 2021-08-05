package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelId extends StObject {
  
  var channelId: js.UndefOr[String] = js.undefined
}
object ChannelId {
  
  inline def apply(): ChannelId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelId]
  }
  
  extension [Self <: ChannelId](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
  }
}
