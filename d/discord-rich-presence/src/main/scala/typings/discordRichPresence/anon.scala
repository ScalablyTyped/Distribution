package typings.discordRichPresence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<discord-rich-presence.discord-rich-presence.PresenceInfo> */
  trait PartialPresenceInfo extends StObject {
    
    var details: js.UndefOr[String] = js.undefined
    
    var endTimestamp: js.UndefOr[Double | js.Date] = js.undefined
    
    var instance: js.UndefOr[Boolean] = js.undefined
    
    var largeImageKey: js.UndefOr[String] = js.undefined
    
    var smallImageKey: js.UndefOr[String] = js.undefined
    
    var startTimestamp: js.UndefOr[Double | js.Date] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object PartialPresenceInfo {
    
    inline def apply(): PartialPresenceInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPresenceInfo]
    }
    
    extension [Self <: PartialPresenceInfo](x: Self) {
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setEndTimestamp(value: Double | js.Date): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      inline def setInstance(value: Boolean): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setLargeImageKey(value: String): Self = StObject.set(x, "largeImageKey", value.asInstanceOf[js.Any])
      
      inline def setLargeImageKeyUndefined: Self = StObject.set(x, "largeImageKey", js.undefined)
      
      inline def setSmallImageKey(value: String): Self = StObject.set(x, "smallImageKey", value.asInstanceOf[js.Any])
      
      inline def setSmallImageKeyUndefined: Self = StObject.set(x, "smallImageKey", js.undefined)
      
      inline def setStartTimestamp(value: Double | js.Date): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
