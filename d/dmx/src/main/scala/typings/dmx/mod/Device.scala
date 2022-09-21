package typings.dmx.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dmx.anon.Colorpretsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var channelgroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var channels: js.Array[String]
  
  var ranges: js.UndefOr[Colorpretsets & typings.dmx.dmxStrings.Device & TopLevel[Any]] = js.undefined
}
object Device {
  
  inline def apply(channels: js.Array[String]): Device = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setChannelgroups(value: js.Array[String]): Self = StObject.set(x, "channelgroups", value.asInstanceOf[js.Any])
    
    inline def setChannelgroupsUndefined: Self = StObject.set(x, "channelgroups", js.undefined)
    
    inline def setChannelgroupsVarargs(value: String*): Self = StObject.set(x, "channelgroups", js.Array(value*))
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setRanges(value: Colorpretsets & typings.dmx.dmxStrings.Device & TopLevel[Any]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
  }
}
